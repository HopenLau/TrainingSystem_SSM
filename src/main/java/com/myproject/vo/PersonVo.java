package com.myproject.vo;

import java.io.Serializable;

public class PersonVo implements Serializable {
	// 锟斤拷锟紽interface java.io.Serializable锟斤拷锟皆凤拷锟斤拷锟捷旓拷锟斤拷锟斤拷锟斤拷锟皆★拷

	private Integer id;
	private String name;
	private Integer age;

	public PersonVo() { // 锟斤拷锟絰锟接咃拷constructor锟斤拷
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
