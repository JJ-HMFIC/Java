package ch15.doll.history;

import java.util.*;

public class DollHistoryManager {
    Map<String, List<String>> historyMap = new TreeMap<>();

    public void addHistory(String customer, String doll) {
        if (historyMap.containsKey(customer)) {
            historyMap.get(customer).add(doll);
        } else {
            List<String> list = new ArrayList<>();
            list.add(doll);
            historyMap.put(customer, list);
        }

        System.out.println("\uD83D\uDCD2 " + customer + " 님의 인형 기록에 '" + doll + "'이 추가되었습니다.");
    }

    public void showAllHistory() {
        if (historyMap.isEmpty()) {
            System.out.println("📋 아직 기록된 고객이 없습니다.");
            return;
        }
        System.out.println("\uD83D\uDCCB 고객별 인형 기록:");
        for (Map.Entry<String, List<String>> entry : historyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void showAllUniqueHistory() {
        if (historyMap.isEmpty()) {
            System.out.println("📋 아직 기록된 고객이 없습니다.");
            return;
        }
        System.out.println("\uD83C\uDF81 중복 인형 제거 이벤트 결과:");
        for (String name : historyMap.keySet()) {
            Set<String> unique = new LinkedHashSet<>(historyMap.get(name));
            System.out.print("- " + name + ": [");

            Iterator<String> it = unique.iterator();
            while (it.hasNext()) {
                String doll = it.next();
                System.out.print(doll);
                if (it.hasNext()) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
