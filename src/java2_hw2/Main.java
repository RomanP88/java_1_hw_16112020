package java2_hw2;

public class Main {
    public static void main(String[] args) {


        String[][] arr = {
                {"2", "4", "3", "7"},
                {"6", "5", "4", "3"},
                {"1", "2", "3", "4"},
                {"2", "9", "1", "4"}
        };

        try {
            System.out.println(sum(arr));

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();

            System.out.println(e.getColumn() + " " + e.getLine());

        }
        System.out.println("BUY!!!");

    }


    static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        if (arr.length < 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < 4) {
                throw new MyArraySizeException();

            }

        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("  " + i + " " + j, i, j);
                }
            }
        }
        return sum;

    }
}
