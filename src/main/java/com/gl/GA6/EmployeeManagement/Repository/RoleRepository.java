package com.gl.GA6.EmployeeManagement.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.GA6.EmployeeManagement.Entity.Roles;



public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
