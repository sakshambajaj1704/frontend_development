public class merge2sortedArray {
    /**
     * @param head1
     * @param head2
     * @return
     */
    public static Node<Integer> takeInput(Node<Integer> head1,Node<Integer> head2){
        if head1==null{
            return head2;
        }
        if head2==null{
            return head1;
  }
        Node<Integer> newHead=null,newTail=null;
        while(head1 !=null && head2 !=null){

        if(head1.data<head2.data){
            newHead=head1;
            newTail=head1;
            head1=head1.next;
        }
        else{
            newHead=head2;
            newTail=head2;
            head2=head2.next;

        }
        while(head1 !=null && head2! =null){
            if(head1.data<head2.data){
                newTail.next=head1;
                newTail=newTail.next;
                head1=head1.next;
            }else{
                newTail.next=head2;
                newTail=newTail.next;
                head2=head2.next;

            }
        }
        if(head1 !=null){
            newTail.next=head1;
        }
        if(head2 !=null){
            newTail.next=head2;
        }
        return newHead;
        
    }
    
    
}
