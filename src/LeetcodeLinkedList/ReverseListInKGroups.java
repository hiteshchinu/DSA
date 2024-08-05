package LeetcodeLinkedList;

// import org.w3c.dom.Node;

public class ReverseListInKGroups {

//    https://leetcode.com/problems/reverse-nodes-in-k-group/solutions/5593251/recursive-code/
    
// public class Solution {
//     public static Node kReverse(Node head, int k) {
//         // Write your code here.
//         if (head == null || head.next == null) return head;

//         Node prev = null;
//         Node next = null;
//         Node current = head;
        

//         Node temp = head;
//         int count = 0;
//         while (count < k && temp != null) {
//             temp = temp.next;
//             count++;
//         }

//         // If we have fewer than k nodes left, return head as is
//         if (count < k) {
//             return head;
//         }


//         count = 0;
//         while(count < k && current != null){
//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//             count++;
//         }

//         if (next != null) {
//             head.next = kReverse(next, k);
//         }
//         return prev;
//     }
// }
}
