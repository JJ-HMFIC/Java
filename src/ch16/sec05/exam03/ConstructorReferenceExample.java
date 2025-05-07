package ch16.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        Member member = person.getMember1(Member::new);
        System.out.println(member);
        System.out.println();

        Member member2 = person.getMember2(Member::new);
        System.out.println(member2);
    }
}
