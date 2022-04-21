package com.example.java11feature;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextBlocksTest {

    @Test
    void textBlocksJsonString() {
        String text = "{\n" +
                "  \"id\": 45,\n" +
                "  \"enterprise\": \"SOPRA\",\n" +
                "  \"country\": \"Espagne\"\n" +
                "}";
        System.out.println(text);
        assertThat(text).isNotEmpty();
    }

    @Test
    void textBlocksHtmlString() {
        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, CDS</p>\n" +
                "    </body>\n" +
                "</html>\n";
        System.out.println(html);
        assertThat(html).isNotEmpty();
    }

    @Test
    void textBlocksSqlString() {
        String query = "SELECT \"EMP_ID\", \"LAST_NAME\" FROM \"EMPLOYEE_TB\"\n" +
                "WHERE \"CITY\" = 'MADRID'\n" +
                "ORDER BY \"EMP_ID\", \"LAST_NAME\";\n";
        System.out.println(query);
        assertThat(query).isNotEmpty();
    }

    @Test
    void textBlocksFunctionString() {
        String function = "function hello() {\n" +
                "    print('\"Hello, CDS\"');\n" +
                "}\n" +
                "\n" +
                "hello();\n";
        System.out.println(function);
        assertThat(function).isNotEmpty();
    }


}
