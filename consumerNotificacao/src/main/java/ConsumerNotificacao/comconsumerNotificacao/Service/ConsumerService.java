package ConsumerNotificacao.comconsumerNotificacao.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import ConsumerNotificacao.comconsumerNotificacao.DTO.NotificacaoDTO;

@Service
public class ConsumerService {
    

    @KafkaListener(topics = "notificacao_novo", groupId = "comconsumerNotificacaoGroupV2")
    public void  consumindoMensagem(NotificacaoDTO notificacao){
        System.out.println("Mensagem recebida: " + notificacao.getNomeAutor() + " -> " + notificacao.getMensagem());

       
    }
}
