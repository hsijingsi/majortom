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
@Table ( name ="images" )
public class Images  implements Serializable {

	private static final long serialVersionUID =  490638026571836428L;

   	@Column(name = "c_i_id" )
	private Long cIId;

   	@Column(name = "bind_id" )
	private Long bindId;

   	@Column(name = "type" )
	private Integer type;

   	@Column(name = "img_url" )
	private String imgUrl;

}
