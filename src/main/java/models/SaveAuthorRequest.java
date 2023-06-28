package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SaveAuthorRequest {

    Long id;

    String firstName;

    String secondName;

    String familyName;
}