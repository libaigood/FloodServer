package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 3258187050586826350L;
	
	private String id;
	private String name;
	private String pwd;
	private int lvl;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String name, String pwd, int lvl) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.lvl = lvl;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", lvl=" + lvl + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + lvl;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lvl != other.lvl)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		return true;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getlvl() {
		return lvl;
	}
	public void setlvl(int lvl) {
		this.lvl = lvl;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
