package ds.lab2;

/**
 *
 * @author barzy
 */
public class Tester {

    public static void main(String[] args) {
        DynamicArray arrObject = new DynamicArray();

        arrObject.addItem(10);
        arrObject.addItem(20);
        arrObject.addItem(30);
        arrObject.addItem(40);
        arrObject.addItem(50);
        arrObject.addItem(60);
        arrObject.addItem(70);
        arrObject.addItem(80);
        arrObject.addItem(90);
        arrObject.addItem(100);

        arrObject.removeItem();
        arrObject.printArrayLength();
        arrObject.removeItem();
        arrObject.printArrayLength();
        arrObject.removeItem();
        arrObject.removeItem();
        arrObject.removeItem();
        arrObject.removeItem();
        arrObject.removeItem();
        arrObject.removeItem();
        arrObject.printArrayLength();

        arrObject.printArray(true);
        arrObject.printArray(false);

        arrObject.search(20);
        arrObject.search(11);

    }
}
