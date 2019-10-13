package Lab5;

//code for question 1-3

public class Puzzle {
    private int puzzle(int base, int limit){
        if (base > limit)
            return -1;
        else if (base == limit)
            return 1;
        else return base * puzzle(base + 1, limit);
    }

    public static void main(String[] args){
        Puzzle testPuzzle = new Puzzle();
        System.out.println(testPuzzle.puzzle(14, 10));
        System.out.println(testPuzzle.puzzle(4, 7));
        System.out.println(testPuzzle.puzzle(0, 0));
    }
}
