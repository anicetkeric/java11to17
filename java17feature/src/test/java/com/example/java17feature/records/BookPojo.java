package com.example.java17feature.records;

import java.util.Objects;

public final class BookPojo {

    private final String id;

    private final String title;

    private final int page;


    public BookPojo(String id, String title, int page) {
        this.id = id;
        this.title = title;
        this.page = page;
    }

    String id() { return id; }
    String title() { return title; }
    int page() { return page; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookPojo bookPojo = (BookPojo) o;
        return page == bookPojo.page && Objects.equals(id, bookPojo.id) && Objects.equals(title, bookPojo.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, page);
    }
    @Override
    public String toString() {
        return String.format("BookPojo[id=%s, title=%s, page=%d]", id, title, page);
    }
}
