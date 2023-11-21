package ReinoAnimal;
/**
 * classe responsável por gerar um animal aereo
 * 
 * @author 20191064010012
 *
 */

public class Aereo extends Animal{
	private String altitude;
	
	/**
	 * metódo que diz que o animal aereo está voando
	 */
	public void voar() {
		System.out.println("O animal está voando");
	}
	
	/**
	 * metódo que diz que o animal aereo está comendo
	 */
	public void comer() {
		System.out.println("O animal ar está comendo");
	}
	/**
	 * metódo que diz o perfil do animal aereo
	 */
	public void perfil() {
		System.out.println( "altitude" + this.altitude + "especie" + this.getEspecie() + "sexo" + this.getSexo() + "data" + this.getDataNascimento());
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

}
