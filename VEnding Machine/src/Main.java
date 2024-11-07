import javax.swing.JOptionPane;

public class Main {
    public static double moneyInsert(){
        double Money;
        Money = Double.parseDouble(JOptionPane.showInputDialog("Wpłać pieniadze do automatu:"));
        return Money;
    }
    public static int enterChoice(){
        int choice;
        choice = Integer.parseInt(JOptionPane.showInputDialog("<html>Wybierz przedmiot<br>1. Pluszak<br>2. Telefon</html>"));
        return choice;
    }
    static void connectionInfo(){
        System.out.println("Polaczono z serwerem. Przedmioty dostepne.");
    }
    static void end(){
        System.out.println("zakonczono");
    }
    public static void main(String[] args) {
        connectionInfo();
        double Money;
        int choiceOfItem;
        Money = moneyInsert();
        choiceOfItem = enterChoice();
        switch(choiceOfItem){
            case 1:
                System.out.println("Wybrano pluszaka");
                break;
                case 2:
                    System.out.println("Wybrano telefon");
                    break;
                    default:
                        System.out.println("Wybrano zla opcje");
                        break;
        }
        end();

    }
}