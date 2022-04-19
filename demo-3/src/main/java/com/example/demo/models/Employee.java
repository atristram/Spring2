package com.example.demo.models;

public class Employee {

		private String name;
		private int salary;
		private String designation;
		private String age;

		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}
		
}
