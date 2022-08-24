package com.Universities.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UniObj {
	
private static List<UniversitiesModel> userDataEmp = new ArrayList<UniversitiesModel>();
	
	static {
		userDataEmp.add(new UniversitiesModel(1,"Nikhil","DevOps",20000));
		userDataEmp.add(new UniversitiesModel(2,"Mahesh","Sales Manager",70000));
		userDataEmp.add(new UniversitiesModel(3,"Abhil","DevOps",80000));
		userDataEmp.add(new UniversitiesModel(4,"Teja","BackEnd",40000));
		userDataEmp.add(new UniversitiesModel(5,"Rakshith","Cyber Securities",50000));
		userDataEmp.add(new UniversitiesModel(6,"Raga","Sport",90000));
		userDataEmp.add(new UniversitiesModel(7,"Ravi","Sql",30000));
		userDataEmp.add(new UniversitiesModel(8,"NIKI","Hello",20000));
	}
	
	public static List<UniversitiesModel> getList()
	{return userDataEmp;}
}
