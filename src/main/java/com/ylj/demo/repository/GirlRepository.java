package com.ylj.demo.repository;

import com.ylj.demo.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
