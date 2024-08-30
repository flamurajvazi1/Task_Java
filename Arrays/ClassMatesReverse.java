package Arrays;

public class ClassMatesReverse {
    public static void main(String[] args) {
        String[] classmates = {
                "Arben Gashi",
                "Blerina Hoxha",
                "Dritan Shala",
                "Elona Krasniqi",
                "Fatos Berisha",
                "Gentiana Beqiri",
                "Ilir Kastrati",
                "Lejla Rraci",
                "Shkëlzen Zogaj",
                "Valbona Kelmendi"
        };

        for (String name : classmates) {
            String reversedName = new StringBuilder(name).reverse().toString();
            System.out.println(reversedName);
        }
    }
}

