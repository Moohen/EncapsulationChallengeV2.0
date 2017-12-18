package com.mateusz;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial pages count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(1);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printer.getPagesPrinted());
        int addToner = printer.addToner(40);
        System.out.println("Toner level is = " + addToner);
        addToner = printer.addToner(20);
        System.out.println("Toner level is = " + addToner);
        pagesPrinted = printer.printPages(10);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printer.getPagesPrinted());

    }
}
