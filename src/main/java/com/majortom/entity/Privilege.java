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
@Table ( name ="privilege" )
public class Privilege  implements Serializable {

	private static final long serialVersionUID =  6008146398312498106L;

   	@Column(name = "p_id" )
	private Long pId;

   	@Column(name = "type" )
	private String type;

   	@Column(name = "description" )
	private String description;

}
