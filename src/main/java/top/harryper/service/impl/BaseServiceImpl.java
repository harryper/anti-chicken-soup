package top.harryper.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import top.harryper.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {
	
	
	final Logger LOGGER = LoggerFactory.getLogger(BaseServiceImpl.class);
	public DozerBeanMapper mapper = new DozerBeanMapper();// 获取mapper
	@Override
	public <D> List<D> pojoToDto(Class<D> dClass, Iterable<T> origList) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
		List<D> destList = new ArrayList<D>();
		for(T t:origList) {
			D d = (D)dClass.newInstance();
			mapper.map(t, d);
			destList.add(d);
		}
		return destList;
	}

}
