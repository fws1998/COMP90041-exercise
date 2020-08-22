class Solution {
    public static void main(String[] args) {
        /*[0,0,0,0,0,0,0,0,0,0,0],
          [1,0,0,0,0,0,0,0,0,0,0],
          [0,0,0,2,0,0,0,0,0,0,0],
          [0,0,0,0,0,0,0,0,0,0,0],
          [0,0,0,0,0,0,0,0,0,0,0],
          [0,0,0,0,0,0,0,0,0,0,0],
          [0,0,0,0,0,0,0,0,0,0,0],
          [0,0,0,0,0,0,0,0,0,0,0],
          [0,0,0,0,0,0,0,0,0,0,0],
          [0,0,0,0,0,0,0,0,0,0,0],
          [0,0,0,0,0,0,0,0,0,0,0],
         */
        int chessArr[][] = new int[11][11];
        chessArr[1][0] = 1;
        chessArr[2][3] = 2;
        chessArr[2][4] = 3;
        /*for (int[] row : chessArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();*/
        int sum = 0;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
        int sparseArr[][] = new int[sum + 1][3];
        sparseArr[0][0] = chessArr.length;
        sparseArr[0][1] = chessArr.length;
        sparseArr[0][2] = sum;
        int a = 1;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    sparseArr[a][0] = i;
                    sparseArr[a][1] = j;
                    sparseArr[a][2] = chessArr[i][j];
                    a++;
                }
            }
        }
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        System.out.println();
        };
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i =1; i<sparseArr.length; i++){
            chessArr2[sparseArr[i][0]][sparseArr[i][1]]= sparseArr[i][2];
        }
        for (int i = 0; i< chessArr2.length;i++){
            for (int j=0;j< chessArr2.length; j++){
                System.out.printf("%d\t", chessArr2[i][j]);
            }
            System.out.println();
        }
    }
}
