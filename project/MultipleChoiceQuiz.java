package com.project;

import java.util.Scanner;

public class MultipleChoiceQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] correctAnswers = {"b","a","c","b","c","a","b","a","b","a"};
		String[] Response = new String[10];
		int score = 0;
		
		System.out.println("===== Java Multiple Choice Question =====\n");
		
		//Questions are 10 starting from [0] ends with [9]
		Response[0] = askQuestion(sc,1,"Number of Primitive data types in Java are ?",
				                       "a) 6","b) 8","c) 7");
		
		Response[1] = askQuestion(sc,2,"What is the size of float and double in Java ?",
                "a) 32 and 64","b) 64 and 32","c) 64 and 64");
		
		Response[2] = askQuestion(sc,3,"Automatic type coversion is possible in which of the possible cases ?",
                "a) Byte to int","b) long to int","c) Int to long");
		
		Response[3] = askQuestion(sc,4,"When an array is passed to a method, what does the method receive ?",
                "a) A Copy of the array","b) The Reference if the array","c) Length of the array");
		
		Response[4] = askQuestion(sc,5,"Arrays in Java are ?",
                "a) Object Reference","b) Primitive data type","c) Object");
		
		Response[5] = askQuestion(sc,6,"When is the object created with new keyword ?",
                "a) At run time","b) At compile time","c) Depends on the code");
		
		Response[6] = askQuestion(sc,7,"In which of the following is toString() method defined ?",
                "a) java.lang.String","b) java.lang.Object","c) java.lang.util");
		
		Response[7] = askQuestion(sc,8,"compareTo() returns ?",
                "a) An int Value","b) True","c) False");
		
		Response[8] = askQuestion(sc,9,"Identify the return type of method that does not return any value ?",
                "a) int","b) void","c) double");

		Response[9] = askQuestion(sc,10,"Identify the modifier which cannot be used for constructor ?",
                "a) static","b) public","c) private");
		
		for(int i=0;i<10;i++) {
			
			if(Response[i].equalsIgnoreCase(correctAnswers[i])) {
				score++;
			}
		}
		
		System.out.println("Your Score: "+score+" out of "+correctAnswers.length);
		if(score>=6) {
			System.out.println("You Passed :)");
		}
		else {
			System.out.println("You Failed :(");
		}
		sc.close();
	}
	


	public static String askQuestion(Scanner sc,int num,String question,String option1,String option2,String option3) {
		System.out.println(num +") "+question);
		System.out.println(option1);
		System.out.println(option2);
		System.out.println(option3);
		System.out.println("Your Answer (a/b/c) : ");
		return getValidResponse(sc);
	}



	private static String getValidResponse(Scanner sc) {
		String resp;
		
		while(true) {
			resp=sc.next();
			
			if(resp.equalsIgnoreCase("a") || resp.equalsIgnoreCase("b")|| resp.equalsIgnoreCase("c")) {
				break;
			}
			else {
				System.out.println("Invalid input.. Please Enter a,b or c");
			}
		}
		return resp;
	}
	
}
