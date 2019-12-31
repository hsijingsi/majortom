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
@Table ( name ="collection" )
public class Collection  implements Serializable {

	private static final long serialVersionUID =  9075147471842953651L;

   	@Column(name = "collection_id" )
	private Long collectionId;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "type" )
	private Integer type;

   	@Column(name = "folder_id" )
	private Long folderId;

   	@Column(name = "time" )
	private Date time;

   	@Column(name = "bind_id" )
	private Long bindId;

}
