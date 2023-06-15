package com.sample1;

public class sample1 {

	public static void main(String[] args) {

		String s = "Computer Programming";

		// 1. TO FIND THE LENGTH OF THE STRING

		int length = s.length();
		System.out.println("Length of the string is" + length);

		// 2. TO CONVERT A STRING TO UPPERCASE

		String s1 = s.toUpperCase();
		System.out.println(s1);

		// 3. TO CONVERT A STRING TO LOWERCASE

		String s2 = s.toLowerCase();
		System.out.println(s2);

		// 4. TO FIND THE PARTICULAR CHARACTER FROM THE STRING

		char s3 = s.charAt(4);
		System.out.println(s3);

		// 5. TO CHECK WHETHER THE STRING STARTS WITH PREFIX OR NOT

		boolean s4 = s.startsWith("Comp");
		System.out.println(s4);

		// 6. TO CHECK WHETHER THE PARTICULAR STRING WITH SUFFIX OR NOT
		// false since the given string "program" p is small case so it defines as false

		boolean s5 = s.endsWith("Program");
		System.out.println(s5);

		// 7. TO CHECK WHETHER THE STRING IS EMPTY OR NOT

		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		//8. TO REPLACE THE PARTICULAR STRING
		
		String replace = s.replace("Computer", "Basic");
		System.out.println(replace);
		
		
		
		//9. indexOf - – TO FIND THE PARTICULAR CHARACTER OF THE STRING
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		
		
		
		//10. TO FIND THE LASTINDEXOF PARTICULAR CHARACTER IN THE STRING
		
		int lastIndexOf = s.lastIndexOf("m");
		System.out.println(lastIndexOf);

	}

}
