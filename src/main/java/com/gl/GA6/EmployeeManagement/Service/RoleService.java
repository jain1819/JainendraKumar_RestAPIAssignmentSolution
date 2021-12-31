package com.gl.GA6.EmployeeManagement.Service;


import java.util.List;
import java.util.Optional;

import com.gl.GA6.EmployeeManagement.Entity.Roles;



public interface RoleService {
	public List<Roles> findAll();

	public Optional<Roles> findById(int theId);

	public void save(Roles theRole);

	public void deleteById(int theId);

	public Optional<Roles> findByName(String name);
}

