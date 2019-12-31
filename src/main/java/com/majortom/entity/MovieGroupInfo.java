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
@Table ( name ="movie_group_info" )
public class MovieGroupInfo  implements Serializable {

	private static final long serialVersionUID =  6198051487049542633L;

   	@Column(name = "m_info_id" )
	private Long mInfoId;

   	@Column(name = "c_i_id" )
	private Long cIId;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "autograph" )
	private String autograph;

   	@Column(name = "synopsis" )
	private String synopsis;

   	@Column(name = "register_time" )
	private Date registerTime;

   	@Column(name = "active_city" )
	private String activeCity;

}
