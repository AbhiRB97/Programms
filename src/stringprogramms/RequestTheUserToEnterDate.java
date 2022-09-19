package stringprogramms;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RequestTheUserToEnterDate{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Date");
		String date = s.next();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("DD/MM/YYYY");
		try
		{
			d.parse(date);
			System.out.println("valid Date");
		}
		catch(Exception e)
		{
			System.out.println("Invalid date");
			
		}
	}
}
