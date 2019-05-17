package top.harryper.transfer;

import java.io.Serializable;

public class BaseTransfer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String status; //状态
	private String message; //返回的信息
	private Object content; //传输的内容
	/**
	 * @param status
	 * @param message
	 */
	public BaseTransfer(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
