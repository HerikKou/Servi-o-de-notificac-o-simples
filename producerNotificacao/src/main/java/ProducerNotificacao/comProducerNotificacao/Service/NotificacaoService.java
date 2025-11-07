package ProducerNotificacao.comProducerNotificacao.Service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import ProducerNotificacao.comProducerNotificacao.DTO.NotificacaoDTO;
import ProducerNotificacao.comProducerNotificacao.Model.NotificacaoModel;
import ProducerNotificacao.comProducerNotificacao.Repository.NotificacaoRepository;
import jakarta.transaction.Transactional;

@Service
public class NotificacaoService {
    private final NotificacaoRepository notificacaoRepository;
    private final KafkaTemplate<String,NotificacaoDTO> kafkaTemplate;
    public NotificacaoService(NotificacaoRepository notificacaoRepository, KafkaTemplate<String, NotificacaoDTO> kafkaTemplate) {
        this.notificacaoRepository = notificacaoRepository;
        this.kafkaTemplate = kafkaTemplate;
    }
    @Transactional
    public NotificacaoModel salvarNotificacao(NotificacaoDTO notificacao){
        NotificacaoModel notificacaoModel = new NotificacaoModel();
        notificacaoModel.setMensagem(notificacao.getMensagem());
        notificacaoModel.setNomeAutor(notificacao.getNomeAutor());
       NotificacaoModel salvar = notificacaoRepository.save(notificacaoModel);
        kafkaTemplate.send("notificacao_novo", notificacao.getNomeAutor(),notificacao);
        return salvar;
        
    }
}
