package ch_01;
import java.util.HashSet;
import java.util.Arrays;


public class _06_hashSet_var {

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력
        //집합 자료형에는 2가지 큰 특징
        // 중복을 허용하지 않는다.
        // 순서가 없다(unordered).

        // 리스트나 배열은 순서가 있기(ordered) 때문에 인덱싱을 통해 자료형의 값을 얻을 수 있지만
        // 집합 자료형은 순서가 없기(unordered) 때문에 인덱싱으로 값을 얻을 수 없다.
        // 이는 마치 맵 자료형과 비슷하다.
        // 맵 자료형 역시 순서가 없는 자료형이라 인덱싱을 지원하지 않는다.

        // 교집합 구하기
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력

        // 합집합 구하기
        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

        // 차집합 구하기
        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력

        // Add 값을 한꺼번에 여러개 추가
        HashSet<String> set1 = new HashSet<>();
        set1.add("Jump");
        set1.addAll(Arrays.asList("To", "Java"));
        System.out.println(set1);  // [Java, To, Jump] 출력

        // remove 메서드는 특정 값을 제거할 때 사용한다.
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set2.remove("To");
        System.out.println(set2);  // [Java, Jump] 출력

        // 상수 집합 enum
        System.out.println(CoffeeType.AMERICANO);  // AMERICANO 출력
        System.out.println(CoffeeType.ICE_AMERICANO);  // ICE_AMERICANO 출력
        System.out.println(CoffeeType.CAFE_LATTE);  // CAFE_LATTE 출력

        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);  // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }
    }
}
