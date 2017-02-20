package com.bw.bean;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String sex;

    private String collage;

    private String cdate;

    private Integer chome;

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
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage == null ? null : collage.trim();
    }

   

    public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public Integer getChome() {
        return chome;
    }

    public void setChome(Integer chome) {
        this.chome = chome;
    }
}