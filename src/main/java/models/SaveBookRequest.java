package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@ToString
public class SaveBookRequest implements Serializable {

    Long id;

    String bookTitle;

    private SaveAuthorRequest author;
}
