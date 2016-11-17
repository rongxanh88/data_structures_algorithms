import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSocks = input.nextInt();
        HashSet<Integer> sockSet = new HashSet<>();
        
        int sock;
        int pairs = 0;
        for (int i = 0; i < numSocks; i++) {
            sock = input.nextInt();
            
            if (sockSet.contains(sock)) {
                pairs++;
                sockSet.remove(sock);
            } else {
                sockSet.add(sock);
            }
        }
        
        System.out.println(pairs);
    }
}
