package Algorithms;

import java.util.PriorityQueue;

public class LC0215_Kth_largest_element_in_a_array {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue minHeap = new PriorityQueue();
        for( int i: nums){
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }
        return (int) minHeap.peek();
    }
}
