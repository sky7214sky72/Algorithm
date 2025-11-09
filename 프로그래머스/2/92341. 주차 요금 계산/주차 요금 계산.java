import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        Map<String, Integer> inTime = new HashMap<>();
        Map<String, Integer> totalTime = new HashMap<>();
        for (String rec : records) {
            String[] parts = rec.split(" ");
            String timeStr = parts[0];
            String carNum = parts[1];
            String type = parts[2];
            
            int hh = Integer.parseInt(timeStr.substring(0,2));
            int mm = Integer.parseInt(timeStr.substring(3,5));
            
            int minutes = hh * 60 + mm;
            
            if (type.equals("IN")) {
                inTime.put(carNum, minutes);
            } else {
                int inMin = inTime.get(carNum);
                int used = minutes - inMin;
                totalTime.put(carNum, totalTime.getOrDefault(carNum, 0) + used);
                inTime.remove(carNum);
            }
        }
        int endTime = 23 * 60 + 59;
        for (String carNum : inTime.keySet()) {
            int inMin = inTime.get(carNum);
            int used = endTime - inMin;
            totalTime.put(carNum, totalTime.getOrDefault(carNum, 0) + used);
        }
        
        List<String> cars = new ArrayList<>(totalTime.keySet());
        Collections.sort(cars);
        int[] answer = new int[cars.size()];
        for (int i=0;i<cars.size();i++) {
            String carNum = cars.get(i);
            int time = totalTime.get(carNum);
            int fee = baseFee;
            if (time > baseTime) {
                fee += (int) Math.ceil((double)(time - baseTime) / unitTime) * unitFee;
            }
            answer[i] = fee;
        }
        return answer;
    }
}