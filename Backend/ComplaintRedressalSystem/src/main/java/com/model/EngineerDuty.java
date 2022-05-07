package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_engineerDuty")
@Setter
@Getter
public class EngineerDuty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int engineerDutyId;
	
	private String engineerEmail;
	private int ticketId;
	private String customerEmail;
	public int getEngineerDutyId() {
		return engineerDutyId;
	}
	public void setEngineerDutyId(int engineerDutyId) {
		this.engineerDutyId = engineerDutyId;
	}
	public String getEngineerEmail() {
		return engineerEmail;
	}
	public void setEngineerEmail(String engineerEmail) {
		this.engineerEmail = engineerEmail;
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
	@Override
	public String toString() {
		return "EngineerDuty [engineerDutyId=" + engineerDutyId + ", engineerEmail=" + engineerEmail + ", ticketId="
				+ ticketId + ", customerEmail=" + customerEmail + "]";
	}
	public EngineerDuty(int engineerDutyId, String engineerEmail, int ticketId, String customerEmail) {
		super();
		this.engineerDutyId = engineerDutyId;
		this.engineerEmail = engineerEmail;
		this.ticketId = ticketId;
		this.customerEmail = customerEmail;
	}
	public EngineerDuty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
