package animauxpolymorphisme;

public class Chien extends Domestique{
	


public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chien(String nom, String type, String domestique) {
		super(nom, type, domestique);
		// TODO Auto-generated constructor stub
	}

@Override
	public void communiquer() {
		System.out.println("un chien aboie");
	}
}
