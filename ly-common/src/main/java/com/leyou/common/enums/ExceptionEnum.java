package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author sherwin
 * @Create 2019-08-02 00:59:42
 * @Description
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

	PRICE_CANNOT_BE_NULL(400, "价格不能为空"),
	CATEGORY_NOT_FOUND(404, "商品分类没有找到"),
	;
	private int code;
	private String msg;

}
