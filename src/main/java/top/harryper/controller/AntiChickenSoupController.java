package top.harryper.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.harryper.dto.AntiChickenSoupDto;
import top.harryper.exception.AntiChickenSoupException;
import top.harryper.service.AntiChickenSoupService;
import top.harryper.transfer.BaseTransfer;

@RestController
@RequestMapping("/antiChickenSoup")
public class AntiChickenSoupController extends BaseController {
	
	@Resource(name = "antiChickenSoupService")
	private AntiChickenSoupService antiChickenSoupService;
	
	@GetMapping("/findRandomContent")
	public BaseTransfer findRandomContent() {
		BaseTransfer dto = new BaseTransfer("success", "查询成功");
		try {
			AntiChickenSoupDto content = antiChickenSoupService.findRandomContent();
			dto.setContent(content);
		} catch (AntiChickenSoupException e) {
			returnError(e, dto);
		}
		return dto;
	}
}
