package com.company.dao;

import com.company.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao extends JpaRepository<Company,Integer> {
}
