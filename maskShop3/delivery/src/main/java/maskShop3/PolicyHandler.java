package maskShop3;

import maskShop3.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{


    @Autowired
    DeliveryRepository deliveryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }






    /*
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrderCanceled_OrderCancel(@Payload OrderCanceled orderCanceled){

        System.out.println("##### listener OrderCancel 1111111: " + orderCanceled.toJson());

        if(orderCanceled.isMe()){

            System.out.println("##### listener OrderCancel 2222222222222 : " + orderCanceled.toJson());

            Delivery delivery = new Delivery();

          //  deliveryRepository.findById(Long.valueOf(orderCanceled.getOrderId())).ifPresent((delivery)->{

                System.out.println("##### listener OrderCancel 333333333333333 : " + deliveryRepository.findById(Long.valueOf(orderCanceled.getOrderId())));
              // delivery.setOrderId(orderCanceled.getOrderId());
                delivery.setStatus("canceled");
                deliveryRepository.save(delivery);
//            });


            System.out.println("##### listener OrderCancel : " + orderCanceled.toJson());

       }
    }

     */
}
