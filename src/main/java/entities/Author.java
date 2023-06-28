package entities;

import java.io.Serializable;
import java.util.List;

public class Author implements Serializable {

    Long id;

    String firstName;

    String secondName;

    String familyName;

    List<Book> books;
}