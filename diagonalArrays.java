public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeN = in.nextInt();
        int element;
        
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        for (int i = 0; i < sizeN; i++) {
            for (int j = 0; j < sizeN; j++) {
                element = in.nextInt();
                if (i == j) {
                    sumDiag1 += element;
                }
                
                if ((i + j) == (sizeN - 1)) {
                    sumDiag2 += element;
                }
            }
        }
        int diff = Math.abs(sumDiag1 - sumDiag2);
        System.out.println(diff);
    }
}