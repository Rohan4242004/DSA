class Solution {
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex + 1;
        List<List<Integer>> ans = new ArrayList<>();   ///Created Empty 2D ArrayList

        for (int i = 0; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();  /// Created Empty ArrayList inside a ArrayList

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr.add(1);
                } else {
                    arr.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1)); // arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
                }
            }
            ans.add(arr);  // Add all ArrayList inside a ArrayList
        }

        return ans.get(rowIndex);
    }
}