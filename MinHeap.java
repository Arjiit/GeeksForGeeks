import java.io.*;
import java.util.*;
import java.lang.*;

// O(n*logn) - not tighter bound
//  We can derive a tighter bound by observing that the running time of Heapify
// depends on the height of the tree ‘h’ (which is equal to lg(n), where n is number of nodes) 
// and the heights of most sub-trees are small.

//Time complexity for Building a Binary Heap is O(n). (tighter bound)

public class MinHeap {
    private int[] Heap;
    private int size;
    private int maxSize;

    private static final int FRONT = 1;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return pos/2;
    }

    private int leftChild(int pos) {
        return (2*pos);
    }

    private int rightChild(int pos) {
        return (2*pos) + 1;
    }

    private boolean isLeaf(int pos) {
            if (pos >= size/2 && pos <=size) {
                return true;
            }
        return false;
    }

    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    } 

    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (Heap[pos] > Heap[rightChild(pos)] || Heap[pos] > Heap[leftChild(pos)]) { // < condition for maxHeap
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) { // > condition for maxHeap  
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }  

    public void insert(int element) {
        Heap[++size] = element;
        int current = size;

        while(Heap[current] < Heap[parent(current)]) { // > condition for maxHeap 
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print() {
        for (int i = 1; i<= size/2; i++) {
            System.out.print("Parent :" + Heap[i] + "Leftchild: " + Heap[2*i] + "RightChild: " + Heap[2*i + 1]);
            System.out.println();
        }
    }

    public void minHeap() {
        for (int pos = size/2; pos>= 1; pos--) {
            minHeapify(pos);
        }
    }

    public int remove() {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
        return popped;
    }

    public static void main(String[] args) {

        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.minHeap();

    minHeap.print();

            System.out.println("The Min val is " + minHeap.remove());

        System.out.println("The Min val is " + minHeap.remove());

        System.out.println("The Min val is " + minHeap.remove());

    }
}