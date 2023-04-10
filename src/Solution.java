import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        Stack<Integer>mystack =new Stack<>();
        mystack.push(-1);
        for (int i=0 ;i< s.length();i++)
        {
            char temp=s.charAt(i);
            if (temp=='(')
                mystack.push(i);
            else
            {
                mystack.pop();
                if (mystack.empty())
                    mystack.push(i);
                else
                    max=Math.max(max,i-mystack.peek());
            }
        }
        return max;
    }
}
