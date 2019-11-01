package com.leyou.item.service;

import com.leyou.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author sherwin
 * @Create 2019-08-02 00:02:13
 * @Description
 */
@Deprecated
@Service
public class ItemService {

	public Item saveItem(Item item){
		//商品新增
		int id = new Random().nextInt();
		item.setId(id);
		return item;
	}

}
