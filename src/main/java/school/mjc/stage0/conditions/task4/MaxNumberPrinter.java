package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
       int result = first >= second ? first : second;
        int result2 = second >= third ? second : third;
        if (result2 >= result ){
            System.out.println(result2);
        } else if (result2 <= result ) {
            System.out.println(result);
        }



    }
}
