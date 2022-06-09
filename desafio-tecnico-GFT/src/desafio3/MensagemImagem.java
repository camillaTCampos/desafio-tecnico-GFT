package desafio3;

public class MensagemImagem extends Mensagem {
	public String linkMensagem ;
	
	
	public MensagemImagem(String texto, String[] reacao) {
		super(texto, reacao);
		this.linkMensagem = linkMensagem;
		
		
	}


	@Override
	public String DigitarMensagem() {
		// TODO Auto-generated method stub
		return super.DigitarMensagem();
	}


	@Override
	public String getTexto() {
		// TODO Auto-generated method stub
		return super.getTexto();
	}


	@Override
	public String[] getReacao() {
		// TODO Auto-generated method stub
		return super.getReacao();
	}
	
	

}
