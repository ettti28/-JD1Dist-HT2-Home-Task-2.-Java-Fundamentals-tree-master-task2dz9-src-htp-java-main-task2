package by.htp.java.main.task2_9;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {




        Book fantastic1 = new Book(101, "Life", "Ivanov", "Reed Elsevier", 2001, 244, 245.5, "softcover");
        Book fantastic2 = new Book(111, "Life 2", "Ivanov", "Wolters Kluwer", 2012, 234, 234.5, "hardcover");
        Book fantastic3 = new Book(103, "Stars", "Petrov", "Wolters Kluwer", 2001, 133, 255.5, "softcover");
        Book fantastic4 = new Book(102, "Moon", "Sidorov", "Reed Elsevier", 1999, 342, 254.7, "softcover");
        Book fantastic5 = new Book(114, "Mars", "Sidorov", "Wolters Kluwer", 2001, 342, 544.5, "softcover");

        Book classic1 = new Book(110, "Man", "Ivanova", "Reed Elsevier", 1967, 243, 334.5, "hardcover");
        Book classic2  = new Book(109, "Woman", "Ivanov", "Wolters Kluwer", 2016, 205, 264.5, "softcover");
        Book classic3  = new Book(104, "Childe", "Petrova", "Pearson", 2002, 211, 436.2, "softcover");
        Book classic4  = new Book(113, "Man 2", "Sidorova", "Pearson", 2011, 122, 455.0, "softcover");
        Book classic5  = new Book(112, "Runner", "Grigorieva", "Reed Elsevier", 2001, 122, 464.5, "hardcover");

        Book detective1 = new Book(115, "Catherine Morland", "Jane Austen", "Pearson", 2013, 543, 784.7, "softcover");
        Book detective2 = new Book(105, "Inspector Bucket", "Charles Dickens", "Reed Elsevier", 2001, 205, 443, "hardcover");
        Book detective3 = new Book(108, "Sergeant Cuff", "Charles Dickens", "Pearson", 2019, 223, 254.5, "softcover");
        Book detective4 = new Book(107, "Mrs. Paschal", "Stephens Hayward", "Wolters Kluwer", 2002, 223, 678, "softcover");
        Book detective5 = new Book(106, "A Study in Scarlet  ", "Conan Doyle", "Reed Elsevier", 1988, 325, 322.5, "hardcover");




        Book ws = new Fantastic();



        ws.box1( fantastic1.getId() , fantastic1.getName() ,fantastic1.getAuthor() , fantastic1.getPublishingHouse() ,
                fantastic1.getYear() ,   fantastic1.getPages() , fantastic1.getPrice() , fantastic1.getCoverType());

        ws.box1( fantastic2.getId() , fantastic2.getName() ,fantastic2.getAuthor() , fantastic2.getPublishingHouse() ,
                fantastic2.getYear() ,   fantastic2.getPages() , fantastic2.getPrice() , fantastic2.getCoverType());

        ws.box1( fantastic3.getId() , fantastic3.getName() ,fantastic3.getAuthor() , fantastic3.getPublishingHouse() ,
                fantastic3.getYear() ,   fantastic3.getPages() , fantastic3.getPrice() , fantastic3.getCoverType());

        ws.box1( fantastic4.getId() , fantastic4.getName() ,fantastic4.getAuthor() , fantastic4.getPublishingHouse() ,
                fantastic4.getYear() ,   fantastic4.getPages() , fantastic4.getPrice() , fantastic4.getCoverType());

        ws.box1( fantastic5.getId() , fantastic5.getName() ,fantastic5.getAuthor() , fantastic5.getPublishingHouse() ,
                fantastic5.getYear() ,   fantastic5.getPages() , fantastic5.getPrice() , fantastic5.getCoverType());


        Book ws2 = new Classic();

        ws2.box1( classic1.getId() , classic1.getName() ,classic1.getAuthor() , classic1.getPublishingHouse() ,
                classic1.getYear() ,   classic1.getPages() , classic1.getPrice() , classic1.getCoverType() );

        ws2.box1( classic2.getId() , classic2.getName() ,classic2.getAuthor() , classic2.getPublishingHouse() ,
                classic2.getYear() ,   classic2.getPages() , classic2.getPrice() , classic2.getCoverType());

        ws2.box1( classic3.getId() , classic3.getName() ,classic3.getAuthor() , classic3.getPublishingHouse() ,
                classic3.getYear() ,   classic3.getPages() , classic3.getPrice() , classic3.getCoverType());

        ws2.box1( classic4.getId() , classic4.getName() ,classic4.getAuthor() , classic3.getPublishingHouse() ,
                classic4.getYear() ,   classic4.getPages() , classic4.getPrice() , classic4.getCoverType());

        ws.box1( classic5.getId() , classic5.getName() ,classic5.getAuthor() , classic5.getPublishingHouse() ,
                classic5.getYear() ,   classic5.getPages() , classic5.getPrice() , classic5.getCoverType());


        Book ws3 = new Detective();


        ws3.box1( detective1.getId() , detective2.getName() ,detective1.getAuthor() , detective1.getPublishingHouse() ,
                detective1.getYear() ,   detective1.getPages() , detective1.getPrice() , detective1.getCoverType());

        ws3.box1( detective2.getId() , detective2.getName() ,detective2.getAuthor() , detective2.getPublishingHouse() ,
                detective2.getYear() ,   detective2.getPages() , detective2.getPrice() , detective2.getCoverType());

        ws3.box1( detective3.getId() , detective3.getName() ,detective3.getAuthor() , detective3.getPublishingHouse() ,
                detective3.getYear() ,   detective3.getPages() , detective3.getPrice() , detective3.getCoverType());

        ws3.box1( detective4.getId() , detective4.getName() ,detective4.getAuthor() , detective4.getPublishingHouse() ,
                detective4.getYear() ,   detective4.getPages() , detective4.getPrice() , detective4.getCoverType());

        ws3.box1( detective5.getId() , detective5.getName() ,detective5.getAuthor() , detective5.getPublishingHouse() ,
                detective5.getYear() ,   detective5.getPages() , detective5.getPrice() , detective5.getCoverType() );






            int y = 1;

            while (  y == 1 ) {

                Scanner scan = new Scanner(System.in);

                System.out.print("\n\nВвод:  автор \n \n Список: \n  Ivanov   \n  Petrov  \n  Sidorov  \n  Ivanova  \n  Petrova " +
                        "\n  Sidorova  \n  Grigorieva  \n  Jane Austen  \n  Charles Dickens  \n  Stephens Hayward " +
                        "\n  Conan Doyle                           : \n \n");

                String a = scan.nextLine();

                 ws.findAuthor(a);

                 ws2.findAuthor(a);

                 ws3.findAuthor(a);



                Scanner scan5 = new Scanner(System.in);

                System.out.print("Повторить поиск? ");
                System.out.print("если ДА: нажмите \"1 \" если НЕТ: нажмите \"2 \" ");


                 y = scan5.nextInt();



            }




        int y2 = 1;
        while (  y2 == 1 ) {

            Scanner scan2 = new Scanner(System.in);

            System.out.print("\n\nВвод:  издательстово: \n \n Список: \n  Reed Elsevier   \n  Wolters Kluwer  \n  Pearson \n \n ");

            String a = scan2.nextLine();

            ws.publishingHouse(a);
            ws2.publishingHouse(a);
            ws3.publishingHouse(a);

            Scanner scan6 = new Scanner(System.in);

            System.out.print("Повторить поиск? ");
            System.out.print("если ДА: нажмите \"1 \" если НЕТ: нажмите \"2 \" ");


            y2 = scan6.nextInt();

        }

        Scanner scan3 = new Scanner(System.in);


        int y3 = 1;
        while (  y3 == 1 ) {

            System.out.print("\n\nВвод:  с какого года искать?: \n \n     ");

            String a = scan3.nextLine();

            ws.year(a);
            ws2.year(a);
            ws3.year(a);

            Scanner scan7 = new Scanner(System.in);

            System.out.print("Повторить поиск? ");
            System.out.print("если ДА: нажмите \"1 \" если НЕТ: нажмите \"2 \" ");


            y3 = scan7.nextInt();

        }




    }




}