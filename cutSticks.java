public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSticks = input.nextInt();
        int stick;
        PriorityQueue<Integer> sticks = new PriorityQueue<>();
        
        for (int i = 0; i < numSticks; i++) {
            stick = input.nextInt();
            sticks.add(stick);
        }
        
        while (sticks.size() > 0) {
            //print number of sticks being cut
            System.out.println(sticks.size());
            stick = sticks.remove();
            
            //remove all sticks that are the smallest and of the same size
            while (stick == sticks.peek()) {
                stick = sticks.remove();
            }
            
            //cut the rest of the sticks by the smallest size
            for (int element : sticks) {
                element -= stick;
            }
        }
    }
}