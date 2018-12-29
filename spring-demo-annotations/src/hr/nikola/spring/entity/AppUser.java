package hr.nikola.spring.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class AppUser {
	
	private BigDecimal id = null;
	private String type = null;
	private Timestamp created_on = null;
	private String name = null;
	private String login = null;
	private String password = null;
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AppUser [id=" + id + ", type=" + type + ", created_on=" + created_on + ", name=" + name + ", login="
				+ login + ", password=" + password + "]";
	}
	
	

}
