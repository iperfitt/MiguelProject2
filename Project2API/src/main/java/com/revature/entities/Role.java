package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class Role {

	@Id
	@Column(name = "user_role_id")
	private int user_role_id;

	private String user_role;

	public Role(int user_role_id, String user_role) {
		super();
		this.user_role_id = user_role_id;
		this.user_role = user_role;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_role == null) ? 0 : user_role.hashCode());
		result = prime * result + user_role_id;
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
		Role other = (Role) obj;
		if (user_role == null) {
			if (other.user_role != null)
				return false;
		} else if (!user_role.equals(other.user_role))
			return false;
		if (user_role_id != other.user_role_id)
			return false;
		return true;
	}

	public int getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	@Override
	public String toString() {
		return "Role [user_role_id=" + user_role_id + ", user_role=" + user_role + "]";
	}

}
