package org.pension.vo;

import java.sql.Date;

public class reservationVO 
{
	private String rid, reservation_request, reservation_state;
	private int reservation_number, room_number, reservation_pay, reservation_person ,reservation_days;
	private Date reservation_date;
	public reservationVO() {}
	public reservationVO(String rid, String reservation_request, String reservation_state, int reservation_number,
			int room_number, int reservation_pay, int reservation_person, int reservation_days, Date reservation_date) {
		super();
		this.rid = rid;
		this.reservation_request = reservation_request;
		this.reservation_state = reservation_state;
		this.reservation_number = reservation_number;
		this.room_number = room_number;
		this.reservation_pay = reservation_pay;
		this.reservation_person = reservation_person;
		this.reservation_days = reservation_days;
		this.reservation_date = reservation_date;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getReservation_request() {
		return reservation_request;
	}
	public void setReservation_request(String reservation_request) {
		this.reservation_request = reservation_request;
	}
	public String getReservation_state() {
		return reservation_state;
	}
	public void setReservation_state(String reservation_state) {
		this.reservation_state = reservation_state;
	}
	public int getReservation_number() {
		return reservation_number;
	}
	public void setReservation_number(int reservation_number) {
		this.reservation_number = reservation_number;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public int getReservation_pay() {
		return reservation_pay;
	}
	public void setReservation_pay(int reservation_pay) {
		this.reservation_pay = reservation_pay;
	}
	public int getReservation_person() {
		return reservation_person;
	}
	public void setReservation_person(int reservation_person) {
		this.reservation_person = reservation_person;
	}
	public int getReservation_days() {
		return reservation_days;
	}
	public void setReservation_days(int reservation_days) {
		this.reservation_days = reservation_days;
	}
	public Date getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(Date reservation_date) {
		this.reservation_date = reservation_date;
	}
	
	
	
}
