package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Company;

public interface CompanyDao extends CrudRepository<Company, Long>{

}
