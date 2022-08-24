package com.Universities.Model;


public class UniversitiesModel {

	private Integer Uniid;

	private String Uniname;
	private int Unipasspercentage;
	private String Uniaddress;
	
	
	public UniversitiesModel() {
		super();
	}


	public UniversitiesModel(Integer uniid, String uniname,String uniaddress,  int unipasspercentage) {
		super();
		Uniid = uniid;
		Uniname = uniname;
		Unipasspercentage = unipasspercentage;
		Uniaddress = uniaddress;
	}


	public Integer getUniid() {
		return Uniid;
	}


	public void setUniid(Integer uniid) {
		Uniid = uniid;
	}


	public String getUniname() {
		return Uniname;
	}


	public void setUniname(String uniname) {
		Uniname = uniname;
	}


	public int getUnipasspercentage() {
		return Unipasspercentage;
	}


	public void setUnipasspercentage(int unipasspercentage) {
		Unipasspercentage = unipasspercentage;
	}


	public String getUniaddress() {
		return Uniaddress;
	}


	public void setUniaddress(String uniaddress) {
		Uniaddress = uniaddress;
	}

	@Override
	public String toString() {
		return "UniversitiesModel [Uniid=" + Uniid + ", Uniname=" + Uniname + ", Unipasspercentage=" + Unipasspercentage
				+ ", Uniaddress=" + Uniaddress + "]";
	}
	
	
}
