package in.kunal.main;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ConversionCode {

	public static void main(String[] args) throws Exception {
		
		//read input from user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date :: (dd-mm-yyy)");
		String sdate=sc.next();
		
		//convert date from string format to java.util.Date
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate=sdf.parse(sdate);
		
		//convet java.util.Date into java.sql.date
		long value=uDate.getTime();
		java.sql.Date sqlDate=new java.sql.Date(value);
		
		System.out.println("string format date:"+sdate);
		System.out.println("util date:"+uDate);
		System.out.println("SQl date:"+sqlDate);
		
		
		
		
		System.out.println("enter date:: (yyy-MM-dd) ");
		String standradInputString=sc.next();
		java.sql.Date sqlstdinput=java.sql.Date.valueOf(standradInputString);
		System.out.println("standard Date :"+standradInputString);
		System.out.println("sqlstandrad date:"+sqlstdinput);
		
		sc.close();
		
	}

}
