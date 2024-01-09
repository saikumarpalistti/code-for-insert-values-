package com.example.demo.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerp {
@Autowired
servicep sp;

@PostMapping("/insertp")
String ddd(@RequestBody pojop p)
{
	try {
	int r=sp.insertp(p);
	if(r==1) return "one row inserted";
	else return "nothing happend";
}
catch(Exception e)
	{
	return e.getMessage();
	}
}
}
