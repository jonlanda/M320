package V3;

import V3.Börse.börse;

public class newyork implements börse {

    @Override
    public int getValueMicrosoft() {
        return 120;
    }

    @Override
    public int getValueCreditSuisse() {
        return 1;
    }

}