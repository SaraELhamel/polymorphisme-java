package animauxpolymorphisme;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	private String nom;
	private String cri;
	private String type;
	
	
	public void communiquer() {
		System.out.println("un animal communique avec les autres");
	}
	public void ReadSound(String path,String effectSource) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        Path AbsolutePath = FileSystems.getDefault().getPath("").toAbsolutePath();
        String fullPath = AbsolutePath + path;

        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(fullPath));

           Clip clip = AudioSystem.getClip();
           clip.open(audioIn);
           clip.start();
           System.out.println(effectSource+" sound is start ! ");
           System.out.println("s : "+clip.isActive());
           while(clip.isActive()) {
//System.out.println("hola "+effectSource);
}
           clip.close();
           System.out.println(effectSource+" sound is end ! ");
}
	
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public String getCri() {
		return cri;
	}
	
	public void setCri(String cri) {
		this.cri=cri;
	}
	
	public Animal(String nom,String type,String cri) {
		this.nom=nom;
		this.type=type;
		this.cri=cri;
	}
	
	public Animal() {

	}
	
	@Override
	public String toString() {
		return " nom:"+ nom + "\n type:"+ type + "\n cri:" + cri;
	}
}


