package com.leyou.common.advice;

import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author sherwin
 * @Create 2019-08-02 00:35:38
 * @Description
 */

@ControllerAdvice
public class CommonExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ExceptionResult> handleException(LyException e){

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionResult(e.getExceptionEnum()));
	}
}
