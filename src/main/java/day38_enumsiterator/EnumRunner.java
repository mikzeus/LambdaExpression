package day38_enumsiterator;

import day18_constructorsstatickeyword.StudentRunner;

public class EnumRunner {
    public static void main(String[] args) {
        String capital = usStatesEnum.ILLINOIS.getCapital();
        System.out.println(capital);

        String abbriviation= usStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbriviation);

        System.out.println(usStatesEnum.ALASKA);

        usStatesEnum state= usStatesEnum.AMERICAN_SAMOA;
        System.out.println(state);

        String str = usStatesEnum.getStateNameByUsingAbbeviation("AL");
        System.out.println(str);

    }
}
