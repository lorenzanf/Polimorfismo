public class Mamifero extends Animal{
	
	private String corPelo;
	
	
	public String getCorPelo() {
		System.out.println("A cor do pelo é: "+ corPelo);
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	
	@Override
	public void locomover() {
		System.out.println("O Mamifero está se movimentando");
		
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