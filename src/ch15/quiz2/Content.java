package ch15.quiz2;

public class Content {
    private String question;

    public Content(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public boolean equals(Object obj) {

        // 1. 자기 자신과 비교
        if (this == obj) return true;

        // 2. null 이거나, 타입이 다르면 false
        if (obj == null || !(obj instanceof Content)) return false;

        // 3. 형변환
        Content other = (Content) obj;

        // 4. 문제 제목(question) 비교 (문자열은 equals로 비교!)
        return this.question.equals(other.getQuestion());
    }
}
