package ch06.problem;

public class Database {
    private String connection ;
    private static Database database = new Database("MySQL"); // 2. 접근 제한 정적 필드 선언 및 초기화
    
    private Database(String database){ // 1. 접근 제한자 생성자 생성 
        this.connection = database;
    }

     public static Database getConnection() {
        System.out.println(database.connection + "에 연결합니다.");
        return database;
    }

    public String getDatabase() {
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }

}
