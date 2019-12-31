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
@Table ( name ="identification" )
public class Identification  implements Serializable {

	private static final long serialVersionUID =  2078690152891737331L;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "user_id" )
	private Long userId;

   	@Column(name = "c_i_id" )
	private Long cIId;

   	@Column(name = "nick_name" )
	private String nickName;

   	@Column(name = "password" )
	private String password;

   	@Column(name = "level" )
	private Long level;

   	@Column(name = "autograph" )
	private String autograph;

   	@Column(name = "register_time" )
	private Date registerTime;

   	@Column(name = "y_money" )
	private Long yMoney;

}
