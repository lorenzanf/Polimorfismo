public class TesteAnimal {

	public static void main(String[] args){
		
		
		Ave a = new Ave();
		a.locomover();
		a.setCorPena("Amarela");
		a.getCorPena();
		a.setFazerNinho(0);
		a.getFazerNinho();
		
		Mamifero m = new Mamifero();
		m.locomover();
		m.setCorPelo("Cinza");
		m.getCorPelo();
		
		Peixe p = new Peixe();
		p.locomover();
		p.setCorEscama("Branco");
		p.getCorEscama();
		p.setSoltarBolha(1);
		p.getSoltarBolha();
		
		Reptil r = new Reptil();
		r.locomover();
		r.setCorEscama("Verde");
		r.getCorEscama();
		
		
		
		
		
	}
}