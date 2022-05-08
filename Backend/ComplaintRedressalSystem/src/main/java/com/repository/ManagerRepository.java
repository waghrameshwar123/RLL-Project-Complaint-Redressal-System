package com.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.model.Complaints;
import com.model.Managers;
public interface ManagerRepository extends CrudRepository<Managers, String> {


}
