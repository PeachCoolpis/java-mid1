package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        
        Hello hello = () -> System.out.println("hello");
        
        hello.hello();
    }
}
