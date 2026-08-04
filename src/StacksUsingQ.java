import java.util.LinkedList;
public class StacksUsingQ {
    private LinkedList<Integer> arr;
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public StacksUsingQ() {
        this.arr=new LinkedList();
    }
    
    public void push(int x) {
        this.arr.add(x);
    }
    
    public int pop() {
        int n=this.arr.size();
        for (int i=1; i<n; i++){
            int t=this.arr.removeFirst();
            this.arr.add(t);
        }
        return this.arr.removeFirst();
    }
    
    public int top() {
        int val=pop();
        push(val);
        return val;
    }
    
    public boolean empty() {
        return (this.arr.size()==0);
    }
}