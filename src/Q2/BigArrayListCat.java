package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class BigArrayListCat {
    public static void printCat(Cat cat) {
        System.out.printf("%s\t%.2f\t%d\t$%.2f\n",
                cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = file.nextInt();
            file.nextLine();
            ArrayList<Cat> cats = new ArrayList<>();

            for (int lcv = 0; lcv < numCats; lcv++){
                String n = file.nextLine();
                double w = file.nextDouble();
                int a = file.nextInt();
                double c = file.nextDouble();
                file.nextLine();
                cats.add(new Cat(n, w, a, c));
            }
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats)
                printCat(cat);

            System.out.println("\n2. The third cat is named: "+ cats.get(2).getName());

            cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight() + 10);
            System.out.println("\n3. The updated weight is: " + cats.get(cats.size()-1).getWeight());

            for (int i = 0; i < cats.size(); i++)
                if (cats.get(i).getName().equals("Rascal"))
                    cats.remove(i);

            cats.add(1, new Cat("Angel", 3.6, 1, 25.99));

            cats.add(new Cat("Gimpy", 14.3, 10, 29.99));

            System.out.println("\n7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats)
                printCat(cat);

            Cat third = cats.get(2);
            cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));
            cats.add(third);

            Cat temp = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp);

            System.out.println("\n10. The current cat names are: ");
            for (Cat c : cats)
                System.out.print(c.getName() + "\t");
            System.out.println();

            for (int i = 0; i < cats.size(); i++){
                if (cats.get(i).getCost() < 26){
                    cats.remove(i);
                    i--;
                }
            }
            System.out.println("\n11. The costs of the remaining cats are: ");
            for (Cat c : cats)
                System.out.print(c.getCost() + "\t");
            System.out.println();

            System.out.println("\n12. The cats being put on a diet are: ");
            for (int lcv = 0; lcv < cats.size(); lcv++){
                Cat c = cats.get(lcv);
                if (c.getWeight() > 15)
                    System.out.print(c.getName() + "\t");
            }
            System.out.println();

            while (file.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
1. All the cats:
Name	Weight	Age	Cost
Inky	15.69	2	$35.79
Panda	14.30	6	$15.03
Rascal	21.10	21	$0.00
Blacky	13.99	3	$26.89
Taffy	24.50	10	$56.89
Toby	17.20	10	$37.57

2. The third cat is named: Rascal

3. The updated weight is: 27.2

7. The updated list is:
Name	Weight	Age	Cost
Inky	15.69	2	$35.79
Angel	3.60	1	$25.99
Panda	14.30	6	$15.03
Blacky	13.99	3	$26.89
Taffy	24.50	10	$56.89
Toby	27.20	10	$37.57
Gimpy	14.30	10	$29.99

10. The current cat names are:
Inky	Blacky	Sugar	Angel	Taffy	Toby	Gimpy	Panda

11. The costs of the remaining cats are:
35.79	26.89	33.25	56.89	37.57	29.99

12. The cats being put on a diet are:
Inky	Sugar	Taffy	Toby

 */