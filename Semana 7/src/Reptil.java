public class Reptil extends Animal {

	private String corEscama;
	
	public String getCorEscama() {
		System.out.println("A cor da escama �: "+ corEscama);
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("O Reptil est� rastejando");
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}

	
	
}