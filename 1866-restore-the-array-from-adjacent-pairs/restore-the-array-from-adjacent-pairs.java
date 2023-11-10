class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();

        for (int[] pair : adjacentPairs) {
            adjacencyMap.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
            adjacencyMap.computeIfAbsent(pair[1], k -> new ArrayList<>()).add(pair[0]);
        }

        int n = adjacentPairs.length + 1;
        int[] result = new int[n];
        Set<Integer> visited = new HashSet<>();
        int startIndex = 0;

        for (Map.Entry<Integer, List<Integer>> entry : adjacencyMap.entrySet()) {
            if (entry.getValue().size() == 1) {
                startIndex = entry.getKey();
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            result[i] = startIndex;
            visited.add(startIndex);

            List<Integer> neighbors = adjacencyMap.get(startIndex);
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    startIndex = neighbor;
                    break;
                }
            }
        }

        return result;
    
    }
}