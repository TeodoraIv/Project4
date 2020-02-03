package fmi.informatics.events;

import java.util.ArrayList;
import java.util.Scanner;

public class InUse implements Observer{
	private ArrayList<String> users = new ArrayList<>();

	public void addToUsers(){
		users.add("Pesho");
		users.add("Gosho");
		users.add("Mitko");
		users.add("Nikoleta");
		users.add("Vanya");
		users.add("Tedito");
	}

	public void sayHi(){
		addToUsers();
		Scanner scanner = new Scanner(System.in);
		String Hello = scanner.nextLine();
		if (Hello.equals("Здравейте")){
			for (int i=0; i<users.size(); i++){
				System.out.println(users.get(i) + " says: Здравей!");
			}
		}
	}
}
