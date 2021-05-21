
import java.util.*;

/**
 * @author hui
 * 2020/5/7 0007 10:28
 */
public class NacosPassword {
    private static int visited;

    public static void main(String[] args) {
//        System.out.println(new BCryptPasswordEncoder().encode("123456"));
//        System.out.println(UUID.randomUUID().toString());

        //最小书架高度（dp）
//        int[][] books = {{1, 1}, {2, 3}, {2, 3}, {1, 1}, {1, 1}, {1, 1}, {1, 2}};
//        System.out.println(minHeightShelves(books, 4));
        //判断是否是有效的IPv4/IPv6
        // System.out.println(validIPAddress("192.0.0.1"));

        //和可被 K 整除的子数组
//        int[] A = {1, 2};
//        System.out.println(subarraysDivByK(A, 5));
//        System.out.println(decodeString("100[leetcode]"));

        //数组拼接（贪心）
//        int[][] clips = {{0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9},{0,8}};
//        System.out.println(videoStitching(clips, 10));

        //HTML实体解析
        // &quot; &apos; &amp; &gt; &lt; &frasl;
//        String text ="x &gt; y &amp;&amp;amp; x &lt; y is always false";
//
//        System.out.println(entityParser(text));
        //贪心
//        int[] nums = {9, 7, 9, 3, 1};
//        System.out.println(rob(nums));

//        System.out.println(brokenCalc(3, 10));

//        System.out.println(detectCapitalUse("FlaG"));

//        int[] arr = {0, 2, 3, 3,5,2};
        //山脉数组
//        System.out.println(validMountainArray(arr));

        //左右连乘
//        System.out.println(productExceptSelf(arr));

//        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        int[][] arr = {{3},{2}};
//        System.out.println(spiralOrder(arr));
//        int[] arr = {1,2,3,4};
////        System.out.println(decompressRLElist(arr));

//        System.out.println(generatorSign());

        //单调栈
//        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
//        System.out.println(dailyTemperatures(temperatures));

        //三数之和 排序，双指针
//        int[] num = {-1, 0, 1, 2, -1, -4};
//        System.out.println(threeSum(num));

//        System.out.println(smallestRepunitDivByK(10011));


//        int[] a = {8, 1, 5, 2, 6};
//        System.out.println(maxScoreSightseeingPair(a));
//        System.out.println(reverseWords("Let's take LeetCode contest"));

        //从先序遍历还原二叉树
//        System.out.println(recoverFromPreorder("1-2--3--4-5--6--7"));

//        System.out.println(patternMatching("abba", "dogcatcatdog"));

//        int[] a = {-3,-2,-5,3,-4};
//        System.out.println(threeSumClosest(a, -1));

//        int[] a = {2,3,1,2,4,3};
//        System.out.println(minSubArrayLen(7,a));

        //给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。candidates 中的数字可以无限制重复被选取
        //递归
//        int[] a = {2,3,5};
//        System.out.println(combinationSum(a,8));
//
//        int[] a = {1,2,3,2,1};
//        int[] b = {3,2,1,4,7};
//        System.out.println(findLength(a,b));

        //给你一个整数数组 bloomDay，以及两个整数 m 和 k 。
        //现需要制作 m 束花。制作花束时，需要使用花园中 相邻的 k 朵花 。
        //花园中有 n 朵花，第 i 朵花会在 bloomDay[i] 时盛开，恰好 可以用于 一束 花中。
        //请你返回从花园中摘 m 束花需要等待的最少的天数。如果不能摘到 m 束花则返回 -1 。
//
//        int[] a = {1,10,3,10,2};
//
//        System.out.println(minDays(a,3,1));

//        int[][] a = {{0,0,0},{0,1,0},{0,0,0}};
//        System.out.println(uniquePathsWithObstacles(a));

        //求解数独
        //回溯
//        char[][] a = {  {'5','3','.','.','7','.','.','.','.'},
//                        {'6','.','.','1','9','5','.','.','.'},
//                        {'.','9','8','.','.','.','.','6','.'},
//                        {'8','.','.','.','6','.','.','.','3'},
//                        {'4','.','.','8','.','3','.','.','1'},
//                        {'7','.','.','.','2','.','.','.','6'},
//                        {'.','6','.','.','.','.','2','8','.'},
//                        {'.','.','.','4','1','9','.','.','5'},
//                        {'.','.','.','.','8','.','.','7','9'}};
//        solveSudoku(a);
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        //恢复空格，返回未识别的字符数
//        String[] dictionary  = {"looked", "just", "like", "her", "brother"};
//        System.out.println(respace1(dictionary , "jesslookedjustliketimherbrother"));
//
//        System.out.println(getPermutation(4,9));
//        int[] a = {1,1,2,3};
//        System.out.println(distributeCandies(a));

        //System.out.println(reverseLeftWords("lrloseumgh",6));
//        String[] a = {"I","am","a","student","from","a","university","in","a","city"};
//        System.out.println(findClosest(a,"a","student"));

        //字符串相乘
        // System.out.println(multiply("123","456"));


        //System.out.println(compareVersion("1.2.3","1.2.2"));

//        System.out.println(repeatedSubstringPattern("abcd"));
//        System.out.println(letterCombinations("23"));
//        List<List<Integer>> a = new ArrayList<>(16);
//        for (int i = 0; i < 3; i++){
//            List<Integer> x = new ArrayList<>();
//            x.add(i+1);
//            a.add(x);
//        }
//        a.add(new ArrayList<>());
//
//        System.out.println(canVisitAllRooms(a));

        //判断字符串是否是数字（状态机实现）
//        System.out.println(isNumber("1E-16"));

        //N皇后问题
//        System.out.println(solveNQueens(4));

        //前K个高频元素
//        int[] a = {4,1,-1,2,-1,2,3};
//        System.out.println(topKFrequent(a,2));

//        System.out.println(combine(4,2));
//
//        int[][] a = {{1,2}, {1,3}, {2,3}};
//        System.out.println(findRedundantDirectedConnection(a));

//        int[] a = {1,1,2};
//        System.out.println(permuteUnique(a));

        //返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表
//        String[] a = {"bella","label","roller"};
//        System.out.println(commonChars(a));

        // System.out.println(isLongPressedName("pyplrz","ppyypllr"));

//        int[] a = {3,6,9,1};
//        System.out.println(maximumGap(a));
        // System.out.println(wordPattern("abba","dog cat cat dog"));

//        int[][] a ={{1,2},{1,3},{2,3}};
//        System.out.println(findRedundantConnection(a));


//        List<List<String>> b = new ArrayList<List<String>>(){{
//            add(new ArrayList<>(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com")));
//            add(new ArrayList<>(Arrays.asList("John", "johnnybravo@mail.com")));
//            add(new ArrayList<>(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com")));
//            add(new ArrayList<>(Arrays.asList("Mary", "mary@mail.com")));
//        }
//        };
//        System.out.println(accountsMerge(b));

//        String[] a = {"aaaa","asas","able","ability","actt","actor","access"};
////        String[] b = {"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
////        System.out.println(findNumOfValidWords(a,b));
//
//        int a = 11;
//        int count = 0;
//        while (a>0){
//            a = a&(a-1);
//            count++;
//        }
//        System.out.println(count);

//        System.out.println(minCut("aab"));
//        System.out.println(calculate1("3+2*2"));
//
//        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        System.out.println(spiralOrder(a));
//
//        System.out.println(numDistinct("rabbbit","rabbit"));
//        int[] a ={0,2,1,-6,6,-7,9,1,2,0,1};
////        System.out.println(canThreePartsEqualSum(a));

//        int[] a = {0,0,1,1,1,1,2,3,3};
//        System.out.println(removeDuplicates(a));
//        System.out.println(numDecodings("220"));
//        System.out.println((int)Math.exp(2));
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(canCross(a));
//        System.out.println(minimumTimeRequired(a,2));
        System.out.println(shipWithinDays(a, 5));
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //不相交的线
    //现在，可以绘制一些连接两个数字 nums1[i] 和 nums2[j] 的直线，这些直线需要同时满足满足：
    //
    //     nums1[i] == nums2[j]
    //    且绘制的直线不与任何其他连线（非水平线）相交。
    //
    //请注意，连线即使在端点也不能相交：每个数字只能属于一条连线。
    //
    //以这种方法绘制线条，并返回可以绘制的最大连线数
    // 问题转换成求最长公共子序列
    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int num1 = nums1[i - 1];
            for (int j = 1; j <= n; j++) {
                int num2 = nums2[j - 1];
                if(num1 == num2){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }


    public static List<String> topKFrequent(String[] words, int k) {
        //hash + 排序
//        Map<String, Integer> count = new HashMap<>(16);
//        for (String word : words) {
//            count.put(word, count.getOrDefault(word, 0) + 1);
//        }
//        List<String> keys = new ArrayList<>(16);
//        keys.addAll(count.keySet());
//        keys.sort((o1, o2) -> count.get(o1).equals(count.get(o2)) ? o1.compareTo(o2) : count.get(o2) - count.get(o1));
//        return keys.subList(0, k);
        //hash + 小顶堆
        Map<String, Integer> count = new HashMap<>(16);
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> o1.getValue().equals(o2.getValue()) ? o1.getKey().compareTo(o2.getKey()) : o1.getValue() - o2.getValue());
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            priorityQueue.offer(entry);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        List<String> res = new ArrayList<>(16);
        while (!priorityQueue.isEmpty()) {
            res.add(priorityQueue.poll().getKey());
        }
        return res;
    }

    public static int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = (left + right) >> 2;
            int need = 1;
            int cur = 0;
            for (int weight : weights) {
                if (cur + weight > mid) {
                    need++;
                    cur = 0;
                }
                cur += weight;
            }
            if (need <= D) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    public static int minimumTimeRequired(int[] jobs, int k) {
        int low = 0, high = jobs.length - 1;
        while (low < high) {
            int temp = jobs[low];
            jobs[low] = jobs[high];
            jobs[high] = temp;
            low++;
            high--;
        }
        int l = jobs[0], r = Arrays.stream(jobs).sum();
        while (l < r) {
            int mid = (l + r) >> 1;
            if (check(jobs, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static boolean check(int[] jobs, int k, int limit) {
        int[] workloads = new int[k];
        return backtrack(jobs, workloads, 0, limit);
    }

    public static boolean backtrack(int[] jobs, int[] workloads, int i, int limit) {
        if (i >= jobs.length) {
            return true;
        }
        int cur = jobs[i];
        for (int j = 0; j < workloads.length; ++j) {
            if (workloads[j] + cur <= limit) {
                workloads[j] += cur;
                if (backtrack(jobs, workloads, i + 1, limit)) {
                    return true;
                }
                workloads[j] -= cur;
            }
            // 如果当前工人未被分配工作，那么下一个工人也必然未被分配工作
            // 或者当前工作恰能使该工人的工作量达到了上限
            // 这两种情况下我们无需尝试继续分配工作
            if (workloads[j] == 0 || workloads[j] + cur == limit) {
                break;
            }
        }
        return false;
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != result) {
                if (count == 1) {
                    return result;
                } else {
                    result = nums[i];
                    count = 1;
                }
            } else {
                count++;
            }
        }
        return result;
    }

    public static boolean canCross(int[] stones) {
        int n = stones.length;
        boolean[][] dp = new boolean[n][n];
        dp[0][0] = true;
        for (int i = 1; i < n; ++i) {
            if (stones[i] - stones[i - 1] > i) {
                return false;
            }
        }
        for (int i = 1; i < n; ++i) {
            for (int j = i - 1; j >= 0; --j) {
                int k = stones[i] - stones[j];
                if (k > j + 1) {
                    break;
                }
                dp[i][k] = dp[j][k - 1] || dp[j][k] || dp[j][k + 1];
                if (i == n - 1 && dp[i][k]) {
                    return true;
                }
            }
        }
        return false;
    }


    public static int numDecodings(String s) {
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; ++i) {
            if (s.charAt(i - 1) != '0') {
                f[i] += f[i - 1];
            }
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                f[i] += f[i - 2];
            }
        }
        return f[n];
    }

    public static int minHeightShelves(int[][] books, int shelf_width) {
        int[] dp = new int[books.length + 1];
        dp[0] = 0;
        for (int i = 0; i < books.length; i++) {
            dp[i + 1] = Integer.MAX_VALUE;
            int width = 0;
            int height = 0;
            for (int j = i; j >= 0; j--) {
                width += books[j][0];
                height = height > books[j][1] ? height : books[j][1];
                if (width <= shelf_width) {
                    dp[i + 1] = dp[i + 1] > dp[j] + height ? dp[j] + height : dp[i + 1];
                } else {
                    break;
                }
            }
        }
        return dp[books.length];
    }

    public static String validIPAddress(String IP) {
        String[] strs4 = IP.split("\\.", -1);
        String[] strs6 = IP.split(":", -1);

        if (strs4.length == 4) {
            int count = 0;
            for (String str : strs4) {
                count += 1;
                char[] chars = str.toCharArray();
                for (char c : chars) {
                    if (!Character.isDigit(c)) {
                        return "Neither";
                    }
                }
                if (str.length() > 1 && str.startsWith("0")) {
                    return "Neither";
                }
                if (str.isEmpty() || str.length() > 3 || Integer.valueOf(str) > 255) {
                    return "Neither";
                }
            }
            if (count == 4) {
                return "IPv4";
            }
        } else if (strs6.length == 8) {
            int count = 0;
            for (String str : strs6) {
                count += 1;
                if (str.length() == 0 || str.length() > 4) {
                    return "Neither";
                }
                char[] chars = str.toCharArray();
                for (char c : chars) {
                    if (!Character.isDigit(c)) {
                        c = Character.toLowerCase(c);
                        if (!(c >= 'a' && c <= 'f')) {
                            return "Neither";
                        }
                    }

                }
            }
            if (count == 8) {
                return "IPv6";
            }
        } else {
            return "Neither";
        }
        return "Neither";
    }

    public static int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> preSum = new HashMap<>();
        int sum = 0;
        int count = 0;
        preSum.put(0, 1);
        for (int i : A) {
            sum += i;
            int mod = (sum % K + K) % K;
            int tmp = preSum.getOrDefault(mod, 0);
            count += tmp;
            preSum.put(mod, tmp + 1);
        }
        return count;
    }

    public static String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                stringStack.push(String.valueOf(s.charAt(i)));
            } else {
                StringBuilder str = new StringBuilder();
                while (!"[".equals(stringStack.peek())) {
                    str.insert(0, stringStack.pop());
                }
                stringStack.pop();
                int count = 0;
                StringBuilder countStr = new StringBuilder();
                while (!stringStack.empty() && stringStack.peek().charAt(0) >= '0' && stringStack.peek().charAt(0) <= '9') {
                    countStr.insert(0, stringStack.pop());
                }
                count = Integer.valueOf(countStr.toString());
                StringBuilder tmp = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    tmp.append(str);
                }
                stringStack.push(tmp.toString());
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stringStack.empty()) {
            result.insert(0, stringStack.pop());
        }
        return result.toString();
    }

    public static int videoStitching(int[][] clips, int T) {
        Arrays.sort(clips, (left, right) -> left[0] == right[0] ? right[1] - left[1] : left[0] - right[0]);

        int count = 0;
        int maxRight = 0;
        for (int i = 0; i < clips.length && maxRight < T; i++) {
            int[] tmp = clips[i];
            while (i < clips.length && clips[i][0] < maxRight) {
                if (clips[i][1] > tmp[1]) {
                    tmp = clips[i];
                }
                i++;
            }
            if (i < clips.length && maxRight == clips[i][0]) {
                maxRight = Math.max(clips[i][1], tmp[1]);
            } else if (maxRight > tmp[0]) {
                maxRight = tmp[1];
            }
            count++;
        }
        if (maxRight < T) {
            return -1;
        }
        return count;
    }

    public static String entityParser(String text) {
//        int index = 0;
//        while (text.indexOf("&", index) != -1 && text.indexOf(";", index) != -1) {
//            int begin = text.indexOf("&",index);
//            int end = text.indexOf(";",index);
//            String subStr = text.substring(begin,end + 1);
//            switch (subStr) {
//                case "&quot;":
//                    text = text.replaceFirst("&quot;","\"");
//                    break;
//                case "&apos;":
//                    text = text.replaceFirst("&apos;","\'");
//                    break;
//                case "&amp;":
//                    text = text.replaceFirst("&amp;","&");
//                    break;
//                case "&gt;":
//                    text = text.replaceFirst("&gt;",">");
//                    break;
//                case "&lt;":
//                    text = text.replaceFirst("&lt;","<");
//                    break;
//                case "&frasl;":
//                    text = text.replaceFirst("&frasl;","/");
//                    break;
//                default:
//                    break;
//            }
//            index = begin + 1;
//        }

        return text
                .replaceAll("&quot;", "\"")
                .replaceAll("&apos;", "'")
                .replaceAll("&amp;", "&")
                .replaceAll("&gt;", ">")
                .replaceAll("&lt;", "<")
                .replaceAll("&frasl;", "/");
        //return text;
    }

    public static int rob(int[] nums) {
        int preTmp = nums[0];
        int sum = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int tmp = sum;
            sum = Math.max(preTmp + nums[i], sum);
            preTmp = tmp;
        }
        return sum;
    }

    public static int brokenCalc(int X, int Y) {
        if (X >= Y) {
            return X - Y;
        } else {
            if (Y % 2 == 0) {
                return 1 + brokenCalc(X, Y / 2);
            } else {
                return 1 + brokenCalc(X, Y + 1);
            }
        }
    }

    public static boolean detectCapitalUse(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                count++;
            }
        }
        if (count == word.length() || count == 0 || (count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
            return true;
        }
        return false;
        //return word.matches("([A-Z][a-z]+|[a-z]+|[A-Z]+)");
    }

    public static boolean validMountainArray(int[] A) {
        int length = A.length;
        int index = 0;

        while (index < length - 1 && A[index] < A[index + 1]) {
            index++;
        }
        if (index == 0 || index == length - 1) {
            return false;
        }
        while (index < length - 1 && A[index] > A[index + 1]) {
            index++;
        }
        if (index != length - 1) {
            return false;
        }
        return true;
    }

    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] left = new int[length];
        left[0] = 1;
        for (int i = 1; i < length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        int r = 1;
        for (int i = length - 1; i > 0; i--) {
            left[i] = left[i] * r;
            r = r * nums[i];
        }
        return left;
    }

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int[] result = new int[(bottom + 1) * (right + 1)];
        int index = 0;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            for (int j = top + 1; j <= bottom; j++) {
                result[index++] = matrix[j][right];
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                    result[index++] = matrix[bottom][i];
                }
                for (int j = bottom; j > top; j--) {
                    result[index++] = matrix[j][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        return result;
    }

    public static int[] decompressRLElist(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            count += nums[i];
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 1; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                result[index++] = nums[i];
            }
        }
        return result;
    }

//    private static String generatorSign() {
//        System.out.println(System.currentTimeMillis());
//        StringBuilder stringBuilder = new StringBuilder();
//        String str = stringBuilder.append("today-mini-order-demo").append("{\"id\":\"111\"}").append("1591854961788").append("123456").toString();
//        return md5(str).toLowerCase();
//    }

    public static int[] dailyTemperatures(int[] T) {
        //{73, 74, 75, 71, 69, 72, 76, 73}
        int[] result = new int[T.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < T.length; i++) {
            int temp = T[i];
            while (!stack.isEmpty() && temp > T[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>(16);
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                return listList;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>(16);
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    listList.add(list);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return listList;
    }

    public static int smallestRepunitDivByK(int K) {
        //https://leetcode-cn.com/problems/smallest-integer-divisible-by-k/solution/javajie-fa-yi-ji-zheng-ming-de-si-lu-by-jiangzk/
        if (K % 2 == 0 || K % 5 == 0) {
            return -1;
        }
        int x = 1;
        int len = 1;
        //(x*10+1)%K=((x%K)*10+1)%K,防止x越界
        while (x % K != 0) {
            x = x % K;
            x = x * 10 + 1;
            len++;
        }
        return len;
    }

    public static int maxScoreSightseeingPair(int[] A) {
        int result = Integer.MIN_VALUE;
        int x = A[0];
        for (int i = 1; i < A.length; i++) {
            result = Math.max(result, x + A[i] - i);
            x = Math.max(x, A[i] + i);
        }
        return result;
    }

    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(new StringBuilder(strings[i]).reverse().toString()).append(" ");
        }
        return sb.toString().trim();
    }

    public static TreeNode recoverFromPreorder(String S) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        int pos = 0;
        while (pos < S.length()) {
            int level = 0;
            int value = 0;
            while (S.charAt(pos) == '-') {
                level++;
                pos++;
            }
            StringBuilder sb = new StringBuilder();
            while (pos < S.length() && S.charAt(pos) != '-') {
                sb.append(S.charAt(pos++));
            }
            value = Integer.valueOf(sb.toString());
            TreeNode node = new TreeNode(value);
            if (!stack.isEmpty()) {
                while (stack.size() > level) {
                    stack.pop();
                }
                if (stack.peekFirst().left == null) {
                    stack.peekFirst().left = node;
                } else {
                    stack.peekFirst().right = node;
                }
                stack.push(node);
            } else {
                stack.push(node);
            }
        }
        return stack.peekLast();
    }

    public static boolean patternMatching(String pattern, String value) {
        int count_a = 0, count_b = 0;
        //统计模式中a和b的数量
        for (char ch : pattern.toCharArray()) {
            if (ch == 'a') {
                ++count_a;
            } else {
                ++count_b;
            }
        }
        //如果a的数量小于b的数量，将模式的a与b对换
        if (count_a < count_b) {
            int temp = count_a;
            count_a = count_b;
            count_b = temp;
            char[] array = pattern.toCharArray();
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] == 'a' ? 'b' : 'a';
            }
            pattern = new String(array);
        }
        //当value为空时，只有
        if (value.length() == 0) {
            return count_b == 0;
        }
        if (pattern.length() == 0) {
            return false;
        }

        //枚举a的长度
        for (int len_a = 0; count_a * len_a <= value.length(); ++len_a) {
            int rest = value.length() - count_a * len_a;
            if ((count_b == 0 && rest == 0) || (count_b != 0 && rest % count_b == 0)) {
                int len_b = (count_b == 0 ? 0 : rest / count_b);
                int pos = 0;
                boolean correct = true;
                String value_a = "", value_b = "";
                for (char ch : pattern.toCharArray()) {
                    if (ch == 'a') {
                        String sub = value.substring(pos, pos + len_a);
                        if (value_a.length() == 0) {
                            value_a = sub;
                        } else if (!value_a.equals(sub)) {
                            correct = false;
                            break;
                        }
                        pos += len_a;
                    } else {
                        String sub = value.substring(pos, pos + len_b);
                        if (value_b.length() == 0) {
                            value_b = sub;
                        } else if (!value_b.equals(sub)) {
                            correct = false;
                            break;
                        }
                        pos += len_b;
                    }
                }
                if (correct && !value_a.equals(value_b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(bestSum - target)) {
                    bestSum = sum;
                }
                if (sum > target) {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else {
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return bestSum;
    }

    public static int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= s) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>(16);
        List<Integer> tmp = new ArrayList<>(16);
        Arrays.sort(candidates);
        find(result, tmp, candidates, target, 0);
        return result;
    }

    public static void find(List<List<Integer>> listAll, List<Integer> tmp, int[] candidates, int target, int num) {
        if (target == 0) {
            listAll.add(tmp);
            return;
        }
        for (int i = num; i < candidates.length && target >= candidates[num]; i++) {
            List<Integer> list = new ArrayList<>(tmp);
            list.add(candidates[i]);
            find(listAll, list, candidates, target - candidates[i], i);
        }
    }

    public static int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int left = 0;
        int right = 0;
        for (int num : bloomDay) {
            right = Math.max(right, num);
        }
        while (left < right) {
            int mid = (left + right) / 2;
            int tmp = 0;
            int count = 0;
            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == k) {
                    count = 0;
                    tmp++;
                }
            }
            if (tmp >= m) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[] f = new int[m];

        f[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    f[j] = 0;
                    continue;
                }
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
                    f[j] += f[j - 1];
                }
            }
        }

        return f[m - 1];
    }

    public static void solveSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] block = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    row[i][num] = true;
                    col[i][num] = true;
                    block[i / 3 * 3 + j / 3][num] = true;
                }
            }
        }
        dfsSudoku(board, row, col, block, 0, 0);

    }

    public static void dfsSudoku(char[][] board, boolean[][] row, boolean[][] col, boolean[][] block, int i, int j) {
        while (board[i][j] != '.') {
            if (++j >= 9) {
                i++;
                j = 0;
            }
            if (i >= 9) {
                return;
            }
        }
        for (int num = 0; num < 9; num++) {
            int blockIndex = i / 3 * 3 + j / 3;
            if (!row[i][num] && !col[j][num] && !block[blockIndex][num]) {
                board[i][j] = (char) (num + '1');
                row[i][num] = true;
                col[j][num] = true;
                block[blockIndex][num] = true;
                dfsSudoku(board, row, col, block, i, j);
                board[i][j] = '.';
                row[i][num] = false;
                col[i][num] = false;
                block[blockIndex][num] = false;
            }
        }
    }

    public static int respace(String[] dictionary, String sentence) {
        int n = sentence.length();

        Trie root = new Trie();
        for (String word : dictionary) {
            root.insert(word);
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; ++i) {
            dp[i] = dp[i - 1] + 1;

            Trie curPos = root;
            for (int j = i; j >= 1; --j) {
                int t = sentence.charAt(j - 1) - 'a';
                if (curPos.next[t] == null) {
                    break;
                } else if (curPos.next[t].isEnd) {
                    dp[i] = Math.min(dp[i], dp[j - 1]);
                }
                if (dp[i] == 0) {
                    break;
                }
                curPos = curPos.next[t];
            }
        }
        return dp[n];
    }

    public static int respace1(String[] dictionary, String sentence) {
        int slen = sentence.length();
        int[] dp = new int[slen + 1];
        dp[0] = 0;
        for (int i = 1; i <= slen; i++) {
            dp[i] = dp[i - 1] + 1;
            for (String word : dictionary) {
                int wlen = word.length();
                if (wlen <= i && word.equals(sentence.substring(i - wlen, i))) {
                    dp[i] = Math.min(dp[i], dp[i - wlen]);
                }
            }
        }
        return dp[slen];
    }

    public static String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> candidates = new ArrayList<>();
        int[] factorials = new int[n + 1];
        factorials[0] = 1;
        int fact = 1;
        for (int i = 1; i <= n; ++i) {
            candidates.add(i);
            fact *= i;
            factorials[i] = fact;
        }
        //k下标从0开始
        k -= 1;
        for (int i = n - 1; i >= 0; --i) {
            int index = k / factorials[i];
            //数组下标和index关系，candidates.remove(),数组下标的变化。
            sb.append(candidates.remove(index));
            k -= index * factorials[i];
        }
        return sb.toString();
    }

    public static int distributeCandies(int[] candies) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < candies.length; i++) {
            if (map.get(candies[i]) == null) {
                map.put(candies[i], 1);
            } else {
                map.put(candies[i], map.get(candies[i] + 1));
            }
        }
        if (map.size() >= candies.length / 2) {
            return candies.length / 2;
        } else {
            return map.size();
        }

    }

    public static String reverseLeftWords(String s, int n) {
        int strlength = s.length();
        if (n >= strlength) {
            return s;
        }
        String substr = s.substring(0, n);
        String substr2 = s.substring(n);
        return substr2 + substr;

    }

    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }

    public static int findClosest(String[] words, String word1, String word2) {
        int t1 = -1;
        int t2 = -1;
        int res = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                t1 = i;
            } else if (words[i].equals(word2)) {
                t2 = i;
            }
            if (t1 != -1 && t2 != -1) {
                res = Math.min(res, Math.abs(t1 - t2));
            }
        }
        return res;
    }

    public static String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 2;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int num1Length = num1.length();
        int num2Length = num2.length();
        int[] arr = new int[num1Length + num2Length + 1];
        for (int i = num1Length - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = num2Length - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                arr[i + j + 1] += x * y;
            }
        }
        for (int i = num1Length + num2Length - 1; i > 0; i--) {
            arr[i - 1] += arr[i] / 10;
            arr[i] %= 10;
        }
        StringBuilder sb = new StringBuilder();
        int index = arr[0] == 0 ? 1 : 0;
        while (index < num1Length + num2Length) {
            sb.append(arr[index++]);
        }
        return sb.toString();
    }

    public static int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");


        for (int n = 0; n < Math.max(str1.length, str2.length); n++) {
            int i = n < str1.length ? Integer.parseInt(str1[n]) : 0;
            int j = n < str2.length ? Integer.parseInt(str2[n]) : 0;
            if (i < j) {
                return -1;
            } else if (i > j) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>(16);
        if (digits.length() == 0) {
            return result;
        }
        Map<Character, String> dic = new HashMap<Character, String>(8) {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        backTrace(result, dic, digits, 0, new StringBuffer());
        return result;
    }

    public static void backTrace(List<String> result, Map<Character, String> dic, String digits, int index, StringBuffer temp) {
        if (index == digits.length()) {
            result.add(temp.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = dic.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                temp.append(letters.charAt(i));
                backTrace(result, dic, digits, index + 1, temp);
                temp.deleteCharAt(index);
            }
        }
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int num = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != num) {
                return false;
            }
        }
        return true;
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int num = rooms.size();
        int[] visit = new int[num];
        visited = 0;
        dfs(rooms, visit, 0);
        return visited == num;
    }

    public static void dfs(List<List<Integer>> rooms, int[] visit, int index) {
        visit[index] = 1;
        visited++;
        for (int x : rooms.get(index)) {
            if (visit[x] != 1) {
                dfs(rooms, visit, x);
            }
        }
    }

    public static boolean isNumber(String s) {
        Map<State, Map<CharType, State>> transfer = new HashMap<State, Map<CharType, State>>();
        Map<CharType, State> initialMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_SPACE, State.STATE_INITIAL);
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
            put(CharType.CHAR_SIGN, State.STATE_INT_SIGN);
        }};
        transfer.put(State.STATE_INITIAL, initialMap);
        Map<CharType, State> intSignMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
        }};
        transfer.put(State.STATE_INT_SIGN, intSignMap);
        Map<CharType, State> integerMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_EXP, State.STATE_EXP);
            put(CharType.CHAR_POINT, State.STATE_POINT);
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_INTEGER, integerMap);
        Map<CharType, State> pointMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_POINT, pointMap);
        Map<CharType, State> pointWithoutIntMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
        }};
        transfer.put(State.STATE_POINT_WITHOUT_INT, pointWithoutIntMap);
        Map<CharType, State> fractionMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_FRACTION, fractionMap);
        Map<CharType, State> expMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
            put(CharType.CHAR_SIGN, State.STATE_EXP_SIGN);
        }};
        transfer.put(State.STATE_EXP, expMap);
        Map<CharType, State> expSignMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
        }};
        transfer.put(State.STATE_EXP_SIGN, expSignMap);
        Map<CharType, State> expNumberMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_EXP_NUMBER, expNumberMap);
        Map<CharType, State> endMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_END, endMap);

        int length = s.length();
        State state = State.STATE_INITIAL;

        for (int i = 0; i < length; i++) {
            CharType type = toCharType(s.charAt(i));
            if (!transfer.get(state).containsKey(type)) {
                return false;
            } else {
                state = transfer.get(state).get(type);
            }
        }
        return state == State.STATE_INTEGER || state == State.STATE_POINT || state == State.STATE_FRACTION || state == State.STATE_EXP_NUMBER || state == State.STATE_END;
    }

    public static CharType toCharType(char ch) {
        if (ch >= '0' && ch <= '9') {
            return CharType.CHAR_NUMBER;
        } else if (ch == 'e' || ch == 'E') {
            return CharType.CHAR_EXP;
        } else if (ch == '.') {
            return CharType.CHAR_POINT;
        } else if (ch == '+' || ch == '-') {
            return CharType.CHAR_SIGN;
        } else if (ch == ' ') {
            return CharType.CHAR_SPACE;
        } else {
            return CharType.CHAR_ILLEGAL;
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<List<String>>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        //从列，两个对角判断是否可以放下皇后
        Set<Integer> columns = new HashSet<Integer>();
        Set<Integer> diagonals1 = new HashSet<Integer>();
        Set<Integer> diagonals2 = new HashSet<Integer>();
        backtrack(solutions, queens, n, 0, columns, diagonals1, diagonals2);
        return solutions;
    }

    public static void backtrack(List<List<String>> solutions, int[] queens, int n, int row, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        if (row == n) {
            List<String> board = generateBoard(queens, n);
            solutions.add(board);
        } else {
            for (int i = 0; i < n; i++) {
                if (columns.contains(i)) {
                    continue;
                }
                int diagonal1 = row - i;
                if (diagonals1.contains(diagonal1)) {
                    continue;
                }
                int diagonal2 = row + i;
                if (diagonals2.contains(diagonal2)) {
                    continue;
                }
                queens[row] = i;
                columns.add(i);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                backtrack(solutions, queens, n, row + 1, columns, diagonals1, diagonals2);
                queens[row] = -1;
                columns.remove(i);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
        }
    }

    public static List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }

    enum State {
        STATE_INITIAL,
        STATE_INT_SIGN,
        STATE_INTEGER,
        STATE_POINT,
        STATE_POINT_WITHOUT_INT,
        STATE_FRACTION,
        STATE_EXP,
        STATE_EXP_SIGN,
        STATE_EXP_NUMBER,
        STATE_END,
    }

    enum CharType {
        CHAR_NUMBER,
        CHAR_EXP,
        CHAR_POINT,
        CHAR_SIGN,
        CHAR_SPACE,
        CHAR_ILLEGAL,
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numMap = new HashMap<>(16);
        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return numMap.get(o1) - numMap.get(o2);
            }
        });
        for (int key : numMap.keySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(key);
            } else if (numMap.get(key) > numMap.get(priorityQueue.peek())) {
                priorityQueue.remove();
                priorityQueue.add(key);
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.remove();
        }
        return result;
    }

    public static List<List<Integer>> combine(int n, int k) {
        if (k < 0 || k > n) {
            return null;
        }
        List<Integer> tmp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, tmp, 0, k, n);
        return result;
    }

    public static void dfs(List<List<Integer>> result, List<Integer> tmp, int index, int k, int n) {
        if (tmp.size() == k) {
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = index + 1; i <= n; i++) {
            tmp.add(i);
            dfs(result, tmp, i, k, n);
            tmp.remove(tmp.size() - 1);
        }

    }
//
//    public static int[] findRedundantDirectedConnection(int[][] edges) {
//        HashMap<Integer,Integer> inCount = new HashMap<>(16);
//    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(16);
        List<Integer> tmp = new ArrayList<>(16);
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        backTrace(nums, result, tmp, visited, 0);
        return result;
    }

    public static void backTrace(int[] nums, List<List<Integer>> result, List<Integer> tmp, boolean[] visited, int index) {
        if (index == nums.length) {
            result.add(new ArrayList<Integer>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                continue;
            }
            tmp.add(nums[i]);
            visited[i] = true;
            backTrace(nums, result, tmp, visited, index + 1);
            visited[i] = false;
            tmp.remove(index);
        }
    }

    public static List<String> commonChars(String[] A) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word : A) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }

        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minfreq[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }

    public static int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        int minVal = Arrays.stream(nums).min().getAsInt();
        int maxVal = Arrays.stream(nums).max().getAsInt();
        int d = Math.max(1, (maxVal - minVal) / (n - 1));
        int bucketSize = (maxVal - minVal) / d + 1;

        int[][] bucket = new int[bucketSize][2];
        for (int i = 0; i < bucketSize; ++i) {
            Arrays.fill(bucket[i], -1); // 存储 (桶内最小值，桶内最大值) 对， (-1, -1) 表示该桶是空的
        }
        for (int i = 0; i < n; i++) {
            int idx = (nums[i] - minVal) / d;
            if (bucket[idx][0] == -1) {
                bucket[idx][0] = bucket[idx][1] = nums[i];
            } else {
                bucket[idx][0] = Math.min(bucket[idx][0], nums[i]);
                bucket[idx][1] = Math.max(bucket[idx][1], nums[i]);
            }
        }

        int ret = 0;
        int prev = -1;
        for (int i = 0; i < bucketSize; i++) {
            if (bucket[i][0] == -1) {
                continue;
            }
            if (prev != -1) {
                ret = Math.max(ret, bucket[i][0] - bucket[prev][1]);
            }
            prev = i;
        }
        return ret;
    }

    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        return Arrays.copyOfRange(points, 0, K);
    }


    //给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
    //
    //（当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）

    public static int monotoneIncreasingDigits(int N) {
        //贪心，从左向右查找首个大于后者的数字i，然后从i往左次减一（在i-1>ide 情况下）保证递增，最后从归档前位置开始从左往右将数字变成9
        char[] Nstr = Integer.toString(N).toCharArray();
        int i = 1;
        while (i < Nstr.length && Nstr[i - 1] <= Nstr[i]) {
            i++;
        }
        if (i < Nstr.length) {
            while (i > 0 && Nstr[i - 1] > Nstr[i]) {
                Nstr[i - 1] -= 1;
                i--;
            }
            for (++i; i < Nstr.length; i++) {
                Nstr[i] = '9';
            }
        }
        return Integer.parseInt(new String(Nstr));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> char2str = new HashMap<>(16);
        String[] strings = s.split(" ");
        if (pattern.length() != strings.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!char2str.containsKey(pattern.charAt(i))) {
                if (!char2str.containsValue(strings[i])) {
                    char2str.put(pattern.charAt(i), strings[i]);
                } else {
                    return false;
                }
            } else if (!char2str.get(pattern.charAt(i)).equals(strings[i])) {
                return false;
            }
        }
        return true;
    }

    public int lastStoneWeight(int[] stones) {
//        int length = stones.length;
//        if(length == 2){
//            return Math.abs(stones[0] - stones[1]);
//        }
//        if (length == 1){
//            return stones[0];
//        }
//        Arrays.sort(stones);
//        if(stones[length - 3] == 0){
//            return stones[length - 1] - stones[length - 2];
//        }
//        stones[length - 1] = stones[length - 1] - stones[length - 2];
//        stones[length - 2] = 0;
//        return lastStoneWeight(stones);
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            int left = pq.poll();
            int right = pq.poll();
            if (left > right) {
                pq.offer(left - right);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }

//    public int[] sortByBits(int[] arr) {
//        Integer.bitCount();
//    }


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(16);
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> tmp = new LinkedList<>();
            while (count > 0) {
                TreeNode node = queue.poll();
                if (result.size() % 2 == 0) {
                    tmp.add(node.val);
                } else {
                    tmp.add(0, node.val);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count--;
            }
            result.add(tmp);
        }
        return result;
    }

    public static int[] findRedundantConnection(int[][] edges) {
        int nodesCount = edges.length;
        int[] parent = new int[nodesCount + 1];
        for (int i = 1; i <= nodesCount; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < nodesCount; i++) {
            int[] edge = edges[i];
            int node1 = edge[0], node2 = edge[1];
            if (find(parent, node1) != find(parent, node2)) {
                union(parent, node1, node2);
            } else {
                return edge;
            }
        }
        return new int[0];
    }

    public static void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }

    public static int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    }

    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailToIndex = new HashMap<String, Integer>();
        Map<String, String> emailToName = new HashMap<String, String>();
        int emailsCount = 0;
        for (List<String> account : accounts) {
            String name = account.get(0);
            int size = account.size();
            for (int i = 1; i < size; i++) {
                String email = account.get(i);
                if (!emailToIndex.containsKey(email)) {
                    emailToIndex.put(email, emailsCount++);
                    emailToName.put(email, name);
                }
            }
        }
        UnionFind uf = new UnionFind(emailsCount);
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            int firstIndex = emailToIndex.get(firstEmail);
            int size = account.size();
            for (int i = 2; i < size; i++) {
                String nextEmail = account.get(i);
                int nextIndex = emailToIndex.get(nextEmail);
                uf.union(firstIndex, nextIndex);
            }
        }
        Map<Integer, List<String>> indexToEmails = new HashMap<Integer, List<String>>();
        for (String email : emailToIndex.keySet()) {
            int index = uf.find(emailToIndex.get(email));
            List<String> account = indexToEmails.getOrDefault(index, new ArrayList<String>());
            account.add(email);
            indexToEmails.put(index, account);
        }
        List<List<String>> merged = new ArrayList<List<String>>();
        for (List<String> emails : indexToEmails.values()) {
            Collections.sort(emails);
            String name = emailToName.get(emails.get(0));
            List<String> account = new ArrayList<String>();
            account.add(name);
            account.addAll(emails);
            merged.add(account);
        }
        return merged;
    }

    public int findShortestSubArray(int[] nums) {
        int length = nums.length;
        int maxCount = 0;
        int minLen = 0;
        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[1]++;
            } else {
                map.put(nums[i], new int[]{i, 1});
            }
            if (map.get(nums[i])[1] > maxCount) {
                maxCount = map.get(nums[i])[1];
                minLen = i - map.get(nums[i])[0] + 1;
            } else if (map.get(nums[i])[1] == maxCount) {
                minLen = Math.min(minLen, i - map.get(nums[i])[0] + 1);
            }
        }
        return minLen;
    }

    public static List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();

        for (String word : words) {
            int mask = 0;
            for (int i = 0; i < word.length(); ++i) {
                char ch = word.charAt(i);
                int tmp = ch - 'a';
                mask |= (1 << (ch - 'a'));
            }
            if (Integer.bitCount(mask) <= 7) {
                frequency.put(mask, frequency.getOrDefault(mask, 0) + 1);
            }
        }

        List<Integer> ans = new ArrayList<Integer>();
        for (String puzzle : puzzles) {
            int total = 0;

            // 枚举子集方法一
            // for (int choose = 0; choose < (1 << 6); ++choose) {
            //     int mask = 0;
            //     for (int i = 0; i < 6; ++i) {
            //         if ((choose & (1 << i)) != 0) {
            //             mask |= (1 << (puzzle.charAt(i + 1) - 'a'));
            //         }
            //     }
            //     mask |= (1 << (puzzle.charAt(0) - 'a'));
            //     if (frequency.containsKey(mask)) {
            //         total += frequency.get(mask);
            //     }
            // }

            // 枚举子集方法二
            int mask = 0;
            for (int i = 1; i < 7; ++i) {
                mask |= (1 << (puzzle.charAt(i) - 'a'));
            }
            int subset = mask;
            do {
                int s = subset | (1 << (puzzle.charAt(0) - 'a'));
                if (frequency.containsKey(s)) {
                    total += frequency.get(s);
                }
                subset = (subset - 1) & mask;
            } while (subset != mask);

            ans.add(total);
        }
        return ans;
    }

    public static int minCut(String s) {
        int n = s.length();
        boolean[][] g = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(g[i], true);
        }

        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                g[i][j] = s.charAt(i) == s.charAt(j) && g[i + 1][j - 1];
            }
        }

        int[] f = new int[n];
        Arrays.fill(f, Integer.MAX_VALUE);
        for (int i = 0; i < n; ++i) {
            if (g[0][i]) {
                f[i] = 0;
            } else {
                for (int j = 0; j < i; ++j) {
                    if (g[j + 1][i]) {
                        f[i] = Math.min(f[i], f[j] + 1);
                    }
                }
            }
        }

        return f[n - 1];
    }

    public static String removeDuplicates(String S) {
        StringBuilder stack = new StringBuilder();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                top--;
            } else {
                stack.append(ch);
                top++;
            }
        }
        return stack.toString();
    }

    public static int removeDuplicates(int[] nums) {
//        int length = nums.length;
//        if(length<=2){
//            return length;
//        }
//        int left = 2;
//        int right = 2;
//        while(right < length){
//            if(nums[left - 2] != nums[right]){
//                nums[left] = nums[right];
//                left++;
//            }
//            right++;
//        }
//        return left;
        HashMap<String, String> hashMap = new HashMap<>();
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }


    public static int calculate1(String s) {
        Deque<Integer> stack = new LinkedList<Integer>();
        char preSign = '+';
        int num = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    default:
                        stack.push(stack.pop() / num);
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

    public static int calculate(String s) {
        String suffix = infix2suffix(s);
        return calSuffix(suffix);
    }

    /*
    中缀表达式转换成后缀表达式（波兰逆序表达式）
     */
    public static String infix2suffix(String s) {
        Stack<Character> stack = new Stack<>();
        String suffix = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    suffix = popOP(stack, suffix);
                    break;
                case '+':
                case '-':
                    suffix = pushOP(stack, c, 1, suffix);
                    break;
                case '*':
                case '/':
                    suffix = pushOP(stack, c, 2, suffix);
                    break;
                default:
                    suffix += c;
                    break;
            }
        }
        while (!stack.isEmpty()) {
            suffix += stack.pop();
        }
        return suffix;
    }

    public static String pushOP(Stack<Character> stack, char c, int level1, String suffix) {
        while (!stack.isEmpty()) {
            if (stack.peek() != '(') {
                int level2;
                if (stack.peek() == '+' || stack.peek() == '-') {
                    level2 = 1;
                } else {
                    level2 = 2;
                }
                if (level1 <= level2) {
                    suffix += stack.pop();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        stack.push(c);
        return suffix;
    }

    public static String popOP(Stack<Character> stack, String suffix) {
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            if (ch != '(') {
                suffix += ch;
            }
        }
        return suffix;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(0, level);
        }
        return result;
    }

    /*
    对后缀表达式求值
     */
    public static int calSuffix(String s) {
        Stack<Integer> num_stack = new Stack<>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num_stack.push(ch - '0');
            } else {
                right = num_stack.pop();
                left = num_stack.pop();
                switch (ch) {
                    case '+':
                        num_stack.push(left + right);
                        break;
                    case '-':
                        num_stack.push(left - right);
                        break;
                    case '*':
                        num_stack.push(left * right);
                        break;
                    case '/':
                        num_stack.push(left / right);
                        break;
                }
            }
        }
        return num_stack.pop();
    }

    public static int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n) {
            return 0;
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }
        for (int i = m - 1; i >= 0; i--) {
            char sChar = s.charAt(i);
            for (int j = n - 1; j >= 0; j--) {
                char tChar = t.charAt(j);
                if (sChar == tChar) {
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }

    public static boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }

        // 左侧最小值
        int leftMin = nums[0];
        // 右侧所有元素
        TreeMap<Integer, Integer> rightAll = new TreeMap<Integer, Integer>();

        for (int k = 2; k < n; ++k) {
            rightAll.put(nums[k], rightAll.getOrDefault(nums[k], 0) + 1);
        }

        for (int j = 1; j < n - 1; ++j) {
            if (leftMin < nums[j]) {
                Integer next = rightAll.ceilingKey(leftMin + 1);
                if (next != null && next < nums[j]) {
                    return true;
                }
            }
            leftMin = Math.min(leftMin, nums[j]);
            rightAll.put(nums[j + 1], rightAll.get(nums[j + 1]) - 1);
            if (rightAll.get(nums[j + 1]) == 0) {
                rightAll.remove(nums[j + 1]);
            }
        }

        return false;
    }

    public String largestNumber(int[] nums) {
        int n = nums.length;
        String numsToWord[] = new String[n];
        for (int i = 0; i < n; i++) {
            numsToWord[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsToWord, (a, b) -> {
            return (b + a).compareTo(a + b);
        });

        if (numsToWord[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(numsToWord[i]);
        }
        return sb.toString();
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int firstSum = arr[left];
        int thirdSum = arr[right];
        while (left + 1 < right) {
            if (firstSum == sum / 3 && thirdSum == sum / 3) {
                return true;
            }
            if (firstSum != sum / 3) {
                firstSum += arr[++left];
            }
            if (thirdSum != sum / 3) {
                thirdSum += arr[--right];
            }
        }
        return false;
    }

    private static final int M1 = 0x55555555; // 01010101010101010101010101010101
    private static final int M2 = 0x33333333; // 00110011001100110011001100110011
    private static final int M4 = 0x0f0f0f0f; // 00001111000011110000111100001111
    private static final int M8 = 0x00ff00ff; // 00000000111111110000000011111111

    //颠倒二进制位（分治法）Integer.reverse()
    public static int reverseBits(int n) {
//        n = n >>> 1 & M1 | (n & M1) << 1;
//        n = n >>> 2 & M2 | (n & M2) << 2;
//        n = n >>> 4 & M4 | (n & M4) << 4;
//        n = n >>> 8 & M8 | (n & M8) << 8;
//
//        return n >>> 16 | n << 16;

        int rev = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }


}

//字典树
class Trie {
    public Trie[] next;
    public boolean isEnd;

    public Trie() {
        next = new Trie[26];
        isEnd = false;
    }

    public void insert(String s) {
        Trie curPos = this;

        for (int i = s.length() - 1; i >= 0; --i) {
            int t = s.charAt(i) - 'a';
            if (curPos.next[t] == null) {
                curPos.next[t] = new Trie();
            }
            curPos = curPos.next[t];
        }
        curPos.isEnd = true;
    }
}


//并查集
class UnionFind {
    int[] parent;

    public UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void union(int index1, int index2) {
        parent[find(index2)] = find(index1);
    }

    public int find(int index) {
        if (parent[index] != index) {
            parent[index] = find(parent[index]);
        }
        return parent[index];
    }
}




































