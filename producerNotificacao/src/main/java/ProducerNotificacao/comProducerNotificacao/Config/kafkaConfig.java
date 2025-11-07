package ProducerNotificacao.comProducerNotificacao.Config;


import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import ProducerNotificacao.comProducerNotificacao.DTO.NotificacaoDTO;


@Configuration
public class kafkaConfig {
    
  @Bean
    public KafkaTemplate<String, NotificacaoDTO> kafkaTemplate(ProducerFactory<String, NotificacaoDTO> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }
}
