package ProducerNotificacao.comProducerNotificacao.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProducerNotificacao.comProducerNotificacao.DTO.NotificacaoDTO;
import ProducerNotificacao.comProducerNotificacao.Model.NotificacaoModel;
import ProducerNotificacao.comProducerNotificacao.Service.NotificacaoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/notificacao")
public class NotificacaoController {
        private final NotificacaoService notificacaoService;
    public NotificacaoController(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;}

    @PostMapping("/testekafka")
    public ResponseEntity<NotificacaoModel> enviarNotificacao(@RequestBody NotificacaoDTO notificacao) {
        NotificacaoModel salvar = notificacaoService.salvarNotificacao(notificacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvar);
    }
    
}
