package ch16.quiz6;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("📮 메타몽 편지함 - 진심 메시지만 공개됩니다 💌\n");

        Set<String> keywords = Set.of("미안", "사랑", "소중", "고마워", "행복", "고맙", "영원", "믿어");


        Function<Message, Integer> calcScore = msg -> {
            int score = 0;
            for (String word : keywords) {
                if (msg.getContent().contains(word)) score += 30;
            }
            return Math.min(score, 100);
        };

        Predicate<Message> isHeartfelt = msg -> calcScore.apply(msg) >= 60;


        Consumer<Message> printer = msg -> {
            int score = calcScore.apply(msg);
            System.out.println(msg.toString() + " ✅ 감성 점수: " + score + "\n");
        };

        List<Message> messages = List.of(
                new Message("지우", "이슬이", "오늘 말 심했지? 정말 미안해. 널 제일 소중하게 생각해."),
                new Message("이슬이", "지우", "메타몽처럼 말랑말랑해질게. 나도 고마워 :)"),
                new Message("웅이", "이슬이", "사랑해. 영원히 같이 있고 싶어."),
                new Message("지우", "웅이", "게임은 내가 이겼지롱~")
        );

        for (Message msg : messages) {
            if (isHeartfelt.test(msg)) {
                printer.accept(msg);
            }
        }


    }
}
