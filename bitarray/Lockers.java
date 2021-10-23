package bitarray;

import java.util.BitSet;

/**
 * This class represents a set of 50 lockers, which are being opened or closed by students.
 * @author Colton Marty
 * @version 1.0
 */
public class Lockers {

    private static final int LOCKERS = 50;
    public static void main(String[] args) {
        BitSet lockers = new BitSet(LOCKERS);
        int interval = 1;
        String status;

        // Moves to the next student
        for (int student = 0; student < LOCKERS; student++) {
            // Changes lockers based on if they were open or closed previously
            for (int i = 0; i < LOCKERS; i+=interval) {
                lockers.set(i, !lockers.get(i));
            }
            interval++;
        }

        for (int i = 1; i < LOCKERS + 1; i++) {
            if(lockers.get(i)) {
                status = "open";
            }
            else {
                status = "closed";
            }
            System.out.println(i + ": " + status);
        }
    }
}
