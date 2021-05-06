/**
 * 并查集
 *
 * @author hui
 * 2021/1/18 0018 16:38
 */
public class UnionSet {
    int[] parents;
    int[] rank;

    //初始化：假设每个元素的父节点是自己
    void init(int n) {
        for (int i = 0; i < n; i++) {
            parents[i] = i;
            rank[i] = 1;//按秩合并，即树的深度
        }
    }

    //查询:递归查询至根节点，判断两个元素是否属于一个连通图
    int find(int x) {
        if (parents[x] == x) {
            return x;
        } else {
            return find(parents[x]);
        }
    }

    //查询的路径压缩版本
    int findZip(int x) {
        if (parents[x] == x) {
            return x;
        } else {
            parents[x] = findZip(parents[x]);
            return parents[x];
        }
    }

    //合并:查找到两个元素的父节点，然后将两者连通
    void union(int i, int j) {
        parents[find(i)] = find(j);
    }

    //按秩合并
    void merge(int i, int j) {
        int x = find(i);
        int y = find(j);
        if (rank[x] <= rank[y]) {
            parents[x] = y;
        } else {
            parents[y] = x;
        }
        if (rank[x] == rank[y] && x != y) {  //当深度相同而根节点不同时，则新的根节点的深度+1
            rank[y]++;
        }
    }
}



