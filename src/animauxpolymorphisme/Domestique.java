package animauxpolymorphisme;



public class Domestique extends Animal {
	
	private String domestique;

	
	public String getDomestique() {
		return domestique;
	}
	public void setDomestique(String domestique) {
		this.domestique= domestique;
	}


	public Domestique( String nom, String type, String domestique) {
		super (nom , type, domestique);
		this.domestique= domestique;

	}
	public Domestique() {
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Domestique: " + domestique ;
	}

}
