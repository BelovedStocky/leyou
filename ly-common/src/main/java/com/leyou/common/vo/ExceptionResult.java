package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @Author sherwin
 * @Create 2019-08-02 01:19:07
 * @Description
 */

@Data
public class ExceptionResult {

	private int status;
	private String message;
	private Long timestamp;

 	public ExceptionResult(ExceptionEnum em){

 		this.status = em.getCode();
 		this.message = em.getMsg();
 		this.timestamp = System.currentTimeMillis();
	}

}
