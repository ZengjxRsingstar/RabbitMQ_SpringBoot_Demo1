package com.zengjx.mq.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/2  11:02
 * @Version V1.0
 */
@Configuration
public class RabbitMQConfig {

   //1.创建交换机
  @Bean(name ="topicExchange" )
  public TopicExchange  topicExchange(){


   return   new TopicExchange("topic_exchange_boot1");
  }
   //2.创建消息队列
  @Bean(name ="topicQueue" )
  public Queue   topicQueue(){
  return   new Queue("topic_queue_boot1");
  }
    //3.队列绑定
    @Bean
   public Binding   bindingExchangeTopicQueue(@Qualifier("topicExchange") TopicExchange exchange,
    @Qualifier("topicQueue")  Queue  queue){

      //return BindingBuilder.bind(queue).to(exchange).with("log.#");
        return BindingBuilder.bind(queue).to(exchange).with("log.#");
   }
}
