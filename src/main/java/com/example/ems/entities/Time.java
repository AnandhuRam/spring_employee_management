package com.example.ems.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "time")
public class Time {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Employee_ID_Number ;
	
	@Column(name="Worked_Hours")
	private  String Worked_Hours ;
	
	@Column(name="Off_Hours")
	private String Off_Hours ;
	
	@Column(name="Days_Off")
	private String Days_Off ;
	
	@Column(name="Over_Time")
	private String Over_Time ;
	
	@Column(name="Extra_Days")
	private String Extra_Days ;
	
	@Column(name="From_Date_Day")
	private String From_Date_Day ;
	
	@Column(name="w_From_Date_Month")
	private String w_From_Date_Month;
	
	@Column(name="w_To_Date_Day")
	private String w_To_Date_Day;
	
	@Column(name="w_To_Date_Month")
	private String w_To_Date_Month;
	
	@Column(name="w_To_Date_Year")
	private String w_To_Date_Year;
	
	public  Time () {
		
	}
	
	
	public Time(int employee_ID_Number, String worked_Hours, String off_Hours, String days_Off, String over_Time,
			String extra_Days, String from_Date_Day, String w_From_Date_Month, String w_To_Date_Day,
			String w_To_Date_Month, String w_To_Date_Year) {
		super();
		Employee_ID_Number = employee_ID_Number;
		Worked_Hours = worked_Hours;
		Off_Hours = off_Hours;
		Days_Off = days_Off;
		Over_Time = over_Time;
		Extra_Days = extra_Days;
		From_Date_Day = from_Date_Day;
		this.w_From_Date_Month = w_From_Date_Month;
		this.w_To_Date_Day = w_To_Date_Day;
		this.w_To_Date_Month = w_To_Date_Month;
		this.w_To_Date_Year = w_To_Date_Year;
	}
	public int getEmployee_ID_Number() {
		return Employee_ID_Number;
	}
	public void setEmployee_ID_Number(int employee_ID_Number) {
		Employee_ID_Number = employee_ID_Number;
	}
	public String getWorked_Hours() {
		return Worked_Hours;
	}
	public void setWorked_Hours(String worked_Hours) {
		Worked_Hours = worked_Hours;
	}
	public String getOff_Hours() {
		return Off_Hours;
	}
	public void setOff_Hours(String off_Hours) {
		Off_Hours = off_Hours;
	}
	public String getDays_Off() {
		return Days_Off;
	}
	public void setDays_Off(String days_Off) {
		Days_Off = days_Off;
	}
	public String getOver_Time() {
		return Over_Time;
	}
	public void setOver_Time(String over_Time) {
		Over_Time = over_Time;
	}
	public String getExtra_Days() {
		return Extra_Days;
	}
	public void setExtra_Days(String extra_Days) {
		Extra_Days = extra_Days;
	}
	public String getFrom_Date_Day() {
		return From_Date_Day;
	}
	public void setFrom_Date_Day(String from_Date_Day) {
		From_Date_Day = from_Date_Day;
	}
	public String getW_From_Date_Month() {
		return w_From_Date_Month;
	}
	public void setW_From_Date_Month(String w_From_Date_Month) {
		this.w_From_Date_Month = w_From_Date_Month;
	}
	public String getW_To_Date_Day() {
		return w_To_Date_Day;
	}
	public void setW_To_Date_Day(String w_To_Date_Day) {
		this.w_To_Date_Day = w_To_Date_Day;
	}
	public String getW_To_Date_Month() {
		return w_To_Date_Month;
	}
	public void setW_To_Date_Month(String w_To_Date_Month) {
		this.w_To_Date_Month = w_To_Date_Month;
	}
	public String getW_To_Date_Year() {
		return w_To_Date_Year;
	}
	public void setW_To_Date_Year(String w_To_Date_Year) {
		this.w_To_Date_Year = w_To_Date_Year;
	}
	
}
