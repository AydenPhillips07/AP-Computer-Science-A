package Q4;

public class GenericsAndTernary {
    // Generic Typing
    static class MyBox<T> { //Define a template type
        private T myVal;

        public MyBox(T thing) {myVal = thing;}
        public void setVal(T thing) { myVal = thing;}
        public T getVal() {return myVal;}
        public String toString() {return myVal.toString();}
    }

    static <T> void printBox(MyBox<T> box) {
        if (box != null && box.getVal() instanceof Integer)
            System.out.println("Box number: " + box.getVal());
        System.out.println("Box contains: " + box.getVal());
    }

    public static void main(String[] args){
        //ArrayList<Type> list = new ArrayList<TYPE>();
        var box = new MyBox<Integer>(5); // var infers the type from the RHS
        //ONLY EVER USE var IF YOU USE THE new KEYWORD
        //AND THE TYPE IS NOT A CHILD CLASS OR USES AN INTERFACE
        String msg = (box.getVal() >= 5) ? "val >= 5" : "val < 5:";
        // ?: ternary operator -> (condition) "if" ... "else" ...
        System.out.println(msg);
        int num = Integer.parseInt("10"); //String _> Integer; also Double.parseDouble
        System.out.println(box.getVal());
        // Can't do dynamic typings; i.e., box.setVal("Hello");
        var sBox = new MyBox<String>("Hello");
        System.out.println(sBox);
        int x = 100;
        do {
            System.out.println("X = " + x);
        } while (x < 5);
        //The condition is only checked after the loop runs
        for(int i = 0; i < 1000000; i++){
            if (i % 2 != 0) continue; // skips rest of code and starts loop over
            System.out.println(i);
            if(i==10)
                break; // Breaks out of the loop entirely(like return)
        }

        int day = 3;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default: //else
                System.out.println("Invalid");
                break;
        }

        char grade = 'A';
        switch(grade){
            case 'A' -> System.out.println("An A is great!");
            case 'B' -> System.out.println("A B is okay (I guess)!");
            case 'C' -> System.out.println("A C means do better!");
            default -> System.out.println("What happened to your grade?!");
        }

        enum Days{
            Monday,
            Tuesday,
            Wednesday
        }

        Days today = Days.Wednesday;
        switch (today) {
            case Wednesday -> System.out.println("It is Wednesday my dudes");
            default -> System.out.println("It is not Wednesday");
        }
    }
}
