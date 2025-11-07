package ProducerNotificacao.comProducerNotificacao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ProducerNotificacao.comProducerNotificacao.Model.NotificacaoModel;

public interface NotificacaoRepository extends JpaRepository<NotificacaoModel, Long> {
    
} 
