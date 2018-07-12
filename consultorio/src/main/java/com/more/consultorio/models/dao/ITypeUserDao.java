package com.more.consultorio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.more.consultorio.models.entity.TypeUser;

public interface ITypeUserDao extends CrudRepository<TypeUser, Long>{
	
}
