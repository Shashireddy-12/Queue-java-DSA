public class queuecirarr {
    static class Queue{
        static int size;
        static int arr[];
        static int rear=-1;
        static int front=-1;
        public Queue(int size)
        {
            this.size=size;
            arr=new int[size];
        }
        public static boolean isEmpty()
        {
            return front==-1&&rear==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
        public void add(int data)
         {
            if(isFull())
            {
                System.out.println("is full");
                return;
            }
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

         }
         public int remove()
         {
            if(isEmpty())
            {
                System.out.println("it is empty");
                return -1;
            }
            int result=arr[front];
            if(front==rear)
            {
                front=rear=-1;
            }
            else
            {
            front=(front+1)%size;
            }
            return result;

         }
         public int peek()
         {
            if(isEmpty())
            {
                System.out.println("is empty");
                return -1;
            }
            return arr[front];
         }
    }
    public static void main(String a[])
    {
        Queue q=new Queue(7);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
                q.remove();
                q.remove();
                q.add(1);
                q.add(2);
                while(!q.isEmpty())
                {
                    System.out.println(q.peek());
                    q.remove();
                }

    }
    
}
