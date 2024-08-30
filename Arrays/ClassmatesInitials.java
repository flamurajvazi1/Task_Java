package Arrays;

public class ClassmatesInitials {
    public static void main(String[] args) {
        String[] classmates = {
                "Arben Gashi",
                "Blerina Hoxha",
                "Dritan Shala",
                "Fatos Berisha",
                "Gentiana Beqiri",
                "Valbona Krasniqi",

        };
        for (String name : classmates){
            String[] names = name.split(" ");
            char firstinitial = names[0].charAt(0);
            char lastInitial = names[1].charAt(0);
            System.out.println(firstinitial + "" + lastInitial);


        }
    }
}
