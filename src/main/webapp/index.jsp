<%@ page import="com.majortom.entity.Expression" %>
<%@ page import="java.util.List" %>
<%@ page import="com.majortom.commons.PageBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css"   charset="utf-8"/>
    <%--<link rel="stylesheet" type="text/css" href="./css/font-awesome-4.7.0/css/font-awesome.css"   charset="utf-8"/>--%>
    <title>$Title$</title>
    <style>
      .expressions{
        width: 500px;
        margin: 0 auto;
      }
      .expression{
        width: 500px;
        border: 3px solid black;
        border-radius: 20px;
        margin: 20px 0;
        padding: 20px;
      }
      .expression_head{
        width: 100%;
        height: 70px;
      }
      .expression_head div:nth-of-type(1){
        float: left;
        width: 70px;
       }
      .expression_head div:nth-of-type(2){
        float: left;
        width: 400px;
      }
      .expression_head div:nth-of-type(2) div:nth-of-type(1){
        width: 400px;
        height: 50%;
        display: flex;
        align-content: center;
        text-align: center;
      }
      .expression_head div:nth-of-type(2) div:nth-of-type(2){
        width: 400px;
        height: 50%;
        display: flex;
        align-content: center;
        text-align: center;
        color:grey;
      }
      .expression_body{
        width: 100%;
        min-height: 100px;
        padding: 10px 0 0 10px;
      }
      .expression_foot{
        width: 100%;
        height: 20px;
        display: flex;
        align-content: center;
      }
      .expression_foot i{
        display: flex;
        align-content: center;
        justify-content: center;
        flex: 1;
      }
      .headImage{
        width: 60px;
        height: 60px;
        border-radius: 30px;
      }
    </style>
  </head>
  <body>
    <form action="<%=request.getContextPath()+"/majortom/publish"%>" method="post">
      <input class="publishExpression" name="content" placeholder="想说点什么">
      <button type="submit">发表</button>
    </form>

    <%
      PageBean<Expression> pageBean = (PageBean<Expression>)request.getAttribute("pageBean");
      if(null==pageBean){
          response.sendRedirect(application.getContextPath()+ "/majortom/list");
        return;
      }
    %>
    <div class="nav">
      <a href="<%=application.getContextPath()+"/majortom/list?page="+pageBean.getPageHome()%>"> 首页 </a>
      <a href="<%=application.getContextPath()+"/majortom/list?page="+pageBean.getPageUp()%>">上一页</a>
      <%
        for (Integer num : pageBean.getPageNums()) {
      %>
      <a href="<%=application.getContextPath()+"/majortom/list?page="+num%>"><%=num%></a>
      <%
        }%>
      <a href="<%=application.getContextPath()+"/majortom/list?page="+pageBean.getPageDown()%>">下一页</a>
      <a href="<%=application.getContextPath()+"/majortom/list?page="+pageBean.getPageEnd()%>">尾页</a>
    </div>
    <div class="expressions">
    <%
      List<Expression> exps = pageBean.getDatas();
      for (Expression exp : exps) {
    %>
    <div class="expression">
      <div class="expression_head">
        <div><img class="headImage" src="<%=exp.getUserHeadImage()%>"></div>
        <div>
          <div class="name"><%=exp.getUserName()%></div>
          <div class="time"><%=exp.getPublishTime()%></div>
        </div>
      </div>
      <div class="expression_body">
        <%=exp.getContentText()%>
      </div>
      <div class="expression_foot">
        <i class="fa fa-thumbs-o-up"><%=exp.getLikedCount()%></i>
        <i class="fa fa-comment"><%=exp.getCommentCount()%></i>
        <i class="fa fa-share"><%=exp.getForwardCount()%></i>
        <a class="delete" href="<%=application.getContextPath()+"/majortom/delete?id="+exp.getExpressionId()%>">删除</a>
      </div>
    </div>
    <%
      }
    %>
    </div>
  </body>
</html>
