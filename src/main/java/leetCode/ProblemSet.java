package leetCode;


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
        getSum(2, 3);
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
