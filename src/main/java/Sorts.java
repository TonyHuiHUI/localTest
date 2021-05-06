import java.util.TreeMap;

/**
 * @author hui
 * 2019/5/9 0009 11:34
 */
public class Sorts {

    private static void insertSort(int[] target) {
        for (int i = 1; i < target.length; i++) {
            int key = target[i];
            int j = i - 1;
            while (j >= 0 && target[j] > key) {
                target[j + 1] = target[j];
                j--;
            }
            target[j + 1] = key;
        }
    }

    /**
     * @param target 目标数组
     * @param start  数组合并的起始下标
     * @param end    数组合并的结尾下标
     * @return
     * @method 归并排序：通过将数组分割成两部分，并递归排序
     */
    private static void mergeSort(int[] target, int start, int end) {
        if (start < end) {
            int index = (start + end) / 2;
            mergeSort(target, start, index);
            mergeSort(target, index + 1, end);
            merge(target, start, index, end);
        }
    }

    /**
     * @param
     * @return
     * @method 合并两个已有序数组
     */
    private static void merge(int[] target, int start, int index, int end) {
        System.out.println("merge: " + start + "---" + index + "---" + end);
/*        int[] left = new int[index - start + 1];
        int[] right = new int[end - index];
        for (int i = start, j = 0; i <= index; i++, j++) {
            left[j] = target[i];
        }
        for (int i = index + 1, j = 0; i <= end; i++, j++) {
            right[j] = target[i];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = start; i <= end; i++) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] <= right[rightIndex]) {
                    target[i] = left[leftIndex];
                    leftIndex++;
                } else {
                    target[i] = right[rightIndex];
                    rightIndex++;
                }
            }
        }
        int targetIndex = start + rightIndex + leftIndex;
        if (leftIndex == left.length) {
            for (int i = rightIndex, j = 0; i < right.length; i++, j++) {
                target[targetIndex + j] = right[i];
            }
        }

        if (rightIndex == right.length) {
            for (int i = leftIndex, j = 0; i < left.length; i++, j++) {
                target[targetIndex + j] = left[i];
            }
        }*/


        int[] left = new int[index - start + 2];
        int[] right = new int[end - index + 1];
        for (int i = start, j = 0; i <= index; i++, j++) {
            left[j] = target[i];
        }
        for (int i = index + 1, j = 0; i <= end; i++, j++) {
            right[j] = target[i];
        }

        left[left.length - 1] = Integer.MAX_VALUE;
        right[right.length - 1] = Integer.MAX_VALUE;

        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = start; i <= end; i++) {
            if (left[leftIndex] <= right[rightIndex]) {
                target[i] = left[leftIndex];
                leftIndex++;
            } else {
                target[i] = right[rightIndex];
                rightIndex++;
            }
        }

        for (int x : target) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    /**
     * @param low   数组低水位下标
     * @param hight 数组高水位下标
     * @return
     * @method 快排
     */
    private static void quickSort(int[] target, int low, int hight) {
        if (low < hight) {
            int index = partition(target, low, hight);
            quickSort(target, low, index - 1);
            quickSort(target, index + 1, hight);
        }
    }

    /**
     * @param
     * @return
     * @method 快排分区划分
     */

    private static int partition(int[] target, int low, int hight) {
        int tmp = target[low];
        while (low < hight) {
            while (low < hight && target[hight] >= tmp) {
                hight--;
            }
            target[low] = target[hight];
            while (low < hight && target[low] <= tmp) {
                low++;
            }
            target[hight] = target[low];
        }
        target[low] = tmp;
        return low;
    }


    /**
     * @param target 目标数组
     * @return
     * @method 堆排序
     */
    private static void heapSort(int[] target) {
        //建堆
        //以数组的1/2向上取整的节点，依次构建大顶堆
        for (int i = target.length / 2; i >= 0; i--) {
            maxHeapify(target, i, target.length);
        }

        //堆排序，注意:堆调整的节点数每次递减1
        for (int i = target.length - 1; i >= 1; i--) {
            int tmp = target[0];
            target[0] = target[i];
            target[i] = tmp;
            maxHeapify(target, 0, i);
        }
    }


    /**
     * @param target 目标堆
     * @param index  调整堆的节点下标
     * @param n      调整堆的节点个数。在堆排序的过程中，堆尾在递归的过程中依次有序，因此在调整过程中要剔除掉已经有序的节点
     * @return
     * @method 堆调整：比较当前调整节点与左右子节点的大小，来构建大顶堆。并在发生调整后对其子节点递归进行调整
     */
    private static void maxHeapify(int[] target, int index, int n) {
        int maxIndex = index;
        if (2 * index + 1 < n && target[2 * index + 1] > target[maxIndex]) {
            maxIndex = 2 * index + 1;
        }
        if (2 * index + 2 < n && target[2 * index + 2] > target[maxIndex]) {
            maxIndex = 2 * index + 2;
        }
        if (maxIndex != index) {
            int tmp = target[index];
            target[index] = target[maxIndex];
            target[maxIndex] = tmp;
            maxHeapify(target, maxIndex, n);
        }
    }

     /**
      * @method  计数排序
      * @param   tmp 存放排序结果的数组
      * @param  k target数组中的最大的整数
      * @return 
      */
    private static void countSort(int[] target, int[] tmp, int k) {
        int[] numCount = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            numCount[i] = 0;
        }
        for (int i : target) {
            numCount[i] = numCount[i] + 1;
        }
        for (int i = 1; i <= k; i++) {
            numCount[i] = numCount[i - 1] + numCount[i];
        }
        for (int j = target.length - 1; j >= 0; j--) {
            tmp[numCount[target[j]] - 1] = target[j];
            numCount[target[j]] = numCount[target[j]] - 1;
        }

        System.arraycopy(tmp, 0, target, 0, target.length);
    }


    public static void main(String[] args) {
        int[] target = {5, 3, 1, 6, 4, 9, 0, 2, 8, 6, 7};
        int[] tmp = new int[target.length];
        System.out.println("before sort: ");
        for (int x : target) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

/*        insertSort(target);

        Arrays.sort(target);

        mergeSort(target, 0, target.length - 1);

        heapSort(target);

        quickSort(target, 0, target.length - 1);*/

        countSort(target, tmp, 9);


        System.out.println("\nafter sort: ");
        for (int x : target) {
            System.out.print(x + " ");
        }

    }

}
