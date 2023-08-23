package ch_01;

public class _02_boolean_var {
    public static void main(String[] args) {
        // boolean 연산 : 참과 거을 판단하는 연산

        int base = 100;
        int height = 200;
        boolean isTall = height > base;

        if(isTall) {
            System.out.println("키가 크다");
        }

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);

        boolean t = true;
        boolean f= false;


    }
}
