package com.service;
import java.util.List;

import com.model.Feedbacks;

public interface FeedbackService {
	List<Feedbacks> fetchAllFeedbacks();
	void saveFeedback (Feedbacks feedback);
	

}
