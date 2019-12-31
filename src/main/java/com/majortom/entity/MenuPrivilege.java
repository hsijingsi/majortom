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
@Table ( name ="menu_privilege" )
public class MenuPrivilege  implements Serializable {

	private static final long serialVersionUID =  6323180309467534098L;

   	@Column(name = "menu_id" )
	private Long menuId;

   	@Column(name = "privilege_id" )
	private Long privilegeId;

}
