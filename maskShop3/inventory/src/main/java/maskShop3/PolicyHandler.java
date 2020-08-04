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
    InventoryRepository inventoryRepository;


    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeliveryRegisterd_Change(@Payload DeliveryRegisterd deliveryRegisterd){

        if(deliveryRegisterd.isMe()){
            System.out.println("##### listener Change : " + deliveryRegisterd.toJson());

            Inventory inventory = new Inventory();
            inventory.setProductId(deliveryRegisterd.getProductId());
            inventory.setInvQty(deliveryRegisterd.getInvQty());
            inventoryRepository.save(inventory);

        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeliveryCanceled_Change(@Payload DeliveryCanceled deliveryCanceled){

        System.out.println("##### listener Change : " + deliveryCanceled.toJson());

        if(deliveryCanceled.isMe()){
            System.out.println("##### listener Change : " + deliveryCanceled.toJson());
            System.out.println("##### listener Change deliveryCanceled.getOrderId(): " + deliveryCanceled.getOrderId());


        }
    }

}
