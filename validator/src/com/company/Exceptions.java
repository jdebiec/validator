package com.company;

import java.util.List;

public class Exceptions extends SortCodeSubstitutionTab{


    int[] weightsTab = getWeights();
    List<SortCodeSubstitutionTab> sortCodesTab = getSortCodesSubTab();

    public Exceptions(int originalSortCode, int substituteSortCode) {
        super(originalSortCode, substituteSortCode);
    }


    public List<SortCodeSubstitutionTab> getSortCodesTab() {
        return sortCodesTab;
    }

    public void setSortCodesTab(List<SortCodeSubstitutionTab> sortCodesTab) {
        this.sortCodesTab = sortCodesTab;
    }




    public void setWeightsTab(int[] weightsTab) {
        this.weightsTab = weightsTab;
    }


    private int exception1(){

        checksum += 27;
    }

    private int exception2or9(){

            if(accNo[0] != 0 && accNo[6] != 0){
                int[] firstCaseWeights = new int[]{0,0,1,2,5,3,6,4,8,7,10,9,3,1};
                setWeightsTab(firstCaseWeights);

            } else if (accNo[0] != 0 && accNo[6] == 0) {
                int[] secondCaseWeights = new int[] {0,0,0,0,0,0,0,0,8,7,10,9,3,1};
                setWeightsTab(secondCaseWeights);
            }

            // wyliczyć checksum dla MOD11 + MOD11
        }



    private int exception3(){

        if(accNo[2] == 6 || accNo[2] == 9){
           isChecksumValidMod10();
        } else {
            //trzeba kontynuowac drugi check
        }

    }

    private boolean exception4(){

        int restFromMOD11;
        int checkDigit;    //cyfry gh z nr konta jako dwucyfrowa liczba


        if (checksumFromMOD11 == checkDigit){
            return true;
        } else return false;
    }


    private int exception5(int sortCode){

        for (int j = 0; j <= getSortCodesTab().length; j++) {
            //jesli sortcode == originalSortCode, podmien go na substituteSortCode i użyj do walidacji

        }

    }


    private boolean exception6(){

        if (accNo[0] == 4 || accNo[0] == 5 || accNo[0] == 6 || accNo[0] == 7 || accNo[0] == 8 && accNo[6] == accNo[7]){
            isChecksumValid() = true;
        } else {
            //DBLALG
        }
    }

    private int exception7(){

        if(accNo[6] == 9){
            setWeightsTab(0,0,0,0,0,0,0,0,,,,);  // wagi 1-8 się zerują, reszta bez zmian
            //wykonaj przypisany check
        } else {
            //wykonaj przypisany check
        }
    }

    private int exception8(){

        substituteSortCode = 090126;
        //wykonaj przypisany check
    }


    private exception10or11(){

        //jeśli ab = 09  lub ab = 99 i g = 9
        setWeightsTab(0,0,0,0,0,0,0,0,,,,);  // wagi 1-8 się zerują, reszta bez zmian

        if(isChecksumValidMod11() || isChecksumValidMod10()){
            return true;
        } else return false;
    }


    private boolean exception12or13(){

        if(isChecksumValidMod11() || isChecksumValidMod10()){
            return true;
        } else return false;

    }


    private boolean exception14(){

        if(isChecksumValidMod11()){
            return true;
        } else {
            secondCheckEx14();
        }
    }

    private boolean secondCheckEx14(){
        if(accNo[7] != 0 || accNo[7] != 1 || accNo[7] != 9){
            return false;
        } else if(accNo[7] == 0 || accNo[7] == 1 || accNo[7] == 9){
            //usuń ostatnią cyfrę i dodaj 0 na początku numeru konta do checka
            isChecksumValidMod11(); //na zmodyfikowanym numerze, z tymi samymi wagami
            //jeśli nie ma reszty - valid
            // jeśli jest reszta - invalid

        }
    }


}
