package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();
        String name2 = name.nextLine();
        String name3 = name.nextLine();
        String name4 = name.nextLine();
        String name5 = name.nextLine();

        ArrayList<String> namesListA = new ArrayList<>();
        namesListA.add(name1);
        namesListA.add(name2);
        namesListA.add(name3);
        namesListA.add(name4);
        namesListA.add(name5);
        System.out.println("Лист А:");
        Iterator<String> iter = namesListA.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        Scanner nameListB = new Scanner(System.in);
        String nm1 = nameListB.nextLine();
        String nm2 = nameListB.nextLine();
        String nm3 = nameListB.nextLine();
        String nm4 = nameListB.nextLine();
        String nm5 = nameListB.nextLine();

        ArrayList<String> namesListB = new ArrayList<>();
        namesListB.add(nm1);
        namesListB.add(nm2);
        namesListB.add(nm3);
        namesListB.add(nm4);
        namesListB.add(nm5);
        System.out.println("Лист Б:");
        Iterator<String> iterator = namesListB.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<String> namesListC = new ArrayList<>();
        namesListC.add(0, name1);
        namesListC.add(1, nm5);
        namesListC.add(2, name2);
        namesListC.add(3, nm4);
        namesListC.add(4, name3);
        namesListC.add(5, nm3);
        namesListC.add(6, name2);
        namesListC.add(7, nm2);
        namesListC.add(8, name1);
        namesListC.add(9, nm1);
        System.out.println("Смешанные листы:");
        Iterator<String> iteratorC = namesListC.iterator();
        while (iteratorC.hasNext()) {
            System.out.println(iteratorC.next());
        }

        Collections.sort(namesListC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("Сортировка по кол-ву символов:");
        iteratorC = namesListC.iterator();
        while (iteratorC.hasNext()) {
            System.out.println(iteratorC.next());
        }
    }

}
