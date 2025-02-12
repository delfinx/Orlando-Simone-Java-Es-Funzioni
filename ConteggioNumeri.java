import java.util.Scanner;
public class ConteggioNumeri
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

        String risposta = "";
        while(!risposta.equals("si")){
                System.out.println("Inserisci un numero: ");
                int numeri = input.nextInt();
                while(!negativo(numeri)){
                        System.out.println("Inserire numero positivo: ");
                        numeri = input.nextInt();
                    }
                System.out.println(numeri + ": " + pari_dispari(numeri));
                System.out.println("Vuoi smettere di giocare? Si/No: ");
                risposta = input1.nextLine().toLowerCase();
            }
        


    }

    public static boolean negativo(int numero){
            if(numero < 0){
                    return false;
                }
            else{
                    return true;
                }
        }
        
    public static String pari_dispari(int numero){
            String risultato = "";
            if(numero % 2 == 0){
                    for(int i = 0; i < numero; i++){
                            risultato += "*";
                        }
                }
            else{
                    for(int i = 0; i < numero; i++){
                            risultato += "#";
                        }
                }
            return risultato;
        }
}