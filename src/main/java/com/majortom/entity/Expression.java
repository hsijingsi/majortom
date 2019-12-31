package com.majortom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-12-27 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="expression" )
public class Expression  implements Serializable {

    public Expression(Long expressionId, String userName, String userHeadImage, Date publishTime, String contentText, Long likedCount, Long commentCount, Long forwardCount) {
        this.expressionId = expressionId;
        this.userName = userName;
        this.userHeadImage = userHeadImage;
        this.publishTime = publishTime;
        this.contentText = contentText;
        this.likedCount = likedCount;
        this.commentCount = commentCount;
        this.forwardCount = forwardCount;
    }

    private static final long serialVersionUID =  2003042878772270230L;

	/**
	 * id
	 */
   	@Column(name = "expression_id" )
	private Long expressionId;

	/**
	 * 账号
	 */
   	@Column(name = "user_name" )
	private String userName;

	/**
	 * 头像
	 */
   	@Column(name = "user_headImage" )
	private String userHeadImage;

	/**
	 * 时间
	 */
   	@Column(name = "publish_time" )
	private Date publishTime;

	/**
	 * 内容
	 */
   	@Column(name = "content_text" )
	private String contentText;

	/**
	 * 喜欢数
	 */
   	@Column(name = "liked_count" )
	private Long likedCount;

	/**
	 * 评论数
	 */
   	@Column(name = "comment_count" )
	private Long commentCount;

	/**
	 * 转发数
	 */
   	@Column(name = "forward_count" )
	private Long forwardCount;

}
