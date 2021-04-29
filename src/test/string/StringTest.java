package test.string;

import test.LogUtils;

public class StringTest {

    public static void main(String[] args) {
        String src = "abcdefg";
        StringFunction s  = new StringFunImpl();
        LogUtils.log(s.handleStr(src,2));
    }
}
