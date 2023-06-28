package entities;

import java.io.Serializable;

public class Book implements Serializable {

    Long id;

    String bookTitle;

    private Author author;
}
