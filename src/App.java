import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       int tal1 = 10;
       int tal2 = 20;
       if(tal2>tal1){
        System.out.println(tal2+" är större än "+tal1);
       } else {
        System.out.println(tal2+" är mindre än "+tal1);
       }

       Scanner tb = new Scanner(System.in);
       System.out.println("Vad är klockan? ");
       int klockan = tb.nextInt();
       if(klockan>=7 && klockan<=11){
        System.out.println("Dags att gå upp");
       }
       else if(klockan==12){
        System.out.println("Dags att äta");
       }
       else if(klockan>=24 || klockan<=6){
        System.out.println("Dags att gå och lägga dig.");
       }

       boolean medlem = false;
       System.out.print("Är du medlem? Ja eller Nej. ");
       String svar = tb.nextLine();
       if(svar.equalsIgnoreCase("Ja")){
        medlem = true;
       } else if(svar.equalsIgnoreCase("Nej")){
        medlem = false;
       }c
       

    }
}
