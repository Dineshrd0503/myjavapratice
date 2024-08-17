import java.util.*;
public class NewSwitch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day");
        String day=sc.next();
        System.out.println("using traditional switch");
        switch(day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid day");
        }
        System.out.println("using new switch statement");
        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("weekday");
            case "saturday", "sunday" -> System.out.println("weekend");
            default -> System.out.println("invalid day");
            
        }
        
    }
}