package com.belajar.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nama")
	private String nama;
	
	@Column(name = "harga_beli")
	private Long hargaBeli;
	
	@Column(name = "harga_jual")	
	private Long hargaJual;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Long getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(Long hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public Long getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(Long hargaJual) {
		this.hargaJual = hargaJual;
	}
	
}
