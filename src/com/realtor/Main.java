package com.realtor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub on Dec 31 ,2021

		try {
			// step1 load the driver class
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String connectionUrl = "jdbc:sqlserver://localhost:52188;databaseName=Realtor;user=sachin;password=sachin";

			// step2 create the connection object
			Connection con = DriverManager.getConnection(connectionUrl);

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from HouseDetails");

			ArrayList<HouseDetails> hdlist = new ArrayList<HouseDetails>();

			while (rs.next()) {
				// System.out.println(rs.getString(1) + " " + rs.getString(2) + " " +
				// rs.getString(3));
				HouseDetails hd = buildHouseDeatils(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getFloat(5), rs.getDate(6), rs.getInt(7), rs.getString(8));

				hdlist.add(hd);

			}

			printHouseDeatils(hdlist);

			//stmt.executeQuery();
			stmt.executeUpdate("update HouseDetails set Cost =Cost+100000 where listingID= '21030545' ");
			stmt.executeUpdate("delete HouseDetails where listingID= '2341333'");




			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void printHouseDeatils(ArrayList<HouseDetails> hdlist) {
		// TODO Auto-generated method stub

		for (Iterator iterator = hdlist.iterator(); iterator.hasNext();) {
			HouseDetails houseDetails = (HouseDetails) iterator.next();

			System.out.println(houseDetails.toString());

		}

	}

	private static HouseDetails buildHouseDeatils(String listingID, String realtorID, String address, String city,
			Float cost, Date statusDate, Integer yearBuilt, String question ) {
		// TODO Auto-generated method stub

		HouseDetails hd = new HouseDetails();
		hd.setListingID(listingID);
		hd.setRealtorID(realtorID);
		hd.setAddress(address);
		hd.setCity(city);
		hd.setCost(cost);
		hd.setStatusDate(statusDate);
		hd.setYearBuilt(yearBuilt);
		hd.setQuestion(question);


		return hd;

	}

}
