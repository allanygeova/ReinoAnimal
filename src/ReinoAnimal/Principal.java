package ReinoAnimal;

public class Principal {
	
	public static void main(String[] args) {
		/**
		 * inicializadores
		 */
		
		Aquatico a1 = new Aquatico();
		a1.setEspecie(" Carcharias taurus");
		a1.setSexo("femea");
		a1.setDataNascimento("7");
		a1.setTipoagua("salgada");
		a1.setEscamas(true);
		a1.comer();
		a1.perfil();
		a1.nadar();
		
		
		Aquatico a2 = new Aquatico();
		a2.setEspecie(" Pygocentrus nattereri");
		a2.setSexo("macho");
		a2.setDataNascimento("3");
		a2.setTipoagua("doce");
		a2.setEscamas(true);
		a2.comer();
		a2.perfil();
		a2.nadar();
		
		Terrestre t1 = new Terrestre();
		t1.setEspecie(" Felis catus");
		t1.setSexo("femea");
		t1.setDataNascimento("7");
		t1.setRegiao("asia");
		t1.setPelagem(true);
		t1.comer();
		t1.perfil();
		t1.mover();
		
		Terrestre t2 = new Terrestre();
		t2.setEspecie("Hydrochoerus hydrochaeris");
		t2.setSexo("macho");
		t2.setDataNascimento("8");
		t2.setRegiao("america do sul");
		t2.setPelagem(true);
		t2.comer();
		t2.perfil();
		t2.mover();
		
		Aereo e1 = new Aereo();
		e1.setEspecie("coragyps atratus");
		e1.setSexo("macho");
		e1.setDataNascimento("3");
		e1.setAltitude("54");
		e1.comer();
		e1.perfil();
		e1.voar();
		
		Aereo e2 = new Aereo();
		e2.setEspecie("Amazona aestiva");
		e2.setSexo("fêmea");
		e2.setDataNascimento("10");
		e2.setAltitude("37");
		e2.comer();
		e2.perfil();
		e2.voar();
		
		System.out.println("Animais cadastrados: " + Animal.getContador());
	}
}