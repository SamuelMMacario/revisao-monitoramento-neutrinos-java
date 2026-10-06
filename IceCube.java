import java.util.Scanner;

public class IceCube {
    public static void main (String[] args) {
        double[] energias = new double[10];
        Scanner input = new Scanner(System.in); 
        double media = 0;
        double pico = 0;
        int contadorAltissimaEnergia = 0;

        for(int i = 0; i < energias.length; i++){
            System.out.println("Digite o valor capturado no sensor de número [" + (i+1) + "]: ");
            energias[i] = input.nextDouble();
        }
        
        for(double energia : energias){
            media += energia;

            if(energia > pico) {
                pico = energia;
            }
            if(energia >= 1000) {
                contadorAltissimaEnergia++;
            }
        }
        media /= 12;

        System.out.println("Média das temperaturas capturadas: "+ media);
        System.out.println("Maior pico de energia capturado: "+ pico);
        System.out.println("Total de sensores com evento > 100 TeV: " + contadorAltissimaEnergia);

    }   
}