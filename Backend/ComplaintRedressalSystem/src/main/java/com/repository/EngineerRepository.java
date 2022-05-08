package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Engineers;
public interface EngineerRepository extends JpaRepository<Engineers, String> {

}
