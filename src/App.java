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
       tb.nextLine();
       if(svar.equalsIgnoreCase("Ja")){
        medlem = true;
       } else if(svar.equalsIgnoreCase("Nej")){
        medlem = false;
       }
       System.out.print("Hur gammal är du? ");
       int ålder = tb.nextInt();
       if(ålder >= 18 || medlem){
        System.out.println("Välkommen");
       } else{
        System.out.println("GITTA");
       }

       tb.nextLine();
    System.out.print("Användarnamn: ");
    String user = tb.nextLine();
    System.out.print("Lösenord: ");
    String pass = tb.nextLine();
    if(user.equals("root") && pass.equals("passwd")){
        System.out.println("ur in");
    }

    System.out.println("Vädermeny");
    System.out.println("1. Temperatur");
    System.out.println("2. Vind");
    System.out.println("3. Luftfunktighet");
    System.out.println("Ange val: ");
    int val = tb.nextInt();
    if(val== 1){
        System.out.println("Det är 18 grader"); 
    }
    if(val== 2){
        System.out.println("Vinden är 10 sekund-meter");
    }
    if(val== 3){
        System.out.println("Det är 100% luftfuktighet");
    }
}
}
