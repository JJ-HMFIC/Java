package ch06.problem;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String tmp1 = input.read("이름");
        System.out.println("입력값 : " + tmp1);

        String tmp2 = input.read("이름", "홍길동");
        System.out.println("입력값 : " + tmp2);

        int tmp3 = input.readInt("나이");
        System.out.println("입력값 : " + tmp3);

        boolean tmp4 = input.confirm("종료할까요?", true);
        System.out.println("입력값 : " + tmp4);

        boolean tmp5 = input.confirm("종료할까요?");
        System.out.println("입력값 : " + tmp5);
    }
}
