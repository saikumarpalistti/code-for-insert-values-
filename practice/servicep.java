package com.example.demo.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class servicep {
@Autowired
JdbcTemplate jd;

 int insertp(pojop jp)
 {
	 String area=jp.getArea();
	 int street =jp.getStreet();
	 int number=jp.getNumber();
	 String q="insert into serveyVzm values(?,?,?)";
	 return jd.update(q,area,street,number); 
 }
}
