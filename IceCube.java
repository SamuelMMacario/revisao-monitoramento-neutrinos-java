import java.util.Scanner;

public class IceCube {
    public static void main (String[] args) {
        
        double[] energias = new double[10];
        Scanner input = new Scanner(System.in); 
        double media = 0;
        double pico = 0;
        int contadorAltissimaEnergia = 0;
        double num = 0;
        

        int i = 0;
        while(i < energias.length){
            System.out.println("Digite o valor capturado no sensor de número [" + (i+1) + "]: ");
            
            num = input.nextDouble();
            if(num >= 0 ) {
                energias[i] = num;
                i++;
            } else {
                System.out.println("Número inválido. ");
            }
        }
        
        
        for(double energia : energias){
            media += energia;

            if(energia > pico) {
                pico = energia;
            }
            if(energia >= 100) {
                contadorAltissimaEnergia++;
            }
        }
        media /=12;

        System.out.println("=== RELATÓRIO DE DETECÇÃO DE PARTÍCULAS FANTASMA ===");
        System.out.println("Média das temperaturas capturadas: "+ media);
        System.out.println("Maior pico de energia capturado: "+ pico);
        System.out.println("Total de sensores com evento > 100 TeV: " + contadorAltissimaEnergia);


        input.close();
    }   
}
