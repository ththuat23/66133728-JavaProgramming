package Bai1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Xin chào thế giới Java!");
        System.out.println("Chào mừng đến thế giới lập trình Java");
        System.out.println("5 + 3 = " + ( 5 + 3 ));
        Hello1();
        Hello2();
    }
    public static void Hello1() {
        // Text blocks với """
        String greeting = """
            ======================
            HELLO, MODERN JAVA!
            ======================
            by Mai Cường Thọ NTU
            ======================
            """;
        System.out.println(greeting);
    }
    public static void Hello2() {
        // var - tự động suy luận kiểu
        var message = "Hello, World with var!";
        var number = 42;
        var list = java.util.List.of("Java", "Modern", "Features");
        
        System.out.println(message);
        System.out.println("Number: " + number);
        System.out.println("List: " + list);
    }
}
