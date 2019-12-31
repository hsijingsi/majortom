package com.majortom.dao;

import com.majortom.entity.Expression;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 动态的数据操作层接口
 */
public interface IExpressionDao {

    @Select("select count(0) from expression")
    long expCount();

    @Select("select * from expression order by expression_id desc limit #{start},#{limit}")
    List<Expression> queryByLimit(@Param("start")int start, @Param("limit")int limit);

    @Insert("insert into expression( user_name, user_headImage, publish_time, content_text) values(#{userName},#{userHeadImage},now(),#{contentText})")
    int insert(Expression exp);

    @Select("")
    List<Integer> batchSave(List<Expression> exps);

    @Select("select * from expression where expression_id = #{expId}")
    Expression queryById(Long expId);

    @Delete("delete from expression where expression_id=#{expId}")
    int deleteById(Long expId);
}
