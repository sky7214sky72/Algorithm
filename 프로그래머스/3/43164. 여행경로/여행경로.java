import java.util.*;
class Solution {
    public static String[] solution(String[][] tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for (String[] ticket : tickets) {
            graph.computeIfAbsent(ticket[0], k -> new PriorityQueue<>()).add(ticket[1]);
        }

        List<String> route = new ArrayList<>();
        dfs("ICN", graph, route);
        return route.toArray(new String[route.size()]);
    }

    private static void dfs(String airport, Map<String, PriorityQueue<String>> graph, List<String> route) {
        PriorityQueue<String> destinations = graph.get(airport);

        while (destinations != null && !destinations.isEmpty()) {
            String nextAirport = destinations.poll();
            dfs(nextAirport, graph, route);
        }
        route.add(0, airport);
    }
}