package com.learn.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rates")
public class RateController {
	
	@Value("${rate}")
	String rate;
	
	@Value("${tollstart}")
	String tollstart;
	
	@Value("${lanes}")
	String lanecount;
	
	@Value("${connString}")
	String connString;
	
	@GetMapping("/getRates")
	public String getRate(){
		return "rate : "+rate +" tollstart : "+ tollstart + "lanes : "+ lanecount + " connString :"+connString;
	}

	
}
