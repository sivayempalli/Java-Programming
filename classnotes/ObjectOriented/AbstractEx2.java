//creating abstract class
abstract class Bike{
	Bike(){
		System.out.println("Bike will created");
	}

	//abstract method
	abstract void speed();

	//we can create normal method also
	void bikeType(String str){
		System.out.println(str+"Bike");
	} 
}

class Pulsar extends Bike{

	//constructor will created
	//Pulsar(){
	//     super();
	//}

	void speed(){
		System.out.println("speed is 120km/hr");
	}
} 

class Yamaha extends Bike{
	void speed(){
		System.out.println("speed is 110 km/hr");
	}
}

class AbstractEx2{
	public static void main(String[] args) {
		
		Bike bi = new Pulsar();
		bi.speed();
		bi.bikeType("Pulsar");

		bi = new Yamaha();
		bi.speed();
		bi.bikeType("Yamaha");
	}
}