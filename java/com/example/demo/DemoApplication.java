package com.example.demo;

import com.example.demo.algo.controller.AlgoController;
import com.example.demo.quiz.controller.Feb07Controller;
import com.example.demo.quiz.controller.QuizController;
import com.example.demo.member.controller.MemberController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.phone.controller.PhoneController;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		PhoneController phoneController = new PhoneController();
		MemberController memberController = new MemberController();
		QuizController quizController = new QuizController();
		Feb07Controller feb07Controller = new Feb07Controller();
		AlgoController algoController = new AlgoController();
		while(true){
			System.out.println("### MENU ### 0. EXIT  1 . phone  2.  AUTH  3.  Quiz  4.  Feb07");
			switch (scanner.next()){
				case "0":
					System.out.println("EXIT"); return;
				case "1":
					System.out.println("### OOP ###");
					phoneController.execute(scanner);
				break;
				case "2":
					System.out.println("### AUTH ###");
					memberController.execute(scanner);
				break;
				case "3":
					System.out.println("### Quiz ###");
					quizController.execute(scanner);
				break;
				case "4":
					System.out.println("### Feb07 ###");
					feb07Controller.execute(scanner);
				break;

				case "5":
					System.out.println("### Algorithm ###");
					algoController.execute(scanner);
			}

		}

	}

}
