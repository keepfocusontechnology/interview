package test.design.single;


//外部类加载时不需要立即加载内部类，所以节约内存。只有getIns调用时才会去初始化Instance
public class SingleTon {

    private SingleTon(){}


    public static SingleTon getIns(){
       return Holder.INS;
    }

    private static class Holder{
        private static SingleTon INS = new SingleTon();
    }

}

/**
 * 双重锁校验
 *
 * 三步
 *   1.在堆内存开辟内存空间。
 *   2.在堆内存中实例化SingleTon里面的各个参数。
 *   3.把对象指向堆内存空间。
 */
class SingleInstance {

    private static volatile SingleInstance ins ;

    private SingleInstance(){}
    public static SingleInstance getIns(){
        //第一次判断 INSTANCE == null为了避免非必要加锁，
        // 当第一次加载时才对实例进行加锁再实例化
        //这样既可以节约内存空间，又可以保证线程安全。
        if(ins == null){
            synchronized (SingleInstance.class){
                if(ins == null){
                    ins = new SingleInstance();
                }
            }
        }
        return ins;
    }
}

