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
@Table ( name ="question" )
public class Question  implements Serializable {

	private static final long serialVersionUID =  268947485417888182L;

   	@Column(name = "question_id" )
	private Long questionId;

   	@Column(name = "question_text" )
	private String questionText;

   	@Column(name = "content_text" )
	private String contentText;

   	@Column(name = "type" )
	private Integer type;

}
