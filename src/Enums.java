import java.util.Scanner;
enum Day {
    MONDAY("Start of work week"),
    TUESDAY("Second day of work week"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost there"),
    FRIDAY("End of work week"),
    SATURDAY("Weekend!"),
    SUNDAY("Rest day");

    protected String description;

    // Constructor
    Day(String description) {
        this.description = description;
    }

    // Getter method
    public String getDescription() {
        return description;
    }
}

public class Enums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
        System.out.println("Enter a day to get its description:");
        String dayInput = sc.nextLine();
        Day day = Day.valueOf(dayInput.toUpperCase());
        if (day!=null) {
            System.out.println("Description: " + day.getDescription());
        } else {
            System.out.println("Invalid day input");
        }
        sc.close();
    }
    
}
