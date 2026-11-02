class Node {
    int data;
    Node next;
    
    Node(int data,Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    public Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i < arr.length;i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public void traverseLL(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node insertAtHead(int data,Node head) {
        Node temp = new Node(data,head);
        return temp;
    }

    public Node insertAtTail(int data,Node head) {
        if(head == null) {
            return new Node(data);
        }
        Node tail = new Node(data);
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = tail;
        return head;
    }

    public Node insertAtKthPosition(int data,int k,Node head) {
        if(head == null) {
            if(k == 1) {
                return new Node(data);
            }
            else {
                return null;
            }
        }
        if(k == 1) {
            return new Node(data,head);
        }
        int count = 1;
        Node curr = head;
        while(curr.next != null) {
            if(count == k - 1) {
                Node temp = new Node(data,curr.next);
                curr.next = temp;
                return head;
            }
            count++;
            curr = curr.next;
        }
        return head;
    }

    public Node insertBeforeElement(int data,int ele,Node head) {
        if(head == null) {
            return head;
        }
        if(head.data == ele) {
            return new Node(data,head);
        }
        Node curr = head;
        while(curr.next != null) {
            if(curr.next.data == ele) {
                Node temp = new Node(data,curr.next);
                curr.next = temp;
                return head;
            }
            curr = curr.next;
        }
        return head;
    }

    public Node removeHead(Node head) {
        if(head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    public Node removeTail(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return  head;
    }

    public Node removeKthNode(int k,Node head) {
        if(head == null) {
            return head;
        }
        
        if(k == 1) {
            head = head.next;
            return head;
        }
        int count = 1;
        Node curr = head;
        while(curr.next != null) {
            if(count == k -1) {
                curr.next = curr.next.next;
                return head;
            }
            curr = curr.next;
            count++;
        }
        return head;
    }

    
 }

class LLCreation {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5};
        LinkedList ll = new LinkedList();
        Node head = ll.convertToLL(arr);
        System.out.println(head.data);
        ll.traverseLL(head);
        
        System.out.println(head.next);

        head = ll.insertAtHead(9,head);
        ll.traverseLL(head);
        head = ll.insertAtTail(100,head);
        ll.traverseLL(head);
        head = ll.insertAtKthPosition(50,3,head);
        ll.traverseLL(head);
        head = ll.insertBeforeElement(30,50,head);
        ll.traverseLL(head);
        head = ll.removeHead(head);
        ll.traverseLL(head);
        head = ll.removeTail(head);
        ll.traverseLL(head);
        head = ll.removeKthNode(4, head);
        ll.traverseLL(head);
        head = ll.removeKthNode(5, head);
        ll.traverseLL(head);
        head = ll.removeKthNode(5, head);
        ll.traverseLL(head);
    }
}