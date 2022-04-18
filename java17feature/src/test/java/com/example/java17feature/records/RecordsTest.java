package com.example.java17feature.records;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecordsTest {

    @Test
    void testPojo() {
        BookPojo bookPojo = new BookPojo("1233", "tech conference", 100);
        assertThat(bookPojo.id()).isEqualTo("1233");
        assertThat(bookPojo.title()).isEqualTo("tech conference");
        assertThat(bookPojo.page()).isEqualTo(100);
        BookPojo bookPojo1 = new BookPojo(bookPojo.id(), bookPojo.title(), bookPojo.page());
        assertThat(bookPojo1).isEqualTo(bookPojo);
    }

    @Test
    void testRecord() {
        BookRecord bookRecord = new BookRecord("1233", "tech conference", 100);
        assertThat(bookRecord.id()).isEqualTo("1233");
        assertThat(bookRecord.title()).isEqualTo("tech conference");
        assertThat(bookRecord.page()).isEqualTo(100);
        BookRecord bookRecord1 = new BookRecord(bookRecord.id(), bookRecord.title(), bookRecord.page());
        assertThat(bookRecord1).isEqualTo(bookRecord);

        assertThat(bookRecord1.hashCode()).hasSameHashCodeAs(bookRecord.hashCode());
    }



}
