package com.expleeve.chargeup.dto;

import com.expleeve.chargeup.consts.ResultState;

/**
 * 返回前端
 * @author expleeve
 * @date 2017年7月22日 上午11:57:45
 *
 */
public class ResultDTO {

	private String msg;
	
	private int state = ResultState.SUCCESS;
	
	private Object content;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

}
