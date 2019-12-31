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
@Table ( name ="role_privilege" )
public class RolePrivilege  implements Serializable {

	private static final long serialVersionUID =  9142731212558104964L;

   	@Column(name = "role_id" )
	private Long roleId;

   	@Column(name = "privilege_id" )
	private Long privilegeId;

}
