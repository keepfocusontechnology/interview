package test.collection;


import test.LogUtils;

/**
 * 环形队列,从队尾插入，头指针永远指向空格子
 * 队头指针和队尾指针指向同一个指针，则队列为null
 * 队尾指针指向空，队头指针指向队头，则已满。
 *
 */
public class CircleQueue {

    int first; //头指针
    int last; //尾指针

    int size;

    private int[] nums;

    public CircleQueue(int n){
        first = 0;
        last = 0;
        this.size = n+1;
        nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i] = -1;
        }
    }


    public boolean isEmpty(){
        return  first == last;
    }

    /**
    * 尾指针指向头指针前面一格时为满
     */
    public boolean isFull(){
        return  first == (last+1) %  size;
    }
    public void push(int element){
        if(!isFull()){
            nums[last] = element;
            last = (last+1) % size; //例如长度为5，进来一个，last当前为0+1 % 5 = 1 ，first不变
        }else {
            throw new IndexOutOfBoundsException("已经满了，当前长度为 :"+(size-1));
        }
    }

    public int pop(){
        if(!isEmpty()){
            int temp = nums[first];
            nums[first] = -1;
            first = (first+1) % size; //例如长度为5，进来一个，last当前为0+1 % 5 = 1 ，first不变
            return temp;
        }else {
            throw new IndexOutOfBoundsException("没了已经");
        }
    }

    public void printSelf(){
        if(nums.length >0){
            LogUtils.printArray(nums);
        }
    }

}
