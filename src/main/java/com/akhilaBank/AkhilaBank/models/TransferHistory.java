package com.akhilaBank.AkhilaBank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transfer_history")
public class TransferHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long history_id;

	private String sender_account_number;

	private String receiver_account_number;
	
	private Double amount_transfered;

	public TransferHistory() {
		super();
	}
	
	

	public TransferHistory(String sender_account_number, String receiver_account_number, Double amount_transfered) {
		super();
		this.sender_account_number = sender_account_number;
		this.receiver_account_number = receiver_account_number;
		this.amount_transfered = amount_transfered;
	}



	public Long getHistory_id() {
		return history_id;
	}

	public void setHistory_id(Long history_id) {
		this.history_id = history_id;
	}

	public String getSender_account_number() {
		return sender_account_number;
	}

	public void setSender_account_number(String sender_account_number) {
		this.sender_account_number = sender_account_number;
	}

	public String getReceiver_account_number() {
		return receiver_account_number;
	}

	public void setReceiver_account_number(String receiver_account_number) {
		this.receiver_account_number = receiver_account_number;
	}

	public Double getAmount_transfered() {
		return amount_transfered;
	}

	public void setAmount_transfered(Double amount_transfered) {
		this.amount_transfered = amount_transfered;
	}

}
