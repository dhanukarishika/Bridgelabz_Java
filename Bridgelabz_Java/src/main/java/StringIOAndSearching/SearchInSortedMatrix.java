package StringIOAndSearching;
/*
 * Q14. Binary Search - Search in a 2D Sorted Matrix
 * Find a target value in a sorted matrix using Binary Search.
 * Return true if found, otherwise false.
 */
public class SearchInSortedMatrix {
    // Search target using Binary Search
    static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Convert 1D index into row and column
            int row = mid / cols;
            int col = mid % cols;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;
        System.out.println("Target: " + target);
        System.out.println("Element Found: " + searchMatrix(matrix, target));
    }
}
