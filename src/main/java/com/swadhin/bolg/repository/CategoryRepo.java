package com.swadhin.bolg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swadhin.bolg.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}