//implementing queue using array
public class queuearr
{
static class Queue{
    static int size;
    static int rear=-1;
    static int arr[];
    Queue(int size)
    {
         arr=new int[size];
        this.size=size;
    }
    public boolean isEmpty()
    {
        return rear==-1;
    }
    public void add(int data)
    {
        if(rear==size-1)
        {
            System.out.println("is empty");
            return;
        }
        rear++;
        arr[rear]=data;

    }
    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++)
        {
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return -1;

        }
        return arr[0];

    }

}
public static void main(String a[])
{
    Queue list=new Queue(5);
    list.add(1);
    list.add(2);
    list.add(3);
    while(!list.isEmpty())
    {
        System.out.println(list.peek());
        list.remove();


    }
}
}