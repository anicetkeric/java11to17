package com.example.java17feature.records;

import lombok.*;


@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class BookLombok {

    private String id;

    private String title;

    private int page;
}
