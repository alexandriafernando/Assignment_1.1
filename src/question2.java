import java.util.*;
public class question2 {

        public static List<Integer> Traverse(int[][] trans) {
            List<Integer> output = new ArrayList<Integer>();
            int i, m1,m2,col,row, a=0,b=0,di=0;

            if (trans.length == 0)
                return output;

            m1 = trans.length;
            m2 = trans[0].length;
            boolean[][] bool = new boolean[m1][m2];
            int[] dr = { 0, 1, 0, -1 };
            int[] dc = { 1, 0, -1, 0 };


            // Iterate from 0 to R * C - 1
            for (i = 0; i < m1 * m2; i++) {
                output.add(trans[a][b]);
                bool[a][b] = true;
                row = a + dr[di];
                col = b + dc[di];

                if (0 <= row && row < m1 && 0 <= col && col < m2
                        && !bool[row][col]) {
                    a = row;
                    b = col;
                } else {
                    di = (di + 1) % 4;
                    a += dr[di];
                    b += dc[di];
                }
            }
            return output;
        }
        public static void main(String[] args) {
            int res[][] = { { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } };

            System.out.println("Sample Input:\n1, 2, 3, 4 \n" +
                    "5, 6, 7, 8\n" +
                    "9, 10, 11, 12\n" +
                    "13, 14, 15, 16\n"+ "\nOutput: "+Traverse(res));
        }
    }
