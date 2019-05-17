package top.harryper.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import top.harryper.transfer.BaseTransfer;

@Component
public class BaseController {
	
	final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
	
	
	protected void returnError(Exception e, BaseTransfer dto) {
		LOGGER.error(e.getMessage(),e);
		dto.setStatus("failed");
		dto.setMessage(e.getMessage());
	}
}
