package com.learning.thread;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

import org.xml.sax.SAXException;

public class NamaMantanParser {
	
	public List<NamaMantan> parseUsers() throws ParserConfigurationException {
		NamaMantanHandler handler = new NamaMantanHandler();
		String fileName = "src/main/resources/namamantan.xml";
		File xmlDocument = Paths.get(fileName).toFile();
		
		try {
			SAXParser parser = MyRunner.createSaxParser();
			parser.parse(xmlDocument, handler);
		} catch (SAXException | IOException ex) {
			Logger lgr = Logger.getLogger(MyRunner.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);
		}
		
		return handler.getUsers();
	}
}
