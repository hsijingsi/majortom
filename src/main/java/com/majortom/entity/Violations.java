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
@Table ( name ="violations" )
public class Violations  implements Serializable {

	private static final long serialVersionUID =  3829360330863821537L;

   	@Column(name = "violations_id" )
	private Long violationsId;

   	@Column(name = "bind_id" )
	private Long bindId;

   	@Column(name = "type" )
	private Integer type;

   	@Column(name = "concrete_content" )
	private String concreteContent;

   	@Column(name = "violations_time" )
	private Date violationsTime;

}
