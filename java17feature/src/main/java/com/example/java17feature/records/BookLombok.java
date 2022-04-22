package com.example.java17feature.records;

import lombok.*;


@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public final class BookLombok {

    private String id;

    private String title;

    private int page;
}
