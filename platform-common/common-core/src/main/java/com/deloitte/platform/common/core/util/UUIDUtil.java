package com.deloitte.platform.common.core.util;


/**
 * Created by jackliu on 09/11/2017.
 * @Description 全局UUID生成工具类
 */
public class UUIDUtil {

    /*
     * 知识点：
     * UUID(Universally Unique Identifier)全局唯一标识符,是指在一台机器上生成的数字；
     * 它保证对在同一时空中的所有机器都是唯一的。
     * 按照开放软件基金会(OSF)制定的标准计算，
     * 用到了以太网卡地址、纳秒级时间、芯片ID码和许多可能的数字。
     * 由以下几部分的组合：当前日期和时间
     * (UUID的第一个部分与时间有关，如果你在生成一个UUID之后，过几秒又生成一个UUID，则第一个部分不同，其余相同)，
     * 时钟序列，全局唯一的IEEE机器识别号（如果有网卡，从网卡获得，没有网卡以其他方式获得）
     * UUID的唯一缺陷在于生成的结果串会比较长。
     * 在Java中生成UUID主要有以下几种方式:
     * 1 JDK1.5 如果使用的JDK1.5的话,那么生成UUID变成了一件简单的事,因为JDK实现了UUID:
     * java.util.UUID,直接调用即可.
     * UUID uuid = UUID.randomUUID();
     * String s = UUID.randomUUID().toString();用来生成数据库的主键id非常不错。
     * UUID是由一个十六位的数字组成,表现出来的形式例如 550E8400-E29B-11D4-A716-446655440000
     */

    /***
     * 随机产生32位16进制字符串
     *
     * @return
     */
    public static String getRandom32PK() {

        return java.util.UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println("随机" + UUIDUtil.getRandom32PK().length() + "位：" + UUIDUtil.getRandom32PK());
    }
}
