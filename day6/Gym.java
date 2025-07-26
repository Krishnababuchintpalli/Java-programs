package day6;
interface Activity {
    void perform(String name);
    default void start() {
        System.out.println("Starting the activity...");
    }
    static int calculateCaloriesBurned(int minutes, int ratePerMinute) {
        return minutes * ratePerMinute;
    }
}
class Running implements Activity {
    @Override
    public void perform(String name) {
        System.out.println(name + " is running...");
    }
}
public class Gym {
	public static void main(String[] args) {
        Activity act = new Running();
        act.start();
        act.perform("Alice");
        int calories = Activity.calculateCaloriesBurned(30, 10); 
        System.out.println("Calories burned: " + calories);
    }

}
