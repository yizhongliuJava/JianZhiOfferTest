package com.java.Test.StackListNode;


import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表节点的值
 *
 * @author liuyizhong
 * @date 2018/8/13 9:56
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();//因为最后放入数组ArrayList中的是Integer类型  故要确定Integer类型
        //Stack<ListNode> stack = new Stack<>()//当存入的是ListNode对象
        while(listNode != null){
            stack.push(listNode.val);
            //stack.push(listNode);
            listNode = listNode.next;
        }
        //System.out.println(stack.size());
       /* for(int i=0;i<=stack.size()+1;i++){
            list.add(stack.pop());
           +1是因为pop()取值后stack.size()容量在动态减小
        }*/
       while (!stack.isEmpty()){
           list.add(stack.pop());
           //list.add(stack.pop().val);
       }

        return list;
    }
    public static void main(String []args){
        PrintListFromTailToHead printListFromTailToHead = new PrintListFromTailToHead();
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        listNode1.next = listNode2;//节点拼接
        listNode2.next = listNode3;//节点拼接


        System.out.println(printListFromTailToHead.printListFromTailToHead(listNode1));
    }

}
