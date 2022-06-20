package com.learning.thread;

public class NamaMantan {
	
	int Id;
	private String Name;
	private String Karakter;

	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getKarakter() {
		return Karakter;
	}

	public void setKarakter(String karakter) {
		Karakter = karakter;
	}

	public NamaMantan() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(" ").append(Id)
		.append(":").append(Name)
		.append(", karakter=").append(Karakter).append("]");
		
		return builder.toString();
	}
}
