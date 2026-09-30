class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int area = 0;
        for (int i = 0; i < n; i++) {
            int rowMax = 0;
            int colMax = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    area++;
                }
                if (grid[i][j] > rowMax) {
                    rowMax = grid[i][j];
                }
                if (grid[j][i] > colMax) {
                    colMax = grid[j][i];
                }
            }
            area = area + rowMax + colMax;
        }
        return area;
    }
}
