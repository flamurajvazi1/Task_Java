import java.util.Arrays;
public class ArraysIntro {

    public static void main(String[] args) {
        int score1 =85;
        int score2 =75;
        int score3 = 70;
        int score4 = 88;
        int score5= 95;

        int[] scores = new int[6];

        scores[2] = score3;
        scores[0]= score1;
        scores[1]=score2;
        scores[3]= score4;
        scores[4]= score5;
        System.out.println(Arrays.toString(scores));
        scores[5]=34;
        System.out.println(scores[2]);
    }
}
