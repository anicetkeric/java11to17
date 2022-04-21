package com.example.java17feature;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextBlocksTest {



    @Test
    void textBlocksJsonString() {
        String text = """
            {
              "id": 45,
              "enterprise": "SOPRA",
              "country": "Espagne"
            }
            """;
        System.out.println(text);
        assertThat(text).isNotEmpty();
    }
    @Test
    void textBlocksHtmlString() {
        String html = """
              <html>
                  <body>
                      <p>Hello, CDS</p>
                  </body>
              </html>
              """;
        System.out.println(html);
        assertThat(html).isNotEmpty();
    }

    @Test
    void textBlocksSqlString() {
        String query = """
               SELECT "EMP_ID", "LAST_NAME" FROM "EMPLOYEE_TB"
               WHERE "CITY" = 'MADRID'
               ORDER BY "EMP_ID", "LAST_NAME";
               """;
        System.out.println(query);
        assertThat(query).isNotEmpty();
    }

    @Test
    void textBlocksFunctionString() {
        String function = """
                         function hello() {
                             print('"Hello, CDS"');
                         }
                         
                         hello();
                         """;
        System.out.println(function);
        assertThat(function).isNotEmpty();
    }

    @Test
    void textBlocksSingleLineString() {
        String singleLine = """
          Hello \
          World
          """;
        System.out.println(singleLine);
        assertThat(singleLine).isNotEmpty();
    }
}
