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
@Table ( name ="history_log" )
public class HistoryLog  implements Serializable {

	private static final long serialVersionUID =  4117943553614436265L;

   	@Column(name = "h_i_id" )
	private Long hIId;

   	@Column(name = "i_id" )
	private Long iId;

   	@Column(name = "log_time" )
	private Date logTime;

   	@Column(name = "log_ip" )
	private Long logIp;

}
