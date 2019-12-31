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
@Table ( name ="videos" )
public class Videos  implements Serializable {

	private static final long serialVersionUID =  7057004497510175673L;

   	@Column(name = "v_id" )
	private Long vId;

   	@Column(name = "c_i_id" )
	private Long cIId;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "intro" )
	private String intro;

}
