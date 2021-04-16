package base;

public class Main {
    /**
     * In our Assignment here we're running a little lemonade stand and we also sell pretzels. We need to keep track of
     * our inventory as well as the money that we're making throughout the day. I have code in the wet code section that
     * keeps track of all of this poorly. Come up with a better way to manage our system. There's not just one way to do
     * this so get creative and most importantly remember to stay DRY!
     *
     * We're gonna look at the first hour where we have 15 customers!
     *
     * We're responsible for keeping track of the number of pretzels and lemonades sold as well as the cash on hand and
     * in the tip jar! To keep things easy I won't make you make change! At the end of the day tips are split among the
     * employees! That means DON'T add it to the cash at the end of the day or during a transaction
     *
     * At the end we're going to print out our inventory left and how much we made in case for the day! Print out the
     * tips too!
     *
     * Remember to use functions, variables, and whatever else would make this easier to maintain!
     *
     * Pretzels are $2 for 1
     * Lemonade is $8 for 1
     */
    static int lemonades_available = 43;
    static int pretzels_available = 60;
    static double cash = 1500.0;
    static double tips = 0.0;


    public static void main(String[] args) {
        //	Replace this with your dry inventory function!
        System.out.println("Lemonades to start: "+ lemonades_available);
        System.out.println("pretzels to start: "+ pretzels_available);
        System.out.println("Cash to start: " + cash);
        dry_inventory();
        System.out.println("-----------Results for the hour:-----------");
        System.out.println("Lemonades left: " + lemonades_available);
        System.out.println("Pretzels left: " + pretzels_available);
        System.out.println("total Cash: " + cash);
        System.out.println("total Tips: " + tips);
    }

    static void dry_inventory() {
        purchase(1,4,4.0);//1
        purchase(3,2,0.0);//2
        purchase(0,3,0.0);//3
        purchase(2,1,0.0);//4
        purchase(6,0,10.0);//5
        purchase(4,0,5.0);//6
        purchase(0,2,0.0);//7
        purchase(8,10,10.0);//8
        purchase(0,6,0.0);//9
        purchase(1,0,0.0);//10
        purchase(0,1,0.0);//11
        purchase(7,0,4.0);//12
        purchase(0,2,0.0);//13
        purchase(3,6,0.0);//14
        purchase(2,9,3.0);//15
    }

    // function that handles purchases
    static void purchase(int lem, int pretz, double tip){
        lemonades_available -= lem;
        pretzels_available -= pretz;
        tips += tip;
        cash += (lem*8)+(pretz*2);
        System.out.println("-------------------------------------------");
        System.out.println("Lemonades purchased: "+ lem);
        System.out.println("pretzels purchased: "+ pretz);
        System.out.println("tip: " + tip);
        System.out.println("Lemonades remaining: "+ lemonades_available);
        System.out.println("pretzels remaining: "+ pretzels_available);
        System.out.println("total cash: " + cash);
        System.out.println("Total Tips: "+ tips);
    }

    static void wet_inventory() {
        /**
         * We have 10 customers in the first hour! This is what they bought! When running this with your dry code you
         * don't want to run this function because then the numbers in the end will be wrong!
         */
        //Customer 1
        pretzels_available -= 4;
        cash += 8;
        lemonades_available -= 1;
        cash += 8;
        tips += 4;

        //Customer 2
        pretzels_available -= 2;
        cash += 4;
        lemonades_available -= 3;
        cash += 24;

        //Customer 3
        pretzels_available -= 3;
        cash += 6;

        //Customer 4
        pretzels_available -= 1;
        cash += 2;
        lemonades_available -= 2;
        cash += 16;

        //Customer 5
        lemonades_available -= 6;
        cash += 48;
        tips += 10;

        //Customer 6
        lemonades_available -= 4;
        cash += 32;
        tips += 5;

        //Customer 7
        pretzels_available -= 2;
        cash += 4;

        //Customer 8
        pretzels_available -= 10;
        cash += 20;
        lemonades_available -= 8;
        cash += 64;
        tips += 10;


        //Customer 9
        pretzels_available -= 6;
        cash += 12;

        //Customer 10
        lemonades_available -= 1;
        cash += 8;

        //Customer 11
        pretzels_available -= 1;
        cash += 2;

        //Customer 12
        lemonades_available -= 7;
        cash += 56;
        tips += 4;

        //Customer 13
        pretzels_available -= 2;
        cash += 4;

        //Customer 14
        pretzels_available -= 6;
        cash += 12;
        lemonades_available -= 3;
        cash += 24;

        //Customer 15
        pretzels_available -= 9;
        cash += 18;
        lemonades_available -= 2;
        cash += 16;
        tips += 3;

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }
}
