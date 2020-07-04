package myPackage;

public class PetDemo {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		for(int i=0;i<5;i++)
			dog[i]=new Dog();
		dog[0].setPet("poo", 3, 2.0);
		dog[0].setBreed("Puddle");
		dog[0].setBooster(false);
		
		dog[1].setPet("bichon", 1, 2.0);
		dog[1].setBreed("Bichon Frise");
		dog[1].setBooster(false);

		dog[2].setPet("shiba", 3, 2.5);
		dog[2].setBreed("Shiba Inu");
		dog[2].setBooster(false);
	
		dog[3].setPet("jindo", 1, 2.0);
		dog[3].setBreed("Jindo Dog");
		dog[3].setBooster(true);
		
		dog[4].setPet("corgi", 2, 2.0);
		dog[4].setBreed("Welsh Corgi");
		dog[4].setBooster(true);
		
		for(int i=0; i<5; i++){
			if(dog[i].getAge()>=2&&(dog[i].getBooster()==false))
				System.out.println("Dog: "+ dog[i].getName() +" Breed: " + dog[i].getBreed());
		}
	}
	
}
