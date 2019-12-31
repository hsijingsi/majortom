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
@Table ( name ="role" )
public class Role  implements Serializable {

	private static final long serialVersionUID =  4081922083053404044L;

   	@Column(name = "role_id" )
	private Long roleId;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "description" )
	private String description;

}
