package ProducerNotificacao.comProducerNotificacao.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
public NewTopic topic1() {
    return TopicBuilder.name("notificacao_novo")
            .partitions(2)
            .replicas(1)
            .compact()
            .build();
}
}
