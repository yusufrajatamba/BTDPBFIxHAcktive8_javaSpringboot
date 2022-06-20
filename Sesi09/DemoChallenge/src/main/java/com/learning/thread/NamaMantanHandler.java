package com.learning.thread;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class NamaMantanHandler extends DefaultHandler{
	private List<NamaMantan> users = new ArrayList<>();
	private NamaMantan user;
	
	private boolean bfn = false;
	private boolean bln = false;
	
	
	@Override
	public void startElement(String url, String localName, String qName, Attributes attributes) throws SAXException {
		
		if("user".equals(qName)) {
			user = new NamaMantan();
			int id = Integer.valueOf(attributes.getValue("id"));
			user.setId(id);
		}
		
		switch(qName) {
		case "name":
			bfn = true;
			break;
		case "karakter":
			bln = true;
			break;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (bfn) {
			user.setName(new String(ch, start, length));
			bfn = false;
		}
		if (bln) {
			user.setKarakter(new String(ch, start, length));
			bln = false;
		}
		
	}
	
	@Override
	public void endElement(String url, String localName, String qName) throws SAXException {
		
		if("user".equals(qName)) {
			users.add(user);
		}
	}
	
	public List<NamaMantan> getUsers() {
		return users;
	} 	
	
}
