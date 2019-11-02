package com.zengjx.mq;

import com.zengjx.mq.config.SpringBootApplicationStart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/2  11:05
 * @Version V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationStart.class )

public class SpringBootMqTest {

@Autowired
private RabbitTemplate  rabbitTemplate;
@Test
public   void   testMessage(){

   rabbitTemplate.convertAndSend("topic_exchange_boot1","log.info","log.info提示信息");
   rabbitTemplate.convertAndSend("topic_exchange_boot1","log.error","log.erro提示信息");
   rabbitTemplate.convertAndSend("topic_exchange_boot1","log.warning","log.warning提示信息");



}



}
