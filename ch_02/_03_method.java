package ch_02;

class Sample {
    int sum(int a, int b) {
        return a + b; // return -> int 값 리턴
    }

    String say() {
        return "Hi"; // return string 값 리턴
    }

    void sumPrint(int a, int b) {
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다."); // 입력 O 리턴X
    }

    void sayVoid() {
        System.out.println("Hi"); // 입력X 리턴X -> return값이 없을때는 보이드를 쓴다
    }

    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    int a;
    void varTest(Sample sample) {
        sample.a++;  // this.a++; 도 된다
    }


}

class Updater {
    void update(Counter counter) {
        counter.count++;
    }
}

class Counter {
    int count = 0;  // 객체변수
}

public class _03_method {
        public static void main(String[] args) {
            int a = 3;
            int b = 4;

            Sample sample = new Sample();
            int c = sample.sum(a, b);  // 3, 4는 인수로 들어간다
            System.out.println(c);

            String hi = sample.say();
            System.out.println(hi);  // "Hi" 출력

            sample.sumPrint(3, 4); // "3과 4의 합은 7입니다." 출력

            sample.sayVoid(); // Hi 출력

            sample.sayNick("야호");
            sample.sayNick("바보");  // 출력되지 않는다.

            sample.a = 1;
            sample.varTest(sample);
            System.out.println(sample.a); // 2출력

            Counter myCounter = new Counter();
            System.out.println("before update:"+myCounter.count);
            Updater myUpdater = new Updater();
            myUpdater.update(myCounter);
            System.out.println("after update:"+myCounter.count);


        }
}
