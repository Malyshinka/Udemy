package com.udemy.oop.dog;

public class Main {

	public static void main(String[] args) {

		Dog lab = new Dog();
		lab.setBreed("Lab");
		lab.setName("Charley");
		lab.setSize(Size.SMALL);
		lab.bark();

		Dog sheppard = new Dog();
		sheppard.setBreed("Sheppard");
		sheppard.setName("Mike");
		sheppard.setSize(Size.AVERAGE);
		sheppard.bark();

		Dog doberman = new Dog();
		doberman.setName("Jack");
		doberman.setBreed("Doberman");
		doberman.setSize(Size.BIG);
		doberman.bark();

		Size s = Size.SMALL;
		Size s1 = Size.valueOf("BIG");

		System.out.println(s1);

		Size[] values = Size.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		System.out.println("Labs name is " + lab.getName());
		System.out.println("Sheppards name is " + sheppard.getName());

	}

}
