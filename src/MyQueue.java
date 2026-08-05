class MyQueue {
    private int max=100;
    private int[] stack1, stack2;
    private int last1, last2;
    public MyQueue() {
        this.stack1=new int[max];
        this.stack2=new int[max];
        this.last1=this.last2=-1;
    }
    
    public void push(int x) {
        (this.stack1)[++(this.last1)]=x;
    }
    
    private void transfer(){
        if (this.last2==-1){
            while (this.last1>=0){
                (this.stack2)[++(this.last2)]=(this.stack1)[this.last1];
                this.last1--;
            }
        }
    }

    public int pop() {
        transfer();
        return (this.stack2)[(this.last2)--];
    }
    
    public int peek() {
        transfer();
        return (this.stack2)[this.last2];
    }
    
    public boolean empty() {
        return (this.last1==-1 && this.last2==-1);
    }
}