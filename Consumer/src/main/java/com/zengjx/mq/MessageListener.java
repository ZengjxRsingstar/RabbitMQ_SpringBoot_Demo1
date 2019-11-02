package com.zengjx.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/2  12:33
 * @Version V1.0
 */
@Component
public class MessageListener {

    /**
     * 监听某个队列的消息
     */
    @RabbitListener(queues ="topic_queue_boot1" )
    public   void   getMessage(String  msg){
        System.out.println("msg "+msg);

}


}
