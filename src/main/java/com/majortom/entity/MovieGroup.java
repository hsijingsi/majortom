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
@Table ( name ="movie_group" )
public class MovieGroup  implements Serializable {

	private static final long serialVersionUID =  7060954735503608237L;

   	@Column(name = "m_g_id" )
	private Long mGId;

   	@Column(name = "m_info_id" )
	private Long mInfoId;

   	@Column(name = "level" )
	private Long level;

   	@Column(name = "y_money" )
	private Long yMoney;

}
