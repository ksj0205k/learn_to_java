package ch_01;
import java.util.ArrayList; // arraylist 를 사용할려면 import문 작성 필요
import java.util.Arrays;
// java.util.Arrays 클래스의 asList 메서드를 사용하면 이미 존재하는 문자열 배열로 ArrayList를 만들 수 있다.
import java.util.Comparator;
// 정렬을 위한 import 문 필요

public class _04_arrayAndList_var {
    public static void main(String[] args) {
        // Array
        int[] odds = {1, 3, 5, 7, 9};
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};

        String[] weeks = new String[7]; // 7과 같은 숫잣값을 넣어 길이를 정해 줘야 한다. 그렇지 않으면 오류가 발생한다.
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";

        System.out.println(weeks[3]); // 앞서 만든 요일의 배열에서 ‘목’요일에 해당하는 값을 얻으려면 인덱스를 이용해야 한다.

        //for 문에 배열을 사용할 때에는 배열의 길이를 알아야 한다.
        // 왜냐하면 배열의 길이만큼 for 문을 반복하기 때문이다.
        // 이때 배열 길이는 length를 사용하면 된다.
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }

        // List
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        // 추가로 더 저장시
        pitches.add(0, "133");  // 첫번째 위치에 133 삽입.
        pitches.add(1, "153");  // 두번째 위치에 153 삽입.

        // ArrayList의 get 메서드를 사용하면 특정 인덱스의 값을 추출할 수 있다
        System.out.println(pitches.get(1));

        // size 메소드는 ArrayList의 요소의 개수를 리턴한다. 다음 코드를 실행하면 pitches에 담긴 요소의 개수가 출력된다.
        System.out.println(pitches.size());

        // contains 메서드는 리스트 안에 해당 항목이 있는지 판별해 그 결과를 boolean으로 리턴한다.
        // pitches 객체는 142를 포함하고 있으므로 true가 출력된다.
        System.out.println(pitches.contains("142"));

        //remove(객체) 리스트에서 객체에 해당하는 항목을 삭제한 뒤, 그 결과로 true 또는 false를 리턴한다.
        System.out.println(pitches.remove("129"));  // 129를 리스트에서 삭제하고, true를 리턴한다.

        //remove(인덱스) 인덱스에 해당하는 항목을 삭제한 뒤, 그 항목을 리턴한다.
        System.out.println(pitches.remove(0));  // pitches의 첫 번째 항목이 138이므로, 138을 삭제한 뒤 138을 리턴한다.

        // 제네릭스 <String>는 ArrayList에 담을수 있는 자료형은 string 만 들어갈수 있다
        ArrayList<String> pitches1 = new ArrayList<>();
        pitches1.add("138");
        pitches1.add("129");
        pitches1.add("142");
        System.out.println(pitches1);  // [138, 129, 142] 출력

        String one = pitches1.get(0);  // 형 변환이 필요없다.
        String two = pitches1.get(1);  // 형 변환이 필요없다.

        //제네릭스로 자료형을 선언만 하면 그 이후로는 자료형을 형 변환하는 과정이 필요 없다.
        // pitches에는 반드시 String 자료형만 추가되어야 한다는 것을 컴파일러가 이미 알기 때문이다.
        // 이처럼 제네릭스를 이용하면 형 변환과 관련된 불필요한 코딩을 줄일 수 있고, 잘못된 형 변환 때문에 발생하는 런타임 오류를 방지할 수 있다.

        // java.util.Arrays 클래스의 asList 메서드를 사용하면 이미 존재하는 문자열 배열로 ArrayList를 만들 수 있다.
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches2);  // [138, 129, 142] 출력

        // String 배열 대신 String 자료형을 여러 개 전달하여 생성할 수도 있다.
        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches3);
        // String.join("구분자", 리스트 객체)를 사용해 리스트의 각 요소에 구분자를 넣어 하나의 문자열로 만들 수 있다.
        String result4 = String.join(",", pitches3);
        System.out.println(result4);  // 138,129,142 출력

        //String.join은 문자열 배열에도 사용할 수 있다.
        String[] pitches5 = new String[]{"138", "129", "142"};
        String result5 = String.join(",", pitches5);
        System.out.println(result5);  // 138,129,142 출력

        ArrayList<String> pitches6 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches6.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches6);  // [129, 138, 142] 출력

        //오름차순(순방향) 정렬 - Comparator.naturalOrder()
        //내림차순(역방향) 정렬 - Comparator.reverseOrder()


    }
}
