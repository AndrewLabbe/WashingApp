public class Machine {
	
	public void washMachine(Clothes c) {
		if(isFull()) {
			System.out.println("Sorry, you will have to wait " + timeRemaining() + " minutes till the load finishes");
			return;
		}
		while(!c.isClean()) {
			if(c.isClean()) {
				System.out.println("Your clothes are ready, come pick them up.");
				return;
			}
			else if(timeRemaining() == 0){
				System.out.println("Restarting the cycle.");
			}
		}
	}
	
	public void dryMachine(Clothes c) {
		if(isFull()) {
			System.out.println("Sorry, you will have to wait " + timeRemaining() + " minutes till the load finishes");
			return;
		}
		while(c.isDry()) {
			if(c.isDry()) {
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
