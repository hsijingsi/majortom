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
@Table ( name ="complaint" )
public class Complaint  implements Serializable {

	private static final long serialVersionUID =  1549686795738387658L;

   	@Column(name = "complaint_id" )
	private Long complaintId;

   	@Column(name = "to_complaint_id" )
	private Long toComplaintId;

   	@Column(name = "bind_id" )
	private Long bindId;

   	@Column(name = "type" )
	private Integer type;

   	@Column(name = "content_id" )
	private Long contentId;

   	@Column(name = "dispose" )
	private Integer dispose;

}
