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
@Table ( name ="user" )
public class User  implements Serializable {

	private static final long serialVersionUID =  8173752599425899150L;

   	@Column(name = "user_id" )
	private Long userId;

   	@Column(name = "user_name" )
	private String userName;

   	@Column(name = "gender" )
	private Integer gender;

   	@Column(name = "age" )
	private Long age;

   	@Column(name = "birthday" )
	private Date birthday;

   	@Column(name = "tel" )
	private String tel;

   	@Column(name = "email" )
	private String email;

   	@Column(name = "address" )
	private String address;

   	@Column(name = "id_num" )
	private String idNum;

}
