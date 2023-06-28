package models;

import entities.Author;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Book {

    Long id;

    String bookTitle;

    private Author author;
}
