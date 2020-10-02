import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


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
	
	
}//class aspirante


class RegistroAspirantes{
	ArrayList listaAspirantes;
	private int numFolio = 1;
	static Scanner entrada = new Scanner(System.in);
	


	public int getnumFolio() {
		return numFolio;
	}

	public void setnumFolio(int numFolio) {
		this.numFolio = numFolio;
	}

	public static int validacionNatural() {
		int ret = 0;
		boolean err = false;
		do {
			try {
				ret = entrada.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("entrada no valida, intente de nuevo:");
				entrada.nextLine();
				err=true;
			}
			if (ret>0) {
				err=false;
			}else {
				System.out.println("solo números naturales");
				err=true;
			}
		}while(err);
		return ret;
	}
	
	
	public RegistroAspirantes() {
		listaAspirantes = new ArrayList();
	}
	
	public void añadirAspirante(Aspirante a) {
		this.setnumFolio(this.getnumFolio()+1);
		listaAspirantes.add(a);
	}
	
	public Object elimAspirante(String folio) {
		this.setnumFolio(this.getnumFolio()-1);
		return listaAspirantes.remove(listaAspirantes.size()-1);
	}
	
	public void mostrarAspirantes() {
		Iterator i = listaAspirantes.iterator();
		while(i.hasNext()) {
			Aspirante a = (Aspirante) i.next();
			System.out.println(a);
		}
	}
	
}//class registroAspirantes


public class Actividad6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		RegistroAspirantes regAsp = new RegistroAspirantes();
		
		String nombre = "";
		String folio = null;
		int opcion = 0;
		int edad = 0;
		
		do {
			System.out.println("1- Añadir Aspirante");
			System.out.println("2- Eliminar Aspirante");
			System.out.println("3- Mostrar Aspirantes");
			System.out.println("4- Salir del menú");
			
			opcion = RegistroAspirantes.validacionNatural();
			switch(opcion) {
		case 1: String redesSoc[] = new String[4];
			System.out.println("Ingrese su nombre:");
			nombre = entrada.nextLine();
			System.out.println("Ingrese su edad: ");
			edad = RegistroAspirantes.validacionNatural();
			System.out.println("Instagram: ");
			redesSoc[0] = entrada.nextLine();
			System.out.println("Facebook: ");
			redesSoc[1] = entrada.nextLine();
			System.out.println("Snapchat: ");
			redesSoc[2] = entrada.nextLine();
			System.out.println("Twitter: ");
			redesSoc[3] = entrada.nextLine();
			
			if(regAsp.listaAspirantes.isEmpty()) {
				regAsp.añadirAspirante(new Aspirante(1, nombre, (byte) edad, redesSoc));
			}
			else {
				regAsp.añadirAspirante(new Aspirante(regAsp.getnumFolio(), nombre, (byte)edad, redesSoc));
			}
			break;
		case 2: regAsp.elimAspirante(folio);
			break;
		case 3: regAsp.mostrarAspirantes();
			break;
		case 4: 
			break;
		default: System.out.println("Esa opción no esta dentro del menú");
			break;
			
			}
		}while(opcion != 4);
		
		System.out.println("Tamaño de la lista: " + regAsp.listaAspirantes.size());

	}

}
