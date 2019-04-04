package televisao;
import java.util.Scanner;

public class ControleRemoto {
    private int canal;
    private int volume;

public ControleRemoto(int canal, int vol){
    this.canal = canal;
    this.volume = vol;
    }
    public int getCanal(){
        return canal;   }

    public void setCanal(int canal){
        this.canal = canal; }

    public int getVol(){
        return volume;   }

    public void setVol(int vol){
        this.volume = vol;    }

    public int aumentaVol(){
    if(this.volume >= 10){
            System.out.println("Volume: "+this.volume);
            return 0;
            }else{
            return this.volume++;
        }
    }
    public int diminuiVol(){
        if(this.volume <= 0){
            System.out.println("Volume: "+this.volume);
            return 0;
            }else{
            return this.volume--;
        }
    }
    public int aumentaCanal(){
        if(this.canal >=20)
            return this.canal = 1;
        else{
        return this.canal++;
        }
    }
    public int diminuiCanal(){
        if(this.canal <= 1)
            return this.canal = 20;
        else{
        return this.canal--;
        }
    }
    public void consultaTelev(){
        System.out.println("Canal: "+this.canal+" | Volume: "+this.volume);
    }
    
    public void menu() { // menu principal
		int opcao = 0;
		do {
			System.out.println("\n         ========================================");
			System.out.println("          1 - Aumentar canal        "); 
			System.out.println("          2 - Diminuir canal      ");
			System.out.println("          3 - Aumentar volume    ");
			System.out.println("          4 - Diminuir volume      ");
			System.out.println("          5 - Exibir canal e volume da televisão ");
			System.out.println("          0 - Sair          ");
			System.out.println("          ========================================\n");			
			Scanner scan = new Scanner(System.in);
                        opcao = Integer.parseInt(scan.nextLine());
			switch (opcao) {
			case 1:
                            aumentaCanal();
			break;
		        case 2:
                            diminuiCanal();
			break;
                        case 3:
                            aumentaVol();
                        break;
                        case 4:
                            diminuiVol();
                        break;
			case 5:
                            consultaTelev();
			break;
                        case 0:
                            break;
		        default:
                            System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}