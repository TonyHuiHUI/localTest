package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class ProblemSet {
    public static void main(String[] args) {
        int[] a = {3,0,6,1,5};
        System.out.println(hIndex(a));
    }
    //387. 字符串中的第一个唯一字符
    //给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0 ;i < s.length(); i++){
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(hashMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    //275. H 指数 II
    //给定一位研究者论文被引用次数的数组（被引用次数是非负整数），数组已经按照 升序排列 。编写一个方法，计算出研究者的 h 指数。
    public static int hIndex2(int[] citations) {
//        int len = citations.length;
////        for(int i = 0 ; i < len; i++){
////            int h = len - i;
////            if(citations[i] >= h){
////                return h;
////            }
////        }
////        return 0;
        int n = citations.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return n - left;
    }
    //73. 矩阵置零
//    给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean row0 = false;//第一行是否有0
        boolean col0 = false;//第一列是否有0
        for(int i = 0; i < n; i++){
            if(matrix[i][0] == 0){
                col0 = true;
            }
        }
        for(int i = 0; i < m; i++){
            if(matrix[0][i] == 0){
                row0 = true;
            }
        }
        //利用第一行和第一列记录矩阵是否有0
        for(int i = 1; i < n; i++){
            for (int j = 1; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //覆盖原矩阵
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        //还原原第一行
        if(row0){
            for(int i = 0; i < m; i++){
                matrix[0][i] = 0;
            }
        }
        //还原原第一列
        if(col0){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }
    }
    //36. 有效的数独
    //请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
    //数字 1-9 在每一行只能出现一次。
    //数字 1-9 在每一列只能出现一次。
    //数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
    //数独部分空格内已填入了数字，空白格用 '.' 表示。
    //注意：
    //一个有效的数独（部分已被填充）不一定是可解的。
    //只需要根据以上规则，验证已经填入的数字是否有效即可
    public static boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0; i < 9;i++){
            for (int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '1';
                    int boxIndex = i / 3 * 3 + j / 3;
                    if(row[i][num] || col[j][num] || box[boxIndex][num]){
                        return false;
                    }else {
                        row[i][num] = true;
                        col[j][num] = true;
                        box[boxIndex][num] = true;
                    }
                }
            }
        }
        return true;
    }
    //274. H 指数
    //给定一位研究者论文被引用次数的数组（被引用次数是非负整数）。编写一个方法，计算出研究者的 h 指数。
    //h 指数的定义：h 代表“高引用次数”（high citations），一名科研人员的 h 指数是指他（她）的 （N 篇论文中）总共有 h 篇论文分别被引用了至少 h 次。且其余的 N - h 篇论文每篇被引用次数 不超过 h 次。
    //例如：某人的 h 指数是 20，这表示他已发表的论文中，每篇被引用了至少 20 次的论文总共有 20 篇。
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        for(int i = 0 ; i < len; i++){
            int h = len - i;
            if(citations[i] >= h){
                return h;
            }
        }
        return 0;
    }
}
