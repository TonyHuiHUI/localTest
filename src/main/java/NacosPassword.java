
import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.*;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(canCross(a));
//        System.out.println(minimumTimeRequired(a,2));
//        System.out.println(shipWithinDays(a, 5));

//        int[] a = {3, 4, 5, 2, 1, 7, 3, 4, 7};
//        System.out.println(minChanges(a, 3));
//        System.out.println(reverseParentheses("(ed(et(oc))el)"));
//        int[] a = {5, 2, 6, 4, 1};
//        int[][] b = {{3, 1, 2}, {4, 10, 3}, {3, 10, 100}, {4, 100, 30}, {1, 3, 1}};
//        System.out.println(canEat(a, b));
//        int[] a = {1, 1, 1, 1, 1};
//        System.out.println(findMaxLength(a));
//        System.out.println(findTargetSumWays(a, 3));
//        int[] a = {2,4};
//        System.out.println(largestRectangleArea(a));
//        int[] a = {5, 3, 4, 5};
//        System.out.println(lastStoneWeightII(a));
//        System.out.println(change(5, a));
//        System.out.println(stoneGame(a));
//        System.out.println(smallestGoodBase("4681"));
//        System.out.println(permutation("abc"));
//        String[] a = {"0201", "0101", "0102", "1212", "2002"};
//        System.out.println(openLock(a, "0202"));
//        int[][] a = {{1, 2, 7}, {3, 6, 7}};
//        System.out.println(numBusesToDestination(a, 1, 6));
//        TreeNode root = new TreeNode(1);
//        TreeNode left = root.left = new TreeNode(2);
//        TreeNode right = root.right = new TreeNode(3);
//        right.left = new TreeNode(4);
//        right.right = new TreeNode(5);
//        System.out.println(serialize(root));
//        System.out.println(deserialize(serialize(root)));
//        int[] a = {1, 3, 5, 7, 2, 4, 6, 8};
//        System.out.println(smallestK(a, 0));
//        int[][] a = {{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}};
////        System.out.println(numWays(5, a, 3));
//        System.out.println(countOfAtoms("K4(ON(SO3)2)2"));
//        int[] a = {1, 0, 1, 0, 1};
//        System.out.println(numSubarraysWithSum(a, 2));
//        int[] a = {1, 2, 5, 9, 5, 9, 5, 5, 5};
//        System.out.println(majorityElement(a));
        System.out.println(longestPalindrome("babad"));
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //5. 最长回文子串
    //给你一个字符串 s，找到 s 中最长的回文子串。
    public static String longestPalindrome(String s) {
        //中心扩展
//        if (s == null || s.length() < 1) {
//            return "";
//        }
//        int start = 0;
//        int end = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int lenO = expand(s, i, i);
//            int lenE = expand(s, i, i + 1);
//            int len = Math.max(lenE, lenO);
//            if (len > end - start) {
//                start = i - (len - 1) / 2;
//                end = i + len / 2;
//            }
//        }
//        return s.substring(start, end + 1);
        //动态规划
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int L = 2; L <= len; L++) {
            for (int left = 0; left < len; left++) {
                int right = left + L - 1;
                if (right >= len) {
                    break;
                }
                if (s.charAt(left) != s.charAt(right)) {
                    dp[left][right] = false;
                } else {
                    if (right - left < 3) {
                        dp[left][right] = true;
                    } else {
                        dp[left][right] = dp[++left][--right];
                    }
                }
                if (dp[left][right] && right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    begin = left;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    //118. 杨辉三角
//    给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new LinkedList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(temp);
        }
        return result;
    }

    //566. 重塑矩阵
    //在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
    //给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
    //重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
    //如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if (n * m != r * c) {
            return mat;
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < n * m; i++) {
            result[i / c][i % c] = mat[i / m][i % m];
        }
        return result;
    }

    //面试题 17.10. 主要元素
    //数组中占比超过一半的元素称之为主要元素。给你一个 整数 数组，找出其中的主要元素。若没有，返回 -1 。请设计时间复杂度为 O(N) 、空间复杂度为 O(1) 的解决方案。
//    Boyer-Moore 投票算法
    public static int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        //可能不存在主要元素，需要再遍历一遍统计candidate的数量
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return count * 2 > nums.length ? candidate : -1;
    }

    //121. 买卖股票的最佳时机
    //给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
//你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
//返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;//最大利润
        int min = prices[0];//遍历到的最小价格
        for (int i = 1; i < n; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

    //350. 两个数组的交集 II
    //给定两个数组，编写一个函数来计算它们的交集
    public static int[] intersect(int[] nums1, int[] nums2) {
        //排序
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int length1 = nums1.length;
//        int length2 = nums2.length;
//        int[] result = new int[Math.min(length1, length2)];
//        int index = 0;
//        int index1 = 0;
//        int index2 = 0;
//        while (index1 < length1 && index2 < length2) {
//            if (nums1[index1] == nums2[index2]) {
//                result[index++] = nums1[index1];
//                index1++;
//                index2++;
//            } else if (nums1[index1] < nums2[index2]) {
//                index1++;
//            } else {
//                index2++;
//            }
//        }
//        return Arrays.copyOfRange(result, 0, index);
        //hash
        if (nums2.length < nums1.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[nums1.length];
        int index = 0;
        for (int num : nums1) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (hashMap.containsKey(num) && hashMap.get(num) != 0) {
                result[index++] = num;
                hashMap.put(num, hashMap.get(num) - 1);
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }

    //930. 和相同的二元子数组
//给你一个二元数组 nums ，和一个整数 goal ，请你统计并返回有多少个和为 goal 的 非空 子数组。
//    子数组 是数组的一段连续部分。
    public static int numSubarraysWithSum(int[] nums, int goal) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(0, 1);
//        int result = 0;
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//            if (map.containsKey(sum - goal)) {
//                result += map.get(sum - goal);
//            }
//            map.put(sum, map.getOrDefault(sum, 0) + 1);
//        }
//        return result;
        int n = nums.length;
        int left1 = 0, left2 = 0, right = 0;
        int sum1 = 0, sum2 = 0;
        int ret = 0;
        while (right < n) {
            sum1 += nums[right];
            while (left1 <= right && sum1 > goal) {
                sum1 -= nums[left1];
                left1++;
            }
            sum2 += nums[right];
            while (left2 <= right && sum2 >= goal) {
                sum2 -= nums[left2];
                left2++;
            }
            ret += left2 - left1;
            right++;
        }
        return ret;
    }

    //3. 无重复字符的最长子串
    //给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
    public static int lengthOfLongestSubstring(String s) {
        //集合去重
        Set<Character> set = new HashSet<>();
        int index = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            //字符串重复，左移边界，从set移除一个字符
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            //字符不重复，则index右移
            while (index < s.length() && !set.contains(s.charAt(index))) {
                set.add(s.charAt(index));
                index++;
            }
            result = Math.max(result, index - i);
        }
        return result;
    }

    //88. 合并两个有序数组
    //给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
    //初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int index1 = 0;
//        int index2 = 0;
//        while (index1 < m && index2 < n) {
//            if (nums1[index1] <= nums2[index2]) {
//                index1++;
//            } else {
//                int temp = nums1[index1];
//                nums1[index1] = nums2[index2];
//                nums2[index2] = temp;
//                index1++;
//                Arrays.sort(nums2);
//            }
//        }
//        while (index1 < (m + n) && index2 < n) {
//            nums1[index1++] = nums2[index2++];
//        }
        int p1 = m - 1;
        int p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }

    //1. 两数之和
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hashMap.containsKey(temp)) {
                result[0] = hashMap.get(temp);
                result[1] = i;
                return result;
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }

    //1711. 大餐计数
    //大餐 是指 恰好包含两道不同餐品 的一餐，其美味程度之和等于 2 的幂。
    //你可以搭配 任意 两道餐品做一顿大餐。
    //给你一个整数数组 deliciousness ，其中 deliciousness[i] 是第 i​​​​​​​​​​​​​​ 道餐品的美味程度，返回你可以用数组中的餐品做出的不同 大餐 的数量。结果需要对 109 + 7 取余。
    //注意，只要餐品下标不同，就可以认为是不同的餐品，即便它们的美味程度相同。
    public int countPairs(int[] deliciousness) {
        final int MOD = 1000000007;
        int maxVal = 0;
        for (int val : deliciousness) {
            maxVal = Math.max(maxVal, val);
        }
        int maxSum = maxVal * 2;
        int pairs = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = deliciousness.length;
        for (int i = 0; i < n; i++) {
            int val = deliciousness[i];
            for (int sum = 1; sum <= maxSum; sum <<= 1) {
                int count = map.getOrDefault(sum - val, 0);
                pairs = (pairs + count) % MOD;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return pairs;
    }

    //645. 错误的集合
//集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有一个数字重复 。
//    给定一个数组 nums 代表了集合 S 发生错误后的结果。
//    请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();//利用Set去重
        int sum = 0;
        for (int num : nums) {
            sum += num;
            set.add(num);
        }
        int sumA = 0;
        for (int num : set) {
            sumA += num;
        }
        return new int[]{(sum - sumA), (nums.length * (nums.length + 1)) / 2 - sumA};
    }

    //53. 最大子序和
    //给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
    public static int maxSubArray(int[] nums) {
//        int pre = 0;
//        int maxAns = nums[0];
//        for(int num : nums){
//            pre = Math.max(pre + num, num);
//            maxAns = Math.max(maxAns, pre);
//        }
//        return maxAns;

        int result = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    //1418. 点菜展示表
    //给你一个数组 orders，表示客户在餐厅中完成的订单，确切地说， orders[i]=[customerNamei,tableNumberi,foodItemi] ，其中 customerNamei 是客户的姓名，tableNumberi 是客户所在餐桌的桌号，而 foodItemi 是客户点的餐品名称。
    //请你返回该餐厅的 点菜展示表 。在这张表中，表中第一行为标题，其第一列为餐桌桌号 “Table” ，后面每一列都是按字母顺序排列的餐品名称。接下来每一行中的项则表示每张餐桌订购的相应餐品数量，第一列应当填对应的桌号，后面依次填写下单的餐品数量。
    //注意：客户姓名不是点菜展示表的一部分。此外，表中的数据行应该按餐桌桌号升序排列。
    public static List<List<String>> displayTable(List<List<String>> orders) {
        HashMap<Integer, Map<String, Integer>> orderMap = new HashMap<>();
        Set<String> foodNameSet = new HashSet<>();
        for (List<String> order : orders) {
            foodNameSet.add(order.get(2));
            int tableNum = Integer.valueOf(order.get(1));
            Map<String, Integer> map = orderMap.getOrDefault(tableNum, new HashMap<String, Integer>());
            map.put(order.get(2), map.getOrDefault(order.get(2), 0) + 1);
            orderMap.put(tableNum, map);
        }
        List<String> names = new ArrayList<>();
        for (String name : foodNameSet) {
            names.add(name);
        }
        Collections.sort(names);
        List<Integer> nums = new ArrayList<>();
        for (int num : orderMap.keySet()) {
            nums.add(num);
        }
        Collections.sort(nums);

        List<List<String>> result = new ArrayList<List<String>>();
        List<String> header = new ArrayList<>();
        header.add("Table");
        for (String name : names) {
            header.add(name);
        }
        result.add(header);
        for (int num : nums) {
            Map<String, Integer> order = orderMap.get(num);
            List<String> row = new ArrayList<>();
            row.add(Integer.toString(num));
            for (String name : names) {
                row.add(Integer.toString(order.getOrDefault(name, 0)));
            }
            result.add(row);
        }
        return result;
    }

    //726. 原子的数量
    //给定一个化学式formula（作为字符串），返回每种原子的数量。
    //原子总是以一个大写字母开始，接着跟随0个或任意个小写字母，表示原子的名字。
    //如果数量大于 1，原子后会跟着数字表示原子的数量。如果数量等于 1 则不会跟数字。例如，H2O 和 H2O2 是可行的，但 H1O2 这个表达是不可行的。
    //两个化学式连在一起是新的化学式。例如 H2O2He3Mg4 也是化学式。
    //一个括号中的化学式和数字（可选择性添加）也是化学式。例如 (H2O2) 和 (H2O2)3 是化学式。
    //给定一个化学式，输出所有原子的数量。格式为：第一个（按字典序）原子的名子，跟着它的数量（如果数量大于 1），然后是第二个原子的名字（按字典序），跟着它的数量（如果数量大于 1），以此类推。
    public static String countOfAtoms(String formula) {
        Stack<HashMap<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        int n = formula.length();
        int index = 0;
        while (index < n) {
            char ch = formula.charAt(index);
            if (ch == '(') {
                stack.push(new HashMap<>());
                index++;
            } else if (ch == ')') {
                index++;
                StringBuilder num = new StringBuilder();
                while (index < n && Character.isDigit(formula.charAt(index))) {
                    num.append(formula.charAt(index++));
                }
                if (num.length() == 0) {
                    num.append("1");
                }
                HashMap<String, Integer> pop = stack.pop();
                HashMap<String, Integer> peek = stack.peek();
                for (Map.Entry<String, Integer> entry : pop.entrySet()) {
                    String atom = entry.getKey();
                    int v = entry.getValue();
                    peek.put(atom, peek.getOrDefault(atom, 0) + v * Integer.valueOf(num.toString()));
                }
            } else {
                StringBuilder sb = new StringBuilder().append(ch);
                while (++index < n && Character.isLowerCase(formula.charAt(index))) {
                    sb.append(formula.charAt(index));
                }
                String atom = sb.toString();
                StringBuilder num = new StringBuilder();
                while (index < n && Character.isDigit(formula.charAt(index))) {
                    num.append(formula.charAt(index++));
                }
                if (num.length() == 0) {
                    num.append("1");
                }
                HashMap<String, Integer> peek = stack.peek();
                peek.put(atom, peek.getOrDefault(atom, 0) + Integer.valueOf(num.toString()));
            }
        }
        HashMap<String, Integer> pop = stack.pop();
        TreeMap<String, Integer> treeMap = new TreeMap<>(pop);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String atom = entry.getKey();
            int count = entry.getValue();
            sb.append(atom);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    //1833. 雪糕的最大数量
    //夏日炎炎，小男孩 Tony 想买一些雪糕消消暑。
    //商店中新到 n 支雪糕，用长度为 n 的数组 costs 表示雪糕的定价，其中 costs[i] 表示第 i 支雪糕的现金价格。Tony 一共有 coins 现金可以用于消费，他想要买尽可能多的雪糕。
    //给你价格数组 costs 和现金量 coins ，请你计算并返回 Tony 用 coins 现金能够买到的雪糕的 最大数量 。
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int i = 0; i < costs.length; i++) {
            coins -= costs[i];
            if (coins < 0) {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }

    //LCP 07. 传递信息
//    小朋友 A 在和 ta 的小伙伴们玩传信息游戏，游戏规则如下：
//    有 n 名玩家，所有玩家编号分别为 0 ～ n-1，其中小朋友 A 的编号为 0
//    每个玩家都有固定的若干个可传信息的其他玩家（也可能没有）。传信息的关系是单向的（比如 A 可以向 B 传信息，但 B 不能向 A 传信息）。
//    每轮信息必须需要传递给另一个人，且信息可重复经过同一个人
//    给定总玩家数 n，以及按 [玩家编号,对应可传递玩家编号] 关系组成的二维数组 relation。返回信息从小 A (编号 0 ) 经过 k 轮传递到编号为 n-1 的小伙伴处的方案数；若不能到达，返回 0。
    public static int numWays(int n, int[][] relation, int k) {
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int[] edge : relation) {
            List<Integer> list = hashMap.getOrDefault(edge[0], new LinkedList<>());
            list.add(edge[1]);
            hashMap.put(edge[0], list);
        }
        queue.offer(0);
        while (!queue.isEmpty() && k-- > 0) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int point = queue.poll();
                for (int next : hashMap.get(point)) {
                    queue.offer(next);
                }
            }
        }
        int result = 0;
        while (!queue.isEmpty()) {
            if (queue.poll() == n - 1) {
                result++;
            }
        }
        return result;
    }

    //面试题 17.14. 最小K个数
    public static int[] smallestK(int[] arr, int k) {
        //排序
//        int[] vec = new int[k];
//        Arrays.sort(arr);
//        for (int i = 0; i < k; ++i) {
//            vec[i] = arr[i];
//        }
//        return vec;

        //堆
        int[] result = new int[k];
        if (k == 0) {
            return result;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : arr) {
            if (priorityQueue.size() < k || priorityQueue.peek() > num) {
                priorityQueue.offer(num);
            }
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll();
        }
        return result;
    }

    // quickSelect 求无需数组第k大的数
    public static int quickSelect(int[] arr, int begin, int end, int k) {
        if (begin == end) {
            return arr[begin];
        }
        int left = begin;
        int right = end;
        int mid = arr[(begin + end) / 2];
        while (left <= right) {
            while (left <= right && arr[left] > mid) {
                left++;
            }
            while (left <= right && arr[right] < mid) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        if (begin + k - 1 <= right) {
            return quickSelect(arr, begin, right, k);
        }
        if (begin + k - 1 >= left) {
            return quickSelect(arr, left, end, k - (left - begin));
        }
        return arr[right + 1];
    }

    //剑指 Offer 37. 序列化二叉树
//    请实现两个函数，分别用来序列化和反序列化二叉树。
//    你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        String result = "";
        if (root == null) {
            return "null";
        } else {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                result += node.val + ",";
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                result += "null,";
            }
        }
        return result;
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if ("null".equals(data)) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        String[] nodes = data.split(",");
        TreeNode root = new TreeNode(Integer.valueOf(nodes[0]));
        queue.offer(root);
        int index = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if ("null".equals(nodes[index + 1])) {
                node.left = null;
            } else {
                node.left = new TreeNode(Integer.valueOf(nodes[index + 1]));
                queue.offer(node.left);
            }
            if ("null".equals(nodes[index + 2])) {
                node.right = null;
            } else {
                node.right = new TreeNode(Integer.valueOf(nodes[index + 2]));
                queue.offer(node.right);
            }
            index += 2;
        }
        return root;
    }

    //    168. Excel表列名称
    //给定一个正整数，返回它在 Excel 表中相对应的列名称。
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            sb.append((char) (--columnNumber % 26 + 'A'));
            columnNumber = columnNumber / 26;
        }
        return sb.reverse().toString();
    }

    //815. 公交路线
//    给你一个数组 routes ，表示一系列公交线路，其中每个 routes[i] 表示一条公交线路，第 i 辆公交车将会在上面循环行驶。
//    例如，路线 routes[0] = [1, 5, 7] 表示第 0 辆公交车会一直按序列 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... 这样的车站路线行驶。
//    现在从 source 车站出发（初始时不在公交车上），要前往 target 车站。 期间仅可乘坐公交车。
//    求出 最少乘坐的公交车数量 。如果不可能到达终点车站，返回 -1 。
    public static int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        int n = routes.length;
        //记录公交线路是否相通
        boolean[][] edge = new boolean[n][n];
        //记录车站对应的路线
        Map<Integer, List<Integer>> rec = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n; i++) {
            for (int site : routes[i]) {
                List<Integer> list = rec.getOrDefault(site, new ArrayList<Integer>());
                for (int j : list) {
                    edge[i][j] = edge[j][i] = true;
                }
                list.add(i);
                rec.put(site, list);
            }
        }

        int[] dis = new int[n];
        Arrays.fill(dis, -1);
        Queue<Integer> que = new LinkedList<Integer>();
        for (int bus : rec.getOrDefault(source, new ArrayList<Integer>())) {
            dis[bus] = 1;
            que.offer(bus);
        }
        while (!que.isEmpty()) {
            int x = que.poll();
            for (int y = 0; y < n; y++) {
                if (edge[x][y] && dis[y] == -1) {
                    dis[y] = dis[x] + 1;
                    que.offer(y);
                }
            }
        }

        int ret = Integer.MAX_VALUE;
        for (int bus : rec.getOrDefault(target, new ArrayList<Integer>())) {
            if (dis[bus] != -1) {
                ret = Math.min(ret, dis[bus]);
            }
        }
        return ret == Integer.MAX_VALUE ? -1 : ret;
    }

    //752. 打开转盘锁
//    你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。每个拨轮可以自由旋转：例如把 '9' 变为 '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。
//    锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。
//    列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
//    字符串 target 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。

    //实际求“0000”到target的最短路劲 广度优先搜索 || 启发式搜索 A*
    public static int openLock(String[] deadends, String target) {
        Set<String> set = new HashSet<>();
        for (String deadend : deadends) {
            set.add(deadend);
        }
        if (set.contains("0000")) {
            return -1;
        }
        int step = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer("0000");
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                String str = queue.poll();
                if (str.equals(target)) {
                    return step;
                }
                for (String next : getNexts(str)) {
                    if (!set.contains(next) && !visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    public static List<String> getNexts(String str) {
        List<String> result = new LinkedList<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < 4; i++) {
            char ch = chars[i];
            chars[i] = ch == '0' ? '9' : (char) (ch - 1);
            result.add(new String(chars));
            chars[i] = ch == '9' ? '0' : (char) (ch + 1);
            result.add(new String(chars));
            chars[i] = ch;
        }
        return result;
    }

    //149. 直线上最多的点数
    //给你一个数组 points ，其中 points[i] = [xi, yi] 表示 X-Y 平面上的一个点。求最多有多少个点在同一条直线上。
    public static int maxPoints(int[][] points) {
        int n = points.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            int max = 0;
            for (int j = i + 1; j < n; j++) {
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];
                int k = gcb(x, y);
                String key = (x / k) + "-" + (y / k);
                hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
                max = Math.max(max, hashMap.get(key));
            }
            result = Math.max(max + 1, result);
        }
        return result;
    }

    //最大公约数
    public static int gcb(int a, int b) {
        return b == 0 ? a : gcb(b, a % b);
    }

    //    剑指 Offer 15. 二进制中1的个数
//    请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
    //剑指 Offer 38. 字符串的排列
    //    输入一个字符串，打印出该字符串中字符的所有排列。
    //    你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。

    public static String[] permutation(String s) {
        int n = s.length();
        Set<String> list = new HashSet<>();
        boolean[] visited = new boolean[n];
        char[] arr = s.toCharArray();
        dfs(arr, "", visited, list);
        return list.toArray(new String[0]);
    }

    public static void dfs(char[] arr, String s, boolean[] visited, Set<String> list) {
        if (s.length() == arr.length) {
            list.add(s);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            dfs(arr, s + String.valueOf(arr[i]), visited, list);
            visited[i] = false;
        }
    }

    //401. 二进制手表
//    二进制手表顶部有 4 个 LED 代表 小时（0-11），底部的 6 个 LED 代表 分钟（0-59）。每个 LED 代表一个 0 或 1，最低位在右侧。
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    result.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return result;
    }

    //483. 最小好进制
    //对于给定的整数 n, 如果n的k（k>=2）进制数的所有数位全为1，则称 k（k>=2）是 n 的一个好进制。
    //以字符串的形式给出 n, 以字符串的形式返回 n 的最小好进制。
    public static String smallestGoodBase(String n) {
        long nVal = Long.parseLong(n);
        int mMax = (int) Math.floor(Math.log(nVal) / Math.log(2));
        for (int m = mMax; m > 1; m--) {
            int k = (int) Math.pow(nVal, 1.0 / m);
            long mul = 1, sum = 1;
            for (int i = 0; i < m; i++) {
                mul *= k;
                sum += mul;
            }
            if (sum == nVal) {
                return Integer.toString(k);
            }
        }
        return Long.toString(nVal - 1);
    }

    //    65. 有效数字
//    有效数字（按顺序）可以分成以下几个部分：
//              一个 小数 或者 整数
//              （可选）一个 'e' 或 'E' ，后面跟着一个 整数
//    小数（按顺序）可以分成以下几个部分：
//     （可选）一个符号字符（'+' 或 '-'）
//      下述格式之一：
//              至少一位数字，后面跟着一个点 '.'
//              至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
//              一个点 '.' ，后面跟着至少一位数字
//    整数（按顺序）可以分成以下几个部分：
//      （可选）一个符号字符（'+' 或 '-'）
//       至少一位数字
    public static boolean isNumber2(String s) {
        String REG = "[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE]{1}[+-]?\\d+)?\\d*";
        return Pattern.matches(REG, s);
    }

    //877. 石子游戏
//    亚历克斯和李用几堆石子在做游戏。偶数堆石子排成一行，每堆都有正整数颗石子 piles[i] 。
//    游戏以谁手中的石子最多来决出胜负。石子的总数是奇数，所以没有平局。
//    亚历克斯和李轮流进行，亚历克斯先开始。 每回合，玩家从行的开始或结束处取走整堆石头。 这种情况一直持续到没有更多的石子堆为止，此时手中石子最多的玩家获胜。
//    假设亚历克斯和李都发挥出最佳水平，当亚历克斯赢得比赛时返回 true ，当李赢得比赛时返回 false 。
    public static boolean stoneGame(int[] piles) {
//        int n = piles.length;
//        int[][] dp = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            dp[i][i] = piles[i];
//        }
//        for (int i = n - 2; i >= 0; i--) {
//            for (int j = i + 1; j < n; j++) {
//                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
//            }
//        }
//        return dp[0][n - 1] > 0;
        int n = piles.length;
        int[][] f = new int[n + 2][n + 2];
        for (int len = 1; len <= n; len++) { // 枚举区间长度
            for (int l = 1; l + len - 1 <= n; l++) { // 枚举左端点
                int r = l + len - 1; // 计算右端点
                int a = piles[l - 1] - f[l + 1][r];
                int b = piles[r - 1] - f[l][r - 1];
                f[l][r] = Math.max(a, b);
            }
        }
        return f[1][n] > 0;
    }

    //852. 山脉数组的峰顶索引
//    符合下列属性的数组 arr 称为 山脉数组 ：
//    arr.length >= 3
//    存在 i（0 < i < arr.length - 1）使得：
//    arr[0] < arr[1] < ... arr[i-1] < arr[i]
//    arr[i] > arr[i+1] > ... > arr[arr.length - 1]
//    给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
    public static int peakIndexInMountainArray(int[] arr) {
        //遍历枚举 O(n)
//        int n = arr.length;
//        int index = 0;
//        while (arr[index] < arr[index + 1]) {
//            index++;
//        }
//        return index;

        //二分查找
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int result = 0;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    //279. 完全平方数
//    给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
//
//    给你一个整数 n ，返回和为 n 的完全平方数的 最少数量 。
//
//    完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
    public static int numSquares(int n) {
//        List<Integer> num = new ArrayList<>();
//        for (int i = 1; i * i <= n; i++) {
//            num.add(i * i);
//        }
//        int count = num.size();
//        int[][] dp = new int[count + 1][n + 1];
//        Arrays.fill(dp[0], Integer.MAX_VALUE);
//        dp[0][0] = 0;
//        for (int i = 1; i <= count; i++) {
//            int val = num.get(i - 1);
//            for (int j = 0; j <= n; j++) {
//                dp[i][j] = dp[i - 1][j];
//                for (int k = 1; k * val <= j; k++) {
//                    if(dp[i - 1][j - k * val] != Integer.MAX_VALUE) {
//                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - k * val] + k);
//                    }
//                }
//            }
//        }
//        return dp[count][n] == Integer.MAX_VALUE ? -1 :dp[count][n];
        //优化
        int[] f = new int[n + 1];
        Arrays.fill(f, Integer.MAX_VALUE);
        f[0] = 0;
        for (int t = 1; t * t <= n; t++) {
            int x = t * t;
            for (int j = x; j <= n; j++) {
                f[j] = Math.min(f[j], f[j - x] + 1);
            }
        }
        return f[n];
    }

    //518. 零钱兑换 II
    //给定不同面额的硬币和一个总金额。写出函数来计算可以凑成总金额的硬币组合数。假设每一种面额的硬币有无限个。
    public static int change(int cnt, int[] cs) {
//        int n = cs.length;
//        int[][] f = new int[n + 1][cnt + 1];
//        f[0][0] = 1;
//        for (int i = 1; i <= n; i++) {
//            int val = cs[i - 1];
//            for (int j = 0; j <= cnt; j++) {
//                f[i][j] = f[i - 1][j];
//                for (int k = 1; k * val <= j; k++) {
//                    f[i][j] += f[i - 1][j - k * val];
//                }
//            }
//        }
//        return f[n][cnt];
        //一维优化
        int n = cs.length;
        int[] f = new int[cnt + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            int val = cs[i - 1];
            for (int j = val; j <= cnt; j++) {
                f[j] += f[j - val];
            }
        }
        return f[cnt];
    }

    //322. 零钱兑换
//    给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
//
//    你可以认为每种硬币的数量是无限的。
    public int coinChange(int[] coins, int amount) {
//        int n = coins.length;
//        //dp[i][j]表示前i个硬币，总和为j的最少的硬币数
//        int[][] dp = new int[n + 1][amount + 1];
//        dp[0][0] = 0;
//        //没有硬币的情况下，金额>0的硬币数为无效值，定义为Integer.MAX_VALUE;
//        for (int i = 1; i <= amount; i++) {
//            dp[0][i] = Integer.MAX_VALUE;
//        }
//        for (int i = 1; i <= n; i++) {
//            int coin = coins[i - 1];
//            for (int j = 0; j <= amount; j++) {
//                //不使用当前硬币的情况
//                dp[i][j] = dp[i - 1][j];
//                //使用当前硬币，考虑多次使用
//                for (int k = 1; k * coin <= j; k++) {
//                    if (dp[i - 1][j - k * coin] != Integer.MAX_VALUE) {
//                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - k * coin] + k);
//                    }
//                }
//            }
//        }
//        return dp[n][amount] == Integer.MAX_VALUE ? -1 : dp[n][amount];
        //一维优化
        int n = coins.length;
        int[] f = new int[amount + 1];
        for (int i = 1; i <= amount; i++) f[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int val = coins[i - 1];
            for (int j = val; j <= amount; j++) {
                f[j] = Math.min(f[j], f[j - val] + 1);
            }
        }
        return f[amount] == Integer.MAX_VALUE ? -1 : f[amount];
    }

    //879. 盈利计划
//    集团里有 n 名员工，他们可以完成各种各样的工作创造利润。
//
//    第 i 种工作会产生 profit[i] 的利润，它要求 group[i] 名成员共同参与。如果成员参与了其中一项工作，就不能参与另一项工作。
//
//    工作的任何至少产生 minProfit 利润的子集称为 盈利计划 。并且工作的成员总数最多为 n 。
//
//    有多少种计划可以选择？因为答案很大，所以 返回结果模 10^9 + 7 的值。

    /**
     * @param n         员工人数
     * @param minProfit 最少利润
     * @param group     工作集合 group[i]表示该工作需要的员工数
     * @param profit    工作利润集合 profir[i]表示该工作产生的利润
     * @return
     */
    public static int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int MOD = (int) 1e9 + 7;
        int gl = group.length;
        int[][][] dp = new int[gl + 1][n + 1][minProfit + 1];//dp[i][j][k]表示前i个工作选择j个员工，产生利润至少为k的盈利计划数
        dp[0][0][0] = 1;
        for (int i = 1; i <= gl; i++) {
            int member = group[i - 1];
            int earn = profit[i - 1];
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= minProfit; k++) {
                    if (j < member) {
                        dp[i][j][k] = dp[i - 1][j][k];
                    } else {
                        dp[i][j][k] = (dp[i - 1][j][k] + dp[i - 1][j - member][Math.max(0, k - earn)]) % MOD;
                    }
                }
            }
        }
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res = (res + dp[gl][i][minProfit]) % MOD;
        }
        return res;
    }

    //1049. 最后一块石头的重量 II
//    有一堆石头，用整数数组 stones 表示。其中 stones[i] 表示第 i 块石头的重量。
//
//    每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
//
//    如果 x == y，那么两块石头都会被完全粉碎；
//    如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
//
//    最后，最多只会剩下一块 石头。返回此石头 最小的可能重量 。如果没有石头剩下，就返回 0。
    public static int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        for (int i : stones) {
            sum += i;
        }
        int t = sum / 2;
        int[][] f = new int[n + 1][t + 1];
        for (int i = 1; i <= n; i++) {
            int x = stones[i - 1];
            for (int j = 0; j <= t; j++) {
                f[i][j] = f[i - 1][j];
                if (j >= x) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - x] + x);
                }
            }
        }
        return Math.abs(sum - f[n][t] - f[n][t]);
    }

    //84. 柱状图中最大的矩形
//    给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
//    求在该柱状图中，能够勾勒出来的矩形的最大面积。
    public static int largestRectangleArea(int[] heights) {
        int res = 0;
        int n = heights.length;
        int[] left = new int[n];//记录每个柱子的左边界
        int[] right = new int[n];//记录每个柱子的右边界
        Arrays.fill(right, n);//默认每个柱子的右边界是最后一个柱子，避免数组递增时无法更新右边界
        Stack<Integer> stack = new Stack<>();//单调栈
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                //当单调栈不空时，遇到的第一个比当前柱子小的，为当前柱子的右边界
                right[stack.peek()] = i;
                stack.pop();
            }
            //单调栈中当前柱子的左边界为栈顶元素
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        for (int i = 0; i < n; i++) {
            res = Math.max(res, (right[i] - left[i] - 1) * heights[i]);
        }
        return res;
    }
    //494. 目标和
//    给你一个整数数组 nums 和一个整数 target 。
//
//    向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
//
//    例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。
//
//    返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。

    public static int findTargetSumWays(int[] nums, int target) {
        //原问题等同于： 找到nums一个正子集和一个负子集，使得总和等于target
        //转化为一个求子集的和问题： 找到nums的一个子集 P，使得sum(P) = (sum(nums)-target) /2;即0-1背包问题
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int diff = sum - target;
        if (diff < 0 || diff % 2 != 0) {
            return 0;
        }
        int neg = diff / 2;
        int n = nums.length;
//        int[][] dp = new int[n + 1][neg + 1];
//        dp[0][0] = 1;
//        for (int i = 1; i <= n; i++) {
//            int num = nums[i - 1];
//            for (int j = 0; j <= neg; j++) {
//                dp[i][j] = dp[i - 1][j];
//                if (j >= num) {
//                    dp[i][j] += dp[i - 1][j - num];
//                }
//            }
//        }
//        return dp[n][neg];

        //优化
        int[] dp = new int[neg + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = neg; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[neg];

//        return backtrack(nums, target, 0, 0, 0);
    }

    //回溯
    public static int backtrack(int[] nums, int target, int index, int sum, int count) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            count = backtrack(nums, target, index + 1, sum + nums[index], count);
            count = backtrack(nums, target, index + 1, sum - nums[index], count);
        }
        return count;
    }

    //相交链表
//    给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;
        if (pa != pb) {
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
//        Set<ListNode> set = new HashSet<>(16);
//        while (headA != null || headB != null){
//            if(headA != null) {
//                if (set.contains(headA)) {
//                    return headA;
//                } else {
//                    set.add(headA);
//                    headA = headA.next;
//                }
//            }
//            if(headB != null) {
//                if (set.contains(headB)) {
//                    return headB;
//                } else {
//                    set.add(headB);
//                    headB = headB.next;
//                }
//            }
//        }
//        return null;
    }

    // 连续数组
    //给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
    public static int findMaxLength(int[] nums) {
//        int res = 0;
//        int n = nums.length;
//        for(int i = 0; i < n;i++){
//            if(nums[i] == 0){
//                nums[i] = -1;
//            }
//        }
//        int sum = 0;
//        HashMap<Integer,Integer> hashMap = new HashMap<>(16);
//        for(int i = 0 ; i < n; i++){
//            sum += nums[i];
//            if(sum == 0 ){
//                res = i + 1;
//            }
//            if(hashMap.containsKey(sum)){
//                res = Math.max(i - hashMap.get(sum), res);
//            }else {
//                hashMap.put(sum, i);
//            }
//        }
//        return res;
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int counter = 0;
        map.put(counter, -1);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num == 1) {
                counter++;
            } else {
                counter--;
            }
            if (map.containsKey(counter)) {
                int prevIndex = map.get(counter);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                map.put(counter, i);
            }
        }
        return maxLength;
    }

//    两数相加
//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
//    请你将两个数相加，并以相同形式返回一个表示和的链表。
//
//    你可以假设除了数字 0 之外，这两个数都不会以 0 开头。

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //新建链表
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if (carry != 0) {
            tail.next = new ListNode(carry);
        }
        return head;
        //在原链表上操作
        // int carry = 0;
        // ListNode head  =  l1;
        // ListNode tail = l1;
        // while(l1 != null && l2 != null){
        //     tail = l1;
        //     int sum = l1.val + l2.val + carry;
        //     carry = sum / 10;
        //     l1.val = sum % 10;
        //     l1 = l1.next;
        //     l2 = l2.next;
        // }
        // if(l1 != null){
        //     while(l1 != null){
        //     tail = l1;
        //     int sum = l1.val + carry;
        //     carry = sum / 10;
        //     l1.val = sum % 10;
        //     l1 = l1.next;
        //     }
        // }
        // if(l2 != null){
        //     tail.next = l2;
        //     while(l2 != null){
        //         tail = l2;
        //         int sum = l2.val + carry;
        //         carry = sum / 10;
        //         l2.val = sum % 10;
        //         l2 = l2.next;
        //     }
        // }
        // if(carry != 0){
        //     tail.next = new ListNode(carry,null);
        // }
        // return head;
    }

    //连续的子数组和
//    给你一个整数数组 nums 和一个整数 k ，编写一个函数来判断该数组是否含有同时满足下述条件的连续子数组：
//
//    子数组大小 至少为 2 ，且
//    子数组元素总和为 k 的倍数。
//
//    如果存在，返回 true ；否则，返回 false 。
//
//    如果存在一个整数 n ，令整数 x 符合 x = n * k ，则称 x 是 k 的一个倍数。
    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int mod = sum % k;
            if (map.containsKey(mod)) {
                if (i - map.get(mod) >= 2) {
                    return true;
                }
            } else {
                map.put(mod, i);
            }
        }
        return false;
    }

    //你能在你最喜欢的那天吃到你最喜欢的糖果吗？
//    给你一个下标从 0 开始的正整数数组 candiesCount ，其中 candiesCount[i] 表示你拥有的第 i 类糖果的数目。同时给你一个二维数组 queries ，其中 queries[i] = [favoriteTypei, favoriteDayi, dailyCapi] 。
//
//    你按照如下规则进行一场游戏：
//
//    你从第 0 天开始吃糖果。
//    你在吃完 所有 第 i - 1 类糖果之前，不能 吃任何一颗第 i 类糖果。
//    在吃完所有糖果之前，你必须每天 至少 吃 一颗 糖果。
//
//    请你构建一个布尔型数组 answer ，满足 answer.length == queries.length 。answer[i] 为 true 的条件是：在每天吃 不超过 dailyCapi 颗糖果的前提下，你可以在第 favoriteDayi 天吃到第 favoriteTypei 类糖果；否则 answer[i] 为 false 。注意，只要满足上面 3 条规则中的第二条规则，你就可以在同一天吃不同类型的糖果。
//
//    请你返回得到的数组 answer 。
    public static boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;
        int m = queries.length;
        boolean[] res = new boolean[m];
        long[] sum = new long[n];
        sum[0] = candiesCount[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + candiesCount[i];
        }
        for (int i = 0; i < m; i++) {
            int favoriteType = queries[i][0];
            int favoriteDay = queries[i][1];
            int dailyCap = queries[i][2];

            long minCount = favoriteDay + 1;
            long maxCount = (long) (favoriteDay + 1) * dailyCap;
            long minTyPeCount = favoriteType == 0 ? 1 : sum[favoriteType - 1] + 1;
            long maxTypeCount = sum[favoriteType];
            res[i] = !(minCount > maxTypeCount || maxCount < minTyPeCount);
        }
        return res;
    }

    // 4的幂
//    给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
//
//    整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
    public static boolean isPowerOfFour(int n) {
        //n & (n - 1)去掉二进制末尾的1 等于0，判断是不是2的幂次方
        // n & 0x55555555 ，4的幂次方只有一个1且在奇数位上
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

//    汉明距离总和

//    两个整数的 汉明距离 指的是这两个数字的二进制数对应位不同的数量。
//
//    计算一个数组中，任意两个数之间汉明距离的总和
//    数组中元素的范围为从 0到 10^9。
//    数组的长度不超过 10^4。

    public int totalHammingDistance(int[] nums) {
        //暴力
//        int sum = 0;
//        int n = nums.length;
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                sum += Integer.bitCount(nums[i]^nums[j]);
//            }
//        }
//        return sum;
        int sum = 0;
        int n = nums.length;
        //10^9 < 2^30
        for (int i = 0; i < 30; i++) {
            int oneCount = 0;
            for (int val : nums) {
                // 计算第i位1的个数
                oneCount += (val >> i) & 1;
            }
            sum += oneCount * (n - oneCount);//数组第i位的汉明距离，count(1)*（n - count(0)）:0的个数表示异或之后1的个数
        }
        return sum;
    }


    //    汉明距离
//    两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
//
//    给出两个整数 x 和 y，计算它们之间的汉明距离。
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int dis = 0;
        while (xor > 0) {
            dis++;
            xor = xor & (xor - 1);
        }
        return dis;
    }

//    反转每对括号间的子串
//    给出一个字符串 s（仅含有小写英文字母和括号）。
//
//    请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。
//
//    注意，您的结果中 不应 包含任何括号

    public static String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (ch == ')') {
                sb.reverse();
                sb.insert(0, stack.pop());
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    //使所有区间的异或结果为零
//    给你一个整数数组 nums​​​ 和一个整数 k​​​​​ 。区间 [left, right]（left <= right）的 异或结果 是对下标位于 left 和 right（包括 left 和 right ）之间所有元素进行 XOR 运算的结果：nums[left] XOR nums[left+1] XOR ... XOR nums[right] 。
//
//    返回数组中 要更改的最小元素数 ，以使所有长度为 k 的区间异或结果等于零。
//
//    1 <= k <= nums.length <= 2000
//            ​​​​​​0 <= nums[i] < 2^10
    public static int minChanges(int[] nums, int k) {
        int n = nums.length;
        int max = 1024;//
        int[][] dp = new int[k][max];//dp[i][j]表示前i列，异或结果为j的最小修改次数
        int[] preMin = new int[k];   //preMin[i]表示第i列的最小修改数
        for (int i = 0; i < k; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            preMin[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < k; i++) {
            Map<Integer, Integer> integerMap = new HashMap<>(16);//每列各个数对应的出现次数
            int count = 0;//每列的整数个数
            for (int j = i; j < n; j += k) {
                integerMap.put(nums[j], integerMap.getOrDefault(nums[j], 0) + 1);
                count++;
            }
            if (i == 0) {//第一列的情况下，只考虑当前列，没有前一列的影响
                for (int xor = 0; xor < max; xor++) {
                    dp[0][xor] = Math.min(dp[0][xor], count - integerMap.getOrDefault(xor, 0));
                    preMin[0] = Math.min(preMin[0], dp[0][xor]);
                }
            } else {
                for (int xor = 0; xor < max; xor++) {
                    dp[i][xor] = preMin[i - 1] + count;//整列替换
                    for (int cur : integerMap.keySet()) {//部分值替换
                        dp[i][xor] = Math.min(dp[i][xor], dp[i - 1][xor ^ cur] + count - integerMap.get(cur));
                    }
                    preMin[i] = Math.min(preMin[i], dp[i][xor]);
                }
            }
        }
        return dp[k - 1][0];
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
                if (num1 == num2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
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

    //    65. 有效数字(有限状态机)
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




































