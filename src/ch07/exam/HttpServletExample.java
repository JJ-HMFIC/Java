package ch07.exam;

public class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());


    }

    public static void method(HttpServlet servlet) {
        servlet.service(); // 다형성(polymorphism)에 의해 실제 구현된 메서드가 실행됨
    }
}
