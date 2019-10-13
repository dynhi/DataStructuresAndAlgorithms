package Lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        Tree theTree = new Tree();
        Tree theTree1 = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);

        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);
        theTree.displayTree();

        theTree1.insert(50, 1.5);
        theTree1.insert(25, 1.2);
        theTree1.insert(75, 1.7);
        theTree1.insert(12, 1.5);
        theTree1.insert(37, 1.2);
        theTree1.insert(43, 1.7);
        theTree1.insert(30, 1.5);
        theTree1.insert(33, 1.2);
        theTree1.insert(87, 1.7);
        theTree1.insert(95, 1.5);
        theTree1.insert(97, 1.5);

        System.out.println("The number of elements of binary tree is : " + theTree.getNumElems());
        System.out.println("The height of binary tree is: " + theTree.getHeight());
        System.out.println("The leaf of binary tree is: " + theTree.getLeafCount());
        System.out.println("Fully balance: " + theTree.fullyBalance());
        System.out.println("Identical tree is :" + theTree.isIdenticalTree(theTree1));
        while (true) {
            System.out.print("Enter first letter of show, ");
            System.out.print("insert, find, delete, or traverse: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    theTree.insert(value, value + 0.9);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.print("Could not find ");
                        System.out.print(value + '\n');
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete)
                        System.out.print("Deleted " + value + '\n');
                    else {
                        System.out.print("Could not delete ");
                        System.out.print(value + '\n');
                    }
                    break;
                case 't':
                    System.out.print("Enter type 1, 2 or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }  // end switch
        }  // end while
    }

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException{
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}
