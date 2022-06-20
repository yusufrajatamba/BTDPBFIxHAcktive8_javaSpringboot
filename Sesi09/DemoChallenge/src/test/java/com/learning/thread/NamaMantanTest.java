package com.learning.thread;

import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.Test;
    

public class NamaMantanTest {

    
        @Test
        public void parseUser() throws ParserConfigurationException {
            NamaMantanParser parser = new NamaMantanParser();
            List<NamaMantan> lines = parser.parseUsers();
            lines.forEach(System.out::print);
        }
    }
    
    

