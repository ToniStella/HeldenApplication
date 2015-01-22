public class HeldenApp {
	public static void main(String... args){
		
		
		Held shaggy = new Held("Shaggy", 2500, 500, 40, false, new Waffe("Bloodscream", 350, "Zweihand-Axt"));
		Held frank = new Held("Frank White", 1500, 850, 10, true, new Waffe("Ashbringer", 150, "Zweihand-Schwert"));
		shaggy.getWaffe();
		frank.getWaffe();
		
		kampf(frank, shaggy, 3000);
		
	}
	public static void kampf(Held angreifer, Held verteidiger, int speed) {
		
		String nameAngreifer = angreifer.getName();
		String nameVerteidiger = verteidiger.getName();
		
		// Text des Kampfgeschehen
		System.out.println( nameAngreifer + " greift " + nameVerteidiger + " an! \n\n");
		
		
		
		//Die Helden begrüßen sich
		System.out.println(angreifer.vorstellen() + "\n" + verteidiger.vorstellen());
		
		
		
		//Die Helden kämpfen
		while (angreifer.getLifepoints() > 0 && verteidiger.getLifepoints() > 0) {
				
			verzoegere(speed);
			System.out.println(nameAngreifer + " schlägt " + nameVerteidiger + "!\n"
					+ nameVerteidiger + " erleidet Schaden von " 
					+ angreifer.schlagen(verteidiger) + " und hat noch "
					+ verteidiger.getLifepoints() + " Lebenspunkte. \n\n");
			
			System.out.println(nameAngreifer + " greift mit " + angreifer.getWaffe().getWaffenName() 
								+ " (" + angreifer.getWaffe().getWaffenArt() + ") an." 
								+ nameVerteidiger + " greift mit " + verteidiger.getWaffe().getWaffenName() 
								+ " (" + verteidiger.getWaffe().getWaffenArt() + ") an.");
			if (verteidiger.getLifepoints() > 0) {
				
			
			// Verteidiger schlägt zurück
				System.out.println(nameVerteidiger + " schlägt " + nameAngreifer + "!\n"
						+ nameAngreifer + " erleidet Schaden von " 
						+ verteidiger.schlagen(angreifer) + " und hat noch "
						+ angreifer.getLifepoints() + " Lebenspunkte. \n\n");
		}
	}
		//Ein Held stirbt
		if (angreifer.getLifepoints() > 0) {
			System.out.println( verteidiger.sterben());
		}else{
			System.out.println(angreifer.sterben());
		}
	}
	public static void verzoegere(int millisekunden){
		try {
			Thread.sleep(millisekunden);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
