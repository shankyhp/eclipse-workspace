package InterfacesInjava;

public class Fish implements Prey,Predator{

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		
		System.out.println("THIS FISH IS HUNTING SMALLER FISH");
		
	}

	@Override
	public void flee() {
		// TODO Auto-generated method stub
		
		System.out.println("THIS FISH IS FLEEING FROM LARGE FISH");
		
	}

}
