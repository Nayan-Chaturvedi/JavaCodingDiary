package com.Validation.Validation;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Employes")
public class Employee 
{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		@NotEmpty(message = "Name cannot be empty")
		@Size(min = 5, max = 20, message = "Name length should bebetween 5 and 20")
		private String name;
		@Email(message = "Email is not valid")
		private String email;
		@Min(value = 18, message = "Age must be 18 and 30")
		@Max(value = 18, message = "Age must be 18 and 30")
		private Integer age;
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
		
		
		
		
}
