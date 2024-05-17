public class mazepaths {
    public static int countMaze(int i, int j , int n , int m) {
        if(i == m-1 && j == n-1){
            return 1;
        }
        if(i == m || j == n){
            return 0;
        }
        int downPaths = countMaze(i+1, j, n, m);
        
        int rightPaths = countMaze(i, j+1, n, m);

        return downPaths + rightPaths;

    }
    public static void main(String[] args) {
      int total =  countMaze(0, 0, 3, 3);
      System.out.println(total);
        
    }
    
}
