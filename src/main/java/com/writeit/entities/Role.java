package com.writeit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rid;
	private String roleName;

    public void setRid(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setRoleName(String ROLE_NORMAL) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}