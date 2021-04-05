package com.example.customItemWriter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
//@Component 
@Entity
@Table( name = "stu_table")
@Data
public class StudentBean {
	@Id
	@GeneratedValue
	Integer stu_id;
	String stu_name;
	String stu_sub;
	Integer stu_no;

}
