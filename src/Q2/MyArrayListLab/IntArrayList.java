package Q2.MyArrayListLab;



public class IntArrayList {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;

    public IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }

    private void doubleCapacity(){
        myCapacity = myCapacity * 2;
        int temp[] = {myCapacity};
        for (int lcv = 0; lcv < mySize - 1; lcv++){
            temp[lcv] = myArray[lcv];
        }
        myArray = temp;
    }
    private void halfCapacity(){
        myCapacity = myCapacity / 2;
        int temp[] = {myCapacity};
        for (int lcv = 0; lcv < mySize - 1; lcv++){
            temp[lcv] = myArray[lcv];
        }
        myArray = temp;
    }
    public void add(int num){
        if (mySize + 1 == myCapacity){doubleCapacity();}
        myArray[mySize] = num;
        mySize++;

    }
    public void remove(int index){
        for (index = index+1; index < mySize - 1; index++){
            myArray[index - 1] = myArray[index];
        }
        mySize--;
        if(mySize <=(myCapacity * 0.25)){
            halfCapacity();
        }
    }
    public int get(int index){return index;}
    public void set(int index,int num){index = num;}
    public int size(){return mySize;}
    public int[] toArray(){return myArray;}
    public int indexOf(int num) {
        for (int lcv = 0; lcv < mySize - 1; lcv++) {
            if (num == lcv){
                return indexOf(num);}
            else {
                return -1;}
        }
        return num;
    }
}
