package com.stackroute.exercise3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author sumanth reddy 
 * Program to print start and end date of current week
 */
public class FirstLastDay {

	public static void main(String[] args) {
		try {
			FirstLastDay wDates = new FirstLastDay();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter date to get start and end date of that week: ");
			String date = scanner.next();
			System.out.println(wDates.getStartEndDates(date));
			scanner.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * @param date
	 * @return output 
	 * method to get start and last dates of a week
	 */
	public String getStartEndDates(String date) {
		StringBuffer output = new StringBuffer();
		try {
			SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");
			Date sDate = sDF.parse(date);
			Calendar calender = Calendar.getInstance();
			calender.setTime(sDate);
			calender.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
			DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
			output.append(df.format(calender.getTime())).append("\n");
			calender.add(Calendar.DATE, 6);
			output.append(df.format(calender.getTime()));
		} catch (Exception e) {
			System.out.println(e);
		}
		return output.toString();
	}
}