package FirstPackage;

public class Animal {
	
	public void  Eat()
	{
		System.out.println("Dog is Eating");
	}

	class Dog extends Animal
	{
		void Bark()
		{
			System.out.println("Barking");
		}
		
		class BabyDog extends Dog
		{
			void weep()
			{
				System.out.println("Weeping");
			}
		}
	}
	public static void main(String[] args) 
	{
		
		
		
		
	}

}

