package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Feedbacks;

public interface FeedbackRepository extends JpaRepository<Feedbacks, Integer>{

}
