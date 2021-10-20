
public class ReverseLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {

			this.data = data;
			next = null;
		}
	}

	Node iterativeReverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		node = prev;
		return node;
	}
	
	Node recursiveReverse(Node curr, Node prev) {
		if(curr.next == null) {
			head = curr;
			curr.next = prev;
			return null;
		}
		
		Node next1 = curr.next;
		curr.next = prev;
		
		recursiveReverse(next1, curr);
		return head;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		
		System.out.println("Original Linked List: - ");
		list.printList(head);
		System.out.println();
		
		System.out.println("Iterative Reverse Linked List");
		head = list.iterativeReverse(head);
		list.printList(head);
		System.out.println();
		
		System.out.println("Recursive Reverse Linked List");
		head = list.recursiveReverse(head, null);
		list.printList(head);
	}

}
