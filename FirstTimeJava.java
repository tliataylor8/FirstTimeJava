//method: function inside an object
//everything in java is an object
//you have to be explicit with Java, ex: what are we expecting out of this method


public class FirstTimeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//has to be Capital and has to have ; at end or else syntax error
		//just like Console.log("Hello World");		
		//1- primitive types
			//4 integer types:
			//of the 4: 2 are floating types
			// for strings: "char"
			//in addition to "char", a string class called "String"
		//bc Java has so may ways to define a number, use the types to make a variable
		//Java doesn't use const/let, you use the actual data type + name of variable
		//Java follows camelCase
		
		boolean isThursday = true;
		boolean isHungry = false;
		
        //4 different WHOLE integer types:
		
//		int age = 27;
		
		byte aByte = 127;
		
		short aShort = 4000;
		
		long aLong = 01234567;
		
		// floats
		double pi = 3.14; //double can represent much larger#s (15 decimals) than a float (7 decimals)
		float morePi = 3.14159f; //you need to use an f at the end when using a float
		char c = 'c'; //only '' for char, not ""
		String comment = "Today is a nice day."; //"" for String
		comment = "I wanna fly"; //you can reassign variables, they also have their own version of const
		System.out.println(comment);
		//In Java creating a variable w/out a type is what we call "illegal operation"
		
		final String favFood = "paella"; //"final" makes the variable a const
		// favFood = "pizza"; //shows it cannot be reassigned
		
		System.out.println(comment + " and I want " + favFood + ".");
		
		double weight = 150;
		double venusWeight = weight * 0.91;
		
		System.out.println("Object's weight on Venus is " + venusWeight + " lbs.");
				
//		int x = 20;
//		int y = 18;
//		if (x>y) {
//			System.out.println("x is greater than y");
//		} else {
//			System.out.println("y is greater than x");
//		}
		
		int x = 18;
		int y = 28;
		if (x>y) {
			System.out.println("x is greater than y");
		} else {
			System.out.println("y is greater than x");
		}
		
		int age = 17;
		
		if (age > 20) {
			System.out.println("You can have a drink");
		} else if (age > 17 && age < 21) {
			System.out.println("Not old enough, too young");
		} else {
			System.out.println("Go home, way too young");
		}
		
	}

}
