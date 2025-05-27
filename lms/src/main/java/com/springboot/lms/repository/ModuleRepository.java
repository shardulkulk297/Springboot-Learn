package com.springboot.lms.repository;

import com.springboot.lms.model.LModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<LModule, Integer> {



}
