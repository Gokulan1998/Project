package com.example.metafic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.metafic.entity.EntityClass;

public interface RepoClass extends JpaRepository<EntityClass, Integer>{
	
}
