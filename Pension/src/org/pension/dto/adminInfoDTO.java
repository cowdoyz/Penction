package org.pension.dto;

import java.sql.Date;

public class adminInfoDTO 
{
	private String room_name, reservation_request;
	private String reservation_state,rid, id ,pw, name, phone, email;
	private int room_number, room_maxperson, room_price, reservation_number, room_number_1, reservation_pay, reservation_days;
	private int reservation_person;
	private Date reservation_date;
	
	public adminInfoDTO() {
		// TODO Auto-generated constructor stub
	}

	public adminInfoDTO(String room_name, String reservation_request, String reservation_state, String rid, String id,
			String pw, String name, String phone, String email, int room_number, int room_maxperson, int room_price,
			int reservation_number, int room_number_1, int reservation_pay, int reservation_days,
			int reservation_person, Date reservation_date) {
		super();
		this.room_name = room_name;
		this.reservation_request = reservation_request;
		this.reservation_state = reservation_state;
		this.rid = rid;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.room_number = room_number;
		this.room_maxperson = room_maxperson;
		this.room_price = room_price;
		this.reservation_number = reservation_number;
		this.room_number_1 = room_number_1;
		this.reservation_pay = reservation_pay;
		this.reservation_days = reservation_days;
		this.reservation_person = reservation_person;
		this.reservation_date = reservation_date;
	}

	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
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

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
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

	public int getReservation_number() {
		return reservation_number;
	}

	public void setReservation_number(int reservation_number) {
		this.reservation_number = reservation_number;
	}

	public int getRoom_number_1() {
		return room_number_1;
	}

	public void setRoom_number_1(int room_number_1) {
		this.room_number_1 = room_number_1;
	}

	public int getReservation_pay() {
		return reservation_pay;
	}

	public void setReservation_pay(int reservation_pay) {
		this.reservation_pay = reservation_pay;
	}

	public int getReservation_days() {
		return reservation_days;
	}

	public void setReservation_days(int reservation_days) {
		this.reservation_days = reservation_days;
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
