package models;

import entities.Book;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@ToString
public class Author {

    Long id;

    String firstName;

    String secondName;

    String familyName;
}