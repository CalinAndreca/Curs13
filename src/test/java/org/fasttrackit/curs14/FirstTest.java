package org.fasttrackit.curs14;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");

    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }

    @Test
    @DisplayName("WHEN sum is called on two no. THEN sum is return")
    public void sumTest(){
        System.out.println("sumTest()");
        //GIVEN
        int a = 2;
        int b = 3;
        First first = new First();

        //WHEN
        int sum = first.sum(a, b);

        //THEN
        Assertions.assertThat(sum).isEqualTo(5);
    }
    @Test
    @DisplayName("WHEN sum is called on two negative no. THEN sum is return")
    public void sumOfNegativeNumbers(){
        System.out.println("sumOfNegativeNumbers");
        //GIVEN
        int a = -3;
        int b = -1;
        First first = new First();

        //WHEN
        int sum = first.sum(a, b);

        //THEN
        Assertions.assertThat(sum).isEqualTo(-4);
    }
}
