package lk.zerocode.api.consumer;

import com.rabbitmq.client.Channel;
import lk.zerocode.api.RabbitMQQueueConfig;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RabbitMQDirectConsumer {

    //messages will be removed automatically  from queue once is delivered to the consumer
    @RabbitListener(queues = RabbitMQQueueConfig.DIRECT_QUEUE_ONE)
    public void receiveMessageFromQueueOne(String message) {
        System.out.println("Received from Direct QueueOne: " + message);
    }

    //messages will be removed from queue after manually acknowledge from consumer
    @RabbitListener(queues = RabbitMQQueueConfig.DIRECT_QUEUE_TWO, ackMode = "MANUAL")
    public void receiveMessageFromQueueTwo(Message message, Channel channel) throws IOException {

        String messageBody = new String(message.getBody());
        System.out.println("Received from Direct QueueTwo: " + messageBody);

        // Manually acknowledge the message (removes it from the queue)
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }
}
