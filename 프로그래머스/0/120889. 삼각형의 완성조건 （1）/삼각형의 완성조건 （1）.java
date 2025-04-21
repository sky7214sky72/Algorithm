import java.util.*;

class Solution {
    public int solution(int[] sides) {
        List<Integer> sideList = new ArrayList<>();
        for (int side : sides) {
            sideList.add(side);
        }
        sideList.sort(Comparator.reverseOrder());
        return sideList.get(0) < sideList.get(1) + sideList.get(2) ? 1 : 2;
    }
}