import java.util.*;
public class ArrayListTakeInput {
    /**
     * @return
     */
    public static ArrayList<Integer> takeInput(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        while(i!=-1){

            list.add(i);
        }
        return list;


    
}

public static void print(ArrayList<Integer> list2){
    for(int i=0; i<list2.size(); i++) {
        System.out.print(list2.get(i) + " ");
    }
}
public static void main(String[] args) {
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    list2=takeInput();
    print(list2);

    
}
}