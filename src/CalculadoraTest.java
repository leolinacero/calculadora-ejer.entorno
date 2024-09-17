import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {
    @RepeatedTest(10)
    @BeforeAll
    static void beroreAll(){
        System.out.println("Este metodo se ejecuta lo primero de todo.");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("los invoque antes  tanto de ejecutar cada prueba unitaria");
    }

    @Test
    @DisplayName("test  suma")
    void testSuma(){
        int suma = Calculadora.suma(1,2);
        assertEquals(3,suma,"vaya este resultado no es el correcto .");

    }
    @Test
    @DisplayName("test  suma fallo")
    void testSumaFallo(){
        int suma = Calculadora.suma(1,2);
        assertEquals(5,suma,"vaya este resultado no es el correcto .");

    }
    @Test
    void testResta(){
        int resta =Calculadora.resta(10,5);
        assertEquals(5,resta,"si no sale esta mal");
    }


    @Test
    void testMultiplica(){
        int multiplica =Calculadora.multiplica(5,2);
        assertEquals(10,multiplica,"si no sale esta mal esta multiplicacion");
    }
    @Test
    void testDivide(){
        int divide =Calculadora.divide(6,3);
        assertEquals(2,divide,"si no sale esta mal esta division ");
    }







    @AfterEach
    void afterEach(){
        System.out.println("los invoque después, tanto de ejecutar cada prueba unitaria");
    }

    @AfterAll
    static void alferAll(){
        System.out.println("Este metodo se ejecuta al final de todo.");
    }



}