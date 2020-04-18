package datastructures.arrays;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print(){
        for(int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        //Jei masyvas pilnas, pakeiciam jo dydi
        if (items.length == count) {
            //sukurti masyva
            int[] newItems = new int[count * 2];
            //perkelti senus elementus i nauja masyva
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            //priskiriame nauja masyva
            items = newItems;
        }

        //Pridedam item
        items[count] = item;
        count++;
    }

    public void remove(int index) {
        //validate index
        if(index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        //perkelti elementus i kaire, kad uzpildytu tuscia vieta (kur buvo panaikintas elelementas)
        //[10,20,30,40]
        //remove index: 1
        //[10,30,40]
        for(int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        //Jei randam , grazinam jo index nr
        //jei neranam grazinam -1
        //Best case scenario - if item is at index 1, then the complexity is O(1)
        //Worst case - O(N), so the runtime complexity of this method is O(n)
        for(int i = 0; i < count; i++) {
            if(items[i] == item) {
                return i;
            }
        }

        return -1;
    }
}
