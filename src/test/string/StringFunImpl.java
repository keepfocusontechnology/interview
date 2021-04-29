package test.string;

import test.LogUtils;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，
 * 该函数将返回左旋转两位得到的结果"cdefgab"。
 */
public class StringFunImpl implements StringFunction {


    @Override
    public String handleStr(String src) {
        return null;
    }

    public String handleStr2(String src, int n) {

        String temp = src;
        temp = temp.substring(0,n);
        String temp2 = src.substring(n,src.length());

        LogUtils.logLn(temp);
        LogUtils.logLn(temp2);

        return temp2+temp;
    }

    @Override
    public String handleStr(String src, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isNeedBreak = false;
        int num = src.length();
        for(int i=n;i<num;i++){
            if(!isNeedBreak && i == num-1){
                stringBuilder.append(src.charAt(i));
                i=0;
                num=n;
                isNeedBreak = true;
            }
            stringBuilder.append(src.charAt(i));
        }
        return stringBuilder.toString();
    }

    public int sumNums(int n) {
        int sum =0 ;
        sum +=n;
        if(n == 0){
            return sum;
        }else{
            return sumNums(n-1);
        }

    }
}
