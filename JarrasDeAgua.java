package IA;

/**
 * @author Daniel Hernandez Sanchezverin
 * 
 *         Problema de las Jarras de Agua
 *
 *         Desarrollar un programa que solucione el problema de las jarras de
 *         agua, indicando cada paso el estado actual, las reglas aplicables, la
 *         regla aplicada y el nuevo estado. La seleccion de la regla aplicada
 *         sera al azar.
 *
 */
public class JarrasDeAgua {
	public static void main(String[] args) {
		int x = 0; // jarras de 4G
		int y = 0; // jarras de 3G
		int n;
		int cantidadMov = 0;
		boolean continuar;
		
		while(x != 2) {
			if (x == 0 && y == 0) {
				System.out.println("Estado Actual: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println("***Opciones Posibles***"
						+ "\n 1.- Llenar jarra de 4G"
						+ "\n 2.- Llenar jarra de 3G");
				n = (int)((Math.random() * 2) + 1);
				switch(n) {
				case 1:
					x = 4;
					System.out.println("Opcion 1 = Llenar jarra de 4G");
					break;
				case 2:
					y = 3;
					System.out.println("Opcion 2 = Llenar jarra de 3G");
					break;
				}
				cantidadMov += 1;
				System.out.println("Nuevo Estado: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println();
				continue;
			}else if (x == 4 && y == 0) {
				System.out.println("Estado Actual: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println("***Opciones Posibles***"
						+ "\n 1.- Llenar jarra de 3G"
						+ "\n 2.- Tirar jarra de 4G"
						+ "\n 3.- Vaciar de 4G a 3G");
				n = (int)((Math.random() * 3) + 1);
				switch(n) {
				case 1:
					y = 3;
					System.out.println("Opcion 1 = Llenar jarra de 3G");
					break;
				case 2:
					x = 0;
					System.out.println("Opcion 2 = Tirar jarra de 4G");
					break;
				case 3:
					y += x;
					if(y > 3) {
						x = y - 3;
						y = 3;
					}
					System.out.println("Opcion 3 = Vaciar de 4G a 3G");
					break;
				}
				cantidadMov += 1;
				System.out.println("Nuevo Estado: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println();
				continue;
			}else if (x == 0 && y == 3) {
				System.out.println("Estado Actual: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println("***Opciones Posibles***"
						+ "\n 1.- Llenar jarra de 4G"
						+ "\n 2.- Tirar jarra de 3G"
						+ "\n 3.- Vaciar de 3G a 4G");
				n = (int)((Math.random() * 3) + 1);
				switch(n) {
				case 1:
					x = 4;
					System.out.println("Opcion 1 = Llenar jarra de 4G");
					break;
				case 2:
					y = 0;
					System.out.println("Opcion 2 = Tirar jarra de 3G");
					break;
				case 3:
					x += y;
					y = 0;
					System.out.println("Opcion 3 = Vaciar de 3G a 4G");
					break;
				}
				cantidadMov += 1;
				System.out.println("Nuevo Estado: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println();
				continue;
			}else if (x == 4 && y == 3) {
				System.out.println("Estado Actual: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println("***Opciones Posibles***"
						+ "\n 1.- Tirar jarra de 4G"
						+ "\n 2.- Tirar jarra de 3G");
				n = (int)((Math.random() * 2) + 1);
				switch(n) {
				case 1:
					x = 0;
					System.out.println("Opcion 1 = Tirar jarra de 4G");
					break;
				case 2:
					y = 0;
					System.out.println("Opcion 2 = Tirar jarra de 3G");
					break;
				}
				cantidadMov += 1;
				System.out.println("Nuevo Estado: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println();
				continue;
			}else if(x == 4 && (y != 0 && y < 3)) {
				System.out.println("Estado Actual: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println("***Opciones Posibles***"
						+ "\n 1.- Llenar jarra de 3G"
						+ "\n 2.- Tirar jarra de 4G"
						+ "\n 3.- Tirar jarra de 3G"
						+ "\n 4.- Vaciar de 4G a 3G");
				n = (int)((Math.random() * 4) + 1);
				switch(n) {
				case 1:
					y = 3;
					System.out.println("Opcion 1 = Llenar jarra de 3G");
					break;
				case 2:
					x = 0;
					System.out.println("Opcion 2 = Tirar jarra de 4G");
					break;
				case 3:
					y = 0;
					System.out.println("Opcion 3 = Tirar jarra de 3G");
					break;
				case 4:
					y += x;
					if(y > 3) {
						x = y - 3;
						y = 3;
					}else {
						x = 0;
					}
					System.out.println("Opcion 4 = Vaciar de 4G a 3G");
					break;
				}
				cantidadMov += 1;
				System.out.println("Nuevo Estado: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println();
				continue;
			}else if ((x != 0 && x < 4) && y == 3) {
				System.out.println("Estado Actual: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println("***Opciones Posibles***"
						+ "\n 1.- Llenar jarra de 4G"
						+ "\n 2.- Tirar jarra de 4G"
						+ "\n 3.- Tirar jarra de 3G"
						+ "\n 4.- Vaciar de 3G a 4G");
				n = (int)((Math.random() * 4) + 1);
				switch(n) {
				case 1:
					x = 4;
					System.out.println("Opcion 1 = Llenar jarra de 4G");
					break;
				case 2:
					x = 0;
					System.out.println("Opcion 2 = Tirar jarra de 4G");
					break;
				case 3:
					y = 0;
					System.out.println("Opcion 3 = Tirar jarra de 3G");
					break;
				case 4:
					x += y;
					if(x > 4) {
						y = x - 4;
						x = 4;
					}else {
						y = 0;
					}
					System.out.println("Opcion 4 = Vaciar de 3G a 4G");
					break;
				}
				cantidadMov += 1;
				System.out.println("Nuevo Estado: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println();
				continue;
			}else if ((x != 0 && x < 4) && y == 0){
				System.out.println("Estado Actual: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println("***Opciones Posibles***"
						+ "\n 1.- Llenar jarra de 4G"
						+ "\n 2.- Llenar jarra de 3G"
						+ "\n 3.- Tirar jarra de 4G"
						+ "\n 4.- Vaciar de 4G a 3G");
				n = (int)((Math.random() * 4) + 1);
				switch(n) {
				case 1:
					x = 4;
					System.out.println("Opcion 1 = Llenar jarra de 4G");
					break;
				case 2:
					y = 3;
					System.out.println("Opcion 2 = Llenar jarra de 3G");
					break;
				case 3:
					x = 0;
					System.out.println("Opcion 3 = Tirar jarra de 4G");
					break;
				case 4:
					y += x;
					if(y > 3) {
						x = y - 3;
						y = 3;
					}else {
						x = 0;
					}
					System.out.println("Opcion 4 = Vaciar de 4G a 3G");
					break;
				}
				cantidadMov += 1;
				System.out.println("Nuevo Estado: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println();
				continue;
			}else if(x == 0 && (y != 0 && y < 3)) {
				System.out.println("Estado Actual: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println("***Opciones Posibles***"
						+ "\n 1.- Llenar jarra de 4G"
						+ "\n 2.- Llenar jarra de 3G"
						+ "\n 3.- Tirar jarra de 3G"
						+ "\n 4.- Vaciar de 3G a 4G");
				n = (int)((Math.random() * 4) + 1);
				switch(n) {
				case 1:
					x = 4;
					System.out.println("Opcion 1 = Llenar jarra de 4G");
					break;
				case 2:
					y = 3;
					System.out.println("Opcion 2 = Llenar jarra de 3G");
					break;
				case 3:
					y = 0;
					System.out.println("Opcion 3 = Tirar jarra de 3G");
					break;
				case 4:
					x += y;
					if(x > 4) {
						y = x - 4;
						x = 4;
					}else {
						y = 0;
					}
					System.out.println("Opcion 4 = Vaciar de 3G a 4G");
					break;
				}
				cantidadMov += 1;
				System.out.println("Nuevo Estado: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println();
				continue;
			}else {
				System.out.println("Estado Actual: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println("***Opciones Posibles***"
						+ "\n 1.- Llenar jarra de 4G"
						+ "\n 2.- Llenar jarra de 3G"
						+ "\n 3.- Tirar jarra de 4G"
						+ "\n 4.- Tirar jarra de 3G"
						+ "\n 5.- Vaciar de 4G a 3G"
						+ "\n 6.- Vaciar de 3G a 4G");
				n = (int)((Math.random() * 6) + 1);
				switch(n) {
				case 1:
					x = 4;
					System.out.println("Opcion 1 = Llenar jarra de 4G");
					break;
				case 2:
					y = 3;
					System.out.println("Opcion 2 = Llenar jarra de 3G");
					break;
				case 3:
					x = 0;
					System.out.println("Opcion 3 = Tirar jarra de 4G");
					break;
				case 4:
					y = 0;
					System.out.println("Opcion 4 = Tirar jarra de 3G");
					break;
				case 5:
					y += x;
					if(y > 3) {
						x = y - 3;
						y = 3;
					}
					System.out.println("Opcion 5 = Vaciar de 4G a 3G");
					break;
				case 6:
					x += y;
					if(x > 4) {
						y = x - 4;
						x = 4;
					}else {
						y = 0;
					}
					System.out.println("Opcion 6 = Vaciar de 3G a 4G");
					break;
				}
				cantidadMov += 1;
				System.out.println("Nuevo Estado: Jarra 4G = " + x + " Jarra de 3G = " + y);
				System.out.println();
				continue;
			}
		}
		System.out.println("---Resultado final---"
				+ "\n Jarra 4G = " + x + " Jarra de 3G = " + y);
		System.out.println("Cantidad de movimientos = " + cantidadMov);
	}
}