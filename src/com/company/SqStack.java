package com.company;

/**
 * @author wgl
 * @ClassName sqStack.java
 * @Description
 * @createTime 2019/11/13  17:31:00
 */
public class SqStack{
    //创建一个对象数组
    private Object[] stackElem;
    //数组下标，栈顶
    private int top;

    public SqStack(int maxSize)
    {
        stackElem=new Object[maxSize];
        top=0;
    }

    //清空
    public void clear()
    {
        top=0;
    }
    //是否为空
    public boolean isEmpty()
    {
        return top==0;
    }
    //元素个数
    public int length()
    {
        return top;
    }
    //栈顶
    public Object peek()
    {
        if(!isEmpty())
            return stackElem[top-1];
        else
            return null;
    }

    //入栈
    public void push(Object x) throws Exception
    {
        if(top==stackElem.length)
        {
            throw new Exception("栈已满！");
        }
        else
        {   //todo
            stackElem[top++]=x;
        }
    }
    //出栈
    public Object pop() throws Exception
    {
        if(top==0)
        {
            throw new Exception("栈为空！");
        }
        else
            return stackElem[--top];  //删除然后返回现在的栈顶
    }

    //打印（从栈顶到栈底）
    public void display()
    {
        for(int i=length()-1; i>=0; i--)
        {
            System.out.print(stackElem[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception
    {
        SqStack sqStack=new SqStack(20);
        sqStack.push(3);
        sqStack.push(6);
        sqStack.push(9);
        sqStack.push("test");

        System.out.print("打印输出： ");
        sqStack.display();

//        int top=(int)sqStack.peek();
        System.out.println("栈顶： "+sqStack.peek());

        sqStack.pop();
        System.out.print("弹出栈顶，打印输出： ");
        sqStack.display();

    }
}
