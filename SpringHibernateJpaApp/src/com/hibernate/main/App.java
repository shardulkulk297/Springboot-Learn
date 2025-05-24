package com.hibernate.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hibernate.main.model.Learner;
import com.hibernate.main.service.LearnerService;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		LearnerService learnerService = context.getBean(LearnerService.class);
		
		boolean running = true;
		while(running) {
			System.out.println("1. Insert Learner");
			System.out.println("2. Update Learner");
			System.out.println("3. GetAll Learners");
			System.out.println("4. Get Learner By id");
			System.out.println("5. Delete Learner");
			System.out.println("0. EXIT");
			System.out.println("Enter choice: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1->{
				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter Email");
				String email = sc.next();
				System.out.println("Enter contact: ");
				String contact = sc.next();
				learnerService.insert(name, email, contact);
				System.out.println("Inserted Successfully");
			}
			case 2->{
				System.out.println("Enter Id of learner you want to update:");
				int id = sc.nextInt();
				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter Email");
				String email = sc.next();
				System.out.println("Enter contact: ");
				String contact = sc.next();
				learnerService.update(id, name, email, contact);
				System.out.println("Updated Successfully");
			}
			
			case 3->{
				
				List<Learner> learners = learnerService.getAll();
				System.out.println("All learners");
				for(Learner l: learners) {
					System.out.println(l);
				}
				
			}
			
			case 4->{
				System.out.println("Enter ID: ");
				int id = sc.nextInt();
				Learner learner = learnerService.getLearnerById(id);	
				System.out.println(learner);
			}
			
			case 5->{
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				learnerService.deleteLearnerById(id);
				System.out.println("Deleted Successfully");
			}
			
			case 0->{
				System.out.println("Thanks for visiting");
				running = false;
			}
			
			default->{
				System.out.println("Invalid Choice");
			}
			}
		}
		
		
		context.close();
		
	}

}
