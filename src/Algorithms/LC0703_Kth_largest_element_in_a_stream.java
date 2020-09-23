package Algorithms;

import java.util.PriorityQueue;

public class LC0703_Kth_largest_element_in_a_stream {
    PriorityQueue minHeap = new PriorityQueue();

    public LC0703_Kth_largest_element_in_a_stream(int k, int[] nums) {
        for(int i : nums){
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }
        System.out.println(minHeap.size());
        if(minHeap.size()<k){
            minHeap.add(2147483647);
        }
    }

    public int add(int val) {
        minHeap.add(val);
        minHeap.remove();
        return (int) minHeap.peek();
    }

    public static void main(String[] args) {
        LC0703_Kth_largest_element_in_a_stream aa = new LC0703_Kth_largest_element_in_a_stream(3, new int[]{});
        System.out.println(aa.add(3));

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
