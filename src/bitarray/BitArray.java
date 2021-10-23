package bitarray;

/**
 * This class represents a BitArray
 * @author Colton Marty
 * @version 1.0
 */
public class BitArray {
    private long data;  // 64 bits

    public BitArray() {
        data = 0;
    }

    /**
     * Set the long to 1 or true
     * @param index a number 0 to 64
     */
    public void set (int index, boolean value) {
        long mask = 1L << index;

        if(value) {
            data |= mask;
        }
        else {
            data = 0;
        }
    }

    /**
     *
     * @param index a number 0 to 64
     * @return Return true if bit is 1, false otherwise
     */
    public boolean get(int index) {
        long mask = 1L << index;

        return ((mask & data) == mask);
    }
}
