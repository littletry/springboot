package top.huangt.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.huangt.springboot.dao.RedisDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringbootApplicationTests.class);

    @Test
    public void contextLoads() {
    }

    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis() {
        redisDao.setKey("name", "huangt");
        redisDao.setKey("age", "18");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
    }

}
