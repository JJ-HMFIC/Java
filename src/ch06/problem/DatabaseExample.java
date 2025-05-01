package ch06.problem;

public class DatabaseExample {
    public static void main(String[] args) {
        Database tmp = Database.getConnection();
        System.out.println("데이터베이스: "+tmp.getDatabase());
        tmp.close();
    }
}