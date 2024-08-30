public class NestedIfStatements {
    public static void main(String[] args) {
        int salary = 20000;
        int yearOnjob = 1;

        if (salary >= 30000) {
            if (yearOnjob >= 2) {
                System.out.println("You Qualify fot he loan");
            } else {
                System.out.println("You must have been on job at least two years");
            }
        } else {
            System.out.println("Ypu must earn at least 30000");
        }
    }
}
