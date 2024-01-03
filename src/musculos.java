import java.util.Scanner;

public class musculos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO A THE-ROOM-OF-MUSCLE");
        System.out.println("---------");
        System.out.println("Aqui você poderá visualizar os 10 principais musculos de uma região do corpo");
        
        char resposta;
        do {
        
        System.out.println("c - Cabeça");
        System.out.println("t - Tronco (aqui contém 15)");        
        System.out.println("p - Perna");
        System.out.println("b - Braço");
        System.out.print("Escolha uma letra:");
        char escolha = sc.next().charAt(0);

        if ( escolha == 'c') {
            System.out.println("---------");
            System.out.println("1.Bucinador");
            System.out.println("2.Esternocleidomastóideo");
            System.out.println("3.Masseter");
            System.out.println("4.Músculos auriculares");
            System.out.println("5.Músculos da mímica facial");
            System.out.println("6.Occipitais");                   
            System.out.println("7.Occipitofrontal (Frontal e Occipital)");
            System.out.println("8.Orbicular dos olhos");             
            System.out.println("9.Platisma");
            System.out.println("10.Temporais");
            System.out.println("---------");

        }else if (escolha == 't') {
            System.out.println("---------");
            System.out.println("1.Diafragma");
            System.out.println("2.Esfíncter anal");
            System.out.println("3.Esfíncter esofágico inferior (esfíncter esofágico)");
            System.out.println("4.Esfíncter uretral externo");
            System.out.println("5.Peitoral maior");
            System.out.println("6.Glúteo médio");                   
            System.out.println("7.Ilíaco");
            System.out.println("8.Obliquo externo");             
            System.out.println("9.Obliquo interno");
            System.out.println("10.Psoas");
            System.out.println("11.Quadrado lombar");
            System.out.println("12.Reto abdominal");
            System.out.println("13.Reto femoral");
            System.out.println("14.Transverso abdominal");
            System.out.println("15.Trapézio");
            System.out.println("---------");

        }else if (escolha == 'p') {
            System.out.println("---------");
            System.out.println("1.Adutores da coxa");
            System.out.println("2.Bíceps femoral");
            System.out.println("3.Cabeça curta do músculo bíceps femoral");
            System.out.println("4.Cabeça longa do músculo bíceps femoral");
            System.out.println("5.Flexores plantares");
            System.out.println("6.Gastrocnêmio");                   
            System.out.println("7.Glúteo máximo");
            System.out.println("8.Glúteo médio");             
            System.out.println("9.Glúteo mínimo");
            System.out.println("10.Iliopsoas");
            System.out.println("---------");

        }else if (escolha == 'b') {
            System.out.println("---------");
            System.out.println("1.Bíceps braquial");
            System.out.println("2.Deltoides");
            System.out.println("3.Flexores do carpo");
            System.out.println("4.Músculos extensores do carpo");
            System.out.println("5.Músculos flexores do antebraço");
            System.out.println("6.Músculos extensores do antebraço");                   
            System.out.println("7.Tríceps braquial");
            System.out.println("8.Trapézio");             
            System.out.println("9.Teres major");
            System.out.println("10.Teres minor");
            System.out.println("---------");
        }else {
            System.out.println("Não existe essa opção");
            System.out.println("---------");
        }
    System.out.println("Deseja ver outro grupo muscular?");
    resposta = sc.next().charAt(0);
    }
    while ( resposta != 'n');
    System.out.println("Até a proxima!!");
        

    }
}
