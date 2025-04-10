package Codelab;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Membuat objek stack
        Stack<Integer> stack = new Stack<>();

        // Menambahkan elemen ke stack (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Menampilkan elemen top tanpa menghapusnya (peek)
        System.out.println("Top of the stack: " + stack.peek());

        // Menghapus elemen dari stack (pop)
        System.out.println("Popped element: " + stack.pop());

        // Menampilkan elemen top setelah pop
        System.out.println("Top of the stack after pop: " + stack.peek());

        // Memeriksa apakah stack kosong
        System.out.println("Is the stack empty? " + stack.empty());
    }
}