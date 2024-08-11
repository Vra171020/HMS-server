package com.Hospital.Management.System.doclogin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicines")
public class Medicine {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	@Column(name="drug_name")
	private String drugname;
	
	private String stock;

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicine(long id, String drugname, String stock) {
		super();
		this.id = id;
		this.drugname = drugname;
		this.stock = stock;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDrugname() {
		return drugname;
	}

	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", drugname=" + drugname + ", stock=" + stock + "]";
	}
	
	
}
