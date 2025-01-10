package Q2.MyArrayListLab;

public class MyArrayListLab {
    public static void main(String[] args) {
        IntArrayList list = new IntArrayList();
        System.out.println("Testing add() and get()...");
        for (int i = 0; i < 10; i++)
            list.add(i);
        for (int i = 0; i < list.size(); i++)
            System.out.println("list.get(" + i + ") = " + list.get(i));
        System.out.println("\nTesting set()...");
        for (int i = 0; i < list.size(); i++)
            list.set(i, i * 2);
        for (int i = 0; i < list.size(); i++)
            System.out.println("list.get(" + i + ") = " + list.get(i));
        System.out.println("\nTesting remove()...");
        for (int i = 0; i < list.size(); i++)
            if (i % 3 == 0) list.remove(i);
        for (int i = 0; i < list.size(); i++)
            System.out.println("list.get(" + i + ") = " + list.get(i));
        System.out.println("\nTesting indexOf()...");
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 20);
            System.out.println("list.indexOf(" + num + ") = " + list.indexOf(num));
        }
    }
}
/*
Testing add() and get()...
list.get(0) = 0
list.get(1) = 1
list.get(2) = 2
list.get(3) = 3
list.get(4) = 4
list.get(5) = 5
list.get(6) = 6
list.get(7) = 7
list.get(8) = 8
list.get(9) = 9

Testing set()...
list.get(0) = 0
list.get(1) = 1
list.get(2) = 2
list.get(3) = 3
list.get(4) = 4
list.get(5) = 5
list.get(6) = 6
list.get(7) = 7
list.get(8) = 8
list.get(9) = 9

Testing remove()...
list.get(0) = 0
list.get(1) = 1
list.get(2) = 2
list.get(3) = 3
list.get(4) = 4
list.get(5) = 5
list.get(6) = 6

Testing indexOf()...
list.indexOf(16) = -1
list.indexOf(3) = -1
list.indexOf(6) = -1
list.indexOf(3) = -1
list.indexOf(6) = -1
list.indexOf(13) = -1
list.indexOf(8) = -1
list.indexOf(6) = -1
list.indexOf(17) = -1
list.indexOf(1) = -1

 */
