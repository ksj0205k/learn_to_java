package ch_01;
import java.util.HashMap;
import java.util.ArrayList;

public class _05_hashMap_var {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); // 새로운 String형태의 맵을 만들어준다

        //put : 갑 추가
        map.put("people", "사람");
        map.put("baseball", "야구");

        //get : key에 해당되는 값을 출력
        System.out.println(map.get("people")); // "사람" 출력
        //key에 해당되는 값이 없을때 null 출력
        System.out.println(map.get("java"));  // null 출력
        //null 대신 기본값(default)을 얻고 싶다면 getOrDefault 메서드를 사용하면 된다.
        System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력

        //containsKey 메서드는 맵에 해당 key가 있는지를 참(true) 또는 거짓(false)으로 리턴한다.
        System.out.println(map.containsKey("people"));  // true 출력

        //remove 메서드는 맵의 항목을 삭제하는 메서드로, 해당 key의 항목을 삭제한 후 value 값을 리턴한다.
        System.out.println(map.remove("people"));  // "사람" 출력
        //people에 해당되는 key와 value가 모두 삭제된 후 사람이 출력된다.

        map.put("people", "사람");

        //keySet은 맵의 모든 key를 모아서 리턴한다.
        System.out.println(map.keySet());  // [baseball, people] 출력
        //keySet() 메서드는 맵의 모든 key를 모아서 집합 자료형으로 리턴한다. 집합 자료형은 리스트 자료형으로 바꾸어 사용할 수도 있다.
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);

        //맵의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는 것이다.
        // 그런데 가끔 Map에 입력된 순서대로 데이터를 가져오거나 입력한 key에 의해 정렬(sort)하도록 저장하고 싶을 수 있다.
        // 이럴때는 LinkedHashMap과 TreeMap을 사용하면 된다.

        //LinkedHashMap : 입력된 순서대로 데이터를 저장한다.
        //TreeMap : 입력된 key의 오름차순으로 데이터를 저장한다.


    }
}
