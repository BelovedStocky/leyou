package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author sherwin
 * @Create 2019-08-02 01:13:23
 * @Description
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LyException extends RuntimeException{

	private ExceptionEnum exceptionEnum;

}
