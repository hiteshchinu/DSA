package MyArrays;

public class MyArray {
    
    private int[] items;
    private int currentIndex;

    public MyArray (int initialSize) {
        this.items = new int[initialSize];
        this.currentIndex = 0;
    }


    public void insert(int value) {
        if (currentIndex == items.length) {
            int[] temp = new int[items.length * 2];
            
            for(int i = 0; i < currentIndex; i++) {
                temp [i] = items[i];
            }
            items = temp;
        }
        this.items[currentIndex] = value;
        this.currentIndex++;
    }

        



    // public void insert(int value) {
    //     this.items[currentIndex] = value;
    //     currentIndex++;
    // }


    public int indexOf(int value) {
        // Linear Search
        for (int i = 0; i < this.currentIndex; i++) { //changed from items.length to currentIndex to search only the part of array  which is filled
        if(this.items[i] == value) return i;
        }
        return -1;
    }

    public void removeAt(int index) {
        if(index>=this.currentIndex) throw new IllegalArgumentException();
        for(int i = index; i <= this.currentIndex - 2; i++){
            this.items[i] = this.items[i + 1];
        }
        this.currentIndex--;
        this.items[currentIndex] = 0;
    }



    public int max() {
        int result = this.items[0];
        for(int i = 1; i < this.currentIndex; i++) {
            if (items[i] > result)
            result = items[i];
        }
        return result;
    }



    public int min() {
        int result = this.items[0];
        for(int i = 1; i < this.currentIndex; i++) {
            if (items[i] < result)
            result = items[i];
        }
        return result;
    }



    public void reverse (){
        int i = 0;
        int j = this.currentIndex - 1;
        
        while (i < j) {
            int temp = items[i];
            items[i] = items[j];
            items [j] = temp;
            i++;
            j--;
        }
    }





    public String toString () {
        StringBuilder str = new StringBuilder ();
        str.append("[");
        for(int i = 0; i < this.currentIndex;i++) {
            str.append(this.items[i]).append(", ");
        }
        str.append("\b").append("\b").append ("]");
        return str.toString();
    }   
}
