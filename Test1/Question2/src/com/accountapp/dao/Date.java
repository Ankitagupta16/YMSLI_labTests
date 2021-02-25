package com.accountapp.dao;

public class Date {

	private int day;
	private int month;
	private int year;
	
	//constructors
	public Date() {}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	//methods
	public void input(Date date)
	{
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	public void print()
	{
		System.out.print("    Day: "+ day);
		System.out.print("    Month: "+ month);
		System.out.print("    Year: "+ year);
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
