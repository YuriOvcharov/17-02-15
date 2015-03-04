package mirea.it.isb1_1_3.Alexandrov.StudentBook;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

/**
 * Created by Степан on 03.03.2015.
 */
public class Student implements Cloneable {
   private int id;
   private double rating;
   private String name;

    public Student clone() {
       return new Student(id,rating,name);
    }

    public Student() {
        this.id = 0;
        this.rating = 0;
        this.name = "Default Student";
    }

    public Student(int id, double rating, String name) {
        this.id = id;
        this.rating = rating;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}
