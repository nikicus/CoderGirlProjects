public class Temperatures {

    public static void main(String args[]) {

        int grid[][] = new int[4][7];

        grid[0][0] = 68;
        grid[0][1] = 70;
        grid[0][2] = 76;
        grid[0][3] = 70;
        grid[0][4] = 68;
        grid[0][5] = 71;
        grid[0][6] = 75;
        grid[1][0] = 76;
        grid[1][1] = 76;
        grid[1][2] = 87;
        grid[1][3] = 84;
        grid[1][4] = 82;
        grid[1][5] = 75;
        grid[1][6] = 83;
        grid[2][0] = 73;
        grid[2][1] = 72;
        grid[2][2] = 81;
        grid[2][3] = 78;
        grid[2][4] = 76;
        grid[2][5] = 73;
        grid[2][6] = 77;
        grid[3][0] = 64;
        grid[3][1] = 65;
        grid[3][2] = 69;
        grid[3][3] = 68;
        grid[3][4] = 70;
        grid[3][5] = 74;
        grid[3][6] = 72;

        for (int row = 0; row < 4; row++) {
            String[] times = {"7 am ", "3 pm ", "7 pm ", "3 am "};
            System.out.print(times[row]);

            for (int column = 0; column < 7; column++) {
                System.out.print(grid[row][column] + " ");
            }
            System.out.println();


        }

        for (int column = 0; column < 7; column++) {
            String[] days = {"Sun: ", "Mon: ", "Tues: ", "Wed: ", "Thurs: ", "Fri: ", "Sat ",};
            System.out.print(days[column]);

            int sum = 0;
            for (int row = 0; row < 4; row++) {
                sum += (grid[row][column]);

            }
            System.out.println(sum / 4);
        }
        for (int row = 0; row < 4; row++) {
            String[] times = {"7 am ", "3 pm ", "7 pm ", "3 am "};
            System.out.print(times[row]);

            int sum = 0;
            for (int column = 0; column < 7; column++) {
                sum += (grid[row][column]);

            }
            System.out.println(sum / 7);
        }
    }
}