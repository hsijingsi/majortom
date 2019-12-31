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
@Table ( name ="punish" )
public class Punish  implements Serializable {

	private static final long serialVersionUID =  7775380772786161215L;

   	@Column(name = "punish_id" )
	private Long punishId;

   	@Column(name = "violations_id" )
	private Long violationsId;

   	@Column(name = "time" )
	private Date time;

   	@Column(name = "time_length" )
	private Long timeLength;

   	@Column(name = "type" )
	private Integer type;

}
