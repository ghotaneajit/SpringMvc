package com.example.registration.entityRepo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Emp {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int empId;
		private String empName;
		private String address;
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Emp(int empId, String empName, String address) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.address = address;
		}
		public Emp() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Emp [empId=" + empId + ", empName=" + empName + ", address=" + address + ", getEmpId()="
					+ getEmpId() + ", getEmpName()=" + getEmpName() + ", getAddress()=" + getAddress() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
	
	

}
