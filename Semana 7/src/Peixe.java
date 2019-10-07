
public class Peixe extends Animal{

	private String corEscama;
	private int soltarBolha;
	
	public String getCorEscama() {
		System.out.println("A cor da escama é: "+ corEscama);
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	public int getSoltarBolha() {
		if (soltarBolha == 1)
			System.out.println("O Peixe está respirando");
		else
			System.out.println("O Peixe não está respirando");	
					
		return soltarBolha;
	}

	public void setSoltarBolha(int soltarBolha) {
		this.soltarBolha = soltarBolha;
	}
	
	@Override
	public void locomover() {
		System.out.println("O Peixe está nadando");
		
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