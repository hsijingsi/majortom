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
@Table ( name ="user_movie_group" )
public class UserMovieGroup  implements Serializable {

	private static final long serialVersionUID =  6262552145141394218L;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "m_id" )
	private Long mId;

   	@Column(name = "type" )
	private Integer type;

}
