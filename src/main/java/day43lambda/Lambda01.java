package day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {


        Course turkishDT = new Course("Turkce güdüz kursu", 213, "Spring", 97);
        Course turkishNT = new Course("Turkce gece kursu", 245, "Winter", 98);
        Course englishDT = new Course("Ingilizce gündüz kursu", 121, "Winter", 91);
        Course englishNT = new Course("Ingilizce gece kursu", 137, "Spring", 95);


        List<Course> courseList = new ArrayList<>();
        courseList.add(turkishDT);
        courseList.add(turkishNT);
        courseList.add(englishDT);
        courseList.add(englishNT);
        System.out.println(isAvgScoreGreaterThanANumber(courseList, 92));
        System.out.println(getCourseNameWhoseAvgMax(courseList));
        System.out.println(getCourseBetterThanLastTwo(courseList));
        System.out.println(getHighestThird(courseList));
        System.out.println(getCourseWhoseRegisteredStdLessThanNumber(courseList,150));
    }

    //Example 1: Tum average score'larin 90 dan buyuk olup olmadigini kontrol eden method'u olusturunuz
    public static boolean isAvgScoreGreaterThanANumber (List<Course> courseList, int avg){
        return courseList.stream().allMatch(t-> t.getAverageScore()>avg);

    }
    //Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.
    public static String getCourseNameWhoseAvgMax (List<Course> courseList){

       Course course= courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).// ==> ortalamaya göre küçükten büyüğe sıralıyor
                        reversed()).findFirst().get();
       return course.getName();
    }
    //Example 4 :Average score'u en dusuk olan ilk iki kurs disindaki tum kurslari return eden method'u olusturunuz
    public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).collect(Collectors.toList());
    }
    //Example 5: Average score'u ustten ucuncu olan kursu veren method'u olusturunuz.

    public static Course getHighestThird(List<Course> courseList){

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).
                get(0);
    }
    //Example 6 : Ogrenci sayisi 150'den az olan kurslari return eden mehod'u olusturunuz.
    public static List<Course> getCourseWhoseRegisteredStdLessThanNumber(List <Course> courseList,int numOfStd){
       return courseList.stream().
               filter(t-> t.getNumodStudent()<numOfStd).
               collect(Collectors.toList());
    }

}
