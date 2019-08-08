package com.h2t.log;

/**
 * com.h2t.study MyLogger接口的实现类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/08/08 17:48
 */
public class MyLogger {
    /**
     * 打印info
     *
     * @param logInfo
     * */
    public void info(String logInfo) {
        System.out.println(logInfo);
    }

    /**
     * 打印error
     *
     * @param logError
     * @return
     **/
    public void error(String logError) {
        System.out.println(logError);
    }
}
