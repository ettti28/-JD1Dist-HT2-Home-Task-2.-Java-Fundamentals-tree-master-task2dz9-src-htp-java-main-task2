package by.htp.java.main.task2_9;

import java.util.ArrayList;

public class Book {


    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int pages;
    private double price;
    private String coverType;


    public Book() {


    }


    public Book(int id, String name, String author, String publishingHouse, int year, int pages, double price, String coverType) {

        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.coverType = coverType;

    }

    ArrayList box1 = new ArrayList();

    public void box1(int id, String name, String author, String publishingHouse, int year, int pages, double price, String coverType) {


        box1.add(id);
        box1.add(name);
        box1.add(author);
        box1.add(publishingHouse);
        box1.add(year);
        box1.add(pages);
        box1.add(price);
        box1.add(coverType);


    }



    public void findAuthor(String a) {



        for ( int i = 2; i < box1.size(); i = i + 8) {


            if (a.equals(box1.get(i))) {

                System.out.println("id :" + box1.get(i - 2) + "  | title :" + box1.get(i - 1) + "   |author: " + box1.get(i) +

                        "   |publishing House: " + box1.get(i + 1) + "    |year: " + box1.get(i + 2) + " |pages:  "

                        + box1.get(i + 3) + " |price : " + box1.get(i + 4) + " |cover type : " + box1.get(i + 5) + " \n \n ");



            }

        }

    }



    public void publishingHouse(String a) {


        for (int i = 3; i < box1.size(); i = i + 8) {

            if (a.equals(box1.get(i))) {

                System.out.println("id :" + box1.get(i - 3) + "  | title :" + box1.get(i - 2) + "   |author: " + box1.get(i - 1) +

                        "   |publishing House: " + box1.get(i) + "    |year: " + box1.get(i + 1) + " |pages:  "

                        + box1.get(i + 2) + " |price : " + box1.get(i + 3) + " |cover type : " + box1.get(i + 4) + " \n  ");

            }


        }

    }


    public void year(String a) {


        for (int i = 4; i < box1.size(); i = i + 8) {

            String y = String.valueOf(box1.get(i));

            int z = a.compareTo(y);

            if (z <= 0) {
                System.out.println("id :" + box1.get(i - 4) + "  | title :" + box1.get(i - 3) + "   |author: " + box1.get(i - 2) +

                        "   |publishing House: " + box1.get(i - 1) + "    |year: " + box1.get(i) + " |pages:  "

                        + box1.get(i + 1) + " |price : " + box1.get(i + 2) + " |cover type : " + box1.get(i + 3) + " \n  ");
            }


        }


    }







    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public String getPublishingHouse() {
        return publishingHouse;
    }


    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public int getPages() {
        return pages;
    }


    public void setPages(int pages) {
        this.pages = pages;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String getCoverType() {
        return coverType;
    }


    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }




}


