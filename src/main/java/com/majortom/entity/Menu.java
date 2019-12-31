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
@Table ( name ="menu" )
public class Menu  implements Serializable {

	private static final long serialVersionUID =  7589217413872505407L;

   	@Column(name = "menu_id" )
	private Long menuId;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "menu_url" )
	private String menuUrl;

   	@Column(name = "parent_id" )
	private Long parentId;

}
