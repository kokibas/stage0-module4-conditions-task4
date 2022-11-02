package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println(first >= second ? first : second >= third ? second :third >= first ? third : first);
//        int result2 = second >= third ? second : third;
//        if (result2 >= result ){
//            System.out.println(result2);
//        } else if (result2 <= result ) {
//            System.out.println(result);
//        }
    }
}
