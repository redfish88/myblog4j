package org.ya.blog.vo;

/**
 * 
 * Description:存在于Session之中保存用户在线状态 
 * Copyright (c) Department of Research and Development/Beijing/Qida Technology.
 * All Rights Reserved.
 * @version 1.0  May 1, 2010 9:09:17 PM  by 孙玮男（lukesun@w-ya.com）创建
 */
public class SessionVO {

	public SessionVO() {
	}

	private int id;
	
	private String nickname;
	
	private String alias;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
}
