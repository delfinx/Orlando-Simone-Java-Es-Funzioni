import java.util.Scanner;
public class RiepilogoVendite
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("LISTINO PREZZI");
        int[] prezzi = {250, 300, 200, 50};
        String[] oggetti = {"televisori", "frigoriferi", "lavatrici", "altro"};


        for(int i = 0; i<oggetti.length; i++){
                System.out.println(oggetti[i] + "    |  "  + prezzi[i] + "$");
            }

        int[] vendite = new int[4];
        for (int i = 0; i < oggetti.length; i++) {
                System.out.print("Quanti/e " + oggetti[i] + " sono state vendute?");
                vendite[i] = input.nextInt();
            }
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int totaleElettrodomestici = vendite[1] + vendite[2];
        int ricavoTotale = 0;
        int[] ricavi = new int[4];

        for (int i = 0; i < oggetti.length; i++) {
            ricavi[i] = vendite[i] * prezzi[i];
            ricavoTotale += ricavi[i];
        }

        System.out.println("Ricavo totale: " + ricavoTotale + "$");
        System.out.println("Numero totale di elettrodomestici venduti (solo Frigoriferi e Lavatrici): " + totaleElettrodomestici);




        for (int i = 0; i < oggetti.length; i++) {
            double percentualeVendite = 0;
            double percentualeRicavo = 0;

            if (totaleElettrodomestici > 0 && (i == 1 || i == 2)) { // Solo per frigoriferi e lavatrici
                percentualeVendite = (vendite[i] * 100.0) / totaleElettrodomestici;
            }

            if (ricavoTotale > 0) {
                percentualeRicavo = (ricavi[i] * 100.0) / ricavoTotale;
            }

            System.out.println(oggetti[i] + " | " + vendite[i] + " | " + (int) percentualeVendite + "% | "
                               + ricavi[i] + "$ | " + (int) percentualeRicavo + "%");
        }


	}
}