package alejandro.programacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Assert;
import org.junit.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import es.alejandro.programacion.Ejercicio01;

public class Ejercicio1Test {

    @Test
    public void comprobarMayorTest() {

        assertEquals(3, Ejercicio01.comprobarMayor(1, 2, 3));
    }
}
