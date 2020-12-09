package animauxpolymorphisme;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		
   Animal chien1 = new Chien("tito", "type13", "domestique");
   Animal chien3 = new Animal("tito", "type13", "domestique");
   Chien chien2 =new Chien("popito", "type1", "domestique");


 chien1.ReadSound("//audio//chien.wav", "chien1");
 chien3.communiquer();
 chien1.communiquer();
	}

}
