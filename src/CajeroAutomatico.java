package cajeroautomatico;
import java.util.Scanner;
public class CajeroAutomatico {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int opcion = 0;
		double saldo = 1000;
		while(opcion != 4) {
		System.out.println("¡BIENVENIDO A SU CUENTA!\n"
				+ "¿En qué podemos ayudarle?:\n"
				+ "1.Consulta de saldo\n"
				+ "2.Deposito\n"
				+ "3. Retiro\n"
				+ "4.Salir");
		opcion = sc.nextInt();
		
		switch(opcion) {
				case 1 -> System.out.println("Saldo: $"+saldo);
		case 2 -> {System.out.println("Ingresa tu deposito:");
		double deposito = sc.nextDouble();
		saldo+=deposito;
		if(deposito > 0) {
		System.out.println("Nuevo saldo: $"+(saldo));
		}else {
			System.out.println("Cantidad Invalida");
		}
		}
		case 3 -> {System.out.println("Retira tu efectivo: ");
		double retiro = sc.nextDouble();
		if(retiro<=saldo) {
			saldo -= retiro;
			System.out.println("Nuevo saldo: $"+saldo);
		}else {
			System.out.println("Fondos Insuficientes");
		}
		}
		case 4 -> System.out.println("!Gracias, vuelva Pronto¡");
		default -> System.out.println("Opcion no valida");
		}

		}
sc.close();		
	}

}
