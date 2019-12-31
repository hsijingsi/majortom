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
@Table ( name ="article" )
public class Article  implements Serializable {

	private static final long serialVersionUID =  8021819786935481844L;

   	@Column(name = "article_id" )
	private Long articleId;

   	@Column(name = "bind_id" )
	private Long bindId;

   	@Column(name = "title" )
	private String title;

   	@Column(name = "publish_time" )
	private Date publishTime;

   	@Column(name = "content_text" )
	private String contentText;

   	@Column(name = "comment_count" )
	private Long commentCount;

   	@Column(name = "liked_count" )
	private Long likedCount;

   	@Column(name = "forward_count" )
	private Long forwardCount;

}
