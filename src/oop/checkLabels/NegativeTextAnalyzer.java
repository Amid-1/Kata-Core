package oop.checkLabels;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] NEGATIVE_SMILEYS = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return NEGATIVE_SMILEYS;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
