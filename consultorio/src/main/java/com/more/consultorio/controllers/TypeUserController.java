package com.more.consultorio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.more.consultorio.models.entity.TypeUser;
import com.more.consultorio.models.services.ITypeUserService;

@RestController
@RequestMapping("/api")
public class TypeUserController {
	
	@Autowired
	private ITypeUserService typeUserService;
	
	@GetMapping("/listado")
	public List<TypeUser> index(){
		return this.typeUserService.findAll();
	}
}