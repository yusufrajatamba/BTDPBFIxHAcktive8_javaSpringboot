package com.finalproject.yusuf.bus.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="agency")
public class Agency {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String code;
	
	private String name;
	
	private String details;
	@ManyToOne(fetch = FetchType.LAZY)
	
	@JoinColumn(name = "owner_user_id")
	private User owner;
	
	@OneToMany(mappedBy = "agency", cascade = CascadeType.ALL)
	private Set<Bus> buses;
	
}