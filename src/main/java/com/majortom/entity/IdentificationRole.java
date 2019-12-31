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
@Table ( name ="identification_role" )
public class IdentificationRole  implements Serializable {

	private static final long serialVersionUID =  6702617367484745815L;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "role_id" )
	private Long roleId;

}
