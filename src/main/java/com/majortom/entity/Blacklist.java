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
@Table ( name ="blacklist" )
public class Blacklist  implements Serializable {

	private static final long serialVersionUID =  6002859082023699664L;

   	@Column(name = "blacklist_id" )
	private Long blacklistId;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "id" )
	private Long id;

   	@Column(name = "time" )
	private Date time;

}
