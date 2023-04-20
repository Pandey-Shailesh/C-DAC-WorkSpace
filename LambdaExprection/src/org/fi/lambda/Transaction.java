package org.fi.lambda;

import java.time.LocalDate;

public class Transaction {

	long cardNo;
	int amount;
	boolean status;
	//Java 8 - JODA
	LocalDate txtDate;
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDate getTxtDate() {
		return txtDate;
	}
	public void setTxtDate(LocalDate txtDate) {
		this.txtDate = txtDate;
	}
	public Transaction(long cardNo, int amount, boolean status, LocalDate txtDate) {
		super();
		this.cardNo = cardNo;
		this.amount = amount;
		this.status = status;
		this.txtDate = txtDate;
	}
	
	
}
