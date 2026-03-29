package lab08;

public class SoundCard {
	
	 private int channels;
	 private int sampleRate;
	 private String brand;
	 private String interfaceType;

	 public void Soundcard(int channels, String brand, String interfaceType, int sampleRate) {
		 this.channels = channels;
		 this.sampleRate = sampleRate;
		 this.brand = brand;
		 this.interfaceType = interfaceType; 	 
	 }
	 public void printInfo() {
		 System.out.println("Sound card:");
		 System.out.println("\tChannels    : " + channels);
	     System.out.println("\tSample Rate : " + sampleRate + " kHz");
	     System.out.println("\tBrand       : " + brand);
	     System.out.println("\tInterface   : " + interfaceType);
	 }
	}


