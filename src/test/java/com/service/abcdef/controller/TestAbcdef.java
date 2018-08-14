package com.service.abcdef.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAbcdef {

        AbcdefDelegate abcdefDelegate = new AbcdefDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = abcdefDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}