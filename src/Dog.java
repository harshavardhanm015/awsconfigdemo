public class Dog{
private String name;
private int age;
Dog(String name, int age){
this.name=name;
this.age=age;
}
void display(){System.out.println("Dog Name "+ name +"And Dog Age "+ age);
	}
public static void main(String[] args){
Dog d1= new Dog("Puppy", 1);
d1.display();
System.out.println("Hello Dog!!");
}
}
