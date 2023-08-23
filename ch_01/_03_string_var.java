package ch_01;

public class _03_string_var {
    public static void main(String[] args) {
        // 문자
        char ch = 'c';  // 문잣값 앞뒤를 단일 인용 부호 ''로 감싸 주어야 한다.

        char ch1 = 'a';  // 문자로 표현
        char ch2 = 97;  // 아스키코드로 표현
        char ch3 = '\u0061';  // 유니코드로 표현

        System.out.println(ch1);  // a 출력
        System.out.println(ch2);  // a 출력
        System.out.println(ch3);  // a 출력


        // 문자열
        String a = "Happy Java";  // 문자열의 앞과 뒤는 쌍따옴표("")로 감싸야 한다.
        String b = "a";
        String c = "123";

        // 객체로 새로운 string 만들기
        String a1 = new String("Happy Java");
        String b1 = new String("a");
        String c1 = new String("123");

        // 문자열 2개가 같은지 비교하는 equals 메서드
        String eq1 = "hello";
        String eq2 = "java";
        String eq3 = "hello";
        System.out.println(eq1.equals(eq2)); // false 출력
        System.out.println(eq1.equals(eq3)); // true 출력

        String a2 = "hello";
        String b2 = new String("hello");
        System.out.println(a2.equals(b2));  // true
        System.out.println(a2 == b2);  // false -> 서로 다른 객체임으로 "==" 같은 객체인지 판별하는 연산자이므로 false 리턴

        // indexOF 메서드 특정 문자열이 시작되는 위치(인덱스 값)를 리턴해준다.
        String a3 = "Hello Java";
        System.out.println(a3.indexOf("Java"));  // 6 출력
        // 7번째 값인 J가 6으로 출력되는 이유는 자바에서 숫자를 0부터 세기 때문 0 1 2 3

        //contain 메서드는 문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴한다
        String a4 = "Hello Java";
        System.out.println(a4.contains("Java"));  // true 출력 ;; Java라는 문자열 포함 -> ture 출력

        // charAt 메서드는 문자열에서 특정 위치의 문자를 리턴한다.
        String a5 = "Hello Java";
        System.out.println(a5.charAt(6));  // "J" 출력

        // replaceAll 메서드는 문자열에서 특정 문자열을 다른 문자열로 바꿀 때 사용한다.
        String a6 = "Hello Java";
        System.out.println(a6.replaceAll("Java", "World"));  // Hello World 출력

        // substring 메서드는 문자열에서 특정 문자열을 뽑아낼 때 사용한다.
        String a7 = "Hello Java";
        System.out.println(a7.substring(0, 4));  // Hell 출력

        // toUpperCase 메서드는 문자열을 모두 대문자로 변경할 때 사용한다.
        String a8 = "Hello Java";
        System.out.println(a8.toUpperCase());  // HELLO JAVA 출력

        // split 메서드는 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴한다.
        String a9 = "a:b:c:d";
        String[] result = a9.split(":");  // result는 {"a", "b", "c", "d"}

        // 문자열 포매팅은 String.format 메서드를 사용한다.
        System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
        System.out.println(String.format("I eat %s apples.", "five"));  // "I eat five apples." 출력

        // 숫자 변수 대입
        int number = 3;
        System.out.println(String.format("I eat %d apples.", number));  // "I eat 3 apples." 출력

        // 값을 두개 이상 넣기
        int number1 = 10;
        String day = "three";
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number1, day));

        // 문자열 포맷 종료 %d : 정수, %c : 문자 1개, %s 문자열, %f : 부동소수, %o : 8진수, %x : 16진수, %% : %표기
        System.out.println(String.format("I have %s apples",  3));  // "I have 3 apples" 출력
        System.out.println(String.format("rate is %s", 3.234));  // "rate is 3.234" 출력
        System.out.println(String.format("Error is %d%%.", 98));  // "Error is 98%." 출력

        // 공백 표현
        System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
        System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
        //%10s는 전체 길이가 10인 문자열 공간에서 대입되는 값(hi)을 가장 오른쪽으로 정렬하고 나머지는 공백으로 남겨 두라는 의미이다.
        //왼쪽 정렬은 %-10s

        //소수점 표현
        System.out.println(String.format("%.4f", 3.42134234));  // 3.4213 출력
        System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213' 출력

        // System.out.printf
        System.out.printf("I eat %d apples.", 3);  // "I eat 3 apples." 출력

        // String.format은 문자열을 리턴하는 메서드이고
        // System.out.printf는 문자열을 출력하는 메서드라는 점에서 차이가 있다. 상황에 맞게 선택하여 사용하자.

    }
}
