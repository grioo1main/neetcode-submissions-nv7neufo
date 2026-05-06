class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int mid;
        int m = matrix[0].length; 
        int r = (m * matrix.length) - 1;
        System.out.println("r "+r);
        while (l <= r) {
            mid = (l + r) / 2;
            System.out.println("mid "+mid);
            if (matrix[mid/m][mid%m] == target) {
                return true;
            } else if (matrix[mid/m][mid%m] > target) {
                r = mid-1;
            } else {
                l = mid+1;
            }
        }

        
        return false;
    }
    
}
