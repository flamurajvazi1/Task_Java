public class MultiBranchStatements {
    public static void main(String[] args) {
        char grade = 'B';
        String result ="";

        if (grade == 'A') {
            result="Excellent";
            System.out.println("Excellent");
        }else if (grade == 'B') {
            System.out.println("Great Job");
        }else{
            System.out.println("good");
        }
        System.out.println(result);
    }
}
