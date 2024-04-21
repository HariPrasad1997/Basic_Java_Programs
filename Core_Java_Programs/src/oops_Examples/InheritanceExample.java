package oops_Examples;

class Animal {
	public void makeSound() {
		System.out.println("Generic Animal Sound");
	}
}

class Dog extends Animal {

	public void makeSound() {
		System.out.println("Woof !..");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
	}

}
