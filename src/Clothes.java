
public class Clothes {
	
	private boolean clothesClean;
	private boolean clothesDry;
	private int moisture;
	
	public Clothes() {
		clothesClean = false;
		clothesDry = false;
		moisture = 0;
	}
	
	public boolean isClean() {
		moisture = (int) Math.floor(Math.random() * (61));
		
		if(moisture > 45) {
			clothesClean = true;
		}
		else {
			clothesClean = false;
		}
		
		return clothesClean;
	}
	
	public boolean isDry() {
		moisture = (int) Math.floor(Math.random() * (61));
		
		if(moisture < 5) {
			clothesDry = true;
		}
		else {
			clothesDry = false;
		}
		
		return clothesDry;
	}
	
	public int moistureLevel(){
		return moisture;
	}
}
