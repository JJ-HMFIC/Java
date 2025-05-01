package ch12.sec03.exam01;

public class Member {
    public String id;
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            return id.equals(target.id);
        }
        return false;

    }
}
