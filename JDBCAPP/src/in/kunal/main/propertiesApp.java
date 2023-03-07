package in.kunal.main;
import java.io.*;
import java.util.*;

public class propertiesApp {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("input.txt");
		Properties properties=new Properties();
		properties.load(fis);
		
		String url=properties.getProperty("url");
		String user=properties.getProperty("user");
		String password=properties.getProperty("password");
		System.out.println("URL is:"+url);
		System.out.println("user is:"+user);
		System.out.println("password is:"+password);

	}

}
