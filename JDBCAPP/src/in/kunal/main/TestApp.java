package in.kunal.main;

import java.util.Date;

public class TestApp {

	public static void main(String[] args) {
		Date udate=new Date(); 
		System.out.println("Uadate is::"+udate);
		long value=udate.getTime();
		
		
		System.out.println("value in milisecond:: "+value);
		java.sql.Date sqlDate =new java.sql.Date(value);
		System.out.println("SQl Date is ::"+sqlDate);
	}

}
