package ch15.doll.popularity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DollPopularityManager {
    private Map<String, Integer> countMap =new HashMap<>();

    public void addDoll(String dollName) {
        if (countMap.containsKey(dollName)) {
            countMap.put(dollName, countMap.getOrDefault(dollName, 0) + 1);
            return;
        }
        countMap.put(dollName, 1);
    }

    public void showRanking() {
        if (countMap.isEmpty()) {
            System.out.println("📉 아직 어떤 인형도 뽑히지 않았습니다.");
            return;
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(countMap.entrySet());

        entries.sort((e1, e2) -> {
            int compareCount = e2.getValue().compareTo(e1.getValue());
            if (compareCount == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return compareCount;
        });

        System.out.println("🏆 인형 인기 순위:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.printf("- %s: %d회\n", entry.getKey(), entry.getValue());
        }
    }

}
