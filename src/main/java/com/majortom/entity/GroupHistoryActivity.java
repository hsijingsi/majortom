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
@Table ( name ="group_history_activity" )
public class GroupHistoryActivity  implements Serializable {

	private static final long serialVersionUID =  3046268747527234731L;

   	@Column(name = "h_a_id" )
	private Long hAId;

   	@Column(name = "m_id" )
	private Long mId;

   	@Column(name = "a_id" )
	private Long aId;

}
