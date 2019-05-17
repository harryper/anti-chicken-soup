package top.harryper.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface BaseService<T> {
	/**
	 * pojo 转 dto
	 * @author harryper
	 * @date 2019年5月17日 下午5:49:17
	 * @param dClass
	 * @param origList
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws InstantiationException
	 */
	public <D> List<D> pojoToDto(Class<D> dClass,Iterable<T> origList) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException;
}
