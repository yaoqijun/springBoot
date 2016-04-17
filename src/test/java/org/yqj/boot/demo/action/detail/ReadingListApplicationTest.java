package org.yqj.boot.demo.action.detail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by yaoqijun.
 * Date:2016-04-17
 * Email:yaoqj@terminus.io
 * Descirbe:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReadingListApplication.class)
@WebAppConfiguration
public class ReadingListApplicationTest {

    @Test
    public void testCondition(){
        System.out.println("test condition");
    }

}
