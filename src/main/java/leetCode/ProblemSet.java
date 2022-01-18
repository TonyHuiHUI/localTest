package leetCode;


import scala.Char;
import scala.io.BytePickle;
import sun.applet.resources.MsgAppletViewer_zh_CN;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ProblemSet {
    public static void main(String[] args) {
//        int[] a = {3, 0, 6, 1, 5};
//        System.out.println(hIndex(a));
//        int[][] a = {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
//        System.out.println(getSkyline(a));
//        int[] a = {1, 10, 4, 4, 2, 7};
//        int[] b = {9, 3, 5, 1, 7, 4};
//        System.out.println(minAbsoluteSumDiff(a, b));
//        TreeNode node2 = new TreeNode(2, new TreeNode(4), new TreeNode(5));
//        TreeNode node3 = new TreeNode(3, new TreeNode(6), new TreeNode(7));
//        TreeNode root = new TreeNode(1, node2, node3);
//        postorderTraversal(root);
//        int[] a = {5,7,7,8,8,10};
//        System.out.println(search(a,8));
//        int[] a = {1, 4, 8, 13};
//        System.out.println(maxFrequency(a, 5));
//        int[][] a = {{1, 10}, {10, 20}};
//        System.out.println(isCovered(a, 21, 21));
//        int[] a = {6, 4, 8, 1, 3, 2};
//        int[] b = {4, 7, 6, 2, 3, 8, 6, 1};
//        System.out.println(minOperations(a, b));
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node0 = new TreeNode(0);
//        TreeNode node8 = new TreeNode(8);
//        TreeNode node2 = new TreeNode(2, node7, node4);
//        TreeNode node1 = new TreeNode(1, node0, node8);
//        TreeNode node5 = new TreeNode(5, node6, node2);
//        TreeNode node3 = new TreeNode(3, node5, node1);
//        System.out.println(distanceK(node3, node5, 2));
//        System.out.println(pathInZigZagTree(14));
//        System.out.println(titleToNumber("ZY"));
//        int[][] a = {{2,1,1},{2,3,1},{3,4,1}};
//        System.out.println(networkDelayTime(a, 4, 2));
//        int[] a = {2,15,4,8,10,9,6};
//        System.out.println(findUnsortedSubarray(a));
//        int[] a = {2,2,3,4};
//        System.out.println(triangleNumber(a));
//        int[][] a = {{1}, {0, 2, 4}, {1, 3, 4}, {2}, {1, 2}};
//        System.out.println(shortestPathLength(a));
//        int[] a = {2, 7, 13, 19};
//        System.out.println(nthSuperUglyNumber(12, a));
//        int[] a = {0, 2000000000, -294967296};
//        System.out.println(numberOfArithmeticSlices2(a));
//        System.out.println(longestPalindromeSubseq("bbbab"));
//        System.out.println(countDigitOne(13));
//        System.out.println(countArrangement(2));
//        int[][] a = {{1,2},{3},{3},{}};
//        System.out.println(allPathsSourceTarget(a));
//        int[] a = {5, 1, 4, 2};
//        System.out.println(numRescueBoats(a, 6));
//        int[] a = {3, 14, 1, 7};
//        Solution solution = new Solution(a);
//        System.out.println(solution.pickIndex());
//        System.out.println(solution.pickIndex());
//        System.out.println(solution.pickIndex());
//        int[][] a = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
//        System.out.println(corpFlightBookings(a, 5));
//        char[][] a = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
////        String[] b = {"oath", "pea", "eat", "rain"};
////        System.out.println(findWords(a, b));
//        getSum(2, 3);
//        System.out.println(quickMul(4, 5));
//        findComplement(5);
//        System.out.println(majorityElement(new int[]{6, 5, 5}));
//        removeInvalidParentheses("(((k()((");

//        reorderedPowerOf2(1);
//        int[][] a = {{0, 0, 1, 1}, {0, 0, 2, 1}, {1, 0, 2, 1}, {0, 2, 2, 3}};
//        System.out.println(isRectangleCover(a));
//        System.out.println(findNthDigit(11));
//        int[] a = {4, 5, 10, 6, 11, 17, 4, 11, 1, 3};
//        System.out.println(maxSumOfThreeSubarrays(a, 1));
//        int[][] a = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
//        System.out.println(maxIncreaseKeepingSkyline(a));
//        int[][] richer = {{1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}};
//        int[] quiet = {3, 2, 5, 4, 6, 1, 7, 0};
//        System.out.println(loudAndRich(richer, quiet));
//        System.out.println(numWaterBottles(9, 3));
//        System.out.println(RK("zdfefrrrdddd", "rrrd"));
//        System.out.println(longestDupSubstring("nnpxouomcofdjuujloanjimymadkuepightrfodmauhrsy"));
//        int[] apples = {1, 2, 3, 5, 2};
//        int[] days = {3, 2, 1, 4, 2};
//        System.out.println(eatenApples(apples, days));
//        System.out.println(numFriendRequests(new int[]{16,17,18}));
//        System.out.println(findAllConcatenatedWordsInADict(new String[]{"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"}));
//        System.out.println(simplifyPath("/a/./b/../../c/"));
//        System.out.println(isAdditiveNumber("112358"));
//        System.out.println(increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        System.out.println(dominantIndex(new int[]{3,6,1,0}));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
    //373. 查找和最小的K对数字
    //给定两个以升序排列的整数数组 nums1 和 nums2 , 以及一个整数 k 。
    //定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2 。
    //请找到和最小的 k 个数对 (u1,v1),  (u2,v2)  ...  (uk,vk) 。
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> (nums1[a[0]] + nums2[a[1]])));
        for(int i = 0; i < Math.min(n ,k); i++){
            priorityQueue.offer(new int[]{i, 0});
        }
        while (k-- > 0 && !priorityQueue.isEmpty()){
            int[] min = priorityQueue.poll();
            List<Integer> list = new ArrayList<>();
            list.add(nums1[min[0]]);
            list.add(nums2[min[1]]);
            result.add(list);
            if(min[1] + 1 < m){
                priorityQueue.offer(new int[]{min[0], min[1] + 1});
            }
        }
        return result;
    }
    public static int dominantIndex(int[] nums) {
//        int[] first = new int[2];
//        int[] second = new int[2];
//        Arrays.fill(first, Integer.MIN_VALUE);
//        Arrays.fill(second, Integer.MIN_VALUE);
//        int n = nums.length;
//        if(n == 1){
//            return 0;
//        }
//        for (int i = 0; i < n; i++){
//            if(nums[i] > first[0]){
//                second[0] = first[0];
//                second[1] = first[1];
//                first[0] = nums[i];
//                first[1] = i;
//            }else if(nums[i] > second[0]){
//                second[0] = nums[i];
//                second[1] = i;
//            }
//        }
//        if(first[0] >= second[0] * 2){
//            return first[1];
//        }
//        return -1;

        int m1 = -1, m2 = -1;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
                index = i;
            } else if (nums[i] > m2) {
                m2 = nums[i];
            }
        }
        return m1 >= m2 * 2 ? index : -1;
    }

    //334. 递增的三元子序列
    //给你一个整数数组 nums ，判断这个数组中是否存在长度为 3 的递增子序列。
    //如果存在这样的三元组下标 (i, j, k) 且满足 i < j < k ，使得 nums[i] < nums[j] < nums[k] ，返回 true ；否则，返回 false 。
    public static boolean increasingTriplet(int[] nums) {
        //贪心（空间O(n) 时间O(1)）
//        int first = Integer.MAX_VALUE;
//        int second = Integer.MAX_VALUE;
//        for(int num : nums){
//            if(num <= first){
//                first = num;
//            }else if(num <= second){
//                second = num;
//            }else {
//                return true;
//            }
//        }
//        return false;

        //双向遍历（空间O(n) 时间O(n)）
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        int[] leftMin = new int[n];
        leftMin[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }
        int[] rightMin = new int[n];
        rightMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i++) {
            rightMin[i] = Math.min(rightMin[i + 1], nums[i]);
        }
        for(int i = 1; i < n; i ++){
            if(nums[i] > leftMin[i - 1] && nums[i] < rightMin[i + 1] ){
                return true;
            }
        }
        return false;
    }

    //306. 累加数
    //累加数 是一个字符串，组成它的数字可以形成累加序列。
    //一个有效的 累加序列 必须 至少 包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。
    //给你一个只包含数字 '0'-'9' 的字符串，编写一个算法来判断给定输入是否是 累加数 。如果是，返回 true ；否则，返回 false 。
    //说明：累加序列里的数 不会 以 0 开头，所以不会出现 1, 2, 03 或者 1, 02, 3 的情况。
    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int secondStart = 1; secondStart < n - 1; secondStart++) {
            if (num.charAt(0) == '0' && secondStart != 1) {
                break;
            }
            for (int secondEnd = secondStart; secondEnd < n - 1; secondEnd++) {
                if (num.charAt(secondStart) == '0' && secondEnd != secondStart) {
                    break;
                }
                if (isValid(num, secondStart, secondEnd)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid(String num, int secondStart, int secondEnd) {
        int n = num.length();
        int firstStart = 0, firstEnd = secondStart - 1;
        while (secondEnd <= n - 1) {
            String thirdString = addString(num, firstStart, firstEnd, secondStart, secondEnd);
            int thirdStart = secondEnd + 1;
            int thirdEnd = secondEnd + thirdString.length();

            if (thirdEnd >= n || !num.substring(thirdStart, thirdEnd + 1).equals(thirdString)) {
                break;
            }
            if (thirdEnd == n - 1) {
                return true;
            }
            firstStart = secondStart;
            firstEnd = secondEnd;
            secondStart = thirdStart;
            secondEnd = thirdEnd;
        }
        return false;
    }

    public static String addString(String num, int firstStart, int firstEnd, int secondStart, int secondEnd) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, cur = 0;
        while (firstStart <= firstEnd || secondStart <= secondEnd || carry != 0) {
            cur = carry;
            if (firstStart <= firstEnd) {
                cur += num.charAt(firstEnd) - '0';
                firstEnd--;
            }
            if (secondStart <= secondEnd) {
                cur += num.charAt(secondEnd) - '0';
                secondEnd--;
            }
            carry = cur / 10;
            cur = cur % 10;
            sb.append((char) (cur + '0'));
        }
        sb.reverse();
        return sb.toString();
    }

    //71. 简化路径
    //给你一个字符串 path ，表示指向某一文件或目录的 Unix 风格 绝对路径 （以 '/' 开头），请你将其转化为更加简洁的规范路径。
    //在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..） 表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。任意多个连续的斜杠（即，'//'）都被视为单个斜杠 '/' 。 对于此问题，任何其他格式的点（例如，'...'）均被视为文件/目录名称。
    //请注意，返回的 规范路径 必须遵循下述格式：
    //始终以斜杠 '/' 开头。
    //两个目录名之间必须只有一个斜杠 '/' 。
    //最后一个目录名（如果存在）不能 以 '/' 结尾。
    //此外，路径仅包含从根目录到目标文件或目录的路径上的目录（即，不含 '.' 或 '..'）。
    public static String simplifyPath(String path) {
        String[] subPaths = path.split("/");
        StringBuilder sb = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();
        for (String subPath : subPaths) {
            if ("..".equals(subPath)) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else if (!".".equals(subPath) && subPath.length() > 0) {
                stack.offerLast(subPath);
            }
        }

        while (!stack.isEmpty()) {
            sb.append("/");
            sb.append(stack.pollFirst());
        }
        return sb.length() == 0 ? sb.append("/").toString() : sb.toString();
    }

    //1995. 统计特殊四元组
    //给你一个 下标从 0 开始 的整数数组 nums ，返回满足下述条件的 不同 四元组 (a, b, c, d) 的 数目 ：
    //nums[a] + nums[b] + nums[c] == nums[d] ，且
    //a < b < c < d
    public int countQuadruplets(int[] nums) {
//        int n = nums.length;
//        int ans = 0;
//        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
//        for (int c = n - 2; c >= 2; --c) {
//            cnt.put(nums[c + 1], cnt.getOrDefault(nums[c + 1], 0) + 1);
//            for (int a = 0; a < c; ++a) {
//                for (int b = a + 1; b < c; ++b) {
//                    ans += cnt.getOrDefault(nums[a] + nums[b] + nums[c], 0);
//                }
//            }
//        }
//        return ans;

        int n = nums.length;
        int ans = 0;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int b = n - 3; b >= 1; --b) {
            for (int d = b + 2; d < n; ++d) {
                cnt.put(nums[d] - nums[b + 1], cnt.getOrDefault(nums[d] - nums[b + 1], 0) + 1);
            }
            for (int a = 0; a < b; ++a) {
                ans += cnt.getOrDefault(nums[a] + nums[b], 0);
            }
        }
        return ans;
    }

    //472. 连接词
//    给你一个 不含重复 单词的字符串数组 words ，请你找出并返回 words 中的所有 连接词 。
//    连接词 定义为：一个完全由给定数组中的至少两个较短单词组成的字符串
    public static List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new LinkedList<>();
        TrieD trieD = new TrieD();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 0) {
                continue;
            }
            if (checkTrieD(trieD, words[i], 0)) {
                result.add(words[i]);
            } else {
                trieD.insert(words[i]);
            }
        }
        return result;
    }

    public static boolean checkTrieD(TrieD trieD, String word, int index) {
        if (word.length() == index) {
            return true;
        }
        TrieD node = trieD;
        for (int i = index; i < word.length(); i++) {
            char ch = word.charAt(i);
            node = node.next[ch - 'a'];
            if (node == null) {
                return false;
            }
            if (node.isEnd) {
                if (checkTrieD(trieD, word, i + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    //825. 适龄的朋友
    //在社交媒体网站上有 n 个用户。给你一个整数数组 ages ，其中 ages[i] 是第 i 个用户的年龄。
    //如果下述任意一个条件为真，那么用户 x 将不会向用户 y（x != y）发送好友请求：
    //age[y] <= 0.5 * age[x] + 7
    //age[y] > age[x]
    //age[y] > 100 && age[x] < 100
    //否则，x 将会向 y 发送一条好友请求。
    //注意，如果 x 向 y 发送一条好友请求，y 不必也向 x 发送一条好友请求。另外，用户不会向自己发送好友请求。
    //返回在该社交媒体网站上产生的好友请求总数。
    public static int numFriendRequests(int[] ages) {
        //排序+双指针
//        int n = ages.length;
//        int sum = 0, left = 0, right = 0;
//        Arrays.sort(ages);
//        for (int age : ages) {
//            if (age < 15) {
//                continue;
//            }
//            while (ages[left] <= 0.5 * age + 7) {
//                left++;
//            }
//            while (right + 1 < n && ages[right + 1] <= age) {
//                right++;
//            }
//            sum += right - left;
//        }
//        return sum;
        //计数排序+前缀和
        int[] count = new int[121];
        int[] pre = new int[121];
        for (int age : ages) {
            count[age]++;
        }
        for (int i = 1; i <= 120; i++) {
            pre[i] = pre[i - 1] + count[i];
        }
        int sum = 0;
        for (int i = 15; i <= 120; i++) {
            if (count[i] > 0) {
                int bound = (int) (i * 0.5 + 8);
                sum += count[i] * (pre[i] - pre[bound - 1] - 1);
            }
        }
        return sum;
    }

    //1705. 吃苹果的最大数目
    //有一棵特殊的苹果树，一连 n 天，每天都可以长出若干个苹果。在第 i 天，树上会长出 apples[i] 个苹果，这些苹果将会在 days[i] 天后（也就是说，第 i + days[i] 天时）腐烂，变得无法食用。也可能有那么几天，树上不会长出新的苹果，此时用 apples[i] == 0 且 days[i] == 0 表示。
    //你打算每天 最多 吃一个苹果来保证营养均衡。注意，你可以在这 n 天之后继续吃苹果。
    //给你两个长度为 n 的整数数组 days 和 apples ，返回你可以吃掉的苹果的最大数目。
    public static int eatenApples(int[] apples, int[] days) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int n = apples.length;
        int sum = 0, index = 0;
        while (index < n) {
            while (!priorityQueue.isEmpty() && priorityQueue.peek()[1] <= index) {
                priorityQueue.poll();
            }
            int rotDay = index + days[index];
            int count = apples[index];
            if (count > 0) {
                priorityQueue.add(new int[]{count, rotDay});
            }
            if (!priorityQueue.isEmpty()) {
                int[] arr = priorityQueue.peek();
                if (--arr[0] == 0) {
                    priorityQueue.poll();
                }
                sum++;
            }
            index++;
        }
        while (!priorityQueue.isEmpty()) {
            while (!priorityQueue.isEmpty() && priorityQueue.peek()[1] <= index) {
                priorityQueue.poll();
            }
            if (priorityQueue.isEmpty()) {
                break;
            }
            int[] arr = priorityQueue.poll();
            int count = Math.min(arr[1] - index, arr[0]);
            sum += count;
            index += count;
        }
        return sum;
    }

    //1154. 一年中的第几天
//    给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。请你计算并返回该日期是当年的第几天。
//
//    通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
    public int dayOfYear(String date) {
        String[] times = date.split("-");
        int year = Integer.valueOf(times[0]);
        int month = Integer.valueOf(times[1]);
        int day = Integer.valueOf(times[2]);
        int count[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            count[1]++;
        }
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += count[i];
        }
        return sum + day;
    }

    //    1044. 最长重复子串
    //给你一个字符串 s ，考虑其所有 重复子串 ：即，s 的连续子串，在 s 中出现 2 次或更多次。这些出现之间可能存在重叠。
    //返回 任意一个 可能具有最长长度的重复子串。如果 s 不含重复子串，那么答案为 "" 。
    public static String longestDupSubstring(String s) {
        int n = s.length();
        Random random = new Random();
        //两套进制和两套摸用来防止溢出和hash碰撞
        // 生成两个进制
        int a1 = random.nextInt(75) + 26;
        int a2 = random.nextInt(75) + 26;
        // 生成两个模
        int mod1 = random.nextInt(Integer.MAX_VALUE - 1000000007 + 1) + 1000000007;
        int mod2 = random.nextInt(Integer.MAX_VALUE - 1000000007 + 1) + 1000000007;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) - 'a';
        }
        int left = 1, right = n - 1;
        int length = 0, start = -1;
        while (left <= right) {
            int mid = (right - left + 1) / 2 + left;
            //Rabin-Karp算法
            int index = check(arr, mid, a1, a2, mod1, mod2);
            if (index != -1) {
                left = mid + 1;
                start = index;
                length = mid;
            } else {
                right = mid - 1;
            }
        }
        return start != -1 ? s.substring(start, start + length) : "";
    }

    public static int check(int[] arr, int m, int a1, int a2, int mod1, int mod2) {
        int n = arr.length;
        long aL1 = pow(a1, m, mod1);
        long aL2 = pow(a2, m, mod2);
        long h1 = 0, h2 = 0;
        for (int i = 0; i < m; ++i) {
            h1 = (h1 * a1 % mod1 + arr[i]) % mod1;
            h2 = (h2 * a2 % mod2 + arr[i]) % mod2;
            if (h1 < 0) {
                h1 += mod1;
            }
            if (h2 < 0) {
                h2 += mod2;
            }
        }
        // 存储一个编码组合是否出现过
        Set<Long> seen = new HashSet<Long>();
        seen.add(h1 * mod2 + h2);
        for (int start = 1; start <= n - m; ++start) {
            h1 = (h1 * a1 % mod1 - arr[start - 1] * aL1 % mod1 + arr[start + m - 1]) % mod1;
            h2 = (h2 * a2 % mod2 - arr[start - 1] * aL2 % mod2 + arr[start + m - 1]) % mod2;
            if (h1 < 0) {
                h1 += mod1;
            }
            if (h2 < 0) {
                h2 += mod2;
            }

            long num = h1 * mod2 + h2;
            // 如果重复，则返回重复串的起点
            if (!seen.add(num)) {
                return start;
            }
        }
        // 没有重复，则返回-1
        return -1;
    }

    public static long pow(int a, int m, int mod) {
        long ans = 1;
        long contribute = a;
        while (m > 0) {
            if (m % 2 == 1) {
                ans = ans * contribute % mod;
                if (ans < 0) {
                    ans += mod;
                }
            }
            contribute = contribute * contribute % mod;
            if (contribute < 0) {
                contribute += mod;
            }
            m /= 2;
        }
        return ans;
    }

    //    Rabin-Karp算法(用于在字符串匹配和查重)（可能需要考虑hash碰撞，和值越界问题）
    //判断target 是否是dic子串
    public static boolean RK(String dic, String target) {
        int dicn = dic.length();
        int tarn = target.length();
        long targetHash = 0;
        long dicHash = 0;
        //字符串只包含小写字母，所以是以26为底,计算字符串hash值
        for (int i = 0; i < tarn; i++) {
            targetHash += (target.charAt(i) - 'a') * Math.pow(26, tarn - i - 1);
            dicHash += (dic.charAt(i) - 'a') * Math.pow(26, tarn - i - 1);
        }
        int index = 0;
        while (index <= dicn - tarn) {
            if (dicHash == targetHash) {//子串hash值与target串hash值相等，则两个子串相等
                return true;
            } else if (index < dicn - tarn) {
                //以tarn为窗口，更新子串hash值
                index++;
                dicHash = (long) (26 * dicHash - Math.pow(26, tarn) * (dic.charAt(index - 1) - 'a') + dic.charAt(tarn + index - 1) - 'a');
            } else {
                return false;
            }
        }
        return false;
    }

    //686. 重复叠加字符串匹配
    //给定两个字符串 a 和 b，寻找重复叠加字符串 a 的最小次数，使得字符串 b 成为叠加后的字符串 a 的子串，如果不存在则返回 -1。
    //注意：字符串 "abc" 重复叠加 0 次是 ""，重复叠加 1 次是 "abc"，重复叠加 2 次是 "abcabc"。
    public int repeatedStringMatch(String a, String b) {
        int bn = b.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (sb.length() < bn) {
            sb.append(a);
            count++;
        }
        sb.append(a);
        int index = sb.indexOf(b);//KMP算法
        if (index == -1) {
            return -1;
        }
        return index + b.length() > a.length() * count ? count + 1 : count;
    }

    //1518. 换酒问题
    //小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
    //如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
    //请你计算 最多 能喝到多少瓶酒。
    public static int numWaterBottles(int numBottles, int numExchange) {
        //模拟
//        int sum = numBottles;
//        int emptyBottles = numBottles;
//        while (emptyBottles >= numExchange){
//            int bottle = emptyBottles / numExchange;
//            sum += bottle;
//            emptyBottles = emptyBottles % numExchange + bottle;
//        }
//        return  sum;
        //数学
        return numBottles >= numExchange ? (numBottles - numExchange) / (numExchange - 1) + 1 + numBottles : numBottles;
    }

    //1610. 可见点的最大数目
    //给你一个点数组 points 和一个表示角度的整数 angle ，你的位置是 location ，其中 location = [posx, posy] 且 points[i] = [xi, yi] 都表示 X-Y 平面上的整数坐标。
    //最开始，你面向东方进行观测。你 不能 进行移动改变位置，但可以通过 自转 调整观测角度。换句话说，posx 和 posy 不能改变。你的视野范围的角度用 angle 表示， 这决定了你观测任意方向时可以多宽。设 d 为你逆时针自转旋转的度数，那么你的视野就是角度范围 [d - angle/2, d + angle/2] 所指示的那片区域。
    //对于每个点，如果由该点、你的位置以及从你的位置直接向东的方向形成的角度 位于你的视野中 ，那么你就可以看到它。
    //同一个坐标上可以有多个点。你所在的位置也可能存在一些点，但不管你的怎么旋转，总是可以看到这些点。同时，点不会阻碍你看到其他点。
    //返回你能看到的点的最大数目。
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        int x = location.get(0), y = location.get(1);
        List<Double> list = new ArrayList<>();
        int cnt = 0;
        double pi = Math.PI, t = angle * pi / 180;
        for (List<Integer> p : points) {
            int a = p.get(0), b = p.get(1);
            if (a == x && b == y && ++cnt >= 0) {
                continue;
            }
            list.add(Math.atan2(b - y, a - x) + pi);
        }
        Collections.sort(list);//将极角排序
        int n = list.size(), max = 0;
        for (int i = 0; i < n; i++) {
            list.add(list.get(i) + 2 * pi);
        }
        for (int i = 0, j = 0; j < 2 * n; j++) {
            while (i < j && list.get(j) - list.get(i) > t) {
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        return cnt + max;
    }

    //851. 喧闹和富有
    //有一组 n 个人作为实验对象，从 0 到 n - 1 编号，其中每个人都有不同数目的钱，以及不同程度的安静值（quietness）。为了方便起见，我们将编号为 x 的人简称为 "person x "。
    //给你一个数组 richer ，其中 richer[i] = [ai, bi] 表示 person ai 比 person bi 更有钱。另给你一个整数数组 quiet ，其中 quiet[i] 是 person i 的安静值。richer 中所给出的数据 逻辑自恰（也就是说，在 person x 比 person y 更有钱的同时，不会出现 person y 比 person x 更有钱的情况 ）。
    //现在，返回一个整数数组 answer 作为答案，其中 answer[x] = y 的前提是，在所有拥有的钱肯定不少于 person x 的人中，person y 是最安静的人（也就是安静值 quiet[y] 最小的人）。
    public static int[] loudAndRich(int[][] richer, int[] quiet) {
        //dfs
//        int n = quiet.length;
//        List<Integer>[] g = new List[n];
//        for (int i = 0; i < n; ++i) {
//            g[i] = new ArrayList<Integer>();
//        }
//        for (int[] r : richer) {
//            g[r[1]].add(r[0]);
//        }
//
//        int[] ans = new int[n];
//        Arrays.fill(ans, -1);
//        for (int i = 0; i < n; ++i) {
//            dfs(i, quiet, g, ans);
//        }
//        return ans;

        //拓扑排序
        int n = quiet.length;
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        int[] inDeg = new int[n];//节点的入度
        for (int[] rich : richer) {
            g[rich[0]].add(rich[1]);
            inDeg[rich[1]]++;
        }
        int[] ans = new int[n];//初始化
        for (int i = 0; i < n; i++) {
            ans[i] = i;
        }
        Queue<Integer> queue = new ArrayDeque<>();//入度为0的节点入队列
        for (int i = 0; i < n; i++) {
            if (inDeg[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int y : g[x]) {
                if (quiet[ans[x]] < quiet[ans[y]]) {//更新节点x的相邻节点
                    ans[y] = ans[x];
                }
                if (--inDeg[y] == 0) {
                    queue.offer(y);
                }
            }
        }
        return ans;
    }

    public static void dfs(int x, int[] quiet, List<Integer>[] g, int[] ans) {
        if (ans[x] != -1) {
            return;
        }
        ans[x] = x;
        for (int y : g[x]) {
            dfs(y, quiet, g, ans);
            if (quiet[ans[y]] < quiet[ans[x]]) {
                ans[x] = ans[y];
            }
        }
    }

    //630. 课程表 III
    //    这里有 n 门不同的在线课程，按从 1 到 n 编号。给你一个数组 courses ，其中 courses[i] = [durationi, lastDayi] 表示第 i 门课将会 持续 上 durationi 天课，并且必须在不晚于 lastDayi 的时候完成。
    //    你的学期从第 1 天开始。且不能同时修读两门及两门以上的课程。
    //    返回你最多可以修读的课程数目。
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
        int total = 0;
        for (int[] course : courses) {
            int duration = course[0], lastDay = course[1];
            if (total + duration <= lastDay) {
                total += duration;
                q.offer(duration);
            } else if (!q.isEmpty() && q.peek() > duration) {
                total -= q.poll() - duration;
                q.offer(duration);
            }
        }
        return q.size();
    }

    //    807. 保持城市天际线
    //在二维数组grid中，grid[i][j]代表位于某处的建筑物的高度。 我们被允许增加任何数量（不同建筑物的数量可能不同）的建筑物的高度。 高度 0 也被认为是建筑物。
    //最后，从新数组的所有四个方向（即顶部，底部，左侧和右侧）观看的“天际线”必须与原始数组的天际线相同。 城市的天际线是从远处观看时，由所有建筑物形成的矩形的外部轮廓。 请看下面的例子。
    //建筑物高度可以增加的最大总和是多少？
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] topBottom = new int[col];
        int[] leftRight = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                leftRight[i] = Math.max(leftRight[i], grid[i][j]);
                topBottom[j] = Math.max(topBottom[j], grid[i][j]);
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += Math.min(leftRight[i], topBottom[j]) - grid[i][j];
            }
        }
        return sum;
    }

    //    748. 最短补全词
    //给你一个字符串 licensePlate 和一个字符串数组 words ，请你找出并返回 words 中的 最短补全词 。
    //补全词 是一个包含 licensePlate 中所有的字母的单词。在所有补全词中，最短的那个就是 最短补全词 。
    //在匹配 licensePlate 中的字母时：
    //忽略 licensePlate 中的 数字和空格 。
    //不区分大小写。
    //如果某个字母在 licensePlate 中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。
    //例如：licensePlate = "aBc 12c"，那么它的补全词应当包含字母 'a'、'b' （忽略大写）和两个 'c' 。可能的 补全词 有 "abccdef"、"caaacab" 以及 "cbca" 。
    //请你找出并返回 words 中的 最短补全词 。题目数据保证一定存在一个最短补全词。当有多个单词都符合最短补全词的匹配条件时取 words 中 最靠前的 那个
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] charCount = new int[26];
        for (int i = 0; i < licensePlate.length(); i++) {
            char ch = licensePlate.charAt(i);
            if (Character.isLetter(ch)) {
                charCount[Character.toLowerCase(ch) - 'a']++;
            }
        }
        int index = -1;
        for (int i = 0; i < words.length; i++) {
            int[] chs = new int[26];
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                chs[ch - 'a']++;
            }
            boolean is = true;
            for (int j = 0; j < 26; j++) {
                if (chs[j] < charCount[j]) {
                    is = false;
                    break;
                }
            }
            if (is && (index < 0 || word.length() < words[index].length())) {
                index = i;
            }
        }
        return words[index];
    }

    //794. 有效的井字游戏
    //给你一个字符串数组 board 表示井字游戏的棋盘。当且仅当在井字游戏过程中，棋盘有可能达到 board 所显示的状态时，才返回 true 。
    //井字游戏的棋盘是一个 3 x 3 数组，由字符 ' '，'X' 和 'O' 组成。字符 ' ' 代表一个空位。
    //以下是井字游戏的规则：
    //玩家轮流将字符放入空位（' '）中。
    //玩家 1 总是放字符 'X' ，而玩家 2 总是放字符 'O' 。
    //'X' 和 'O' 只允许放置在空位中，不允许对已放有字符的位置进行填充。
    //当有 3 个相同（且非空）的字符填充任何行、列或对角线时，游戏结束。
    //当所有位置非空时，也算为游戏结束。
    //如果游戏结束，玩家不允许再放置字符。
    public boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;
        for (String row : board) {
            for (char c : row.toCharArray()) {
                if (c == 'X') {
                    xCount++;
                } else if (c == 'O') {
                    oCount++;
                }
            }
        }
        if (oCount != xCount && oCount != xCount - 1) {
            return false;
        }
        if (checkWinner(board, 'X') && oCount != xCount - 1) {
            return false;
        }
        if (checkWinner(board, 'O') && oCount != xCount) {
            return false;
        }
        return true;
    }

    public boolean checkWinner(String[] board, char c) {
        for (int i = 0; i < 3; i++) {
            if (c == board[0].charAt(i) && c == board[1].charAt(i) && c == board[2].charAt(i)) {
                return true;
            }
            if (c == board[i].charAt(0) && c == board[i].charAt(1) && c == board[i].charAt(2)) {
                return true;
            }
        }
        if (c == board[0].charAt(0) && c == board[1].charAt(1) && c == board[2].charAt(2)) {
            return true;
        }
        if (c == board[0].charAt(2) && c == board[1].charAt(1) && c == board[2].charAt(0)) {
            return true;
        }
        return false;
    }
    //689. 三个无重叠子数组的最大和
    //给你一个整数数组 nums 和一个整数 k ，找出三个长度为 k 、互不重叠、且 3 * k 项的和最大的子数组，并返回这三个子数组。
    //以下标的数组形式返回结果，数组中的每一项分别指示每个子数组的起始位置（下标从 0 开始）。如果有多个结果，返回字典序最小的一个。

    //单个子数组的最大和
    public int[] maxSumOfOneSubarray(int[] nums, int k) {
        int[] ans = new int[1];
        int sum1 = 0, maxSum1 = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum1 += nums[i];
            if (i >= k - 1) {
                if (sum1 > maxSum1) {
                    maxSum1 = sum1;
                    ans[0] = i - k + 1;
                }
                sum1 -= nums[i - k + 1];
            }
        }
        return ans;
    }

    //两个无重叠子数组的最大和
    public static int[] maxSumOfTwoSubarrays(int[] nums, int k) {
        int[] ans = new int[2];
        int sum1 = 0, maxSum1 = 0, maxSum1Idx = 0;
        int sum2 = 0, maxSum12 = 0;
        for (int i = k; i < nums.length; ++i) {
            sum1 += nums[i - k];
            sum2 += nums[i];
            if (i >= k * 2 - 1) {
                if (sum1 > maxSum1) {
                    maxSum1 = sum1;
                    maxSum1Idx = i - k * 2 + 1;
                }
                if (maxSum1 + sum2 > maxSum12) {
                    maxSum12 = maxSum1 + sum2;
                    ans[0] = maxSum1Idx;
                    ans[1] = i - k + 1;
                }
                sum1 -= nums[i - k * 2 + 1];
                sum2 -= nums[i - k + 1];
            }
        }
        return ans;
    }

    public static int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        //滑动窗口
        int[] res = new int[3];
        int sum1 = 0, maxSum1 = 0, index1 = 0;
        int sum2 = 0, maxSum12 = 0, index12 = 0, index2 = 0;
        int sum3 = 0, maxSum123 = 0;
        for (int i = k * 2; i < nums.length; i++) {
            sum1 += nums[i - k * 2];
            sum2 += nums[i - k];
            sum3 += nums[i];
            if (i >= 3 * k - 1) {
                if (sum1 > maxSum1) {
                    maxSum1 = sum1;
                    index1 = i - 3 * k + 1;
                }
                if (maxSum1 + sum2 > maxSum12) {
                    maxSum12 = maxSum1 + sum2;
                    index12 = index1;
                    index2 = i - 2 * k + 1;
                }
                if (maxSum12 + sum3 > maxSum123) {
                    maxSum123 = maxSum12 + sum3;
                    res[0] = index12;
                    res[1] = index2;
                    res[2] = i - k + 1;
                }
                sum1 -= nums[i - 3 * k + 1];
                sum2 -= nums[i - 2 * k + 1];
                sum3 -= nums[i - k + 1];
            }
        }
        return res;
    }

    //1034. 边界着色
    //给你一个大小为 m x n 的整数矩阵 grid ，表示一个网格。另给你三个整数 row、col 和 color 。网格中的每个值表示该位置处的网格块的颜色。
    //当两个网格块的颜色相同，而且在四个方向中任意一个方向上相邻时，它们属于同一 连通分量 。
    //连通分量的边界 是指连通分量中的所有与不在分量中的网格块相邻（四个方向上）的所有网格块，或者在网格的边界上（第一行/列或最后一行/列）的所有网格块。
    //请你使用指定颜色 color 为所有包含网格块 grid[row][col] 的 连通分量的边界 进行着色，并返回最终的网格 grid 。
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Deque<int[]> deque = new ArrayDeque<>();
        List<int[]> borders = new ArrayList<>();
        int[][] direct = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        int initColor = grid[row][col];
        visited[row][col] = true;
        deque.offer(new int[]{row, col});
        while (!deque.isEmpty()) {
            int[] chunk = deque.poll();
            int x = chunk[0], y = chunk[1];
            boolean isBorder = false;
            for (int i = 0; i < 4; i++) {
                int nx = x + direct[i][0], ny = y + direct[i][1];
                if (!(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == initColor)) {
                    isBorder = true;
                } else if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    deque.offer(new int[]{nx, ny});
                }
            }
            if (isBorder) {
                borders.add(new int[]{x, y});
            }
        }
        for (int i = 0; i < borders.size(); i++) {
            int x = borders.get(i)[0], y = borders.get(i)[1];
            grid[x][y] = color;
        }
        return grid;
    }

    //1816. 截断句子
    //句子 是一个单词列表，列表中的单词之间用单个空格隔开，且不存在前导或尾随空格。每个单词仅由大小写英文字母组成（不含标点符号）。
    //例如，"Hello World"、"HELLO" 和 "hello world hello world" 都是句子。
    //给你一个句子 s​​​​​​ 和一个整数 k​​​​​​ ，请你将 s​​ 截断 ​，​​​使截断后的句子仅含 前 k​​​​​​ 个单词。返回 截断 s​​​​​​ 后得到的句子。
    public String truncateSentence(String s, int k) {
        int index = 0;
        for (int i = 0, n = s.length(); i < n; i++) {
            if (s.charAt(i) == ' ' && --k == 0) {
                break;
            }
            index++;
        }
        return s.substring(0, index);
    }

    //1005. K 次取反后最大化的数组和
//    给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组：
//    选择某个下标 i 并将 nums[i] 替换为 -nums[i] 。
//    重复这个过程恰好 k 次。可以多次选择同一个下标 i 。
//    以这种方式修改数组后，返回数组 可能的最大和 。
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        int sum = 0;
        for (int num : nums) {
            sum += num;
            priorityQueue.offer(num);
        }
        while (k > 0) {
            int mini = priorityQueue.poll();
            sum -= 2 * mini;
            priorityQueue.offer(-mini);
        }
        return sum;
    }

    //506. 相对名次
    //给你一个长度为 n 的整数数组 score ，其中 score[i] 是第 i 位运动员在比赛中的得分。所有得分都 互不相同 。
    //运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
    //    名次第 1 的运动员获金牌 "Gold Medal" 。
    //    名次第 2 的运动员获银牌 "Silver Medal" 。
    //    名次第 3 的运动员获铜牌 "Bronze Medal" 。
    //    从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
    //使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况
    public String[] findRelativeRanks(int[] score) {
        String[] top3 = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        int n = score.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (x, y) -> y[0] - x[0]);
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                res[arr[i][1]] = top3[i];
            } else {
                res[arr[i][1]] = Integer.toString(i + 1);
            }
        }
        return res;
    }

    //1446. 连续字符
    //给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
    //请你返回字符串的能量。
    public int maxPower(String s) {
        int res = 1;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 1;
            }
        }
        return res;
    }

    //400. 第 N 位数字
    //给你一个整数 n ，请你在无限的整数序列 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...] 中找出并返回第 n 位数字。
    public static int findNthDigit(int n) {
        int len = 1;
        while (n > len * 9 * Math.pow(10, len - 1)) {
            n -= len * 9 * Math.pow(10, len - 1);
            len++;
        }
        int start = (int) Math.pow(10, len - 1);//第一个len位数
        int num = start + (n - 1) / len;//目标数所在整数
        int digitIndex = (n - 1) % len;//目标数所在整数的下标（从左往右数）
        int digit = (num / (int) (Math.pow(10, len - digitIndex - 1))) % 10;
        return digit;
    }

    //786. 第 K 个最小的素数分数
    //给你一个按递增顺序排序的数组 arr 和一个整数 k 。数组 arr 由 1 和若干 素数  组成，且其中所有整数互不相同。
    //对于每对满足 0 < i < j < arr.length 的 i 和 j ，可以得到分数 arr[i] / arr[j] 。
    //那么第 k 个最小的分数是多少呢?  以长度为 2 的整数数组返回你的答案, 这里 answer[0] == arr[i] 且 answer[1] == arr[j] 。
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((x, y) -> arr[x[0]] * arr[y[1]] - arr[y[0]] * arr[x[1]]);
        for (int i = 1; i < arr.length; i++) {
            priorityQueue.offer(new int[]{0, i});
        }
        for (int i = 1; i < k; i++) {
            int[] cur = priorityQueue.poll();
            int x = cur[0], y = cur[1];
            if (x + 1 < y) {
                priorityQueue.offer(new int[]{x + 1, y});
            }
        }
        return new int[]{arr[priorityQueue.peek()[0]], arr[priorityQueue.peek()[1]]};
    }

    //423. 从英文中重建数字
    //给你一个字符串 s ，其中包含字母顺序打乱的用英文单词表示的若干数字（0-9）。按 升序 返回原始的数字.
    public String originalDigits(String s) {
        Map<Character, Integer> c = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        int[] cnt = new int[10];
        cnt[0] = c.getOrDefault('z', 0);
        cnt[2] = c.getOrDefault('w', 0);
        cnt[4] = c.getOrDefault('u', 0);
        cnt[6] = c.getOrDefault('x', 0);
        cnt[8] = c.getOrDefault('g', 0);

        cnt[3] = c.getOrDefault('h', 0) - cnt[8];
        cnt[5] = c.getOrDefault('f', 0) - cnt[4];
        cnt[7] = c.getOrDefault('s', 0) - cnt[6];

        cnt[1] = c.getOrDefault('o', 0) - cnt[0] - cnt[2] - cnt[4];

        cnt[9] = c.getOrDefault('i', 0) - cnt[5] - cnt[6] - cnt[8];

        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < cnt[i]; ++j) {
                ans.append((char) (i + '0'));
            }
        }
        return ans.toString();
    }

    //859. 亲密字符串
    //给你两个字符串 s 和 goal ，只要我们可以通过交换 s 中的两个字母得到与 goal 相等的结果，就返回 true ；否则返回 false 。
    //交换字母的定义是：取两个下标 i 和 j （下标从 0 开始）且满足 i != j ，接着交换 s[i] 和 s[j] 处的字符。
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int[] scount = new int[26];
        int[] gcount = new int[26];
        int diffSum = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            int b = goal.charAt(i);
            scount[a]++;
            gcount[b]++;
            if (a != b) {
                diffSum++;
            }
        }
        boolean can = false;
        for (int i = 0; i < 26; i++) {
            if (scount[i] != gcount[i]) {
                return false;
            }
            if (scount[i] >= 2) {
                can = true;
            }
        }
        return diffSum == 2 || (diffSum == 0 && can);
    }

    //384. 打乱数组
    //给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。
    //实现 Solution class:
    //    Solution(int[] nums) 使用整数数组 nums 初始化对象
    //    int[] reset() 重设数组到它的初始状态并返回
    //    int[] shuffle() 返回数组随机打乱后的结果
    class Solution1 {
        int[] nums;
        int[] original;

        public Solution1(int[] nums) {
            this.nums = nums;
            this.original = new int[nums.length];
            System.arraycopy(nums, 0, original, 0, nums.length);
        }

        public int[] reset() {
            System.arraycopy(original, 0, nums, 0, nums.length);
            return nums;
        }

        public int[] shuffle() {
            Random random = new Random();
            for (int i = 0; i < nums.length; i++) {
                int j = i + random.nextInt(nums.length - i);
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
            return nums;
        }
    }

    //字典树
    static class TrieD {
        TrieD[] next;
        Boolean isEnd;

        TrieD() {
            next = new TrieD[26];
            isEnd = false;
        }

        public void insert(String s) {
            TrieD curPos = this;
            for (int i = 0; i < s.length(); i++) {
                int ch = s.charAt(i) - 'a';
                if (curPos.next[ch] == null) {
                    curPos.next[ch] = new TrieD();
                }
                curPos = curPos.next[ch];
            }
            curPos.isEnd = true;
        }
    }

    //    397. 整数替换
    //给定一个正整数 n ，你可以做如下操作：
    //    如果 n 是偶数，则用 n / 2替换 n 。
    //    如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。
    //n 变为 1 所需的最小替换次数是多少？
    public int integerReplacement(int n) {
        //位运算
//        long temp = n;//防止越界
//        int count = 0;
//        while (temp != 1) {
//            if ((temp & 3) == 3 && temp != 3) {
//                temp++;
//            } else if ((temp & 1) == 1) {
//                temp--;
//            } else {
//                temp = temp >> 1;
//            }
//            count++;
//        }
//        return count;
        //递归
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + integerReplacement(n / 2);
        }
        //当 n 为奇数时，我们可以选择将 n增加 111 或减少 111。由于这两种方法都会将n 变为偶数，那么下一步一定是除以 2，因此这里我们可以看成使用两次操作，将 n 变为 (n+1)/2​ 或 (n−1)/2,n可能会溢出，使用n/2 + 1 和 n / 2 计算(n+1)/2​ 或 (n−1)/2
        return 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1));
    }

    //563. 二叉树的坡度
    //给定一个二叉树，计算 整个树 的坡度 。
    //一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值 。如果没有左子树的话，左子树的节点之和为 0 ；没有右子树的话也是一样。空结点的坡度是 0 。
    //整个树 的坡度就是其所有节点的坡度之和。
    int res = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        res += Math.abs(left - right);
        return left + right + root.val;
    }

    //318. 最大单词长度乘积
    //给定一个字符串数组 words，找到 length(word[i]) * length(word[j]) 的最大值，并且这两个单词不含有公共字母。你可以认为每个单词只包含小写字母。如果不存在这样的两个单词，返回 0。
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] mask = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (char c : words[i].toCharArray()) {
                mask[i] |= (1 << c - 'a');
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((mask[i] & mask[j]) == 0) {
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        return res;
    }

    //391. 完美矩形
    //给你一个数组 rectangles ，其中 rectangles[i] = [xi, yi, ai, bi] 表示一个坐标轴平行的矩形。这个矩形的左下顶点是 (xi, yi) ，右上顶点是 (ai, bi) 。
    //如果所有矩形一起精确覆盖了某个矩形区域，则返回 true ；否则，返回 false 。
    public static boolean isRectangleCover(int[][] rectangles) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        int top = Integer.MIN_VALUE;
        int bottom = Integer.MAX_VALUE;
        int sumArea = 0;
        Set<String> points = new HashSet<>();
        for (int[] rec : rectangles) {
            sumArea += (rec[2] - rec[0]) * (rec[3] - rec[1]);
            left = Math.min(left, rec[0]);
            right = Math.max(right, rec[2]);
            top = Math.max(top, rec[3]);
            bottom = Math.min(bottom, rec[1]);
            String lb = rec[0] + "," + rec[1];
            String lt = rec[0] + "," + rec[3];
            String rb = rec[2] + "," + rec[1];
            String rt = rec[2] + "," + rec[3];
            if (!points.contains(lb)) {
                points.add(lb);
            } else {
                points.remove(lb);
            }
            if (!points.contains(lt)) {
                points.add(lt);
            } else {
                points.remove(lt);
            }
            if (!points.contains(rb)) {
                points.add(rb);
            } else {
                points.remove(rb);
            }
            if (!points.contains(rt)) {
                points.add(rt);
            } else {
                points.remove(rt);
            }

        }
        if (points.size() == 4 && points.contains(left + "," + bottom) && points.contains(left + "," + top) && points.contains(right + "," + bottom) && points.contains(right + "," + top)) {
            return sumArea == (right - left) * (top - bottom);
        }
        return false;
    }

    //319. 灯泡开关
    //初始时有 n 个灯泡处于关闭状态。第一轮，你将会打开所有灯泡。接下来的第二轮，你将会每两个灯泡关闭一个。
    //第三轮，你每三个灯泡就切换一个灯泡的开关（即，打开变关闭，关闭变打开）。第 i 轮，你每 i 个灯泡就切换一个灯泡的开关。直到第 n 轮，你只需要切换最后一个灯泡的开关。
    //找出并返回 n 轮后有多少个亮着的灯泡。
    public int bulbSwitch(int n) {
        //首先思考：灯泡i会被按几次？这其实相当于求i有几个因子 比如灯泡8,一共会被按4次，分别是第一轮 第二轮 第四轮 第八轮
        //一开始灯都是灭的，所以如果i有k个因子，且k为奇数，那么最终灯就亮，如果为偶数，灯就灭。 那么问题就转化成了，求1..n每个数分别有几个因子。 最直观的做法就是，枚举i，然后计算i的因子数。怎么计算呢？ 最直观的做法就是枚举j=0..i，count+= i%j==0 ? 1:0; 这里有个优化的点，假如x*y=z，显然z%y==0且z%x==0。 也就是说你只要需要枚举j从到1..根号i，count += i%j==0? 2:0;
        //在写完上面的式子之后你突然可以发现，在根号i的左边每发现一个j使得i%j==0，那么根号i的右边一定存在一个k同样满足i%k==0，一次枚举会把count+2。而我们关心的其实是最终count为奇数还是偶数！！通过枚举，count最终的结果都是偶数，当且仅当 i可以被开根号时，count才会是奇数！
        //然后其实问题转换成了，求数字1..n中有几个数能开更开得尽（结果是整数）
        //想到这里，你就可以一个O(n)的枚举来完成了吗？ 其实还可以优化！
        //想想，在1..n中，假设n等于100，1*1 2*2 3*3 4*4 ... 10*10的结果都小于等于100，换句话说，1*1 ... 根号n*根号n 都<= n，所以求1..n里有几个开根号能开尽的数，其实就是求根号n向下取整等于几。
        //所以最终答案就是 (n as f64).sqrt().floor() as i32
        //还能优化不？ 当然还可以！
        //求n开根号怎么求，有大量的论文可以参考，它们收敛速度能比语言自带的sqrt还快！

        return (int) Math.sqrt(n);
    }

    //    375. 猜数字大小 II
//    我们正在玩一个猜数游戏，游戏规则如下：
//    我从 1 到 n 之间选择一个数字。
//    你来猜我选了哪个数字。
//    如果你猜到正确的数字，就会 赢得游戏 。
//    如果你猜错了，那么我会告诉你，我选的数字比你的 更大或者更小 ，并且你需要继续猜数。
//    每当你猜了数字 x 并且猜错了的时候，你需要支付金额为 x 的现金。如果你花光了钱，就会 输掉游戏 。
//    给你一个特定的数字 n ，返回能够 确保你获胜 的最小现金数，不管我选择那个数字 。
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + 1; j <= n; j++) {
                int miniCost = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = k + Math.max(dp[i][k - 1], dp[k + 1][j]);
                    miniCost = Math.min(miniCost, cost);
                }
                dp[i][j] = miniCost;
            }
        }
        return dp[1][n];
    }

    //629. K个逆序对数组
//    给出两个整数 n 和 k，找出所有包含从 1 到 n 的数字，且恰好拥有 k 个逆序对的不同的数组的个数。
    //逆序对的定义如下：对于数组的第i个和第 j个元素，如果满i < j且 a[i] > a[j]，则其为一个逆序对；否则不是。
    //由于答案可能很大，只需要返回 答案 mod 109 + 7 的值。
    public int kInversePairs(int n, int k) {
        int mod = (int) 1e9 + 7;
        int[][] f = new int[n + 1][k + 1];
        int[][] sum = new int[n + 1][k + 1];
        f[1][0] = 1;
        Arrays.fill(sum[1], 1);
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                f[i][j] = j < i ? sum[i - 1][j] : (sum[i - 1][j] - sum[i - 1][j - (i - 1) - 1] + mod) % mod;
                sum[i][j] = j == 0 ? f[i][j] : (sum[i][j - 1] + f[i][j]) % mod;
            }
        }
        return f[n][k];
    }

    //495. 提莫攻击
//    给你一个 非递减 的整数数组 timeSeries ，其中 timeSeries[i] 表示提莫在 timeSeries[i] 秒时对艾希发起攻击，以及一个表示中毒持续时间的整数 duration 。
//    返回艾希处于中毒状态的 总 秒数。
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int end = 0;
        int res = 0;
        for (int time : timeSeries) {
            if (time >= end) {
                res += duration;
            } else {
                res += time + duration - end;
            }
            end = time + duration;
        }
        return res;
    }

    //    299. 猜数字游戏
//    你在和朋友一起玩 猜数字（Bulls and Cows）游戏，该游戏规则如下：
//    写出一个秘密数字，并请朋友猜这个数字是多少。朋友每猜测一次，你就会给他一个包含下述信息的提示：
//    猜测数字中有多少位属于数字和确切位置都猜对了（称为 "Bulls", 公牛），
//    有多少位属于数字猜对了但是位置不对（称为 "Cows", 奶牛）。也就是说，这次猜测中有多少位非公牛数字可以通过重新排列转换成公牛数字。
//    给你一个秘密数字 secret 和朋友猜测的数字 guess ，请你返回对朋友这次猜测的提示。
//    提示的格式为 "xAyB" ，x 是公牛个数， y 是奶牛个数，A 表示公牛，B 表示奶牛。
//    请注意秘密数字和朋友猜测的数字都可能含有重复数字。
    public String getHint(String secret, String guess) {
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        int bulls = 0, cows = 0;
//        boolean[] visited = new boolean[guess.length()];
//        for (int i = 0; i < secret.length(); i++) {
//            if (secret.charAt(i) == guess.charAt(i)) {
//                bulls++;
//                visited[i] = true;
//                continue;
//            }
//            hashMap.put(secret.charAt(i), hashMap.getOrDefault(secret.charAt(i), 0) + 1);
//        }
//        for (int i = 0; i < guess.length(); i++) {
//            if (!visited[i]) {
//                Integer tmp = hashMap.getOrDefault(guess.charAt(i), 0);
//                if (tmp != 0) {
//                    cows++;
//                    tmp--;
//                    hashMap.put(guess.charAt(i), tmp);
//                }
//            }
//        }
//        return bulls + "A" + cows + "B";
        int bulls = 0, cows = 0;
        int[] s = new int[10];
        int[] g = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                ++s[secret.charAt(i) - '0'];
                ++g[guess.charAt(i) - '0'];
            }
        }
        for (int i = 0; i < 10; i++) {
            cows += Math.min(s[i], g[i]);
        }
        return bulls + "A" + cows + "B";
    }

    //1218. 最长定差子序列
//    给你一个整数数组 arr 和一个整数 difference，请你找出并返回 arr 中最长等差子序列的长度，该子序列中相邻元素之间的差等于 difference 。
//    子序列 是指在不改变其余元素顺序的情况下，通过删除一些元素或不删除任何元素而从 arr 派生出来的序列。
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int res = 0;
        for (int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num - difference, 0) + 1);
            res = Math.max(res, hashMap.get(num));
        }
        return res;
    }

    //    367. 有效的完全平方数
//    给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
//    进阶：不要 使用任何内置的库函数，如  sqrt 。
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid > num) {
                right = mid - 1;
            } else if (mid * mid < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    //407. 接雨水 II
//    给你一个 m x n 的矩阵，其中的值均为非负整数，代表二维高度图每个单元的高度，请计算图中形状最多能接多少体积的雨水。
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        if (m <= 2 || n <= 2) {
            return 0;
        }
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    queue.offer(new int[]{i * n + j, heightMap[i][j]});
                    visited[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = cur[0] / n + dir[i][0];
                int y = cur[0] % n + dir[i][1];
                if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y]) {
                    if (cur[1] > heightMap[x][y]) {
                        res += cur[1] - heightMap[x][y];
                    }
                    queue.offer(new int[]{x * n + y, Math.max(heightMap[x][y], cur[1])});
                    visited[x][y] = true;
                }
            }
        }
        return res;
    }

    //237. 删除链表中的节点
//    请编写一个函数，用于 删除单链表中某个特定节点 。在设计函数时需要注意，你无法访问链表的头节点 head ，只能直接访问 要被删除的节点 。
//    题目数据保证需要删除的节点 不是末尾节点 。
    public void deleteNode(ListNode node) {
//        while (node.next.next != null){
//            node.val = node.next.val;
//            node = node.next;
//        }
//        node.val= node.next.val;
//        node.next = null;
        node.val = node.next.val;
        node.next = node.next.next;
    }

    //575. 分糖果
//    给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
    public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = candyType.length;
        for (int type : candyType) {
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        return Math.min(map.size(), n / 2);
    }

    //    335. 路径交叉
//    给你一个整数数组 distance 。
//    从 X-Y 平面上的点 (0,0) 开始，先向北移动 distance[0] 米，然后向西移动 distance[1] 米，向南移动 distance[2] 米，向东移动 distance[3] 米，持续移动。也就是说，每次移动后你的方位会发生逆时针变化。
//    判断你所经过的路径是否相交。如果相交，返回 true ；否则，返回 false 。
    public boolean isSelfCrossing(int[] distance) {
        int n = distance.length;
        for (int i = 3; i < n; i++) {
            if (distance[i] >= distance[i - 2] && distance[i - 1] <= distance[i - 3]) {
                return true;
            }
            if (i == 4 && (distance[3] == distance[1] && distance[4] + distance[0] >= distance[2])) {
                return true;
            }
            if (i >= 5 && (distance[i - 3] - distance[i - 5] <= distance[i - 1])
                    && distance[i - 3] >= distance[i - 1]
                    && distance[i] >= distance[i - 2] - distance[i - 4]
                    && distance[i - 2] >= distance[i - 4]) {
                return true;
            }
        }
        return false;
    }

    //869. 重新排序得到 2 的幂
//    给定正整数 N ，我们按任何顺序（包括原始顺序）将数字重新排序，注意其前导数字不能为零。
//    如果我们可以通过上述方式得到 2 的幂，返回 true；否则，返回 false。
    public static boolean reorderedPowerOf2(int n) {
        Set<String> setOfPowerOf2 = new HashSet<>();
        for (int i = 1; i < 1e9; i *= 2) {
            char[] nchar = String.valueOf(i).toCharArray();
            Arrays.sort(nchar);
            setOfPowerOf2.add(new String(nchar));
        }
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        return setOfPowerOf2.contains(new String(chars));
    }

    //301. 删除无效的括号
//    给你一个由若干括号和字母组成的字符串 s ，删除最小数量的无效括号，使得输入的字符串有效。
//    返回所有可能的结果。答案可以按 任意顺序 返回。
    public static List<String> removeInvalidParentheses(String s) {
        List<String> res = new LinkedList<>();
        int lremove = 0;
        int rremove = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                lremove++;
            } else if (s.charAt(i) == ')') {
                if (lremove == 0) {
                    rremove++;
                } else {
                    lremove--;
                }
            }
        }
        dfs(res, s, 0, 0, 0, lremove, rremove);
        return res;
    }

    public static void dfs(List<String> res, String str, int start, int lcount, int rcount, int lremove, int rremove) {
        if (lremove == 0 && rremove == 0) {
            if (isValidStr(str)) {
                res.add(str);
            }
            return;
        }
        for (int i = start; i < str.length(); i++) {
            if (i != start && str.charAt(i) == str.charAt(i - 1)) {
                if (str.charAt(i) == '(') {
                    lcount++;
                } else if (str.charAt(i) == ')') {
                    rcount++;
                }
                if (rcount > lcount) {
                    break;
                }
                continue;
            }
            if (lremove + rremove > str.length() - i) {
                return;
            }
            if (lremove > 0 && str.charAt(i) == '(') {
                dfs(res, str.substring(0, i) + str.substring(i + 1), i, lcount, rcount, lremove - 1, rremove);
            }

            if (rremove > 0 && str.charAt(i) == ')') {
                dfs(res, str.substring(0, i) + str.substring(i + 1), i, lcount, rcount, lremove, rremove - 1);
            }

            if (str.charAt(i) == '(') {
                lcount++;
            } else if (str.charAt(i) == ')') {
                rcount++;
            }
            if (rcount > lcount) {
                break;
            }
        }

    }

    public static boolean isValidStr(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                if (count == 0) {
                    return false;
                } else {
                    count--;
                }
            }
        }
        return count == 0;
    }

    //496. 下一个更大元素 I
    //给你两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。
    //请你找出 nums1 中每个元素在 nums2 中的下一个比其大的值。
    //nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!stack.isEmpty() && num >= stack.peek()) {
                stack.pop();
            }
            hashMap.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = hashMap.get(nums1[i]);
        }
        return res;
    }


    //240. 搜索二维矩阵 II
    //编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
    //    每行的元素从左到右升序排列。
    //    每列的元素从上到下升序排列。
    public boolean searchMatrix(int[][] matrix, int target) {
        //按行二分
//        for(int[] row : matrix){
//            int low = 0, high = row.length - 1;
//            while (low <= high){
//                int mid = low + (high - low) / 2;
//                if(row[mid] > target){
//                    high = mid - 1;
//                }else if(row[mid] < target){
//                    low = mid + 1;
//                }else {
//                    return true;
//                }
//            }
//        }
//        return false;

        //Z字查找
        int row = matrix.length;
        int col = matrix[0].length;
        int x = 0, y = col - 1;
        while (x < row && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] > target) {
                y--;
            } else {
                x++;
            }
        }
        return false;
    }

    //229. 求众数 II
    //给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
    public static List<Integer> majorityElement(int[] nums) {
        int num1 = 0, num2 = 0;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count1 > 0 && num1 == nums[i]) {
                count1++;
            } else if (count2 > 0 && num2 == nums[i]) {
                count2++;
            } else if (count1 == 0) {
                num1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                num2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        int cnt1 = 0, cnt2 = 0;
        for (int num : nums) {
            if (count1 > 0 && num == num1) {
                cnt1++;
            }
            if (count2 > 0 && num == num2) {
                cnt2++;
            }
        }
        List<Integer> res = new ArrayList<>();
        if (cnt1 > nums.length / 3) {
            res.add(num1);
        }
        if (cnt2 > nums.length / 3) {
            res.add(num2);
        }
        return res;
    }

    //66. 加一
    //给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
    //最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    //你可以假设除了整数 0 之外，这个整数不会以零开头。
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    //    453. 最小操作次数使数组元素相等
//给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。
    public int minMoves(int[] nums) {
        //每次操作会使n-1个元素+1，相当于使1个元素-1，每次减一，因此只需要计算每个元素与最小元素间的差值和
        int min = Arrays.stream(nums).min().getAsInt();
        int sum = 0;
        for (int num : nums) {
            sum += num - min;
        }
        return sum;
    }

    //211. 添加与搜索单词 - 数据结构设计
    //请你设计一个数据结构，支持 添加新单词 和 查找字符串是否与任何先前添加的字符串匹配 。
//实现词典类 WordDictionary ：
//    WordDictionary() 初始化词典对象
//    void addWord(word) 将 word 添加到数据结构中，之后可以对它进行匹配
//    bool search(word) 如果数据结构中存在字符串与 word 匹配，则返回 true ；否则，返回  false 。word 中可能包含一些 '.' ，每个 . 都可以表示任何一个字母。
    class WordDictionary {
        TrieD root;

        public WordDictionary() {
            root = new TrieD();
        }

        public void addWord(String word) {
            root.insert(word);
        }

        public boolean search(String word) {
            return dfs(0, word, root);
        }

        public boolean dfs(int index, String word, TrieD node) {
            if (index == word.length()) {
                return node.isEnd;
            }
            char ch = word.charAt(index);
            if (Character.isLetter(ch)) {
                int chInt = ch - 'a';
                TrieD next = node.next[chInt];
                if (next != null && dfs(index + 1, word, next)) {
                    return true;
                }
            } else {
                for (int i = 0; i < 26; i++) {
                    TrieD next = node.next[i];
                    if (next != null && dfs(index + 1, word, next)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    //476. 数字的补数
    //给你一个 正 整数 num ，输出它的补数。补数是对该数的二进制表示取反。
    public static int findComplement(int num) {
//        int highestBit = 0;//没有前导零位，找出最高位的1，然后依次取反
//        for(int i = 1; i < 31; i++){
//            if(num >= 1 << i){
//                highestBit = i;
//            }else {
//                break;
//            }
//        }
//        //2^(highest+1)-1,表示每一位都为1的highest+1位的二进制数，将num与其异或即可讲num从highest位开始每一位取反
//        //如果highest==30,会产生溢出，取掩码为0x7FFFFFFF
//        int mask = highestBit == 30 ? 0x7FFFFFFF:((1 <<(highestBit + 1)) - 1);
//        return num ^ mask;

//        int n = num;
//        n |= n >>> 1;
//        n |= n >>> 2;
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
//        return n ^ num;
        int n = -1 >>> Integer.numberOfLeadingZeros(num);
        return n ^ num;
    }

    //38. 外观数列
    //给定一个正整数 n ，输出外观数列的第 n 项。
    //「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
    //你可以将其视作是由递归公式定义的数字字符串序列：
    //    countAndSay(1) = "1"
    //    countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
    //前五项如下：
    //1.     1
    //2.     11
    //3.     21
    //4.     1211
    //5.     111221
    //第一项是数字 1
    //描述前一项，这个数是 1 即 “ 一 个 1 ”，记作 "11"
    //描述前一项，这个数是 11 即 “ 二 个 1 ” ，记作 "21"
    //描述前一项，这个数是 21 即 “ 一 个 2 + 一 个 1 ” ，记作 "1211"
    //描述前一项，这个数是 1211 即 “ 一 个 1 + 一 个 2 + 二 个 1 ” ，记作 "111221"
    //要 描述 一个数字字符串，首先要将字符串分割为 最小 数量的组，每个组都由连续的最多 相同字符 组成。然后对于每个组，先描述字符的数量，然后描述字符，形成一个描述组。要将描述转换为数字字符串，先将每组中的字符数量用数字替换，再将所有描述组连接起来。
    public String countAndSay(int n) {
        //递归
//        if (n == 1) {
//            return "1";
//        }
//        String pre = countAndSay(n - 1);
//        StringBuilder sb = new StringBuilder();
//        int length = pre.length();
//        int pos = 0, start = 0;
//        while (pos < length) {
//            while (pos < length && pre.charAt(pos) == pre.charAt(start)) {
//                pos++;
//            }
//            sb.append(Integer.toString(pos - start)).append(pre.charAt(start));
//            start = pos;
//        }
//        return sb.toString();

        //遍历
        String str = "1";
        for (int i = 2; i <= n; ++i) {
            StringBuilder sb = new StringBuilder();
            int start = 0;
            int pos = 0;

            while (pos < str.length()) {
                while (pos < str.length() && str.charAt(pos) == str.charAt(start)) {
                    pos++;
                }
                sb.append(Integer.toString(pos - start)).append(str.charAt(start));
                start = pos;
            }
            str = sb.toString();
        }
        return str;
    }

    //剑指 Offer II 069. 山峰数组的顶部
    //符合下列属性的数组 arr 称为 山峰数组（山脉数组） ：
    //    arr.length >= 3
    //    存在 i（0 < i < arr.length - 1）使得：
    //        arr[0] < arr[1] < ... arr[i-1] < arr[i]
    //        arr[i] > arr[i+1] > ... > arr[arr.length - 1]
    //给定由整数组成的山峰数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i ，即山峰顶部。
    public int peakIndexInMountainArray(int[] arr) {
        //顺序一次遍历
//        int n = arr.length;
//        int result = -1;
//        for (int i = 0; i < n - 1; i++) {
//            if(arr[i] > arr[i + 1]){
//                result = i;
//                break;
//            }
//        }
//        return result;
        //二分
        int n = arr.length;
        int result = -1;
        int left = 1, right = n - 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    //412. Fizz Buzz
//    写一个程序，输出从 1 到 n 数字的字符串表示。
//            1. 如果 n 是3的倍数，输出“Fizz”；
//            2. 如果 n 是5的倍数，输出“Buzz”；
//            3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
    public List<String> fizzBuzz(int n) {
        List<String> ans = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            ans.add(sb.toString());
        }
        return ans;
    }

    //适用范围：快速计算a*b % mod的结果（主要目的是换乘法为加法，防止爆数据），或者快速计算a^b % mod 的结果，时间复杂度大大降低。
    //算法描述：首先你可能会问a*b不是直接乘就出来了么，为什么需要快速算法？但是乘法在计算机中处理的时间并不是这么快的，也要拆分为加法来做的。所以快速乘法会更快的计算a*b的结果，而且a*b%mod可能还没取模就已经爆long long，但快速乘法却不会。快速幂也是同样的道理。
    //实现的原理都是基于按照二进制位一步一步乘来避免重复的操作，利用前面的中间结果，从而实现快速的目的。
    //对于乘数b来说，势必可以拆成2进制，比如110101。有一些位为0，有一些位为1。根据乘法分配律：a*b=a*（b1+b2+b3+…… ）
    //那么对于a*53 = a*110101（二进制）= a*（100000+10000+100+1）=a*（100000*1+10000*1+1000*0+100*1+10*0+1*1）。
    //那么设立一个ans=0用于保存答案，每一位让a*=2，在根据b的对应为1看是不是加上此时的a，即可完成快速运算。比如刚才的例子让a=5，运转流程如下。

    //快速乘
    public static int quickMul(int x, int y) {
        int ans = 0;
        while (y != 0) {
            if ((y & 1) == 1) {
                ans += x;
            }
            y = y >> 1;
            x += x;
        }
        return ans;
    }

    //快速幂
    public static int quickPow(int x, int y) {
        int ans = 0;
        while (y != 0) {
            if ((y & 1) == 1) {
                ans = quickMul(ans, x); //ans *= x;
            }
            y = y >> 1;
            x = quickMul(x, x);//x *= x;
        }
        return ans;
    }

    //29. 两数相除
    //给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
    //返回被除数 dividend 除以除数 divisor 得到的商。
    //整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
    //被除数和除数均为 32 位有符号整数。
    //除数不为 0。
    //假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^ 31 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
    int MIN = Integer.MIN_VALUE;
    int MAX = Integer.MAX_VALUE;

    public int divide(int dividend, int divisor) {
        if (dividend == MIN) {
            if (divisor == 1) {
                return MIN;
            }
            if (divisor == -1) {
                return MAX;
            }
        }
        if (divisor == MIN) {
            return dividend == MIN ? 1 : 0;
        }
        if (dividend == 0) {
            return 0;
        }
        boolean revers = false;
        if (dividend > 0) {
            dividend = -dividend;
            revers = !revers;
        }
        if (divisor > 0) {
            divisor = -divisor;
            revers = !revers;
        }
        //通过二分查找，找到mid,使得 mid * divisor >= dividend
        int left = 1, right = MAX, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) >> 1;
            //使用快速乘判断mid * divisor >= dividend是否成立
            boolean check = quickAdd(dividend, mid, divisor);
            if (check) {
                ans = mid;
                if (mid == MAX) {
                    break;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return revers ? -ans : ans;
    }

    public boolean quickAdd(int dividend, int x, int divisor) {
        //dividend , divisor 为负数， x为正数
        //判断 x * divisor >= dividend 是否成立
        int result = 0;
        while (x >= 0) {
            if ((x & 1) != 0) {
                if (result < dividend - divisor) {
                    return false;
                }
                result += divisor;
            }
            if (x != 1) {
                if (divisor < x - divisor) {
                    return false;
                }
                divisor += divisor;
            }
            x >>= 1;
        }
        return true;
    }


    //273. 整数转换英文表示
    //将非负整数 num 转换为其对应的英文表示。
    String[] singles = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] teen = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] teenty = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thous = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 3, mod = 1000000000; i >= 0; i--, mod /= 1000) {
            int tmpNum = num / mod;
            if (tmpNum != 0) {
                num -= tmpNum * mod;
                res.append(num2Eng(tmpNum)).append(thous[i]).append(" ");
            }
        }
        return res.toString().trim();
    }

    public String num2Eng(int num) {
        StringBuilder res = new StringBuilder();
        int hundred = num / 100;
        num %= 100;
        if (hundred != 0) {
            res.append(singles[hundred - 1]).append(" hundred ");
        }
        int ten = num / 10;
        if (ten >= 2) {
            res.append(teenty[ten - 2]).append(" ");
            num %= 10;
        }
        if (num > 0 && num < 10) {
            res.append(singles[num - 1]).append(" ");
        } else if (num >= 10) {
            res.append(teen[num - 10]).append(" ");
        }
        return res.toString();
    }

    //352. 将数据流变为多个不相交区间
    // 给你一个由非负整数 a1, a2, ..., an 组成的数据流输入，请你将到目前为止看到的数字总结为不相交的区间列表。
    //实现 SummaryRanges 类：
    //    SummaryRanges() 使用一个空数据流初始化对象。
    //    void addNum(int val) 向数据流中加入整数 val 。
    //    int[][] getIntervals() 以不相交区间 [starti, endi] 的列表形式返回对数据流中整数的总结。
    class SummaryRanges {
        TreeMap<Integer, Integer> map;//有序集合维护区间

        public SummaryRanges() {
            map = new TreeMap<>();
        }

        public void addNum(int val) {
            //查找val的左右边界区间
            Map.Entry<Integer, Integer> r = map.ceilingEntry(val + 1);
            Map.Entry<Integer, Integer> l = map.floorEntry(val);
            if (l != null && val >= l.getKey() && val <= l.getValue()) {//val在左边界区间内
                return;
            } else {
                boolean la = (l != null && l.getValue() + 1 == val);
                boolean ra = (r != null && r.getKey() - 1 == val);
                if (la && ra) {//val刚好大于左区间的上界限，小于右区间的下界限，合并左右区间
                    map.remove(l.getKey());
                    map.remove(r.getKey());
                    map.put(l.getKey(), r.getValue());
                } else if (la) {//val刚好大于左区间的上界限，将val并入左区间
                    map.put(l.getKey(), val);
                } else if (ra) {//val刚好小于右区间的下界限，将val并入右区间
                    map.remove(r.getKey());
                    map.put(val, r.getValue());
                } else {//val单独作为一个区间
                    map.put(val, val);
                }
            }
        }

        public int[][] getIntervals() {
            int size = map.size();
            int[][] res = new int[size][2];
            int index = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                res[index][0] = entry.getKey();
                res[index][1] = entry.getValue();
                index++;
            }
            return res;
        }
    }

    //187. 重复的DNA序列
    //所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
    //编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new LinkedList<>();
        int n = s.length();
        if (n <= 10) {
            return res;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
//        for(int i = 0; i + 10 <= n; i++){
//            String sub = s.substring(i, i + 10);
//            hashMap.put(sub, hashMap.getOrDefault(sub, 0) + 1);
//        }
//        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
//            if(entry.getValue() > 1){
//                res.add(entry.getKey());
//            }
//        }
        for (int i = 0; i + 10 <= n; i++) {
            String sub = s.substring(i, i + 10);
            int count = hashMap.getOrDefault(sub, 0);
            if (count == 1) {
                res.add(sub);
            }
            hashMap.put(sub, count + 1);
        }
        return res;
    }

    //223. 矩形面积
    //给你 二维 平面上两个 由直线构成的 矩形，请你计算并返回两个矩形覆盖的总面积。
    //每个矩形由其 左下 顶点和 右上 顶点坐标表示：
    //    第一个矩形由其左下顶点 (ax1, ay1) 和右上顶点 (ax2, ay2) 定义。
    //    第二个矩形由其左下顶点 (bx1, by1) 和右上顶点 (bx2, by2) 定义。
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int rectangle1 = (ax2 - ax1) * (ay2 - ay1);
        int rectangle2 = (bx2 - bx1) * (by2 - by1);
        int w = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int h = Math.min(ay2, by2) - Math.max(ay1, by1);
        int rectangle = Math.max(w, 0) * Math.max(h, 0);
        return rectangle1 + rectangle2 - rectangle;
    }

    //517. 超级洗衣机
    //假设有 n 台超级洗衣机放在同一排上。开始的时候，每台洗衣机内可能有一定量的衣服，也可能是空的。
    //在每一步操作中，你可以选择任意 m (1 <= m <= n) 台洗衣机，与此同时将每台洗衣机的一件衣服送到相邻的一台洗衣机。
    //给定一个整数数组 machines 代表从左至右每台洗衣机中的衣物数量，请给出能让所有洗衣机中剩下的衣物的数量相等的 最少的操作步数 。如果不能使每台洗衣机中衣物的数量相等，则返回 -1 。
    public int findMinMoves(int[] machines) {
        int n = machines.length;
        int sum = Arrays.stream(machines).sum();
        if (sum % n != 0) {
            return -1;
        }
        int avg = sum / n;
        int result = 0;
        int ls = 0;
        int rs = sum;
        for (int i = 0; i < n; i++) {
            rs -= machines[i];
            int a = Math.max(avg * i - ls, 0);
            int b = Math.max((n - i - 1) * avg - rs, 0);
            result = Math.max(result, a + b);
            ls += machines[i];
        }
        return result;
    }

    //437. 路径总和 III
    //给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
    //路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
    public int pathSum(TreeNode root, int targetSum) {
        //dfs
//        if (root == null){
//            return 0;
//        }
//        int result = dfs(root, targetSum);
//        result += pathSum(root.left, targetSum);
//        result += pathSum(root.right, targetSum);
//        return result;

        //前缀和
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        return dfs(root, preSum, targetSum, 0);
    }

    public int dfs(TreeNode root, Map<Integer, Integer> preSum, int targetSum, int currSum) {
        if (root == null) {
            return 0;
        }
        int ret = 0;
        currSum += root.val;

        ret = preSum.getOrDefault(currSum - targetSum, 0);
        preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);
        ret += dfs(root.left, preSum, targetSum, currSum);
        ret += dfs(root.right, preSum, targetSum, currSum);
        preSum.put(currSum, preSum.getOrDefault(currSum, 0) - 1);
        return ret;
    }

    public int dfs(TreeNode root, int targetSum) {
        int ret = 0;
        if (root == null) {
            return 0;
        }
        int val = root.val;
        if (targetSum == val) {
            ret++;
        }
        ret += dfs(root.left, targetSum - val);
        ret += dfs(root.right, targetSum - val);
        return ret;
    }

    //430. 扁平化多级双向链表
    //多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
    //给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    public Node dfs(Node head) {
        Node cur = head;
        Node last = null;
        while (cur != null) {
            Node next = cur.next;
            if (cur.child == null) {
                last = cur;
            } else {
                Node childLast = dfs(cur.child);
                cur.next = cur.child;
                cur.child.prev = cur;
                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }
                cur.child = null;
                last = childLast;
            }
            cur = next;
        }
        return last;
    }

    //639. 解码方法 II
    public int numDecodings(String s) {
        int MOD = 1000000007;
        int n = s.length();
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = (dp[i - 1] * oneChar(s.charAt(i - 1))) % MOD;
            if (i > 1) {
                dp[i] = (dp[i] + dp[i - 2] * twoChar(s.charAt(i - 2), s.charAt(i - 1))) % MOD;
            }
        }
        return (int) dp[n];
    }

    public int oneChar(char ch) {
        return ch == '0' ? 0 : (ch == '*' ? 9 : 1);
    }

    public int twoChar(char ch1, char ch2) {
        if (ch1 == '*' && ch2 == '*') {
            return 15;
        }
        if (ch1 == '*') {
            return ch2 <= '6' ? 2 : 1;
        }
        if (ch2 == '*') {
            if (ch1 == '1') {
                return 9;
            }
            if (ch1 == '2') {
                return 6;
            }
            return 0;
        }

        int twoSum = (ch1 - '0') * 10 + (ch2 - '0');
        if (twoSum >= 10 && twoSum <= 26) {
            return 1;
        }
        return 0;
    }

    //371. 两整数之和
    //给你两个整数 a 和 b ，不使用 运算符 + 和 - ​​​​​​​，计算并返回两整数之和。
    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

    //    326. 3的幂
    //给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
    //整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    //725. 分隔链表
    //给你一个头结点为 head 的单链表和一个整数 k ，请你设计一个算法将链表分隔为 k 个连续的部分。
    //每部分的长度应该尽可能的相等：任意两部分的长度差距不能超过 1 。这可能会导致有些部分为 null 。
    //这 k 个部分应该按照在链表中出现的顺序排列，并且排在前面的部分的长度应该大于或等于排在后面的长度。
    //返回一个由上述 k 部分组成的数组。
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int n = 0;
        ListNode headTmp = head;
        while (headTmp != null) {
            n++;
            headTmp = headTmp.next;
        }
        int quotient = n / k;
        int remainder = n % k;
        ListNode cur = head;
        for (int i = 0; i < k && cur != null; i++) {
            result[i] = cur;
            int length = quotient + (i < remainder ? 1 : 0);
            while (--length > 0) {
                cur = cur.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return result;
    }

    //212. 单词搜索 II
    //给定一个 m x n 二维字符网格 board 和一个单词（字符串）列表 words，找出所有同时在二维网格和字典中出现的单词。
    //单词必须按照字母顺序，通过 相邻的单元格 内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。
    static class Trie {//字典树
        String word;
        Map<Character, Trie> child;

        public Trie() {
            this.word = "";
            this.child = new HashMap<>();
        }

        public void insert(String word) {
            int n = word.length();
            Trie cur = this;
            for (int i = 0; i < n; i++) {
                char c = word.charAt(i);
                if (!cur.child.containsKey(c)) {
                    cur.child.put(c, new Trie());
                }
                cur = cur.child.get(c);
            }
            cur.word = word;
        }
    }

    static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                dfs(board, trie, i, j, ans);
            }
        }
        return new ArrayList<>(ans);
    }

    public static void dfs(char[][] board, Trie now, int i1, int j1, Set<String> ans) {
        if (!now.child.containsKey(board[i1][j1])) {
            return;
        }
        char ch = board[i1][j1];
        now = now.child.get(ch);
        if (!"".equals(now.word)) {
            ans.add(now.word);
        }

        board[i1][j1] = '#';
        for (int[] dir : dirs) {
            int i2 = i1 + dir[0], j2 = j1 + dir[1];
            if (i2 >= 0 && i2 < board.length && j2 >= 0 && j2 < board[0].length) {
                dfs(board, now, i2, j2, ans);
            }
        }
        board[i1][j1] = ch;
    }

    //剑指 Offer 22. 链表中倒数第k个节点
//    输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
//    例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //165. 比较版本号
    //给你两个版本号 version1 和 version2 ，请你比较它们。
    //版本号由一个或多个修订号组成，各修订号由一个 '.' 连接。每个修订号由 多位数字 组成，可能包含 前导零 。每个版本号至少包含一个字符。修订号从左到右编号，下标从 0 开始，最左边的修订号下标为 0 ，下一个修订号下标为 1 ，以此类推。例如，2.5.33 和 0.1 都是有效的版本号。
    //比较版本号时，请按从左到右的顺序依次比较它们的修订号。比较修订号时，只需比较 忽略任何前导零后的整数值 。也就是说，修订号 1 和修订号 001 相等 。如果版本号没有指定某个下标处的修订号，则该修订号视为 0 。例如，版本 1.0 小于版本 1.1 ，因为它们下标为 0 的修订号相同，而下标为 1 的修订号分别为 0 和 1 ，0 < 1 。
    //返回规则如下：
    //    如果 version1 > version2 返回 1，
    //    如果 version1 < version2 返回 -1，
    //    除此之外返回 0。
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for (int i = 0; i < v1.length || i < v2.length; i++) {
            int x1 = 0;
            int x2 = 0;
            if (i < v1.length) {
                x1 = Integer.valueOf(v1[i]);
            }
            if (i < v2.length) {
                x2 = Integer.valueOf(v2[i]);
            }
            if (x1 < x2) {
                return -1;
            } else if (x1 > x2) {
                return 1;
            }
        }
        return 0;
    }

    //1109. 航班预订统计
    //这里有 n 个航班，它们分别从 1 到 n 进行编号。
    //有一份航班预订表 bookings ，表中第 i 条预订记录 bookings[i] = [firsti, lasti, seatsi] 意味着在从 firsti 到 lasti （包含 firsti 和 lasti ）的 每个航班 上预订了 seatsi 个座位。
    //请你返回一个长度为 n 的数组 answer，其中 answer[i] 是航班 i 上预订的座位总数。
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for (int[] booking : bookings) {
            result[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                result[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; i++) {
            result[i] += result[i - 1];
        }
        return result;
    }

    //528. 按权重随机选择
    //给定一个正整数数组 w ，其中 w[i] 代表下标 i 的权重（下标从 0 开始），请写一个函数 pickIndex ，它可以随机地获取下标 i，选取下标 i 的概率与 w[i] 成正比。
    //例如，对于 w = [1, 3]，挑选下标 0 的概率为 1 / (1 + 3) = 0.25 （即，25%），而选取下标 1 的概率为 3 / (1 + 3) = 0.75（即，75%）。
    //也就是说，选取下标 i 的概率为 w[i] / sum(w) 。
    static class Solution {
//        int totalWeight;
//        int n;
//        int[] ins;
//        public Solution(int[] w) {
//            n = w.length;
//            ins = w;
//            for(int i : w){
//                totalWeight += i;
//            }
//        }
//
//        public int pickIndex() {
//            ThreadLocalRandom random =  ThreadLocalRandom.current();
//            int offset = random.nextInt(totalWeight);
//            for(int i = 0; i < n; i++){
//                offset -= ins[i];
//                if(offset < 0) {
//                    return i;
//                }
//            }
//            return 0;
//        }
        //前缀+二分

        int[] pre;
        int total;

        public Solution(int[] w) {
            pre = new int[w.length];
            pre[0] = total = w[0];
            for (int i = 1; i < w.length; i++) {
                pre[i] = pre[i - 1] + w[i];
                total += w[i];
            }
        }

        public int pickIndex() {
            int x = (int) (Math.random() * total) + 1;
            int left = 0;
            int right = pre.length - 1;
            while (left < right) {
                int mid = (right - left) / 2 + left;
                if (pre[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }

    //295. 数据流的中位数
    //中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。
    //例如，
    //[2,3,4] 的中位数是 3
    //[2,3] 的中位数是 (2 + 3) / 2 = 2.5
    //设计一个支持以下两种操作的数据结构：
    //    void addNum(int num) - 从数据流中添加一个整数到数据结构中。
    //    double findMedian() - 返回目前所有元素的中位数。
    class MedianFinder {
        PriorityQueue<Integer> queueMin;
        PriorityQueue<Integer> queueMax;

        /**
         * initialize your data structure here.
         */
        public MedianFinder() {
            queueMin = new PriorityQueue<Integer>((a, b) -> (b - a));
            queueMax = new PriorityQueue<Integer>((a, b) -> (a - b));
        }

        public void addNum(int num) {
            if (queueMin.isEmpty() || num <= queueMin.peek()) {
                queueMin.offer(num);
                if (queueMin.size() > queueMax.size() + 1) {
                    queueMax.offer(queueMin.poll());
                }
            } else {
                queueMax.offer(num);
                if (queueMax.size() > queueMin.size()) {
                    queueMin.offer(queueMax.poll());
                }
            }
        }

        public double findMedian() {
            if (queueMin.size() > queueMax.size()) {
                return queueMin.peek();
            }
            return (queueMin.peek() + queueMax.peek()) / 2.0;
        }
    }

    //881. 救生艇
    //第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。
    //每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。
    //返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
    public static int numRescueBoats(int[] people, int limit) {
        int result = 0;
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                ++left;
            }
            --right;
            ++result;
        }
        return result;
    }

    //797. 所有可能的路径
//    给你一个有 n 个节点的 有向无环图（DAG），请你找出所有从节点 0 到节点 n-1 的路径并输出（不要求按特定顺序）
//    二维数组的第 i 个数组中的单元都表示有向图中 i 号节点所能到达的下一些节点，空就是没有下一个结点了。
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = graph.length;
        stack.push(0);
        dfs(graph, result, stack, 0, n);
        return result;
    }

    public static void dfs(int[][] graph, List<List<Integer>> result, Stack<Integer> stack, int x, int n) {
        if (x == n - 1) {
            result.add(new ArrayList<>(stack));
            return;
        }
        for (int i : graph[x]) {
            stack.push(i);
            dfs(graph, result, stack, i, n);
            stack.pop();
        }
    }

    //787. K 站中转内最便宜的航班
    //有 n 个城市通过一些航班连接。给你一个数组 flights ，其中 flights[i] = [fromi, toi, pricei] ，表示该航班都从城市 fromi 开始，以价格 toi 抵达 pricei。
    //现在给定所有的城市和航班，以及出发城市 src 和目的地 dst，你的任务是找到出一条最多经过 k 站中转的路线，使得从 src 到 dst 的 价格最便宜 ，并返回该价格。 如果不存在这样的路线，则输出 -1
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //dp
        final int INF = 10000 * 101 + 1;
        int[][] f = new int[k + 2][n];// f[t][i]表示通过恰好 t 次航班，从出发城市 src 到达城市 i需要的最小花费
        for (int i = 0; i < k + 2; ++i) {
            Arrays.fill(f[i], INF);
        }
        f[0][src] = 0;
        for (int t = 1; t <= k + 1; ++t) {
            for (int[] flight : flights) {
                int j = flight[0], i = flight[1], cost = flight[2];
                f[t][i] = Math.min(f[t][i], f[t - 1][j] + cost);
            }
        }
        int ans = INF;
        for (int t = 1; t <= k + 1; ++t) {
            ans = Math.min(ans, f[t][dst]);
        }
        return ans == INF ? -1 : ans;
    }

    //1646. 获取生成数组中的最大值
    //给你一个整数 n 。按下述规则生成一个长度为 n + 1 的数组 nums ：
//    nums[0] = 0
//    nums[1] = 1
//    当 2 <= 2 * i <= n 时，nums[2 * i] = nums[i]
//    当 2 <= 2 * i + 1 <= n 时，nums[2 * i + 1] = nums[i] + nums[i + 1]
//返回生成数组 nums 中的 最大 值。
    public static int getMaximumGenerated(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = i % 2 == 0 ? nums[i / 2] : nums[i / 2] + nums[i / 2 + 1];
            max = Math.max(nums[i], max);
        }
        return max;
    }

    //541. 反转字符串 II
    //给定一个字符串 s 和一个整数 k，从字符串开头算起，每 2k 个字符反转前 k 个字符。
//    如果剩余字符少于 k 个，则将剩余字符全部反转。
//    如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i += 2 * k) {
            if (i + k <= n) {
                reverse(arr, i, i + k - 1);
            } else {
                reverse(arr, i, n - 1);
            }
        }
        return new String(arr);
    }

    public void reverse(char[] arr, int begin, int end) {
        while (begin < end) {
            char c = arr[begin];
            arr[begin] = arr[end];
            arr[end] = c;
            begin++;
            end--;
        }
    }

    //345. 反转字符串中的元音字母
    //写一个函数，以字符串作为输入，反转该字符串中的元音字母。
    public String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && !isVowel(arr[i])) {
                ++i;
            }
            while (j > 0 && !isVowel(arr[j])) {
                --j;
            }
            if (i < j) {
                swap(arr, i, j);
                ++i;
                --j;
            }
        }
        return new String(arr);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //552. 学生出勤记录 II
//    可以用字符串表示一个学生的出勤记录，其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符：
//    'A'：Absent，缺勤
//    'L'：Late，迟到
//    'P'：Present，到场
//    如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励：
//    按 总出勤 计，学生缺勤（'A'）严格 少于两天。
//    学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。
//    给你一个整数 n ，表示出勤记录的长度（次数）。请你返回记录长度为 n 时，可能获得出勤奖励的记录情况 数量 。答案可能很大，所以返回对 109 + 7 取余 的结果
    public static int checkRecord2(int n) {
        final int MOD = 1000000007;
        int[][][] dp = new int[n + 1][2][3];//表示前 i天有j个‘A’且结尾有连续k个'L'的可奖励的出勤记录的数量
        dp[0][0][0] = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //当第i天为P时
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][0] = (dp[i][j][0] + dp[i - 1][j][k]) % MOD;
                }
            }
            //当第i天为A时
            for (int k = 0; k < 3; k++) {
                dp[i][1][0] = (dp[i][1][0] + dp[i - 1][0][k]) % MOD;
            }
            //当第i天为L时
            for (int j = 0; j < 2; j++) {
                for (int k = 1; k < 3; k++) {
                    dp[i][j][k] = (dp[i][j][k] + dp[i - 1][j][k - 1]) % MOD;
                }
            }
        }
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 3; k++) {
                sum = (sum + dp[n][j][k]) % MOD;
            }
        }
        return sum;
    }

    //551. 学生出勤记录 I
//给你一个字符串 s 表示一个学生的出勤记录，其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符：
//    'A'：Absent，缺勤
//    'L'：Late，迟到
//    'P'：Present，到场
//    如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励：
//    按 总出勤 计，学生缺勤（'A'）严格 少于两天。
//    学生 不会 存在 连续 3 天或 3 天以上的迟到（'L'）记录。
//    如果学生可以获得出勤奖励，返回 true ；否则，返回 false 。
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                absent++;
            }
            if (c == 'L') {
                late++;
            } else {
                late = 0;
            }
            if (absent == 2 || late == 3) {
                return false;
            }
        }
        return true;
    }

    //526. 优美的排列
    //假设有从 1 到 N 的 N 个整数，如果从这 N 个数字中成功构造出一个数组，使得数组的第 i 位 (1 <= i <= N) 满足如下两个条件中的一个，我们就称这个数组为一个优美的排列。条件：
    //    第 i 位的数字能被 i 整除
    //    i 能被第 i 位上的数字整除
    //现在给定一个整数 N，请问可以构造多少个优美的排列？
    public static HashMap<Integer, List<Integer>> match;
    public static boolean[] visited;
    public static int result;

    public static int countArrangement(int n) {
        match = new HashMap<>();
        visited = new boolean[n + 1];
        result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0 || j % i == 0) {
                    List<Integer> tmp = match.getOrDefault(i, new LinkedList<>());
                    tmp.add(j);
                    match.put(i, tmp);
                }
            }
        }
        //回溯
        backtrace(1, n);
        return result;
    }

    public static void backtrace(int index, int n) {
        if (index == n + 1) {
            result++;
            return;
        }
        for (int i : match.get(index)) {
            if (!visited[i]) {
                visited[i] = true;
                backtrace(index + 1, n);
                visited[i] = false;
            }
        }
    }

    //233. 数字 1 的个数
    //给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。
    public static int countDigitOne(int n) {
        int result = 0;
        String str = String.valueOf(n);
        int len = str.length();
        if (len == 1) {
            return n > 0 ? 1 : 0;
        }
        for (int i = 0; i < len; i++) {
            int x = str.charAt(i) - '0';
            //数字x之后的剩余长度
            int m = len - i - 1;
            //以数字x为分界，suf后缀，pre前缀
            int suf = (int) (n % Math.pow(10, len - i - 1));
            int pre = (int) (n / Math.pow(10, len - i));
            result += pre * Math.pow(10, m);
            if (x == 1) {
                result += suf + 1;
            } else if (x > 1) {
                result += Math.pow(10, m);
            }
        }
        return result;
    }

    //516. 最长回文子序列
//    给你一个字符串 s ，找出其中最长的回文子序列，并返回该序列的长度。
//    子序列定义为：不改变剩余字符顺序的情况下，删除某些字符或者不删除任何字符形成的一个序列。
    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            char c1 = s.charAt(i);
            for (int j = i + 1; j < n; j++) {
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }

    //446. 等差数列划分 II - 子序列
    //给你一个整数数组 nums ，返回 nums 中所有 等差子序列 的数目。
    //如果一个序列中 至少有三个元素 ，并且任意两个相邻元素之差相同，则称该序列为等差序列。
    //    例如，[1, 3, 5, 7, 9]、[7, 7, 7, 7] 和 [3, -1, -5, -9] 都是等差序列。
    //    再例如，[1, 1, 2, 5, 7] 不是等差序列。
    //数组中的子序列是从数组中删除一些元素（也可能不删除）得到的一个序列。
    //    例如，[2,5,10] 是 [1,2,1,2,4,1,5,10] 的一个子序列。
    //题目数据保证答案是一个 32-bit 整数。
    public static int numberOfArithmeticSlices2(int[] nums) {
        int result = 0;
        int n = nums.length;
        Map<Long, Integer>[] maps = new HashMap[n];
        for (int i = 0; i < n; i++) {
            maps[i] = new HashMap<>(16);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                long deta = 1L * nums[i] - nums[j];
                int count = maps[j].getOrDefault(deta, 0);
                result += count;
                maps[i].put(deta, maps[i].getOrDefault(deta, 0) + count + 1);
            }
        }
        return result;
    }

    //413. 等差数列划分
    //如果一个数列 至少有三个元素 ，并且任意两个相邻元素之差相同，则称该数列为等差数列。
    //    例如，[1,3,5,7,9]、[7,7,7,7] 和 [3,-1,-5,-9] 都是等差数列。
    //给你一个整数数组 nums ，返回数组 nums 中所有为等差数组的 子数组 个数。
    //子数组 是数组中的一个连续序列。
    public static int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        int d = nums[0] - nums[1], t = 0;
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (nums[i - 1] - nums[i] == d) {
                ++t;
            } else {
                d = nums[i - 1] - nums[i];
                t = 0;
            }
            ans += t;
        }
        return ans;

//        int n = nums.length;
//        if (n < 3) {
//            return 0;
//        }
//        int result = 0, left = 0, right = 1;
//        int deta = nums[right] - nums[left];
//        for (int i = 2; i < n; i++) {
//            int tmpDeta = nums[i] - nums[right];
//            if (tmpDeta == deta) {
//                right++;
//            } else {
//                result += combinationCount(left, right);
//                left = right;
//                right = i;
//                deta = tmpDeta;
//            }
//        }
//        result += combinationCount(left, right);
//        return result;
    }

    public static int combinationCount(int left, int right) {
        int length = right - left + 1;
        int count = 0;
        if (length < 3) {
            return 0;
        }
        for (int i = 3; i <= length; i++) {
            count += length - i + 1;
        }
        return count;
    }

    //313. 超级丑数
//    超级丑数 是一个正整数，并满足其所有质因数都出现在质数数组 primes 中。
//    给你一个整数 n 和一个整数数组 primes ，返回第 n 个 超级丑数 。
//    题目数据保证第 n 个 超级丑数 在 32-bit 带符号整数范围内。
    public static int nthSuperUglyNumber(int n, int[] primes) {
        //dp
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int m = primes.length;
        int[] pointers = new int[m];
        Arrays.fill(pointers, 1);
        for (int i = 2; i <= n; i++) {
            int[] nums = new int[m];
            int minNum = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                nums[j] = dp[pointers[j]] * primes[j];
                minNum = Math.min(minNum, nums[j]);
            }
            dp[i] = minNum;
            for (int j = 0; j < m; j++) {
                if (minNum == nums[j]) {
                    pointers[j]++;
                }
            }
        }
        return dp[n];
        //小顶堆1
//        PriorityQueue<Long> queue = new PriorityQueue<>();
//        long res = 1;
//        for (int i = 1; i < n; i++) {
//            for (int prime : primes) {
//                queue.add(prime * res);
//            }
//            res = queue.poll();
//            while (!queue.isEmpty() && res == queue.peek()) {
//                queue.poll();
//            }
//        }
//        return (int) res;

        //小顶堆2
//        PriorityQueue<Long> queue = new PriorityQueue<>();
//        Set<Long> seen = new HashSet<>();
//        queue.offer(1L);
//        seen.add(1L);
//        int result = 0;
//        for(int i = 0; i < n; i++){
//            long cur = queue.poll();
//            result = (int)cur;
//            for(int prime : primes){
//                long next =  prime * cur;
//                if(seen.add(next)){
//                    queue.offer(next);
//                }
//            }
//        }
//        return result;
    }

    //847. 访问所有节点的最短路径
//    存在一个由 n 个节点组成的无向连通图，图中的节点按从 0 到 n - 1 编号。
//    给你一个数组 graph 表示这个图。其中，graph[i] 是一个列表，由所有与节点 i 直接相连的节点组成。
//    返回能够访问所有节点的最短路径的长度。你可以在任一节点开始和停止，也可以多次重访节点，并且可以重用边。
    public static int shortestPathLength(int[][] graph) {
        int n = graph.length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][1 << n];
        for (int i = 0; i < n; i++) {
            queue.offer(new int[]{i, 1 << i, 0});
            visited[i][1 << i] = true;
        }
        int result = 0;
        while (!queue.isEmpty()) {
            int[] nodeInfo = queue.poll();
            int node = nodeInfo[0], mask = nodeInfo[1], dist = nodeInfo[2];
            if (mask == (1 << n) - 1) {
                result = dist;
                break;
            }
            for (int u : graph[node]) {
                //设置第u位二进制为1,表示该节点已经被访问
                int maskU = mask | (1 << u);
                if (!visited[u][maskU]) {
                    queue.offer(new int[]{u, maskU, dist + 1});
                    visited[u][maskU] = true;
                }
            }
        }
        return result;
    }

    //802. 找到最终的安全状态
    //在有向图中，以某个节点为起始节点，从该点出发，每一步沿着图中的一条有向边行走。如果到达的节点是终点（即它没有连出的有向边），则停止。
    //对于一个起始节点，如果从该节点出发，无论每一步选择沿哪条有向边行走，最后必然在有限步内到达终点，则将该起始节点称作是 安全 的。
    //返回一个由图中所有安全的起始节点组成的数组作为答案。答案数组中的元素应当按 升序 排列。
    //该有向图有 n 个节点，按 0 到 n - 1 编号，其中 n 是 graph 的节点数。图以下述形式给出：graph[i] 是编号 j 节点的一个列表，满足 (i, j) 是图的一条有向边。
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new LinkedList<>();
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            if (issafe(graph, color, i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static boolean issafe(int[][] graph, int[] color, int node) {
        if (color[node] > 0) {
            return color[node] == 2;
        }
        color[node] = 1;
        for (int x : graph[node]) {
            if (!issafe(graph, color, x)) {
                return false;
            }
        }
        color[node] = 2;
        return true;
    }

    //611. 有效三角形的个数
    //给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数。
    public static int triangleNumber(int[] nums) {
        //排序+二分
        Arrays.sort(nums);
        int result = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int left = j + 1;
                int right = n - 1;
                int index = j;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (nums[mid] < nums[i] + nums[j]) {
                        index = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                result += index - j;
            }
        }
        return result;
    }

    //581. 最短无序连续子数组
    //给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
    //请你找出符合题意的 最短 子数组，并输出它的长度。
    public static int findUnsortedSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int right = -1;
        int left = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < max) {
                right = i;
            } else {
                max = nums[i];
            }
            if (nums[n - i - 1] > min) {
                left = n - i - 1;
            } else {
                min = nums[n - i - 1];
            }
        }
        return right == -1 ? 0 : right - left + 1;
    }

    //743. 网络延迟时间
//    有 n 个网络节点，标记为 1 到 n。
//    给你一个列表 times，表示信号经过 有向 边的传递时间。 times[i] = (ui, vi, wi)，其中 ui 是源节点，vi 是目标节点， wi 是一个信号从源节点传递到目标节点的时间。
//    现在，从某个节点 K 发出一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回 -1 。
    public static int networkDelayTime(int[][] times, int n, int k) {
        int INF = Integer.MAX_VALUE / 2;
        int[][] w = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                w[i][j] = i == j ? 0 : INF;
            }
        }
        for (int[] time : times) {
            w[time[0] - 1][time[1] - 1] = time[2];
        }
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[k - 1] = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            int p = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (p == -1 || dist[j] < dist[p])) {
                    p = j;
                }
            }
            visited[p] = true;
            for (int j = 0; j < n; j++) {
                dist[j] = Math.min(dist[j], dist[p] + w[p][j]);
            }
        }
        int result = Arrays.stream(dist).max().getAsInt();
        return result == INF ? -1 : result;
    }

    //171. Excel表列序号
    public static int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, n - i - 1);
        }

        return result;
    }

    //1104. 二叉树寻路
    //在一棵无限的二叉树上，每个节点都有两个子节点，树中的节点 逐行 依次按 “之” 字形进行标记。
    //如下图所示，在奇数行（即，第一行、第三行、第五行……）中，按从左到右的顺序进行标记；
    // 而偶数行（即，第二行、第四行、第六行……）中，按从右到左的顺序进行标记。
    //给你树上某一个节点的标号 label，请你返回从根节点到该标号为 label 节点的路径，该路径是由途经的节点标号所组成的。
    public static List<Integer> pathInZigZagTree(int label) {
//        List<Integer> result = new LinkedList<>();
//        int row = (int) (Math.log(label) / Math.log(2)) + 1;
//        if (row % 2 == 0) {
//            label = (1 << row - 1) + (1 << row) - 1 - label;
//        }
//        while (row > 0) {
//            if (row % 2 == 0) {
//                result.add((1 << row - 1) + (1 << row) - 1 - label);
//            } else {
//                result.add(label);
//            }
//            label >>= 1;
//            row--;
//        }
//        Collections.reverse(result);
//        return result;
        LinkedList<Integer> res = new LinkedList<>();
        res.add(label);
        int c = (int) (Math.log(label) / Math.log(2));
        while (c != 0) {
            label = (int) (Math.pow(2, c) - 1) + (int) (Math.pow(2, c - 1)) - label / 2;
            res.addFirst(label);
            c--;
        }
        return res;
    }

    //863. 二叉树中所有距离为 K 的结点
    //给定一个二叉树（具有根结点 root）， 一个目标结点 target ，和一个整数值 K 。
    //返回到目标结点 target 距离为 K 的所有结点的值的列表。 答案可以以任何顺序返回。。
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<Integer, TreeNode> hashMap = new HashMap<>();
        List<Integer> result = new LinkedList<>();
        findParent(hashMap, root);
        findNode(hashMap, result, target, null, 0, k);
        return result;
    }

    public static void findNode(HashMap<Integer, TreeNode> hashMap, List<Integer> result, TreeNode node, TreeNode from, int depth, int k) {
        if (node == null) {
            return;
        }
        if (depth == k) {
            result.add(node.val);
            return;
        }
        if (node.left != from) {
            findNode(hashMap, result, node.left, node, depth + 1, k);
        }
        if (node.right != from) {
            findNode(hashMap, result, node.right, node, depth + 1, k);
        }
        if (hashMap.get(node.val) != from) {
            findNode(hashMap, result, hashMap.get(node.val), node, depth + 1, k);
        }
    }

    public static void findParent(HashMap<Integer, TreeNode> hashMap, TreeNode node) {
        if (node.left != null) {
            hashMap.put(node.left.val, node);
            findParent(hashMap, node.left);
        }
        if (node.right != null) {
            hashMap.put(node.right.val, node);
            findParent(hashMap, node.right);
        }
    }

    //671. 二叉树中第二小的节点
    //给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。
    //更正式地说，root.val = min(root.left.val, root.right.val) 总成立。
    //给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
    public int findSecondMinimumValue(TreeNode root) {
        //递归找到第一个大于root.val的
        return findSecond(root, root.val);
    }

    public int findSecond(TreeNode root, int val) {
        if (root == null) {
            return -1;
        }
        if (root.val > val) {
            return root.val;
        }
        int left = findSecond(root.left, val);
        int right = findSecond(root.right, val);
        if (left > val && right > val) {
            return Math.min(left, right);
        }
        return Math.max(left, right);
    }

    //1713. 得到子序列的最少操作次数
    //给你一个数组 target ，包含若干 互不相同 的整数，以及另一个整数数组 arr ，arr 可能 包含重复元素。
    //每一次操作中，你可以在 arr 的任意位置插入任一整数。比方说，如果 arr = [1,4,1,2] ，那么你可以在中间添加 3 得到 [1,4,3,1,2] 。你可以在数组最开始或最后面添加整数。
    //请你返回 最少 操作次数，使得 target 成为 arr 的一个子序列。
    public static int minOperations(int[] target, int[] arr) {
        //原问题转化成求target和arr的最长公共子序列， 答案等于 target.length - 最长公共子序列的长度

        //由于target中元素是不相同的，那么arr的对应的元素的在target中下标是单调递增的，
        //问题进一步转换成求arr在target中对应元素的下标的最长递增子序列
        int n = target.length;
        Map<Integer, Integer> indexMap = new HashMap<>();//记录target的下标
        for (int i = 0; i < n; i++) {
            indexMap.put(target[i], i);

        }
        List<Integer> d = new LinkedList<>();
        for (int val : arr) {
            if (indexMap.containsKey(val)) {
                int index = indexMap.get(val);
                int i = binarySearch(d, index);
                if (i == d.size()) {
                    d.add(index);
                } else {
                    d.set(i, index);
                }
            }
        }
        return n - d.size();
    }

    public static int binarySearch(List<Integer> d, int target) {
        int size = d.size();
        if (size == 0 || d.get(size - 1) < target) {
            return size;
        }
        int low = 0, high = size - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (d.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    //300. 最长递增子序列
    public int lengthOfLIS(int[] nums) {
        //dp
//        int n = nums.length;
//        if(n == 0){
//            return 0;
//        }
//        int[] dp = new int[n];
//        int max = 1;
//        Arrays.fill(dp,1);
//        for(int i = 1; i < n; i++){
//            for (int j = 0; j < i; j++){
//                if(nums[i] > nums[j]){
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//            max = Math.max(dp[i], max);
//        }
//        return max;
        //贪心 + 二分
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int len = 1;
        int[] d = new int[n + 1];
        d[len] = nums[0];
        for (int i = 1; i < n; i++) {
            if (d[len] < nums[i]) {
                d[++len] = nums[i];
            } else {
                int l = 1;
                int r = len;
                int pos = 0;
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (d[mid] < nums[i]) {
                        pos = mid;
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
                d[pos + 1] = nums[i];
            }
        }
        return len;
    }

    //1143. 最长公共子序列
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            int cha1 = text1.charAt(i - 1);
            for (int j = 1; j <= m; j++) {
                int cha2 = text2.charAt(j - 1);
                if (cha1 == cha2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n][m];
    }

    //1893. 检查是否区域内所有整数都被覆盖
    //给你一个二维整数数组 ranges 和两个整数 left 和 right 。每个 ranges[i] = [starti, endi] 表示一个从 starti 到 endi 的 闭区间 。
    //如果闭区间 [left, right] 内每个整数都被 ranges 中 至少一个 区间覆盖，那么请你返回 true ，否则返回 false 。
    //已知区间 ranges[i] = [starti, endi] ，如果整数 x 满足 starti <= x <= endi ，那么我们称整数x 被覆盖了。
    public static boolean isCovered(int[][] ranges, int left, int right) {
        //排序
//        Arrays.sort(ranges, (a1, a2) -> a1[0] - a2[0]);
//        for(int[] range : ranges){
//            if(range[0] <= left && left <= range[1]){
//                left = range[1] + 1;
//            }
//        }
//        return left > right;
        int[] diff = new int[52];   // 差分数组
        for (int[] range : ranges) {
            ++diff[range[0]];
            --diff[range[1] + 1];
        }
        // 前缀和
        int curr = 0;
        for (int i = 1; i <= 50; ++i) {
            curr += diff[i];
            if (i >= left && i <= right && curr <= 0) {
                return false;
            }
        }
        return true;
    }

    //    138. 复制带随机指针的链表
    public ListNode copyRandomList(ListNode head) {
        HashMap<ListNode, ListNode> hashMap = new HashMap<>();
        return helper(head, hashMap);
    }

    public ListNode helper(ListNode head, HashMap<ListNode, ListNode> hashMap) {
        if (head == null) {
            return null;
        }
        if (!hashMap.containsKey(head)) {
            ListNode node = new ListNode(head.val);
            hashMap.put(head, node);
            node.next = helper(head.next, hashMap);
            node.random = helper(head.random, hashMap);
        }
        return hashMap.get(head);
    }

    //    剑指 Offer 52. 两个链表的第一个公共节点
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;
        if (pa == null || pb == null) {
            return null;
        }
        while (pa != pb) {
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
    }

    //1877. 数组中最大数对和的最小值
//    一个数对 (a,b) 的 数对和 等于 a + b 。最大数对和 是一个数对数组中最大的 数对和 。
//    比方说，如果我们有数对 (1,5) ，(2,3) 和 (4,4)，最大数对和 为 max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8 。
//    给你一个长度为 偶数 n 的数组 nums ，请你将 nums 中的元素分成 n / 2 个数对，使得：
//    nums 中每个元素 恰好 在 一个 数对中，且
//    最大数对和 的值 最小 。
//    请你在最优数对划分的方案下，返回最小的 最大数对和 。
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            max = Math.max(max, nums[i] + nums[n - i - 1]);
        }
        return max;
    }

    //98. 验证二叉搜索树
    public static boolean isValidBST(TreeNode root) {
        //递归
//        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        //中序遍历
        Stack<TreeNode> stack = new Stack<>();
        long pre = Long.MIN_VALUE;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            if (node.val < pre) {
                return false;
            }
            pre = node.val;
            root = root.right;
        }
        return true;
    }

    public static boolean isValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }

    //701. 二叉搜索树中的插入操作
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        //递归
//        if(root == null){
//            return new TreeNode(val);
//        }
//        if(root.val < val){
//            root.right = insertIntoBST(root.right, val);
//        }else {
//            root.left = insertIntoBST(root.left, val);
//        }
//        return root;
        //迭代
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode pre = root;
        TreeNode p = root;
        while (p != null) {
            pre = p;
            p = p.val < val ? p.right : p.left;
        }
        if (pre.val < val) {
            pre.right = new TreeNode(val);
        } else {
            pre.left = new TreeNode(val);
        }
        return root;
    }

    //    700. 二叉搜索树中的搜索
    public static TreeNode searchBST(TreeNode root, int val) {
        //递归
//        if (root == null || root.val == val) {
//            return root;
//        }
//        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
        //迭代
        while (root != null && root.val != val) {
            root = root.val < val ? root.right : root.left;
        }
        return root;
    }

    //112. 路径总和
    //给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    //226. 翻转二叉树
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.right = left;
        root.left = right;
        return root;
    }

    //1838. 最高频元素的频数
    //元素的 频数 是该元素在一个数组中出现的次数。
    //给你一个整数数组 nums 和一个整数 k 。在一步操作中，你可以选择 nums 的一个下标，并将该下标对应元素的值增加 1 。
    //执行最多 k 次操作后，返回数组中最高频元素的 最大可能频数
    public static int maxFrequency(int[] nums, int k) {
        //排序+滑动窗口
        Arrays.sort(nums);
        int n = nums.length;
        long total = 0;
        int l = 0, res = 1;
        for (int r = 1; r < n; ++r) {
            total += (long) (nums[r] - nums[r - 1]) * (r - l);
            while (total > k) {
                total -= nums[r] - nums[l];
                ++l;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
        //枚举
//        int n = nums.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : nums){
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//        List<Integer> list = new ArrayList<>(map.keySet());
//        Collections.sort(list);
//        int ans = 1;
//        for (int i = 0; i < list.size(); i++) {
//            int x = list.get(i), cnt = map.get(x);
//            if (i > 0) {
//                int p = k;
//                for (int j = i - 1; j >= 0; j--) {
//                    int y = list.get(j);
//                    int diff = x - y;
//                    if (p >= diff) {
//                        int add = p / diff;
//                        int min = Math.min(map.get(y), add);
//                        p -= min * diff;
//                        cnt += min;
//                    } else {
//                        break;
//                    }
//                }
//            }
//            ans = Math.max(ans, cnt);
//        }
//        return ans;
    }

    //    101. 对称二叉树
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        //递归
//        return helper(root.left, root.right);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }
            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);
        }
        return true;
    }

    public static boolean helper(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }
        return (node1.val == node2.val && helper(node1.left, node2.right) && helper(node1.right, node2.left));
    }

    //104. 二叉树的最大深度
    public static int maxDepth(TreeNode root) {
        //广度优先搜索
//        if(root == null){
//            return 0;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        int depth = 0;
//        queue.offer(root);
//        while (!queue.isEmpty()){
//            depth++;
//            int n = queue.size();
//            for (int i = 0; i < n; i++){
//                TreeNode node = queue.poll();
//                if(node.left != null){
//                    queue.offer(node.left);
//                }
//                if(node.right != null){
//                    queue.offer(node.right);
//                }
//            }
//        }
//        return depth;
        //递归
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    //102. 二叉树的层序遍历
    //给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(temp);
        }
        return result;
    }

    //剑指 Offer 53 - I. 在排序数组中查找数字 I
    //统计一个数字在排序数组中出现的次数。
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        int count = 0;
        while (left < n && nums[left++] == target) {
            count++;
        }
        return count;
    }

    //145. 二叉树的后序遍历
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        //递归
//        postorder(root, result);
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode pre = null;//记录上一个节点
//        TreeNode cur = root;
//        while (cur != null || !stack.isEmpty()){
//            if(cur != null){
//                stack.push(cur);
//                cur = cur.left;
//            }else {
//                cur = stack.peek();
//                if(cur.right == null || cur.right == pre){
//                    result.add(cur.val);
//                    pre = cur;
//                    stack.pop();
//                    cur = null;
//                }else {
//                    cur = cur.right;
//                }
//            }
//        }
        TreeNode cur = root;
        TreeNode mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            if (mostRight != null) {
                while (mostRight.right != null && mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if (mostRight.right == null) {
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                } else {
                    mostRight.right = null;
                    printEdge(cur.left, result);
                }
            }
            cur = cur.right;
        }
        printEdge(root, result);
        return result;
    }

    public static void printEdge(TreeNode node, List<Integer> result) {
        TreeNode tail = reverseEdge(node);
        TreeNode cur = tail;
        while (cur != null) {
            System.out.println(cur.val + "--");
            result.add(cur.val);
            cur = cur.right;
        }
        reverseEdge(tail);
    }

    public static TreeNode reverseEdge(TreeNode node) {
        TreeNode pre = null;
        TreeNode next = null;
        while (node != null) {
            next = node.right;
            node.right = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

    public static void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }

    //94. 二叉树的中序遍历
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        //递归
//        inorder(root, result);
        //迭代
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//        while (cur != null || !stack.isEmpty()) {
//            if (cur != null) {
//                stack.push(cur);
//                cur = cur.left;
//            } else {
//                cur = stack.pop();
//                result.add(cur.val);
//                cur = cur.right;
//            }
//        }
        TreeNode cur = root;
        TreeNode mostright = null;
        while (cur != null) {
            mostright = cur.left;
            if (mostright != null) {
                while (mostright.right != null && mostright.right != cur) {
                    mostright = mostright.right;
                }
                if (mostright.right == null) {
                    mostright.right = cur;
                    cur = cur.left;
                    continue;
                } else {
                    result.add(cur.val);
                    mostright.right = null;
                }
            } else {
                result.add(cur.val);
            }
            cur = cur.right;
        }
        return result;
    }

    public static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

    //   144. 二叉树的前序遍历
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
//        //递归
//        preorder(root, result);
        //迭代
//        if (root == null) {
//            return result;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//            result.add(node.val);
//            if (node.right != null) {
//                stack.push(node.right);
//            }
//            if (node.left != null) {
//                stack.push(node.left);
//            }
//        }
//        return result;
        //Morris 遍历
        //如果cur无左孩子，cur向右移动（cur=cur.right）
        //如果cur有左孩子，找到cur左子树上最右的节点，记为mostright
        //如果mostright的right指针指向空，让其指向cur，cur向左移动（cur=cur.left）
        //如果mostright的right指针指向cur，让其指向空，cur向右移动（cur=cur.right）
        TreeNode cur = root;
        TreeNode mostright = null;
        while (cur != null) {
            mostright = cur.left;
            if (mostright != null) {
                while (mostright.right != null && mostright.right != cur) {
                    mostright = mostright.right;
                }
                if (mostright.right == null) {
                    result.add(cur.val);
                    mostright.right = cur;
                    cur = cur.left;
                    continue;
                } else {
                    mostright.right = null;
                }
            } else {
                result.add(cur.val);
            }
            cur = cur.right;
        }
        return result;
    }

    public static void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    //232. 用栈实现队列
//    请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
//    实现 MyQueue 类：
//    void push(int x) 将元素 x 推到队列的末尾
//    int pop() 从队列的开头移除并返回元素
//    int peek() 返回队列开头的元素
//    boolean empty() 如果队列为空，返回 true ；否则，返回 false
    class MyQueue {
        Stack<Integer> in;
        Stack<Integer> out;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            in = new Stack<>();
            out = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            in.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
            return out.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
            return out.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode random;

        ListNode() {
        }

        ListNode(int x) {
            this.val = x;
            this.next = null;
            this.random = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //162. 寻找峰值
    //峰值元素是指其值严格大于左右相邻值的元素。
    //给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
    //你可以假设 nums[-1] = nums[n] = -∞ 。
    //你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
    public int findPeakElement(int[] nums) {
        //寻找最大值
//        int index = 0;
//        for(int i = 1; i < nums.length; i++){
//            if(nums[index] < nums[i]){
//                index = i;
//            }
//        }
//        return index;

        //二分
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;

    }

    //524. 通过删除字母匹配到字典里最长单词
    //给你一个字符串 s 和一个字符串数组 dictionary 作为字典，找出并返回字典中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
    //如果答案不止一个，返回长度最长且字典序最小的字符串。如果答案不存在，则返回空字符串。
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        for (String dic : dictionary) {
            int i = 0;
            int j = 0;
            while (i < s.length() && j < dic.length()) {
                if (s.charAt(i) == dic.charAt(j)) {
                    j++;
                }
                i++;
            }
            if (j == dic.length()) {
                return dic;
            }
        }
        return "";
    }

    //447. 回旋镖的数量
    //给定平面上 n 对 互不相同 的点 points ，其中 points[i] = [xi, yi] 。回旋镖 是由点 (i, j, k) 表示的元组 ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
    //返回平面上所有回旋镖的数量。
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for (int[] x : points) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int[] y : points) {
                int dis = (x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]);
                map.put(dis, map.getOrDefault(dis, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int n = entry.getValue();
                result += n * (n - 1);
            }
        }
        return result;
    }

    //1894. 找到需要补充粉笔的学生编号
    //一个班级里有 n 个学生，编号为 0 到 n - 1 。每个学生会依次回答问题，编号为 0 的学生先回答，然后是编号为 1 的学生，以此类推，直到编号为 n - 1 的学生，然后老师会重复这个过程，重新从编号为 0 的学生开始回答问题。
    //给你一个长度为 n 且下标从 0 开始的整数数组 chalk 和一个整数 k 。一开始粉笔盒里总共有 k 支粉笔。当编号为 i 的学生回答问题时，他会消耗 chalk[i] 支粉笔。如果剩余粉笔数量 严格小于 chalk[i] ，那么学生 i 需要 补充 粉笔。
    //请你返回需要 补充 粉笔的学生 编号 。
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long total = 0;
        for (int i : chalk) {
            total += i;
        }
        k %= total;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (chalk[i] > k) {
                result = i;
                break;
            }
            k -= chalk[i];
        }
        return result;
    }

    //    68. 文本左右对齐
//    给定一个单词数组和一个长度 maxWidth，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
//    你应该使用“贪心算法”来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
//    要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
//    文本的最后一行应为左对齐，且单词之间不插入额外的空格。
//    说明:
//    单词是指由非空格字符组成的字符序列。
//    每个单词的长度大于 0，小于等于 maxWidth。
//    输入单词数组 words 至少包含一个单词。
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<String>();
        int right = 0, n = words.length;
        while (true) {
            int left = right; // 当前行的第一个单词在 words 的位置
            int sumLen = 0; // 统计这一行单词长度之和
            // 循环确定当前行可以放多少单词，注意单词之间应至少有一个空格
            while (right < n && sumLen + words[right].length() + right - left <= maxWidth) {
                sumLen += words[right++].length();
            }

            // 当前行是最后一行：单词左对齐，且单词之间应只有一个空格，在行末填充剩余空格
            if (right == n) {
                StringBuffer sb = join(words, left, n, " ");
                sb.append(blank(maxWidth - sb.length()));
                ans.add(sb.toString());
                return ans;
            }

            int numWords = right - left;
            int numSpaces = maxWidth - sumLen;

            // 当前行只有一个单词：该单词左对齐，在行末填充剩余空格
            if (numWords == 1) {
                StringBuffer sb = new StringBuffer(words[left]);
                sb.append(blank(numSpaces));
                ans.add(sb.toString());
                continue;
            }

            // 当前行不只一个单词
            int avgSpaces = numSpaces / (numWords - 1);
            int extraSpaces = numSpaces % (numWords - 1);
            StringBuffer sb = new StringBuffer();
            sb.append(join(words, left, left + extraSpaces + 1, blank(avgSpaces + 1))); // 拼接额外加一个空格的单词
            sb.append(blank(avgSpaces));
            sb.append(join(words, left + extraSpaces + 1, right, blank(avgSpaces))); // 拼接其余单词
            ans.add(sb.toString());
        }
    }

    // blank 返回长度为 n 的由空格组成的字符串
    public String blank(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
        return sb.toString();
    }

    // join 返回用 sep 拼接 [left, right) 范围内的 words 组成的字符串
    public StringBuffer join(String[] words, int left, int right, String sep) {
        StringBuffer sb = new StringBuffer(words[left]);
        for (int i = left + 1; i < right; ++i) {
            sb.append(sep);
            sb.append(words[i]);
        }
        return sb;
    }

    //502. IPO
    //给你 n 个项目。对于每个项目 i ，它都有一个纯利润 profits[i] ，和启动该项目需要的最小资本 capital[i] 。
    //最初，你的资本为 w 。当你完成一个项目时，你将获得纯利润，且利润将被添加到你的总资本中。
    //总而言之，从给定项目中选择 最多 k 个不同项目的列表，以 最大化最终资本 ，并输出最终可获得的最多资本。
    //答案保证在 32 位有符号整数范围内
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] arr = new int[n][2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);//已启动资本从小到大排序
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);//大顶堆
        for (int i = 0; i < k; i++) {
            while (index < n && arr[index][0] <= w) {
                queue.add(arr[index][1]);//启动资本小于w的，将其利润加入堆
                index++;
            }
            if (!queue.isEmpty()) {
                w += queue.poll();//去利润最大的堆顶
            } else {
                break;
            }
        }
        return w;
    }

    //704. 二分查找
    //给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
    public static int BSearch(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left] == target ? left : -1;
    }

    //    20. 有效的括号
//    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//    有效字符串需满足：
//    左括号必须用相同类型的右括号闭合。
//    左括号必须以正确的顺序闭合。
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || ch != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    //    1818. 绝对差值和
    //给你两个正整数数组 nums1 和 nums2 ，数组的长度都是 n 。
//数组 nums1 和 nums2 的 绝对差值和 定义为所有 |nums1[i] - nums2[i]|（0 <= i < n）的 总和（下标从 0 开始）。
//你可以选用 nums1 中的 任意一个 元素来替换 nums1 中的 至多 一个元素，以 最小化 绝对差值和。
//在替换数组 nums1 中最多一个元素 之后 ，返回最小绝对差值和。因为答案可能很大，所以需要对 109 + 7 取余 后返回。
//|x| 定义为：
//    如果 x >= 0 ，值为 x ，或者
//    如果 x <= 0 ，值为 -x
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int mod = 1000000007;
        int n = nums1.length;
        int sum = 0;
        int maxChange = 0;
        int[] nums1Clone = nums1.clone();
        Arrays.sort(nums1Clone);
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = (sum + diff) % mod;
            int index = binarySearch(nums1Clone, nums2[i]);
            if (index < n) {
                maxChange = Math.max(maxChange, diff - (nums1Clone[index] - nums2[i]));
            }
            if (index > 0) {
                maxChange = Math.max(maxChange, diff - (nums2[i] - nums1Clone[index - 1]));
            }
        }
        return (sum - maxChange + mod) % mod;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        if (arr[right] < target) {
            return right + 1;
        }
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    //83. 删除排序链表中的重复元素
    //存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
    //返回同样按升序排列的结果链表。
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    //206. 反转链表
    //给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
    public static ListNode reverseList(ListNode head) {
        //迭代
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null){
//            ListNode temp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = temp;
//        }
//        return pre;
        //递归
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //218. 天际线问题
    //城市的天际线是从远处观看该城市中所有建筑物形成的轮廓的外部轮廓。给你所有建筑物的位置和高度，请返回由这些建筑物形成的 天际线 。
    //每个建筑物的几何信息由数组 buildings 表示，其中三元组 buildings[i] = [lefti, righti, heighti] 表示：
    //    lefti 是第 i 座建筑物左边缘的 x 坐标。
    //    righti 是第 i 座建筑物右边缘的 x 坐标。
    //    heighti 是第 i 座建筑物的高度。
    //天际线 应该表示为由 “关键点” 组成的列表，格式 [[x1,y1],[x2,y2],...] ，并按 x 坐标 进行 排序 。关键点是水平线段的左端点。列表中最后一个点是最右侧建筑物的终点，y 坐标始终为 0 ，仅用于标记天际线的终点。此外，任何两个相邻建筑物之间的地面都应被视为天际线轮廓的一部分。
    public static List<List<Integer>> getSkyline(int[][] buildings) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> b[1] - a[1]);
        List<Integer> boundaries = new ArrayList<Integer>();
        for (int[] building : buildings) {
            boundaries.add(building[0]);
            boundaries.add(building[1]);
        }
        Collections.sort(boundaries);
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int n = buildings.length, idx = 0;
        for (int boundary : boundaries) {
            while (idx < n && buildings[idx][0] <= boundary) {
                pq.offer(new int[]{buildings[idx][1], buildings[idx][2]});
                idx++;
            }
            while (!pq.isEmpty() && pq.peek()[0] <= boundary) {
                pq.poll();
            }
            int maxn = pq.isEmpty() ? 0 : pq.peek()[1];
            if (ret.size() == 0 || maxn != ret.get(ret.size() - 1).get(1)) {
                ret.add(Arrays.asList(boundary, maxn));
            }
        }
        return ret;
    }

    //203. 移除链表元素
//给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
    public static ListNode removeElements(ListNode head, int val) {
        //迭代
//        ListNode dummyHead = new ListNode();
//        dummyHead.next = head;
//        ListNode cur = dummyHead;
//        while (cur.next != null) {
//            if(cur.next.val == val){
//                cur.next = cur.next.next;
//            }else {
//                cur = cur.next;
//            }
//        }
//        return dummyHead.next;
        //递归
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    //    21. 合并两个有序链表
    //将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //迭代
//        ListNode head = new ListNode();
//        ListNode cur = head;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                cur.next = l1;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                l2 = l2.next;
//            }
//            cur = cur.next;
//        }
//        cur.next = l1 == null ? l2 : l1;
//        return head.next;
        //递归
        if (l1 == null) {
            return l1;
        } else if (l2 == null) {
            return l2;
        } else if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    //141. 环形链表
    //给定一个链表，判断链表中是否有环。
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    //242. 有效的字母异位词
    //给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    //383. 赎金信
    //给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            hash[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--hash[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    //387. 字符串中的第一个唯一字符
    //给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
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
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                col0 = true;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[0][i] == 0) {
                row0 = true;
            }
        }
        //利用第一行和第一列记录矩阵是否有0
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //覆盖原矩阵
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        //还原原第一行
        if (row0) {
            for (int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }
        //还原原第一列
        if (col0) {
            for (int i = 0; i < n; i++) {
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
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int boxIndex = i / 3 * 3 + j / 3;
                    if (row[i][num] || col[j][num] || box[boxIndex][num]) {
                        return false;
                    } else {
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
        for (int i = 0; i < len; i++) {
            int h = len - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
