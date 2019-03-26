package com.company;

public class ExceptionOne implements ExceptionChecksumCalculator {

    @Override
    public boolean isChecksumValid(int[] sortCodeAndAccNumberDigits, int[] originalWeights, WeightTableRow.WeightAlgorithm algorithm) {

        int originalChecksum = algorithm.calculateChecksum(sortCodeAndAccNumberDigits, originalWeights);
        originalChecksum+=27;
        return WeightTableRow.WeightAlgorithm.MOD10.calculateChecksum(originalChecksum) == 0;

    }
}
