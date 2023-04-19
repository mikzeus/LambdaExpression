package reglit;

public class gh {
    public static void main(String[] args) {
        System.out.println(front3("ay"));
    }

    public static String front3(String str) {
        if (str.length() > 2) {
            str = str.substring(0, 4);
            return str + str + str;

        }

        return str;
    }

}
