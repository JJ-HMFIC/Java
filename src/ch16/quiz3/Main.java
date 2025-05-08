package ch16.quiz3;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        List<Goods> giftPool = Arrays.asList(
                new Goods("메타몽 쿠션", "분홍", false),
                new Goods("메타몽 키링", "파랑", false),
                new Goods("메타몽 텀블러", "보라", true),
                new Goods("메타몽 노트북 파우치", "회색", true),
                new Goods("메타몽 인형", "분홍", false),
                new Goods("메타몽 가방", "회색", true)
        );
        List<Goods> seul = pickGifts(giftPool);
        List<Goods> jiwoo = pickGifts(giftPool);
        String seul_success = "→ 성공! 분홍색 굿즈를 얻었어요! \uD83C\uDF89";
        String seul_fail = "→ 실패! 분홍색 굿즈가 없어요 \uD83D\uDE22";
        String jiwoo_success = "→ 성공! 유용한 굿즈를 얻었어요! \uD83D\uDC4D";
        String jiwoo_fail = "→ 실패! 유용한 굿즈가 없어요 \uD83D\uDE22";


        printResult("이슬이",seul,t -> t.getColor().equals("분홍"),seul_success,seul_fail);
        printResult("지우",jiwoo,t -> t.isUseful(),jiwoo_success,jiwoo_fail);


        System.out.println(sb);

    }


    public static List<Goods> pickGifts(List<Goods> pool) {
        Random random = new Random();
        Supplier<Integer> randomIndex = () -> random.nextInt(pool.size());

        List<Goods> result = new ArrayList<>();

        Set<Integer> pickedIndices = new HashSet<>();

        while (pickedIndices.size() < 2 && pickedIndices.size() < pool.size()) {
            pickedIndices.add(randomIndex.get());
        }

        for (int index : pickedIndices) {
            result.add(pool.get(index)); // remove 없이 안전하게 복사
        }
        return result;

    }

    public static void printResult(String user, List<Goods> picks, Predicate<Goods> condition,
                                   String successMsg,String failMsg) {
        boolean check = false;

//        System.out.println("[" + user + "의 뽑기 결과]");
        sb.append("[").append(user).append("의 뽑기 결과]\n");

        for (Goods goods : picks) {
//            System.out.println("- " + goods.getName());
            sb.append("- ").append(goods.toString()).append("\n");
            if (condition.test(goods)) {
                check = true;
            }
        }
        if(check) sb.append(successMsg).append("\n");
        else sb.append(failMsg).append("\n");

    }
}
