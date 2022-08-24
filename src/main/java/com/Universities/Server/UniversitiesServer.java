package com.Universities.Server;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import com.Universities.Exception.NoIdException;
import com.Universities.Model.UniObj;
import com.Universities.Model.UniversitiesModel;


@Service
public class UniversitiesServer {

	@Autowired
	private UniObj uniRepo;

	public List<UniversitiesModel> findAll()
	{
		return uniRepo.getList();
	}
	
	public UniversitiesModel findOne(int Id) 
			//throws NoIdException
	{
		return uniRepo.getList().stream().filter(i->i.getUniid()==Id).findAny().get();
	}
	
//	public void SaveOneData(UniversitiesModel uniMod) 
//	{
//		uniRepo.getList().add(uniMod);
//	}
//	
//	public List<UniversitiesModel> updateOne(int Id , UniversitiesModel uniMod) 
//			//throws NoIdException
//	{
//			findOne(Id);
//			uniRepo.getList().get(Id).setUniname(uniMod.getUniname());
//			uniRepo.getList().get(Id).setUnipasspercentage(uniMod.getUnipasspercentage());
//			uniRepo.getList().get(Id).setUniaddress(uniMod.getUniaddress());			
//			return uniRepo.getList();
//	}
//	
//	public void deletONe(int Id) 
//			//throws NoIdException 
//	{
//		findOne(Id);
//		uniRepo.getList().remove(Id);
//	}
}
