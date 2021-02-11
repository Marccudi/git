import java.util.Iterator;
import java.util.Random;


public class CineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		
		String ArrayPelis[]= new String[4];
		
		//cramos las peliculas
		Peliculas l = new Peliculas("La bala que dio vuelta a una esquina", 120, 18, "Almodobar");
		Peliculas la = new Peliculas("Big hero 6", 120, 12, "Marvel");
		Peliculas ls = new Peliculas("Forzen", 120, 3, "Disney");
		Peliculas ld = new Peliculas("El resplandor", 120, 21, "Kubrick");

		//obtenemos la pelicula que vaya a estrenarse
		ArrayPelis[0]=l.getTitulo();
		ArrayPelis[1]=la.getTitulo();
		ArrayPelis[2]=ls.getTitulo();
		ArrayPelis[3]=ld.getTitulo();
		int peli=r.nextInt(4);
		int edadmin=0;
		System.out.println("la pelicula es: "+ArrayPelis[peli]);
		
		//edad minima de la pelicula
		switch (peli) {
		case 0:
			edadmin=l.getEdadMinima();
			break;
		case 1:
			edadmin=la.getEdadMinima();
			break;
		case 2:
			edadmin=ls.getEdadMinima();
			break;
		case 3:
			edadmin=ld.getEdadMinima();
			break;

		default:
			break;
		}
		
		//todos los asientos
		boolean asiento[][]=new boolean[8][9];
		Cine q=new Cine(ArrayPelis[peli], 10);
		
		//Por cada espectador comprovamos si puede ver la pelicula
		int numEspec=0;
		Espectador e1= new Espectador("Manolo", 18, 100);
		Espectador e2= new Espectador("Matias", 21, 2);
		Espectador e3= new Espectador("Walt Disney", 15, 100);
		Espectador e4= new Espectador("Amador", 3, 100);

		if (e1.getDinero()>q.getPrecioEntrada() && e1.getEdad()>=edadmin && numEspec<=72) {
			numEspec++;
		}
		
		if (e2.getDinero()>q.getPrecioEntrada() && e2.getEdad()>=edadmin && numEspec<=72) {
			numEspec++;
		}
		
		if (e3.getDinero()>q.getPrecioEntrada() && e3.getEdad()>=edadmin && numEspec<=72) {
			numEspec++;
		}
		
		if (e4.getDinero()>q.getPrecioEntrada() && e4.getEdad()>=edadmin && numEspec<=72) {
			numEspec++;
		}

		//ocupamos asientos libres con los espectadores
		for (int i = 1; i <= numEspec; i++) {
			int ran9=r.nextInt(9);
			int ran8=r.nextInt(8);
			
			if (asiento[ran8][ran9]) {
				i--;
			}else {
				asiento[ran8][ran9]=true;
			}
			
		}
		
		//muestra los asientos ocupados
		for (int j = 0; j < asiento.length; j++) {
			for (int m = 0; m < 9; m++) {
				if (asiento[j][m]) {
					System.out.print("El asiento ");
					switch (m) {
					case 0:
						System.out.print(j+1+"a esta ocupado\n");
						break;
					case 1:
						System.out.print(j+1+"b esta ocupado\n");
						break;
					case 2:
						System.out.print(j+1+"c esta ocupado\n");
						break;
					case 3:
						System.out.print(j+1+"d esta ocupado\n");
						break;
					case 4:
						System.out.print(j+1+"e esta ocupado\n");
						break;
					case 5:
						System.out.print(j+1+"f esta ocupado\n");
						break;
					case 6:
						System.out.print(j+1+"g esta ocupado\n");
						break;
					case 7:
						System.out.print(j+1+"h esta ocupado\n");
						break;
					case 8:
						System.out.print(j+1+"i esta ocupado\n");
						break;

					default:
						break;
					}
					
				}
				
			}			
		}

		
		
	}

}
