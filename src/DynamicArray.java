import java.util.Arrays;

public class DynamicArray<T>{

    private T[] dataArr;
    private int dataArrSize;
    private final int growSize = 10;
    private final int INITIAL_SIZE = 10;

    public DynamicArray(){
        this.dataArr = (T[])new Object[INITIAL_SIZE];
        this.dataArrSize = 0;
    }

    public void add(T val){
        if(dataArr.length == dataArrSize){ 
            grow();
        }
        dataArr[dataArrSize] = val;
        dataArrSize++;
        System.out.print(toString() + "\n");
    }

    public T get(int i){
        if(dataArrSize == 0){
            System.out.println("Array empty!");
            return null;
        } else if(i >= dataArrSize || i < 0) {
            System.out.printf("Invalid index: %d", i);
            return null;
        } else {
            return dataArr[i];
        }    
    }

    public int size(){return dataArrSize;}

    public void remove(){
    if(dataArrSize == 0){
        System.out.println("Array empty!");
    } else {
        dataArr[dataArrSize-1] = null;
        dataArrSize--;
    }
        
    // System.out.print(toString());
    }

    public void remove(int i){
        if(i >= dataArrSize || i < 0){
            System.out.printf("Invalid index: %d", i);
        } else {
            while(i < dataArrSize){
            if(i == dataArrSize - 1){
                dataArr[i] = null;
                break;
            }
            dataArr[i] = dataArr[i + 1];
            i++;
            }
            dataArrSize--;
        }
        System.out.println(toString());
    }

    public void set(int i, T val){
         if(i >= dataArrSize || i < 0){
            System.out.printf("Invalid index: %d", i);
        } else {
            dataArr[i] = val;
        }
        System.out.println(toString());
    }

    public void clear(){
        dataArr = (T[])new Object[INITIAL_SIZE];
        dataArrSize = 0;
        System.out.println(toString());
    }

    private void grow(){
        var newArr = (T[])new Object[INITIAL_SIZE];
        for(int i = 0; i < dataArrSize; i++){
            newArr[i] = dataArr[i];
        }
        dataArr = newArr;
        System.out.print(toString());
    }

    public void shrink(){
        if(canShrink()){
            var newArr = (T[])new Object[INITIAL_SIZE];
            for(int i = 0; i < newArr.length; i++){
            newArr[i] = dataArr[i];
            }
            dataArr = newArr; 
        } else {
            System.out.print("Too many elements in array to shrink!");
        }
        System.out.print(toString());
        
    }

    private boolean canShrink(){
        return dataArr.length > dataArrSize && dataArrSize - dataArr.length > growSize && dataArr.length - growSize >= INITIAL_SIZE;
    }

    public String toString(){
        return Arrays.toString(dataArr);
    }
}