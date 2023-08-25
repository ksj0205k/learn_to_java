package ch_02;

public class _01_Object {
    static class Calculator { // 객체를 생성하기 위한 클래스
        int result = 0;

        int add(int num) {
            result += num;
            return result;
        }
    }
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();  // 계산기1 객체를 생성한다.
        Calculator cal2 = new Calculator();  // 계산기2 객체를 생성한다.

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));

        // 이것이 바로 객체를 선언해서 사용하는 방법이다.
    }
}
