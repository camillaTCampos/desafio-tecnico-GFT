package desafio3;

public class MensagemVideo extends Mensagem {
	
	public String linkMensagem ;

	public String getLinkMensagem() {
		return linkMensagem;
	}

	public void setLinkMensagem(String linkMensagem) {
		this.linkMensagem = linkMensagem;
	}

	public MensagemVideo(String texto, String[] reacao) {
		super(texto, reacao);
	}
	
	

}
