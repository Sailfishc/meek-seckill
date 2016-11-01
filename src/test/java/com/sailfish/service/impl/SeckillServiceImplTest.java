package com.sailfish.service.impl;

import com.sailfish.BaseTest;
import com.sailfish.entity.Seckill;
import com.sailfish.service.SeckillService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by travis on 2016/10/30.
 */
public class SeckillServiceImplTest extends BaseTest{

    private static final Logger LOGGER = LoggerFactory.getLogger(SeckillServiceImplTest.class);

    @Autowired
    private SeckillService seckillService;

    @Test
    public void testGetSeckillList() throws Exception {
        List<Seckill> list = seckillService.getSeckillList();
        LOGGER.info("list={}", list);
    }

    @Test
    public void testGetById() throws Exception {

    }

    @Test
    public void testExportSeckillUrl() throws Exception {

    }

    @Test
    public void testExecuteSeckill() throws Exception {

    }
}