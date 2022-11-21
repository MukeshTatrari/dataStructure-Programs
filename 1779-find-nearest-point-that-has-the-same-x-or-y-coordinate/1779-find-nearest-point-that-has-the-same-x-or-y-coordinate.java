class Solution {

    public int nearestValidPoint(int x1, int y1, int[][] points) {
        var min = Integer.MAX_VALUE;
        var minIndex = -1;
        for (int i = 0; i < points.length; i++) {
            var x2 = points[i][0];
            var y2 = points[i][1];
            if (x1 == x2 || y1 == y2) {
                var distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
                if (min > distance) {
                    min = distance;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }
}
