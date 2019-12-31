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
@Table ( name ="achievement" )
public class Achievement  implements Serializable {

	private static final long serialVersionUID =  1309869474737085147L;

   	@Column(name = "achievement_id" )
	private Long achievementId;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "description" )
	private String description;

   	@Column(name = "state" )
	private Integer state;

}
