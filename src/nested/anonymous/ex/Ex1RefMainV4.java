package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {
    
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        
        process.run();
        System.out.println("프로그램 종료");
    }
    
    public static void main(String[] args) {
        
        
        // 자바 8에서의 엄청난 변화 lamda
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        });
        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
        hello(() -> {
            System.out.println("ㅎㅇㅎㅇ");
        });
        
    }
    
}

