package newOne;

import javafx.scene.Node;

public class Cat {
	
	String name;
	String age;
	String sex;
	String colour;
	String pickup;
	
	Cat(){
		
	}
	
	Cat(String name, String age, String sex, String colour, String pickup){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.colour= colour;
		this.pickup = pickup;
	}
	
	public String Description() {
//		System.out.println("Love to play ball and active");
		String des = "Love to play ball and active";
		return des;
	}


}

class Kitten extends Cat {
	
	Kitten(String name, String age, String sex, String colour, String pickup){
		super(name,age, sex, colour, pickup);
	}
	
	@Override
	public String Description() {
		
//		System.out.println(" -- Hyperactive and love to play with ball & rope -- ");
		String des = "Hyperactive and love to play with ball & rope";
		
		return des;
		
	}

}

class Adult extends Cat{
	
	Adult(String name, String age, String sex, String colour, String pickup){
		super(name,age, sex, colour, pickup);
	}
	
	@Override
	public String Description() {
//		System.out.println("-- Passive and love to laying down --");
	String des = "Passive and love to laying down";
	
	return des;
	
	}

}





