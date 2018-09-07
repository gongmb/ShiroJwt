package com.wang.model.common;

/**
 * 常量
 * @author Wang926454
 * @date 2018/9/3 16:03
 */
public class Constant {
    /**
     * 1
     */
    public static final Integer INTEGER_1 = 1;

    /**
     * 2
     */
    public static final Integer INTEGER_2 = 2;

    /**
     * redis-OK
     */
    public final static String OK = "OK";

    /**
     * redis过期时间，以秒为单位，一分钟
     */
    public final static int EXRP_MINUTE = 60;

    /**
     * redis过期时间，以秒为单位，一小时
     */
    public final static int EXRP_HOUR = 60 * 60;

    /**
     * redis过期时间，以秒为单位，一天
     */
    public final static int EXRP_DAY = 60 * 60 * 24;

    /**
     * redis-key-prefix-shiro:cache:account
     */
    public final static String PREFIX_SHIRO_CACHE = "shiro:cache:";

    /**
     * redis-key-prefix-shiro:access_token:account
     */
    public final static String PREFIX_SHIRO_ACCESS = "shiro:access_token:";

    /**
     * redis-key-prefix-shiro:refresh_token:account
     */
    public final static String PREFIX_SHIRO_REFRESH = "shiro:refresh_token:";

}
