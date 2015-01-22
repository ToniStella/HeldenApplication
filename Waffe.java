import java.util.*;
public class Waffe {
	
	Scanner scan = new Scanner(System.in);
	private String waffenName;
	private int schaden = 1;
	private String waffenArt;
	private int agilityWaffe;
	private int powerWaffe;
	private int lifeplointsWaffe;
	private boolean angelegt;	// Zeigt ob angelegt oder nicht
	
	public Waffe(String name, int schaden, String waffenArt) {
		this.waffenName = name;
		this.schaden = schaden;
		this.waffenArt = waffenArt;
	}
	
	public Waffe(){}
	
	public String getWaffenArt() {
		return waffenArt;
	}
	public void setWaffenArt(String waffenArt) {
		this.waffenArt = waffenArt;
	}
	public int getAgilityWaffe() {
		return agilityWaffe;
	}
	public void setAgilityWaffe(int agilityWaffe) {
		this.agilityWaffe = agilityWaffe;
	}
	public int getPowerWaffe() {
		return powerWaffe;
	}
	public void setPowerWaffe(int powerWaffe) {
		this.powerWaffe = powerWaffe;
	}
	public int getLifeplointsWaffe() {
		return lifeplointsWaffe;
	}
	public void setLifeplointsWaffe(int lifeplointsWaffe) {
		this.lifeplointsWaffe = lifeplointsWaffe;
	}
	
	public String getWaffenName() {
		return waffenName;
	}

	public void setWaffenName(String waffenName) {
		this.waffenName = waffenName;
	}

	public int getSchaden() {
		return schaden;
	}

	public void setSchaden(int schaden) {
		this.schaden = schaden;
	}

	public boolean isAngelegt() {
		return angelegt;
	}
	
	public boolean setAngelegt(boolean angelegt) {
		if (angelegt == false) {
			angelegt = true;
		}
		this.angelegt = angelegt;
		return angelegt;
	}
}
