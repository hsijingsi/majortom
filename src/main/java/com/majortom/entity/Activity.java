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
@Table ( name ="activity" )
public class Activity  implements Serializable {

	private static final long serialVersionUID =  2749438408455999169L;

   	@Column(name = "a_id" )
	private Long aId;

   	@Column(name = "m_id" )
	private Long mId;

   	@Column(name = "v_id" )
	private Long vId;

   	@Column(name = "participan_id" )
	private Long participanId;

   	@Column(name = "title" )
	private String title;

   	@Column(name = "strart_time" )
	private Date strartTime;

   	@Column(name = "strart_apply_time" )
	private Date strartApplyTime;

   	@Column(name = "end_apply_time" )
	private Date endApplyTime;

   	@Column(name = "end_time" )
	private Date endTime;

   	@Column(name = "movie_strart_time" )
	private Date movieStrartTime;

   	@Column(name = "moive_length" )
	private Long moiveLength;

   	@Column(name = "move_end_time" )
	private Date moveEndTime;

   	@Column(name = "city" )
	private String city;

   	@Column(name = "cinema_address" )
	private String cinemaAddress;

   	@Column(name = "places" )
	private Long places;

}
