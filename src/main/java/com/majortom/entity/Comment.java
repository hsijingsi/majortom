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
@Table ( name ="comment" )
public class Comment  implements Serializable {

	private static final long serialVersionUID =  5789436461590754974L;

   	@Column(name = "comment_id" )
	private Long commentId;

   	@Column(name = "bind_id" )
	private Long bindId;

   	@Column(name = "publish_id" )
	private Long publishId;

   	@Column(name = "content_text" )
	private String contentText;

   	@Column(name = "publish_time" )
	private Date publishTime;

   	@Column(name = "liked_count" )
	private Long likedCount;

   	@Column(name = "type" )
	private Integer type;

}
