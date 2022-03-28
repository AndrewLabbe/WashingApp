
public class Machine {

    // Get washing/dryer and get time remaining
    public static float TimeRemaining() {
        // Returns a random value between 0 and 60 which account for minutes remaining
        float minNumber = 0;
        float maxNumber = 60;
        float timeRemaining = (float) Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);

        return timeRemaining;
    }
}
