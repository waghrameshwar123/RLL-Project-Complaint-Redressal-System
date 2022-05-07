package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_feedbacks")
@Setter
@Getter
public class Feedbacks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedbackId;
	
	private int ticketId;
	private String customerEmail;
	private String feedback;
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Feedbacks [feedbackId=" + feedbackId + ", ticketId=" + ticketId + ", customerEmail=" + customerEmail
				+ ", feedback=" + feedback + "]";
	}
	public Feedbacks(int feedbackId, int ticketId, String customerEmail, String feedback) {
		super();
		this.feedbackId = feedbackId;
		this.ticketId = ticketId;
		this.customerEmail = customerEmail;
		this.feedback = feedback;
	}
	public Feedbacks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
