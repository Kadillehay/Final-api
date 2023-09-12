package com.coderscampus.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
	
	@Entity
	public class Farm {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private String id;
		private String farmName;
		private String product;
		private String phoneNumber;
		private String emailAddress;
		private String firstName;
		private String lastName;
		
		
		public String getFarmName() {
			return farmName;
		}
		public void setFarmName(String farmName) {
			this.farmName = farmName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return farmName;
		}
		public void setName(String name) {
			this.farmName = name;
		}
		public String getProduct() {
			return product;
		}
		public void setProduct(String product) {
			this.product = product;
		}
		public String getContactInfo() {
			return phoneNumber;
		}
		public void setContactInfo(String contactInfo) {
			this.phoneNumber = contactInfo;
		}

		
	}


