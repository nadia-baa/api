package com.example.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="role")
public class Role {
   


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_role")
	private int id;
	
    @Column(name="id_user")
    private int id_user;
    
	public int getId_user() {
		return id_user;
	}


	public void setId_user(int id_user) {
		this.id_user = id_user;
	}


	@Column(name="name_role")
	private String name;
    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
