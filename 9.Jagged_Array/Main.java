public class Main {
    public static void main(String[] var0) {
        int[][] var1 = new int[3][];

        var1[0] = new int[3];
        var1[1] = new int[4];
        var1[2] = new int[2];

        // Fill and print
        for (int var2 = 0; var2 < var1.length; ++var2) {
            for (int var3 = 0; var3 < var1[var2].length; ++var3) {
                var1[var2][var3] = (int)(Math.random() * 100.0);
                System.out.print(var1[var2][var3] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPrinting again with enhanced for-loop:");
        // Print using enhanced for-loop
        for (int[] row : var1) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
