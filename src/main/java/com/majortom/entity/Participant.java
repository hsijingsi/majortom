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
@Table ( name ="participant" )
public class Participant  implements Serializable {

	private static final long serialVersionUID =  5350325523835919099L;

   	@Column(name = "participan_id" )
	private Long participanId;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "a_id" )
	private Long aId;

   	@Column(name = "a_f_id" )
	private Long aFId;

   	@Column(name = "type" )
	private Integer type;

}
