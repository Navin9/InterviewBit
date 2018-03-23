package com.csvreader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import java.sql.*;


public class CSVReader1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file="C:\\Users\\navin\\Desktop\\input1.csv";
		
		try {
			CSVReader reader=new CSVReader(new FileReader(file) );
			String []line=null;//int i=0;
			while((line=reader.readNext())!=null)
			{
				System.out.println(line[0] + " " + line[1] + " " + line[2]);
			//i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
		 Statement stat=con.createStatement();
		 String query="CREATE TABLE IF NOT EXISTS VENDOR_ID " +
                 "(sno INTEGER not NULL , " +
                 " vendorname VARCHAR(255), " + 
                 " transaction INTEGER )"; 
		 Boolean res=stat.execute(query);//"Create table vendor_id ( Sno VARCHAR2(10),vendorname VARCHAR2(20),Transaction NUMBER(2))");
		System.out.println(res);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
