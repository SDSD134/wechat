package com.wechat.util;


import org.springframework.beans.factory.annotation.Value;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RedisUtil {
    private static  String HOST = "39.104.141.30";
    private  static  Integer PORT =6379;
    private static String AUTH="1234";
    private static final int MAX_TOTAL = 8;  //最大连接数
    private static final int MIN_IDLE = 0;  //最小空闲连接数
    private static final int MAX_IDLE = 8;  //最大空闲连接数
    private static int TIMEOUT = 10000;     //等待可用连接
    private static JedisPool jedisPool = null;

    static{
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxIdle(MAX_IDLE);
            config.setMinIdle(MIN_IDLE);
            config.setMaxIdle(MAX_IDLE);
            jedisPool = new JedisPool(config,HOST,PORT,TIMEOUT,AUTH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取jedis实例
    public synchronized static Jedis getJedis() {
        try {
            if (jedisPool != null) {
                Jedis jedis = jedisPool.getResource();
                return jedis;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 释放jedis资源
     * @param jedis
     */
    public static void close(final Jedis jedis) {

        if (jedis != null) {
            jedis.close();
        }
    }

}
