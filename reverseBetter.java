 import java.util.Scanner;
public class reverseBetter {
    
    
    
    
    
    
     public static Node<Integer> reverseR(Node<Integer>head){
        if(head==null||head.next==null){
            return head;
        }
        Node<Integer> finalHead=reverseR(head.next);
        Node<Integer> temp=finalHead;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=head;
        head.next=null;
        return finalHead;


    }














    public static Node<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        Node<Integer> head=null, tail=null;
        
        int data=s.nextInt();
        while(data!=-1){
            Node<Integer> newNode=new Node<Integer>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
                
            }
            else{
                Node<Integer>temp = head;
                while(temp.next !=null){
                    temp=temp.next;
                }
                    temp.next=newNode;
                    tail.next=newNode;
                    tail=tail.next;
                }
                data=s.nextInt();
            }
            return head;
}

public static void print(Node<Integer> head){

    
    //Node<Integer> temp=head;
    while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
       }
       System.out.println();
  }

  public static void main(String[] args) {
    Node<Integer> head=takeInput();
    head=reverseR(head);
    print(head);
  }
}
