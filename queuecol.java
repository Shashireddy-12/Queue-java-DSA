import java.util.*;
public class queuecol {
    public static void main(String a[])
    {
        Queue<Integer> q=new LinkedList<>();// here we are using LinkedList rather than Queue because Queue is a abstract instance so it is defined by another class for thatv we have LinkedList, ArrayDeque, PriorityQueue
        q.add(1);
        q.add(2);
        q.add(4);
        q.remove();
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
