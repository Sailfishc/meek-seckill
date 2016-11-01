package com.sailfish.dao;

import com.sailfish.BaseTest;
import com.sailfish.entity.Seckill;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by travis on 2016/10/29.
 */
public class SeckillDaoTest extends BaseTest{

    //注入dao实现类依赖
    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void testQueryById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
        //Assert.assertArrayEquals();
    }


    @Test
    public void testQueryAll() throws Exception {
        //Parameter 'offset' not found. Available parameters are [0, 1, param1, param2]
        // java没有保存形参的记录:queryAll(int offset, int limit) -> queryAll(arg1,arg2)
        List<Seckill> seckills = seckillDao.queryAll(0, 10);
        for (Seckill seckill : seckills) {
            System.out.println(seckill.getName());
        }
    }

    @Test
    public void testReduceNumber() throws Exception {
        int i = seckillDao.reduceNumber(1000L, new Date());
        System.out.println(i);
    }


    @Test
    public void testKillByProcedure() throws Exception {

    }
}
/*
------------------------
100元秒杀iphone6
Seckill [seckillId=1000, name=100元秒杀iphone6, number=98, startTime=Fri Jun 24 14:04:20 CST 2016, endTime=Wed Jun 15 00:00:00 CST 2016, createTime=Fri Jul 01 00:00:00 CST 2016]
-------------------------
100元秒杀ipad
100元秒杀iphone6
100元秒杀红米
100元秒杀mac
-------------------------
0
-------------------------
 */