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
@Table ( name ="p_e_privilege" )
public class PEPrivilege  implements Serializable {

	private static final long serialVersionUID =  1417833373140250754L;

   	@Column(name = "p_e_id" )
	private Long pEId;

   	@Column(name = "privilege_id" )
	private Long privilegeId;

}
