public class SwitchStatements {
    public static void main(String[] args) {
        String dayOfTheWeek = "Friday";

        switch (dayOfTheWeek.toLowerCase()){
            case "Monday":
                System.out.println("First day of the week");
                break;

            case "Wednesday":
                System.out.println("We almost made it to the weekend");
        }
    }
}
