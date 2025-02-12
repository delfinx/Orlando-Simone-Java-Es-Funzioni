import java.util.Scanner;
public class ConversioneOraria
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un orario in secondi: ");
		int tempo = input.nextInt();
		while(!Grandezza(tempo)){
		        System.out.println("Inserisci un numero maggiore di 0 e minore di 84600");
		        tempo = input.nextInt();
		    }
		System.out.println(Conversione(tempo));
	}

	public static boolean Grandezza(int numero){
			if(numero > 84600 || numero < 0){
					return false;
				}
			else{
					return true;
				}
		}

	public static String Conversione(int numero) {
            String tempo = "";
            if (numero > 60) { // Se è più grande dei secondi
                if (numero > 3600) { // Se è più grande di 60 minuti
                    int ore = numero / 3600;
                    int minuti = (numero % 3600) / 60;
                    int secondi = numero % 60;
                    tempo = ore + " h, " + minuti + " m, " + secondi + " s";
                } else if (numero <= 3600) {
                    int minuti = numero / 60;
                    int secondi = numero % 60;
                    tempo = "0 h, " + minuti + " m, " + secondi + " s";
                }
            }
            if (numero <= 60) {
                tempo = "0 h, 0 m, " + numero + " s";
            }
            return tempo;
        }
}
