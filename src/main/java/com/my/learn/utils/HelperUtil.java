package com.my.learn.utils;

import com.my.learn.model.Customer;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class HelperUtil {

    private HelperUtil() {
    }



	public static Supplier<List<Customer>> CustomerSupplier = () ->
			Arrays.asList(
					Customer.builder().name("Wade").email("mail.@123").age(28).build(),
					Customer.builder().name("Bruce").email("mail.@123").age(50).build(),
					Customer.builder().name("Steve").email("mail.@123").age(120).build(),
					Customer.builder().name("Tony").email("mail.@123").age(45).build(),
					Customer.builder().name("Peter").email("mail.@123").age(21).build()
			);



//	public static List<Student> getStaticStudent() {
//
//
//		//System.out.println(developer);
//
//		List<Student> list = new ArrayList<>();
//
//		list.add(new Student(1, "Binay", "Gurung", 490, 500));
//		list.add(new Student(2, "Rahul", "Ghadage", 400, 500));
//		list.add(new Student(3, "Sunny", "Deol", 450, 500));
//		list.add(new Student(4, "Salman", "Khan", 440, 500));
//		list.add(new Student(5, "Aamir", "Khan", 400, 500));
//		list.add(new Student(6, "Sanjay", "Dutt", 420, 500));
//		list.add(new Student(7, "Sharukh", "Khan", 300, 500));
//		list.add(new Student(8, "Ranbir", "Kapoor", 320, 500));
//		list.add(new Student(9, "Ranveer", "Singh", 250, 500));
//		list.add(new Student(10, "Akshay", "Kumar", 280, 500));
//		list.add(new Student(11, "Ajay", "Devgan", 340, 500));
//		list.add(new Student(12, "Kishore", "Kumar", 399, 500));
//		list.add(new Student(13, "Bobby", "Deol", 345, 500));
//		list.add(new Student(14, "Rishi", "Kapoor", 355, 500));
//		list.add(new Student(15, "Jhon", "Abraham", 407, 500));
//		list.add(new Student(16, "Sunil", "Shetty", 421, 500));
//		list.add(new Student(17, "Manoj", "Bajpaye", 422, 500));
//		list.add(new Student(18, "Sunil", "Grover", 308, 500));
//		list.add(new Student(19, "Jhonny", "Lever", 267, 500));
//		list.add(new Student(20, "Abhishek", "Bachhan", 380, 500));
//		list.add(new Student(21, "Nitesh", "Deshmuk", 434, 500));
//		list.add(new Student(22, "Akshay", "Khanna", 402, 500));
//		list.add(new Student(23, "Arjit", "Singh", 347, 500));
//		list.add(new Student(24, "Kumar", "Sanu", 254, 500));
//		list.add(new Student(25, "Abhijit", "Babu", 344, 500));
//
//		return list;
//
//	}

}
