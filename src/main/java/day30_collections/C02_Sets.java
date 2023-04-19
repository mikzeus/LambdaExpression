package day30_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class C02_Sets {
    public static void main(String[] args) {
        // Ex:öğrenci email adreslerini "Natural Order"da sıralanmış olarak depolayınız.
        // I.Way

        TreeSet<String> emails= new TreeSet<>();
        emails.add("xbc@gmal.com");
        emails.add("tcv@gmal.com");
        emails.add("crds@gmal.com");
        emails.add("qwe@gmal.com");
        emails.add("asts@gmal.com");
        emails.add("kzbf@gmal.com");
        emails.add("ystc@gmal.com");
        emails.add("vcds@gmal.com");
        emails.add("kre@gmal.com");
        emails.add("xcr@gmal.com");
        emails.add("tml@gmal.com");

        System.out.println(emails);

        //II.Way: Recommend ikinci yol daha hzılı çalışır.
        HashSet<String >mailHs= new HashSet<>();
        mailHs.add("xbc@gmal.com");
        mailHs.add("tcv@gmal.com");
        mailHs.add("crds@gmal.com");
        mailHs.add("qwe@gmal.com");
        mailHs.add("asts@gmal.com");
        mailHs.add("kzbf@gmal.com");
        mailHs.add("ystc@gmal.com");
        mailHs.add("vcds@gmal.com");
        mailHs.add("kre@gmal.com");
        mailHs.add("xcr@gmal.com");
        mailHs.add("tml@gmal.com");

        TreeSet<String>newEmailSet=new TreeSet<>(mailHs);
        System.out.println(newEmailSet);

    }
}
