package Polymorphism;


class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("cat meows");
	}
}


public class ovveridingex {
	public static void main(String[] args) {
		Animal a;
		
		a = new Dog();
		a.sound();
		
		a = new Cat();
		a.sound();
		
		

	}

}
