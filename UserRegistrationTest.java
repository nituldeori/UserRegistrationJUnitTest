package com.userregistrationregex;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    @Test
    public void validateFirstNameTest(){
        UserRegistration ur=new UserRegistration();
        assertFalse(ur.validateFirstName("nitul"));
        assertTrue(ur.validateFirstName("Nitul"));
        assertFalse(ur.validateFirstName("Ni"));
        assertFalse(ur.validateFirstName("NiTuL"));
        assertFalse(ur.validateFirstName("Ni1L2"));

    }
    @Test
    public void validateEmailTest(){
        UserRegistration ur=new UserRegistration();
        assertTrue(ur.validateEmail("abc@yahoo.com"));
        assertTrue(ur.validateEmail("abc+100@gmail.com"));
        assertTrue(ur.validateEmail("abc@1.com"));
        assertFalse(ur.validateEmail("abc@.com.my"));
        assertFalse(ur.validateEmail("abc123@.com"));
        assertFalse(ur.validateEmail("abc@abc@gmail.com"));
        assertFalse(ur.validateEmail("abc()*@gmail.com"));
        assertFalse(ur.validateEmail("abc@%*.com"));
    }
    @Test
    public void validatePasswordTest(){
        UserRegistration ur=new UserRegistration();
        assertTrue(ur.validatePassword("Ansbd26@"));
        assertFalse(ur.validatePassword("mansk12&n"));
        assertFalse(ur.validatePassword("Ajhso9389"));
        assertFalse(ur.validatePassword("AnB1#"));
    }
    @Test
    public void validatePhoneNoTest(){
        UserRegistration ur=new UserRegistration();
        assertTrue(ur.validatePhoneNo("91 9873872819"));
        assertFalse(ur.validatePhoneNo("19 272638299"));
        assertFalse(ur.validatePhoneNo("91 2627382878"));
        assertFalse(ur.validatePhoneNo("91 27363849"));
        assertFalse(ur.validatePhoneNo("912373847384"));
    }


}