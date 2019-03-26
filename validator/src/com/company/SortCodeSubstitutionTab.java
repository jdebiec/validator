package com.company;

import java.util.Arrays;
import java.util.List;

public class SortCodeSubstitutionTab {

    int originalSortCode;
    int substituteSortCode;


    public SortCodeSubstitutionTab(int originalSortCode, int substituteSortCode){
        this.originalSortCode = originalSortCode;
        this.substituteSortCode = substituteSortCode;
    }

    public void setOriginalSortCode(int originalSortCode) {
        this.originalSortCode = originalSortCode;
    }

    public void setSubstituteSortCode(int substituteSortCode) {
        this.substituteSortCode = substituteSortCode;
    }

    public int getOriginalSortCode() {
        return originalSortCode;
    }

    public int getSubstituteSortCode() {
        return substituteSortCode;
    }



    public List<SortCodeSubstitutionTab> sortCodesSubTab= Arrays.asList(
            new SortCodeSubstitutionTab(938173,38017),
            new SortCodeSubstitutionTab(938289,938068),
            new SortCodeSubstitutionTab(938297,938076),
            new SortCodeSubstitutionTab(938600,938611),
            new SortCodeSubstitutionTab(938602,938343),
            new SortCodeSubstitutionTab(938604,938603),
            new SortCodeSubstitutionTab(938608,938408),
            new SortCodeSubstitutionTab(938609,938424),
            new SortCodeSubstitutionTab(938613,938017),
            new SortCodeSubstitutionTab(938616,938068),
            new SortCodeSubstitutionTab(938618,938657),
            new SortCodeSubstitutionTab(938620,938343),
            new SortCodeSubstitutionTab(938622,938130),
            new SortCodeSubstitutionTab(938628,938181),
            new SortCodeSubstitutionTab(938643,938246),
            new SortCodeSubstitutionTab(938647,938611),
            new SortCodeSubstitutionTab(938648,938246),
            new SortCodeSubstitutionTab(938649,938394),
            new SortCodeSubstitutionTab(938651,938335),
            new SortCodeSubstitutionTab(938653,938424),
            new SortCodeSubstitutionTab(938654,938621)
    );

    public List<SortCodeSubstitutionTab> getSortCodesSubTab() {
        return sortCodesSubTab;
    }
}
