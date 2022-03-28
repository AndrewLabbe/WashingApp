
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
	
    // Get washer/Dryer full data
    public boolean isFull() {
        // Random values for now
        int falseInt = 0;
        int trueInt = 1;

        int boolValue = (int) Math.floor(Math.random() * (trueInt - falseInt + 1) + falseInt);
        // If dryer doesn't have clothes
        if (boolValue == 0) {
            return false;
        }
        // If dryer has clothes
        else {
            return true;
        }

    }

    // Get washing/dryer and get time remaining
    public double timeRemaining() {
        // Returns a random value between 0 and 60 which account for minutes remaining
        float minNumber = 0;
        float maxNumber = 60;
        float timeRemaining = (float) Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);

        return timeRemaining;
    }
}
