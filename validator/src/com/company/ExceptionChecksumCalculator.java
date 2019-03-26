package com.company;

public interface ExceptionChecksumCalculator {

    boolean isChecksumValid(int [] sortCodeAndAccNumberDigits, int [] originalWeights, WeightTableRow.WeightAlgorithm algorithm);

}
