import java.util.Arrays;

class Aspirante{
	private int folio;
	private String nombre;
	private byte edad;
	private String redesSociales[];
	public Aspirante(int folio, String nombre, byte edad, String[] redesSociales) {
		this.folio = folio;
		this.nombre = nombre;
		this.edad = edad;
		this.redesSociales = redesSociales;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public String[] getRedesSociales() {
		return redesSociales;
	}
	public void setRedesSociales(String[] redesSociales) {
		this.redesSociales = redesSociales;
	}
	
	@Override
	public String toString() {
		return "Aspirante [folio=" + folio + ", nombre=" + nombre + ", edad=" + edad + ", redesSociales="
				+ Arrays.toString(redesSociales) + "]";
	}
	
	
	
	
}
public class Actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
