package fmi.informatics.extending;

import fmi.informatics.interfaces.Active;
import fmi.informatics.interfaces.Adaptable;

// Променяме класа Person да бъде абстрактен. 
// Добавяме метод goBar() и абстрактният метод getTypicalDrink()
// Имплементираме интерфейсите Active, Adapdable и имплементираме абстрактните им методи.
public abstract class Person implements Active, Adaptable {

	private static String planet = "Earth";
	private static int variable = 0;

	public Person(String name, int egn,String specialty, int age, int height) {
	}

	public static int getVariable() {
		return variable;
	}

	public static String getPlanet() {
		return planet;
	}

	private String name = "Konstantin Rusev";
	private int egn;
	private char gender;
	private boolean isMale;
	private int age;
	private int height;
	private int weight;
	private String title;
	private String specialty;
	private int facNumber;

	public Person(String name,int egn, boolean isMale, int age, int height,
				  String title, String specialty, int facNumber) {
		this.name = name;
		this.egn = egn;
		this.isMale = isMale;
		this.age = age;
		this.height = height;
		this.title = title;
		this.specialty = specialty;
		this.facNumber = facNumber;
	}

	public void walk() {
		variable++;
		System.out.println("The person is walking");
	}

	public void run() {
		variable--;
		System.out.println("The person is running");
	}

	public void move(int kmPerHour) {
		if (kmPerHour <= 5) {
			walk();
		} else {
			run();
		}
	}

	// Дефиниране на абстрактен метод -> тук няма имплементация, но класовете
	// наследници, които не са абстрактни класове са задължени да го имплементират
	protected abstract String getTypicalDrink();

	public void goBar() {
		System.out.println("The " + this.getClass().getSimpleName() +
				" " + getName() + " drinking ");
		System.out.println(getTypicalDrink());
	}

	@Override
	public void getShower() {
		System.out.println("The person is getting shower");
	}

	// Getters and setters
	public String getName() {
		if (this.name == null) {
			this.name = "Default";
		}
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEgn() {
		return egn;
	}

	public void setEgn(int egn) {
		this.egn = egn;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getFacNumber() {
		return facNumber;
	}

	public void SetFacNumber(int facNUumber) {
		this.facNumber = facNumber;
	}
}