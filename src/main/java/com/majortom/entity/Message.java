package com.majortom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-12-27 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="message" )
public class Message  implements Serializable {

	private static final long serialVersionUID =  3471894598204439305L;

   	@Column(name = "message_id" )
	private Long messageId;

   	@Column(name = "bind_id" )
	private Long bindId;

   	@Column(name = "title" )
	private String title;

   	@Column(name = "content_text" )
	private String contentText;

   	@Column(name = "type" )
	private Integer type;

}
