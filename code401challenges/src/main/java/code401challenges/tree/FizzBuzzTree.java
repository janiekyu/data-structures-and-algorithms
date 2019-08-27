package code401challenges.tree;

public class FizzBuzzTree {
    public static Tree<Object> fizzBuzzTree(Tree<Object> treeToFizzBuzz) {
        fizzBuzzTreeHelper(treeToFizzBuzz.root);
        return treeToFizzBuzz;
    }

    public static void fizzBuzzTreeHelper(Node<Object> node) {


        if (node.leftChild != null) {
            fizzBuzzTreeHelper(node.leftChild);
        }

        node.value = transformValue((Integer) node.value);
        //System.out.println(node.value);

        if (node.rightChild != null) {
            fizzBuzzTreeHelper(node.rightChild);
        }
    }


    public static Object transformValue(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        }
        return value;
    }
}