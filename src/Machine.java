
public class Machine {
    public static void main(String[] args) {
        System.out.println((IsFull()));
    }

    // Get washer/Dryer full data
    public static boolean IsFull() {
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

}
