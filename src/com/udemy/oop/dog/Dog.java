package com.udemy.oop.dog;

public class Dog {

	private static int dogsCount;

	public static int getDogsCount() {
		return dogsCount;
	}

	public Dog() {
		dogsCount++;
		System.out.println("Dog's count is: " + dogsCount);
	}

	private static final int PAWS = 4;
	private static final int TAIL = 1;
	private String name;
	private String breed;
	private Size size;

	public void bark() {
		switch (size) {
		case SMALL:
			System.out.println("Wof-wof");
			break;
		case AVERAGE:
			System.out.println("Tjaf-tjaf");
			break;
		case BIG:
			System.out.println("Baw-Baw");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + size);
		}
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void bite() {
		if (dogsCount > 2) {
			System.out.println("Dogs are biting you");
		} else {
			bite();
		}

	}

}
