package com.company;


public class WeightTableRow {


    public WeightTableRow() {
    }

    enum WeightAlgorithm implements ChecksumCalculator {
        MOD11 {
            @Override
            public int calculateChecksum(int[] digits, int[] weights) {
                return 0;
            }
        },
        MOD10 {
            @Override
            public int calculateChecksum(int[] digits, int[] weights) {
                return 0;
            }
        },
        DBLAL {
            @Override
            public int calculateChecksum(int[] digits, int[] weights) {
                return 0;
            }
        }
    }

    private  int checksum;
    private int from;
    private int to;
    private WeightAlgorithm algorithm;
    private int[] weights;

    public WeightTableRow(int from, int to, WeightAlgorithm algorithm, int... weights) {
        this.from = from;
        this.to = to;
        this.algorithm = algorithm;
        this.weights = weights;
    }
    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int[] getWeights() {
        return weights;
    }

    public void setWeights(int[] weights) {
        this.weights = weights;
    }

    public boolean isInRange(String sortCode) {
        Integer sortCodeNumeric = Integer.valueOf(sortCode);
        return from >= sortCodeNumeric && to <= sortCodeNumeric;
    }

    private boolean amISpecial() {
        return weights.length > 14;
    }

    private int[] getSortCodeAndAccountAsDigits(String sortCode, String digits) {
        return new int[]{};
    }

    public boolean isChecksumValid(String sortCode, String accountNumber) {

        if (amISpecial()) {

            int exceptionCode = weights[weights.length-1];

            switch (exceptionCode) {

                case 1:


            }


        } else {
            return algorithm.calculateChecksum(getSortCodeAndAccountAsDigits(sortCode, accountNumber), weights) == 0;
        }

    }

    private boolean isChecksumValidMod11(String sortCode, String accountNumber) {
        if(getWeights().length == 15){
            int ex = weights[14];


        } else {
            for(int i = 0; i<=weights.length; i++){

            }
        }

    }

    private boolean isChecksumValidMod10() {
        if(getWeights().length == 15){
            int ex = weights[14];

        } else {
            checksum
        }

    }

    private boolean isChecksumValidDblal(String sortCode, String accountNumber) {
        if(getWeights().length == 15){
            int ex = weights[14];

        } else {
            checksum
        }

    }

}
