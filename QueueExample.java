package Codelab;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Membuat objek queue
        Queue<Integer> queue = new LinkedList<>();

        // Menambahkan elemen ke dalam queue (enqueue)
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Menampilkan elemen pertama tanpa menghapusnya (peek)
        System.out.println("Front of the queue: " + queue.peek());

        // Menghapus elemen dari queue (dequeue)
        System.out.println("Dequeued element: " + queue.poll());

        // Menampilkan elemen pertama setelah dequeue
        System.out.println("Front of the queue after dequeue: " + queue.peek());

        // Memeriksa apakah queue kosong
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}