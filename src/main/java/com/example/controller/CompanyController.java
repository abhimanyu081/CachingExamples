package com.example.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CompanyDao;
import com.example.model.Company;
import com.example.util.StartUpUtility;


@RestController
@RequestMapping("/company")
public class CompanyController {
	
	
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CompanyDao companyDao;
	
	@RequestMapping("/test")
	public String test(){
		logger.debug("from test method ");
		return "Hello Spring boot !!";
	}
	
	@RequestMapping(value="/add",method = {RequestMethod.POST})
	public String addCompany(	
			
			@RequestParam(value="companyName",required=false)String companyName,
				
			@RequestParam(value="companyShortName",required=false)String companyShortName,
			
			@RequestParam(value="symbol",required=false)String symbol,
			@RequestParam(value="dateFounded",required=false)String dateFounded,
			
				
			@RequestParam(value="shortDescription",required=false)String shortDescription,
			
				
			@RequestParam(value="longDescription",required=false)String longDescription,
			
				
			@RequestParam(value="headQuarter",required=false)String headQuarter,
			
				
			@RequestParam(value="isActive",required=false)Boolean isActive
			
			) throws ParseException{
		Company company = new Company();
		company.setCompanyName(companyName);
		company.setCompanyShortName(companyShortName);
		company.setSymbol(symbol);
		company.setHeadQuarter(headQuarter);
		company.setIsActive(isActive);
		company.setShortDescription(shortDescription);
		company.setLongDescription(longDescription);
		System.out.println(dateFounded+":::::::::::::::");
		company.setDateFounded(StartUpUtility.parseStringDateInMySQL(dateFounded));
		logger.debug(company.toString());
		if(company!=null)
			try {
				//companyDao.save(company);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return "SUCCESS";
	}
}
