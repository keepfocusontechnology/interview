package test.jvm;

import test.LogUtils;

import java.util.Arrays;
import java.util.List;

/**
 * 类加载机制学习
 */
public class CustomClassLoader {

    private static final String BOOT_PATH = "sun.boot.class.path"; //读取启动类加载器的目录
    private static final String EXT_PATH = "java.ext.dirs"; //读取扩展类加载器的目录
    private static final String SYS_PATH = "java.class.path"; //读取系统类加载器的目录
    public static void main(String[] args) {
        bootClassLoaderLoadingPath(BOOT_PATH);
        LogUtils.logLine();
        bootClassLoaderLoadingPath(EXT_PATH);
        LogUtils.logLine();
        bootClassLoaderLoadingPath(SYS_PATH);
    }


    public static void bootClassLoaderLoadingPath(String path){

        final String property = System.getProperty(path);
        final String[] split = property.split(":");
        final List<String> strings = Arrays.asList(split);
        for (String s: strings) {
            LogUtils.logLn(s);
        }
    }

}
