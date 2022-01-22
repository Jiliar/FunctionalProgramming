package o_anymatch;

import java.util.List;

public class AnyMatch {
    public static void main(String[] args){
        //Searching elements
        //Knowing if a student has at least one score not passed with filters
        List<Integer> scores1 = List.of(10,10,9,6,6,7,8,9,10);
        boolean flag1 = scores1.stream()
                    .filter(score -> score < 6)
                    .count() > 0;
        System.out.println(flag1);

        //Knowing if a student has at least one score not passed with anyMatch
        List<Integer> scores2 = List.of(10,10,9,6,6,7,8,9,10,5);
        boolean flag2 = scores2.stream()
                .anyMatch(score -> score < 6);
        System.out.println(flag2);
    }
}
