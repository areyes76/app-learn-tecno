/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author areyesgaray
 */
@Document
public class Address {
	@Id
	private String id;
	private String line_1;
	private String line_2;
	private String line_3;
	private String city;
	private int idState;
	private String state;
	private String postcode;
	private String country;
	private String number;
	private String local;
	private String mall;
	private String telephone;
	@Field("location")
	private Location location;
	private String[] benefits;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getLine_1() {
		return line_1;
	}

	public void setLine_1(String line_1) {
		this.line_1 = line_1;
	}

	public String getLine_2() {
		return line_2;
	}

	public void setLine_2(String line_2) {
		this.line_2 = line_2;
	}

	public String getLine_3() {
		return line_3;
	}

	public void setLine_3(String line_3) {
		this.line_3 = line_3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the idState
	 */
	public int getIdState() {
		return idState;
	}

	/**
	 * @param idState
	 *            the idState to set
	 */
	public void setIdState(int idState) {
		this.idState = idState;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getMall() {
		return mall;
	}

	public void setMall(String mall) {
		this.mall = mall;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @return the benefits
	 */
	public String[] getBenefits() {
		return benefits;
	}

	/**
	 * @param benefits
	 *            the benefits to set
	 */
	public void setBenefits(String[] benefits) {
		this.benefits = benefits;
	}

	@Override
	public String toString() {
		return "Address{" + "line_1=" + line_1 + ", line_2=" + line_2 + ", line_3=" + line_3 + ", city=" + city
				+ ", state=" + state + ", postcode=" + postcode + ", country=" + country + ", number=" + number
				+ ", local=" + local + ", mall=" + mall + ", telephone=" + telephone + '}';
	}

}
