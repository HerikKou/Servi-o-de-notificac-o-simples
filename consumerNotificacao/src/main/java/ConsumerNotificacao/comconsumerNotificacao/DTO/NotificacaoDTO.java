package ConsumerNotificacao.comconsumerNotificacao.DTO;

public class NotificacaoDTO {
    private String mensagem;
    private String nomeAutor;
    public NotificacaoDTO(){}
    public NotificacaoDTO(String mensagem, String nomeAutor) {
        this.mensagem = mensagem;
        this.nomeAutor = nomeAutor;
    }
    
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    
}
