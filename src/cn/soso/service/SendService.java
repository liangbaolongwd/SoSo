package cn.soso.service;

import cn.soso.entity.MobileCard;

/**
 *  短信服务接口
 */
public interface SendService {
	//发短信
     public int sendMessage(int count, MobileCard card) throws Exception;
}
