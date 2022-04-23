package com.zensar.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.zensar.bean.Gender;

public class InputPrompter {

	public static String promptInputForString(String label) {
		System.out.printf("\t\t %-40s", label);
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		return text;
	}

	public static char promptInputForChar(String label) {
		System.out.printf("\t\t %-40s", label);
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		return text.charAt(0);

	}

	public static int promptInputForInt(String label) {
		System.out.printf("\t\t %-40s", label);
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		return Integer.parseInt(text);

	}

	public static double promptInputForDouble(String label) {
		System.out.printf("\t\t %-40s", label);
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		return Double.parseDouble(text);
	}

	public static LocalDate promptForDateInput(String promptMessage,
			String format) {
		System.out.printf("\t\t %-40s" + " : ", promptMessage + " " + format);
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		LocalDate localDate = LocalDate.parse(str,
				DateTimeFormatter.ofPattern(format));
		return localDate;
	}

	public static Gender promptForGenderInput(String promptMessage) {
		int input = promptInputForInt(promptMessage);
		if (input == 1)
			return Gender.MALE;
		return Gender.FEMALE;
	}

}