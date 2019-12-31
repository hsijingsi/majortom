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
@Table ( name ="folder_privilege" )
public class FolderPrivilege  implements Serializable {

	private static final long serialVersionUID =  5992986212112852589L;

   	@Column(name = "folder_id" )
	private Long folderId;

   	@Column(name = "privilege_id" )
	private Long privilegeId;

}
