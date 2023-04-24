package org.fasttrackit;

import lombok.*;

//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class PersonLombok {
    @MyFirstAnnotation
    private final String name;
    private final String age;
    private final String country;
    private boolean isMarried;
    private final String company;
}
