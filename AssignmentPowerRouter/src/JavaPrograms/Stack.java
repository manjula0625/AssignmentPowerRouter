package JavaPrograms;

import java.util.PriorityQueue;

public class Stack 
{
	PriorityQueue<Base> queue = new PriorityQueue<Base>();/*10, new Comparator<Base>()
	{
        @Override
        public int compare(Base o1, Base o2) 
        {
            return o2.key - o1.key;
        }
	}*/
    
    int order = 1;
    
    public void push(int val){
        Base element = new Base(order++,val);
        queue.add(element);
    }
    
    public Integer pop(){
        
        if(queue.isEmpty()){
            System.out.println("Stack Underflow");
            return null;
        }
        
        return queue.poll().value;
    }

	public static void main(String[] args) {
		 Stack q = new Stack();
	        q.push(2);
	        q.push(4);
	        q.push(6);
	        
	        System.out.print(q.pop()+" ");
	        System.out.print(q.pop()+" ");
	        System.out.print(q.pop()+" ");

	}

	}
	

