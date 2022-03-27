
public class Machine {
	
	private boolean clothesClean;
	private boolean clothesDry;
	
	public Machine() {
		clothesClean = false;
		clothesDry = false;
	}
	
	public boolean isDone(Boolean b) {
		//in actuality, it would be programmed to check the moisture left in the clothes 
		//but returning this value is a simplified method
		return b;
	}
	
	public void washMachine() {
		if(isFull()) {
			System.out.println("Sorry, you will have to wait " + timeRemaining() + " minutes till the load finishes");
			return;
		}
		while(!isDone(clothesClean)) {
			if(isDone(clothesClean)) {
				System.out.println("Your clothes are ready, come pick them up.");
				return;
			}
			else if(timeRemaining() == 0){
				System.out.println("Restarting the cycle.");
			}
		}
	}
	
	public void dryMachine() {
		if(isFull()) {
			System.out.println("Sorry, you will have to wait " + timeRemaining() + " minutes till the load finishes");
			return;
		}
		while(!isDone(clothesDry)) {
			if(isDone(clothesDry)) {
				System.out.println("Your clothes are ready, come pick them up.");
				return;
			}
			else if(timeRemaining() == 0){
				System.out.println("Restarting the cycle.");
			}
		}
	}
	
	public boolean isFull() {
		return false;
		
	}
	
	public double timeRemaining() {
		return 0;
		
	}

}
