package top.harryper.service.impl;

import java.util.Optional;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.harryper.dto.AntiChickenSoupDto;
import top.harryper.exception.AntiChickenSoupException;
import top.harryper.pojo.AntiChickenSoup;
import top.harryper.repository.AntiChickenSoupRepository;
import top.harryper.service.AntiChickenSoupService;

@Transactional
@Service(value = "antiChickenSoupService")
public class AntiChickenSoupServiceImpl extends BaseServiceImpl<AntiChickenSoup> implements AntiChickenSoupService {
	
	@Autowired
	private AntiChickenSoupRepository antiChickenSoupRepository;

	@Override
	public AntiChickenSoupDto findById(Integer acsId) {
		// 根据 id 查询内容
		Optional<AntiChickenSoup> po = antiChickenSoupRepository.findById(acsId);
		
		if (po.isPresent()) {
			AntiChickenSoupDto d = new AntiChickenSoupDto();
			mapper.map(po.get(), d);
			return d;
		} else {
			return null;
		}
	}

	@Override
	public AntiChickenSoupDto findRandomContent() throws AntiChickenSoupException {
		
		// 数据库具有的内容数量
		Integer size = antiChickenSoupRepository.findAll().size();
		// 生产随机数
		Random random = new Random();
		Integer randomId = random.nextInt(size) + 1;
		AntiChickenSoupDto dto = this.findById(randomId);
		return dto;
	}

}
