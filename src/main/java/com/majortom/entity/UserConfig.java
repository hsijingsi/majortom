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
@Table ( name ="user_config" )
public class UserConfig  implements Serializable {

	private static final long serialVersionUID =  3574706937412438135L;

   	@Column(name = "u_c_id" )
	private Long uCId;

   	@Column(name = "i_id" )
	private Long iId;

}
