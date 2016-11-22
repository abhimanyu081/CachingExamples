package com.example.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StartUpUtility {
	
	public static final String DATE_FORMAT_STR_MYSQL = "yyyy-MM-dd";
	
	public static Date parseStringDateInMySQL(String dateStr) throws ParseException{
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_STR_MYSQL);
		Date parsedDate =dateFormat.parse(dateStr);
		return parsedDate;
		
	}

}
