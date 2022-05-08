package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_complaints")
@Setter
@Getter
public class Complaints {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	
	private String customerEmail;
	private String pincode;
	private String complaint;
	private String status = "raised";
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Complaints [ticketId=" + ticketId + ", customerEmail=" + customerEmail + ", pincode=" + pincode
				+ ", complaint=" + complaint + ", status=" + status + "]";
	}
	public Complaints(int ticketId, String customerEmail, String pincode, String complaint, String status) {
		super();
		this.ticketId = ticketId;
		this.customerEmail = customerEmail;
		this.pincode = pincode;
		this.complaint = complaint;
		this.status = status;
	}
	public Complaints() {
		super();
		// TODO Auto-generated constructor stub
	}

}

