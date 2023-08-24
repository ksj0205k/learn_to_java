package ch_01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _07_typeConversion_var {
    public static void main(String[] args) {
        String num = "123";

        //String to int
        int n = Integer.parseInt(num);
        System.out.println(n);  // 123 출력

        //int to String
        int n1 = 123;
        String num1 = "" + n1;
        System.out.println(num1);  // 123 출력

        String num2 = String.valueOf(n); // String.valueOf(정수) -> 정수를 문자열로 바꾸어 리턴한다.
        String num3 = Integer.toString(n); // Integer.toString(정수) -> 정수를 문자열로 바꾸어 리턴한다.
        System.out.println(num2);  // 123 출력
        System.out.println(num3);  // 123 출력

        //String to Double
        String num4 = "123.456";
        double d = Double.parseDouble(num4);
        System.out.println(d);

        // 정수와 실수 사이의 형변환
        int n2 = 123;
        double d1 = n2;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d1);  // 123.0 출력

        double d2 = 123.456;
        int n3 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n3);  // 소숫점이 생략된 123 출력

        String num5 = "123.456";
        int n4 = Integer.parseInt(num5);  // 실수 형태의 문자열을 정수로 변환할 경우 NumberFormatException이 발생한다.

        // final : 값을 한번만 설정 즉 재할당 불가
        final int n5 = 123;  // final로 설정하면 값을 바꿀 수 없다.
        //n5 = 456;  // 컴파일 오류 발생

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        //a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생

        // 리스트의 경우 final로 선언할 때 리스트에 값을 더하거나(add) 뺄(remove) 수 있다.
        // 다만 재할당만 불가능할 뿐이다.
        // 만약 값을 더하거나 빼는 것도 할 수 없게 하고 싶다면
        // List.of를 작성하여 수정할 수 없는 리스트(unmodifiable list)로 만들면 된다.
        final List<String> a1 = List.of("a", "b");
        //a1.add("c");  // UnsupportedOperationException 발생




    }
}
