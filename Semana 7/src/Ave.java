public class Ave extends Animal {
	
	private String corPena;
	private int fazerNinho;

	public String getCorPena() {
		System.out.println("A cor da pena �: "+ corPena);
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public int getFazerNinho() {
		if (fazerNinho == 1)
			System.out.println("O Ave est� produzindo um ninho");
		else
			System.out.println("O Ave n�o est� produzindo um ninho");	
		return fazerNinho;
	}

	public void setFazerNinho(int fazerNinho) {
		this.fazerNinho = fazerNinho;
	}

	@Override
	public void locomover() {
		System.out.println("Estou voando");
		
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