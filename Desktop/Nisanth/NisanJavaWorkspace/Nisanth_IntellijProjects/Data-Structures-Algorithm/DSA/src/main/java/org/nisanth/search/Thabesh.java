package org.nisanth.search;

public class Thabesh {
    public static void main(String[] args) {
        int previousValue = 0;
        int sum = 0;

        for(int i = 0; i < 10; i++) {
            sum = previousValue + i;
            int prev=i-1;
            System.out.println("Current value: " + i + ", Previous value: " + prev + ", Sum: " + sum);
            //previousValue = i;
        }
    }
}
