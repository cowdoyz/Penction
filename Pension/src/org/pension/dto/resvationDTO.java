package org.pension.dto;

import java.sql.Date;

public class resvationDTO
{
	private String room_name, rid, reservation_request, reservation_State;
	private int room_number, room_number_1, room_maxperson, room_price, reservation_Number, reservation_days;
	private int reservation_pay, reservation_person;
	private Date reservation_date;
	public resvationDTO() {}
	public resvationDTO(String room_name, String rid, String reservation_request, String reservation_State,
			int room_number, int room_number_1, int room_maxperson, int room_price, int reservation_Number,
			int reservation_days, int reservation_pay, int reservation_person, Date reservation_date) {
		super();
		this.room_name = room_name;
		this.rid = rid;
		this.reservation_request = reservation_request;
		this.reservation_State = reservation_State;
		this.room_number = room_number;
		this.room_number_1 = room_number_1;
		this.room_maxperson = room_maxperson;
		this.room_price = room_price;
		this.reservation_Number = reservation_Number;
		this.reservation_days = reservation_days;
		this.reservation_pay = reservation_pay;
		this.reservation_person = reservation_person;
		this.reservation_date = reservation_date;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
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
	public String getReservation_State() {
		return reservation_State;
	}
	public void setReservation_State(String reservation_State) {
		this.reservation_State = reservation_State;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public int getRoom_number_1() {
		return room_number_1;
	}
	public void setRoom_number_1(int room_number_1) {
		this.room_number_1 = room_number_1;
	}
	public int getRoom_maxperson() {
		return room_maxperson;
	}
	public void setRoom_maxperson(int room_maxperson) {
		this.room_maxperson = room_maxperson;
	}
	public int getRoom_price() {
		return room_price;
	}
	public void setRoom_price(int room_price) {
		this.room_price = room_price;
	}
	public int getReservation_Number() {
		return reservation_Number;
	}
	public void setReservation_Number(int reservation_Number) {
		this.reservation_Number = reservation_Number;
	}
	public int getReservation_days() {
		return reservation_days;
	}
	public void setReservation_days(int reservation_days) {
		this.reservation_days = reservation_days;
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
	public Date getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(Date reservation_date) {
		this.reservation_date = reservation_date;
	}
	
	
	
	
	
	
	
	
}
