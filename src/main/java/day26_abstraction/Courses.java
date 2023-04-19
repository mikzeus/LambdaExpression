package day26_abstraction;

/*
        1)Bazen parent class'daki method'un body'si hicbir child class tarafindan kullanilmaz.
        Bu durumda parent'daki method'a body yazmak hic kullanilmadigi icin mantikli degildir.
         Biz de o method'a body yazmayiz.
        2)Body'si yazilmayan method'a "Abstract Method" denir.Abstract Ingilizce'de "vucutsuz" veya "soyut" anlamindadir.
        3)Method'un body'sini yazmayinca Java hata verir, biz de "abstract" keyword'unu kullanarak
         Java'ya bu method'un body'si olmayacak deriz.
        4)"abstract" keyword'unu kullaninca elde ettigimiz abstract method normal class'lara konulamaz,
        o yuzden class'i da "abstract" yapariz.
        5)Parent'deki method abstract ise  bütün child class'lar o methodu override etmek zorundadır.Bu yüzden
        tüm child'lar için mecburi olmasını istediğimiz fonksiyonları abstract yapmak mantıklı seçimdir.
        6) Body'si olan methodlar (Concrete Methot) abstract class ın içine yazılabilir. Ancak tersi durum geçerli değildir.
        7) "Abstract" keyword ile "method body" bir method ta aynı anda kullanılamaz..
        8) Abstract Class'lardan obje üretilemez. çünkü Abstract methotların body'si olmadığı için eksik methodlar
        olarak düşünülebilir. Eksik Class tan obje üretilirse, abstract class tan eksik olan özellik eksik obje üretilmiş
        olur. bu yüzden Java bunu istemez, eksik obje eksik iş yapar bu da Applicatin"ın yanlış çalışmasına sebep olur.
        Bu yüzden java Abstract Class"lardan obje üretilmesine izin vermez, engellemiştir.
        9) Abstract methodların constructor'ı var ama object oluşturamazlar.
        10) final methot'lar abstract olamazlar. bir final methot varsa o mutlaka concrate olmalıdır.
        11) private methotlar abstract olamazlar..
        12)abstract Class'ların abstract child child class veya congrete child'e olur..

        */
/*
        Final keyword'u açıklar msınız? interview sorusu..

        Final keyword:
        i) Variable'larda    ii) method'larda  iii) Class'larda kullanılabilir.
        i) Variable'larda kullanılırsa a) variable'a kesinlikle değer ataması yapılmalıdır.
                                       b) Ilk atanan değer değiştirilemez.
        ii) method'larda kullanıldığında o methodun body'si değiştirlemez. body değişmeyince override edilemez.
        iii) Class'larda kullanılanıldığında o class'ın child class'ı olamaz, ancak final Class ın kendisi child class
            olur

 */
/*

    1)Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece child classlarin
    yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak "Abstraction" yapariz
    2)Bazen parent class daki methodun body si hicbir child class tarafindan kullanilmaz. Bu durumda
    parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir. Bizde o methoda
    body yazmayiz
    3)Body si yazilmayan methoda Abstract Method denir. Abstract ingilizcede vucutsuz yada soyut anlamindadir
    4)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullanarak javaya
    bu methodun bodysi olmayacak deriz
    5)abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz,
    o yuzden classi da abstract yapmaliyiz
    6)Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir
    Bu yuzden tum chidlar icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir
    7)Body si olan methodlar (concrete method) abstract classlarin icine yazilabilir.
    Abstract methodlar concrete classlarin icine yazilamazlar. Concrete Methodlar child classlar tarafindan
    override edilmek zorunda degildir.
    8) abstract keyword ile method body bir methodda ayni anda kullanilamaz
    9)final methodlar abstract olamazlar. final methodlar override edilemezler, halbuki abstract methodlar
    override edilmek icin olusturulurlar. Bu celiskidir, bu yüzden java abstract methodlarin final olamasina musade etmez
    10)abstract classlarin icinde abstract methodlar olur, obstract methodlar body si olmadigindan
    eksik methodlari gibi dusunulebilir
    Yani abstract class icinde eksik bir yapi barindirir, siz abstract classdan object uretirseniz abstact class icindeki
    eksikiilk object'e yansir.
    Java bunu istemez cunku eksik object eksik is yapar buda application'ın yanlis calsimasina sebep olur
    javada applicationu korumak icin abstract classlardan object uretilmesini engellemistir
    11)abstract classlarin constructorlari vardir ama object olusturamazlar


    **/


public abstract class Courses {
    public abstract void math();

    public void art() {
        System.out.println("learn art");
    }




}
