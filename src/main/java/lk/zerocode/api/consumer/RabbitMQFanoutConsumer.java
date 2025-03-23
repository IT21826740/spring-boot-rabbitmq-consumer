package lk.zerocode.api.consumer;

import lk.zerocode.api.RabbitMQQueueConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQFanoutConsumer {

    @RabbitListener(queues = RabbitMQQueueConfig.FANOUT_QUEUE_ONE)
    public void consumeQueueOne(String message) {
        System.out.println("Fanout Queue1 received: " + message);
    }

    @RabbitListener(queues = RabbitMQQueueConfig.FANOUT_QUEUE_TWO)
    public void consumeQueueTwo(String message) {
        System.out.println("Fanout Queue2 received: " + message);
    }
}
