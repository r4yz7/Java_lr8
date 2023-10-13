package org.example;

import java.time.LocalDate;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //  1
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        int[]arr = new int[10];
//        for (int i = 0;i<arr.length ; i++){
//            arr[i]= random.nextInt(10);
//        }
//        for (int i:arr){
//            System.out.print(i + " ");
//        }
//        System.out.print("Enter number: ");
//        int n = scanner.nextInt();
//
//        long paired = Arrays.stream(arr).filter(elem->elem%2==0).count();
//        long notPaired = Arrays.stream(arr).filter(elem->elem%2!=0).count();
//        long isNull = Arrays.stream(arr).filter(elem->elem==0).count();
//        long equal = Arrays.stream(arr).filter(elem->elem==n).count();
//
//        System.out.println("Paired: " + paired);
//        System.out.println("Not Paired: " + notPaired);
//        System.out.println("Is null: " + isNull);
//        System.out.println("Equal to the number " + n + ": " + equal);
            //2
//        Scanner scanner = new Scanner(System.in);
//        List<String>cities = new ArrayList<>();
//        Collections.addAll(cities,"Kyiv","Warsaw","Lviv","London","Kriviy Rih","Dnipro","Kyiv");
//        cities.stream().forEach(s->System.out.print(s+" "));
//        System.out.println();
//        System.out.println("more that six");
//        cities.stream().filter(s->s.length()>=6).forEach(s->System.out.println(s));
//        System.out.print("Enter name of city: ");
//        String city = scanner.nextLine();
//        long countCities=cities.stream().filter(elem->elem.equals(city)).count();
//        System.out.println("Such a city occurs: " +countCities);
//        System.out.print("Enter letter: ");
//        String letter = scanner.nextLine();
//        long countCitiesStart = cities.stream().filter(s->s.startsWith(letter)).count();
//        System.out.println("Start " + letter+ ": " + countCitiesStart);

        //3
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Tesla",2018,"black",0,18000000));
//        cars.add(new Car("BMW",2016,"yellow",4.4,30000000));
//        cars.add(new Car("Audi",2018,"black",5,14000000));
//        cars.add(new Car("Daewoo",2009,"green",0.8,100000));
//        System.out.println("1");
//        cars.stream().forEach(s->System.out.println(s));
//        System.out.println();
//        System.out.println("2");
//        cars.stream().filter(s->s.color.equals("black")).forEach(s->System.out.println(s));
//        System.out.println();
//        System.out.println("3");
//        cars.stream().filter(s->s.price>14000000).forEach(s->System.out.println(s));
//        System.out.println();
//        System.out.println("4");
//        cars.stream().filter(s->s.year>=2012 && s.year<2019).forEach(s->System.out.println(s));

        //4
        List<Televisor> tv = new ArrayList<>();
        tv.add(new Televisor("asdg",2023,20000,46,"LG"));
        tv.add(new Televisor("qwerty",2016,15000,32,"Samsung"));
        tv.add(new Televisor("qsaszx",2023,25000,52,"LG"));
        tv.add(new Televisor("ldsla",2012,6000,32,"Panasonic"));
        System.out.println("1");
        tv.stream().forEach(s->System.out.println(s));
        System.out.println("2");
        tv.stream().filter(s->s.diagonal==32).forEach(s->System.out.println(s));
        System.out.println("3");
        tv.stream().filter(s->s.firm.equals("LG")).forEach(s->System.out.println(s));
        System.out.println("4");
        tv.stream().filter(s->s.year == LocalDate.now().getYear()).forEach(s->System.out.println(s));
        System.out.println("5");
        tv.stream().filter(s->s.price>15000).forEach(s->System.out.println(s));
        System.out.println("6");
        tv.stream().sorted((s1,s2)-> Double.compare(s1.price,s2.price)).forEach(s->System.out.println(s));
        System.out.println("7");
        tv.stream().sorted((s1,s2)-> Double.compare(s2.price,s1.price)).forEach(s->System.out.println(s));
        System.out.println("8");
        tv.stream().sorted((s1,s2)-> Double.compare(s1.diagonal,s2.diagonal)).forEach(s->System.out.println(s));
        System.out.println("9");
        tv.stream().sorted((s1,s2)-> Double.compare(s2.diagonal,s1.diagonal)).forEach(s->System.out.println(s));
    }
}