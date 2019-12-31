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
@Table ( name ="following" )
public class Following  implements Serializable {

	private static final long serialVersionUID =  3766737460335416603L;

   	@Column(name = "following_id" )
	private Long followingId;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "bind_id" )
	private Long bindId;

   	@Column(name = "type" )
	private Integer type;

   	@Column(name = "time" )
	private Date time;

}
