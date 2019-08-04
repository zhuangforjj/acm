import java.util.Stack;

/**
 * @author jj
 * @date 2019/8/4-4:27 PM
 * 要求：1.pop、push、getMin操作的最小时间都是O(1。
 *      2.设计的栈类型可以使用现成的栈结构
 */
public class Mystatic1 {
    private Stack<Integer> stackDate;
    private Stack<Integer> stackMin;

    public Mystatic1(){
        this.stackDate=new Stack<Integer>();
        this.stackMin=new Stack<Integer>();
    }

    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum<=this.getmin()){
            this.stackMin.push(newNum);
        }
        this.stackDate.push(newNum);
    }

    public int pop(){
        if(this.stackDate.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        int value=this.stackDate.pop();
        if(value==this.getmin()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getmin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        Mystatic1 mystatic=new Mystatic1();
        for (int i = 0; i < 10; i++) {
            mystatic.push(i+1);
        }
        System.out.println(mystatic.getmin());
    }
}
