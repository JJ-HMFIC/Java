package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet컬렉션생성
        Set<Member> set=new HashSet<Member>();
        //Member객체저장
        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30));
        //저장된객체수출력
        System.out.println("총객체수:"+set.size());
    }
}
