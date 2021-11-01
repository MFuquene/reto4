/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.app.g24.rentas.model;

import static org.testng.Assert.*;

/**
 *
 * @author fambr
 */
public class GamaNGTest {
    
    public GamaNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getIdGama method, of class Gama.
     */
    @org.testng.annotations.Test
    public void testGetIdGama() {
        System.out.println("getIdGama");
        Gama instance = new Gama();
        Integer expResult = null;
        Integer result = instance.getIdGama();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdGama method, of class Gama.
     */
    @org.testng.annotations.Test
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
    @org.testng.annotations.Test
    public void testGetName() {
        System.out.println("getName");
        Gama instance = new Gama();
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Gama.
     */
    @org.testng.annotations.Test
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
    @org.testng.annotations.Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Gama instance = new Gama();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Gama.
     */
    @org.testng.annotations.Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Gama instance = new Gama();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
