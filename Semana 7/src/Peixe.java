
public class Peixe extends Animal{

	private String corEscama;
	private int soltarBolha;
	
	public String getCorEscama() {
		System.out.println("A cor da escama �: "+ corEscama);
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	public int getSoltarBolha() {
		if (soltarBolha == 1)
			System.out.println("O Peixe est� respirando");
		else
			System.out.println("O Peixe n�o est� respirando");	
					
		return soltarBolha;
	}

	public void setSoltarBolha(int soltarBolha) {
		this.soltarBolha = soltarBolha;
	}
	
	@Override
	public void locomover() {
		System.out.println("O Peixe est� nadando");
		
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