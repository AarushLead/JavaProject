package instanceOfExample;

public class InstanceOfExample2 {

	public static void main(String[] args) {
		Animall a=new Animall();
		Dogg d = new Dogg();
		Catt c=new Catt();
		System.out.println("Is d1 the instance of Dog :" + (d instanceof Dogg));
		System.out.println("Is d1 the instance of Dog :" + (a instanceof Animall));
		System.out.println("Is d1 the instance of Dog :" + (c instanceof Catt));
		System.out.println("Is d1 the instance of Dog :" + (a instanceof Object));
		System.out.println("Is d1 the instance of Dog :" + (d instanceof Object));
		System.out.println("Is d1 the instance of Dog :" + (c instanceof Object));

	}

}

class Animall {

}

class Dogg {

}

class Catt {

}