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
@Table ( name ="history_activity" )
public class HistoryActivity  implements Serializable {

	private static final long serialVersionUID =  2867753175561194398L;

   	@Column(name = "h_a_id" )
	private Long hAId;

   	@Column(name = "a_id" )
	private Long aId;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "h_a_time" )
	private Date hATime;

   	@Column(name = "type" )
	private Integer type;

}
