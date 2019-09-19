import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean exit = false;
        Scanner in = new Scanner(System.in);
        String cont;

        System.out.println("Time to make a Christmas tree!");

	    while (!exit)
	    {
	        TreeCreator();
	        System.out.println("Create another tree? y/n");
	        cont = in.next();

	        if(cont.equals("n"))
	            exit = true;

        }

	    System.out.println("Merry Christmas!");
    }

    public static void PrintTreeMenu()
    {
        System.out.println("Choose the kind of tree by entering its number option:");
        System.out.println("1. Fraser Fir \t\t\t\t $12");
        System.out.println("2. Douglas Fir \t\t\t\t $15");
        System.out.println("3. Balsam Fir \t\t\t\t $5");
        System.out.println("4. Colorado Blue Spruce \t $20\n");
    }

    public static void PrintDecorationsMenu()
    {
        System.out.println("Enter the corresponding number for the decoration to add:");
        System.out.println("1. Star \t\t\t $4");
        System.out.println("2. Ruffles \t\t\t $1");
        System.out.println("3. Red Balls \t\t $1");
        System.out.println("4. Blue Balls \t\t $2");
        System.out.println("5. Silver Balls \t $3");
        System.out.println("6. Ribbons \t\t\t $2");
        System.out.println("7. Lights \t\t\t $5");
        System.out.println("8. LEDs \t\t\t $10");
        System.out.println("0. Done adding decorations\n");
    }

    public static void TreeCreator()
    {
        Scanner in = new Scanner(System.in);
        Tree tree;
        int selection = 0;

        //Select a type of tree
        PrintTreeMenu();

        while (selection < 1 || selection > 4)
            selection = in.nextInt();

        switch (selection)
        {
            case 1:
                tree = new FraserFir();
                break;
            case 2:
                tree = new DouglasFir();
                break;
            case 3:
                tree = new BalsamFir();
                break;
            default:
                tree = new ColoradoBlueSpruce();
                break;
        }

        //Add decorations to tree until done
        selection = -1;
        System.out.println("Now, your " + tree.getDescription() + " needs decorations!");
        boolean hasStar = false;

        while (selection != 0)
        {
            selection = -1;

            PrintDecorationsMenu();

            while(selection < 0 || selection > 8)
                selection = in.nextInt();

            switch (selection)
            {
                case 1:
                    if(hasStar)
                    {
                        System.out.println("Tree already has a star!");
                        break;
                    }
                    else
                    {
                        tree = new Star(tree);
                        hasStar = true;
                        break;
                    }
                case 2:
                    tree = new Ruffles(tree);
                    break;
                case 3:
                    tree = new RedBalls(tree);
                    break;
                case 4:
                    tree = new BlueBalls(tree);
                    break;
                case 5:
                    tree = new SilverBalls(tree);
                    break;
                case 6:
                    tree = new Ribbons(tree);
                    break;
                case 7:
                    tree = new Lights(tree);
                    break;
                case 8:
                    tree = new LEDs(tree);
                    break;
                default:
                    break;
            }
        }

        //Print out description and cost of created tree
        System.out.println("Your Tree: " + tree.getDescription());
        System.out.println("Your Tree Cost: " + tree.getCost());
    }
}


