/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.app.g24.rentas.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fambr
 */
public class GamaTest {
    
    public GamaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getIdGama method, of class Gama.
     */
    @Test
    public void testGetIdGama() {
        System.out.println("getIdGama");
        Gama instance = new Gama();
        Integer expResult = null;
        Integer result = instance.getIdGama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdGama method, of class Gama.
     */
    @Test
    public void testSetIdGama() {
        System.out.println("setIdGama");
        Integer idGama = null;
        Gama instance = new Gama();
        instance.setIdGama(idGama);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Gama.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Gama instance = new Gama();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Gama.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Gama instance = new Gama();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Gama.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Gama instance = new Gama();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Gama.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Gama instance = new Gama();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
