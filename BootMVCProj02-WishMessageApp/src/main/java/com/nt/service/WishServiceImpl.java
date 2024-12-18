package com.nt.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishServiceImpl implements IWishService {

	@Override
	public String generateWishMessage() {
	//System date and time
		LocalDateTime ldt=LocalDateTime.now();
		//get current hour of the day
		int hour=ldt.getHour();
		if(hour<12)
			return "Good morning";
		else if(hour<16 )
			return"Good AfterNoon";
		else if(hour<20)
			return "Good Evening";
		else
			
		return "Good night";
	}

}
