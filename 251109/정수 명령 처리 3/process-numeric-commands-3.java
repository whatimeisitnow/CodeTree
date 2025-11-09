import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 줄바꿈 제거
        // Please write your code here.

        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i < n; i++){
            String input = sc.nextLine();
            String [] arr = input.split(" ");
            String query = arr[0];

            switch (query) {
                case "push_front":
                    int first = Integer.parseInt(arr[1]);
                    dq.addFirst(first); break;
                case "push_back":
                    int last = Integer.parseInt(arr[1]);
                    dq.addLast(last); break;
                case "pop_front":
                    System.out.println(dq.pollFirst()); break;
                case "pop_back":
                    System.out.println(dq.pollLast()); break;
                case "size":
                    System.out.println(dq.size()); break;
                case "empty":
                    int n1 = dq.isEmpty() ? 1 : 0;
                    System.out.println(n1); break;
                case "front":
                    System.out.println(dq.peekFirst()); break;
                case "back":
                    System.out.println(dq.peekLast()); break;

            }
        }
    }
}