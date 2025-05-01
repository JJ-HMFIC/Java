package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션생성
        Set<String> set = new HashSet<String>();
        //객체추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }
    }
}
