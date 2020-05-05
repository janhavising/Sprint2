package com.sunsoft.ViewAppointmentDetails.entity;


import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="test")
	public class Test {

		@Id
	
		private String testId;
		
		
		private String testName;
		
		public String getTestId() {
			return testId;
		}
		public void setTestId(String testId) {
			this.testId = testId;
		}
		public String getTestName() {
			return testName;
		}
		public void setTestName(String testName) {
			this.testName = testName;
		}
		
	}

