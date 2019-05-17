package top.harryper.service;

import top.harryper.dto.AntiChickenSoupDto;
import top.harryper.exception.AntiChickenSoupException;
import top.harryper.pojo.AntiChickenSoup;

public interface AntiChickenSoupService extends BaseService<AntiChickenSoup>{
	
	/**
	 * 根据 ascId 查询内容
	 * @author harryper
	 * @date 2019年5月17日 下午5:52:19
	 * @param acsId
	 * @return
	 */
	public AntiChickenSoupDto findById(Integer acsId) throws AntiChickenSoupException;
	
	
	/**
	 * 生产随机数，然后根据 ascId 查询内容
	 * @author harryper
	 * @date 2019年5月17日 下午6:13:31
	 * @return
	 * @throws AntiChickenSoupException
	 */
	public AntiChickenSoupDto findRandomContent() throws AntiChickenSoupException;
	
}
