package cardCreate;
import java.util.Scanner;
/**Creates cards for the user*/
public class CardCreation {
    public void numberOfCards() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of cards you want to input: ");
       int numCards = sc.nextInt();
    }
        /**Sets the name of a card*/
        public void cardName () {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the name of the card: ");
            String cardName = sc1.next();
            }
        /**Sets the price of a card*/
        public void cardPrice () {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Enter the price of the card: ");
                double cardPrice = sc2.nextDouble();
            }
        /**Sets the release set of card*/
        public void setRelease () {
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Enter the set release of the card: ");
                String cardRelease = sc3.next();
        }
        /**Sets the date the card was input*/
        public void inputDate () {
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Enter today's date: ");
                int cardDate = sc4.nextInt();
        }

}
