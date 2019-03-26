package com.company;

public interface ChecksumCalculator {

    int calculateChecksum(int [] digits, int [] weights);

    default int calculateChecksum(int number) {
        return calculateChecksum(new int[] {number}, new int[]{1});
    }

}
