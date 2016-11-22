package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="st_companymaster")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String companyName;
	
	@Column(name="short_name")
	private String companyShortName;
	
	@Column(name="date_founded")
	private Date dateFounded;
	
	@Column(name="symbol")
	private String symbol;
	
	@Column(name="short_description")
	private String shortDescription;
	
	@Column(name="long_description")
	private String longDescription;
	
	@Column(name="head_quarter")
	private String headQuarter;
	
	@Column(name="is_active")
	private Boolean isActive;
		
	@Column(name="date_created")
	private Date dateCreated;
	
	
	@Column(name="date_modified")
	private Date dateModified;


	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getCompanyShortName() {
		return companyShortName;
	}



	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}



	public Date getDateFounded() {
		return dateFounded;
	}



	public void setDateFounded(Date dateFounded) {
		this.dateFounded = dateFounded;
	}



	public String getSymbol() {
		return symbol;
	}



	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}



	public String getShortDescription() {
		return shortDescription;
	}



	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}



	public String getLongDescription() {
		return longDescription;
	}



	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}



	public String getHeadQuarter() {
		return headQuarter;
	}



	public void setHeadQuarter(String headQuarter) {
		this.headQuarter = headQuarter;
	}



	public Boolean getIsActive() {
		return isActive;
	}



	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}



	public Date getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}



	public Date getDateModified() {
		return dateModified;
	}



	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}



	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", companyShortName=" + companyShortName
				+ ", dateFounded=" + dateFounded + ", symbol=" + symbol + ", shortDescription=" + shortDescription
				+ ", longDescription=" + longDescription + ", headQuarter=" + headQuarter + ", isActive=" + isActive
				+ ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + "]";
	}
	
	
	
	
	

}
