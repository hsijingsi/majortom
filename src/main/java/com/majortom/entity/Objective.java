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
@Table ( name ="objective" )
public class Objective  implements Serializable {

	private static final long serialVersionUID =  7373047704649659318L;

   	@Column(name = "s_s_id" )
	private Long sSId;

   	@Column(name = "question_text" )
	private String questionText;

   	@Column(name = "choice_a" )
	private String choiceA;

   	@Column(name = "score_a" )
	private Long scoreA;

   	@Column(name = "choice_b" )
	private String choiceB;

   	@Column(name = "score_b" )
	private Long scoreB;

   	@Column(name = "choice_c" )
	private String choiceC;

   	@Column(name = "score_c" )
	private Long scoreC;

   	@Column(name = "choice_d" )
	private String choiceD;

   	@Column(name = "score_d" )
	private Long scoreD;

   	@Column(name = "type" )
	private Integer type;

}
