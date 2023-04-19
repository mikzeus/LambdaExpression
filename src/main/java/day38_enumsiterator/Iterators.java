package day38_enumsiterator;

import java.util.*;

public class Iterators {

    // iteratorlar loopların yaptığı aynı işi yapar. çünkü looplarda sonsuz loop oluşma tehlikesi var.
    // iterator bir collection dan eleman silme ve değiştirme konusunda daha başarılıdır.
    // Iki tip iteraror var; i)Iterator: Bu sadece eleman silmede kullanilir,
    //                                   eleman eklemek veya elemani degistirmek mumkun degildir.
    //                         ii)ListIterator: Bu eleman silebilir, ekleyebilir veya degistirebilir.
    //                                Note:"Iterator" sadece soldan saga (ilk elemandan son elemana) calisir.
    //                                     "ListIterator" ise iki yonlu calisabilir.
/*
            Itereatorlar bir collectiondan eleman silme ve collectiondaki elemani degistirme konusunda looplara nazaran
            daha basarilidir.
            Iki tip iterator vardir. Birincisi sadece iterator olup bu sadece eleman silmede kullanilir.
            Eleman eklemek veya elemani degistirmek mumkun degildir.
            Ikincisi ise ListIterator olup, elaman silebilir, ekleyebilir ve degistirebilir.
            Iterator sadece soldan saga dogru for each loop gibi ilk elemandan son elemana kadar calisir.
            ListIterator ise iki yonlu calisabilir. Bastan sona, sondan bas elemana gidebilir.

            #####################################################################################
            ListIterator kullanmak icin yeni bir List yaptik. Elemanlarini add methodu ile ekledik.
            yourList. yapinca methodlari gorduk ve ListIterator'i sectik. Bu bize String verecek. Listimizi ListIterator'a
            cevirecek.
            ListIterator<String> konteynerina yourListItr'yi assign ettik.
            While loop kullandik ve parantez icinde listIterator'imizin ismini yazip nokta koyunca methodlari gorduk.
            Methodlardan has.Next() methodunu secip condition olarak yazdik. Daha sonra ListItaretor'imizi kullanarak
            baska methodlara baktik, Iterator'a oranla daha fazla method oldugunu gorduk.
            Oradaki next methodunu aldik, next methodumuzu el isimli String'e assign ettik.ve devaminda yine
            ListIterator'imiz ismini yazip nokta koyduk ve set methodunu aldik.
            set methodu icine el + "!" yazarak her elamanin onundeki pointeri alip o elemanin uzerinden atlayip bir sonrakinin
            onune poiter'i koymasini sagladik. Ancak her atlayista uzerinden atlanan elemanin yanina ! isareti eklenecek, cunku
            biz set methodu ile bunu istedik. Set methodu icinde concatination yaptik.
            Sout icine listimizin ismini yazinca ekrana [Tom!, Jim!, Clara!] yazildi. has.Next nethodu calisirken son elemandan
            sonra bir eleman olmadigi anlasilinca false olur ve loop kirilir. Pointer en saga gelmeden hasPrevious methodunu
            kullanamayiz. Kullanirsak bastaki elemanin oncesinde eleman olmadigindan loop kirilir.
 */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        // Iterator kullanımı

        Iterator<String> newList =myList.iterator();

        while (newList.hasNext()){//hasNext(); pointer'a "Senden sonra eleman var mi?" diye sorar.
                                 //Eleman varsa "true" yoksa "false" return eder.
            newList.next();      //next() pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
            newList.remove();   //next() methodunun return ettigi elemani siler.
        }
        System.out.println(myList);// []

        // list iterator kullanımı(ilk elemandan son elemana doğru gittik)

        List<String> herList = new ArrayList<>();
        herList.add("Tom");
        herList.add("Jim");
        herList.add("Clara");
        herList.add("Angie");
        herList.add("Mark");
        System.out.println(herList);//[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String > newHerList = herList.listIterator();
        while (newHerList.hasNext()){
            String eleman= newHerList.next();
            newHerList.set(eleman + "!");// set() uptade eder.


        }
        System.out.println(herList);

        // hasPrevious() ve previous() nasıl kullanılır?
        //hasPrevious(); pointer'a "Senden once eleman var mi?" diye sorar.
        //Eleman varsa "true" yoksa "false" return eder. Bu method sagdan sola dogru calisir
        while (newHerList.hasPrevious()){
           String eleman =newHerList.previous();
            System.out.println(eleman);
            newHerList.set("?" + eleman);
        }
        System.out.println(herList);

        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator ourListItr= ourList.descendingIterator();
        while(ourListItr.hasNext()){
            String el = (String) ourListItr.next();
            System.out.println(el);
        }

        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);

        Iterator itr=list.iterator();
        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5
        System.out.println(itr.next());//9
        itr.remove();// next () neyin üzerinden zıpladıysa remove () onu siler.
                    // bu yüzden üst üste iki kez remove çalıştırlmaz.
        System.out.println(list);
        System.out.println(itr.next());//2
        itr.remove();
        System.out.println(list);

        // Verilen listedeki her elemani 3 artiran methodu  yaziniz

        List<Integer> list1 =new ArrayList<>();
        list1.add(5);
        list1.add(9);
        list1.add(2);
        list1.add(1);
        list1.add(17);
        list1.add(3);
        System.out.println(list1);//[5, 9, 2, 1, 17, 3]

        ListIterator<Integer> itr1 = list1.listIterator();//[(itr)5, 9, 2, 1, 17, 3]
        while(itr1.hasNext()){
            Object sayi =itr1.next();
            itr1.set((Integer)sayi+3);
        }
        System.out.println(list1);
        while (itr1.hasNext()){
            itr1.next();
        }
        while (itr1.hasPrevious()){

            System.out.print(itr1.previous()+ " ");

        }

    }
}
