package com.dimitar.java;

import lombok.Lombok;

import java.io.IOException;

/**
 * Lombok's SneakyThrows
 */
public class Exceptions1 {


    private void test1() {
        System.out.println("test 1");
        try {
            throw new IOException("throw 1");
        } catch (IOException e) {
            //throw e;
            throw Lombok.sneakyThrow(e);
            //throw  (RuntimeException)((Throwable)e);
        }
    }

    public static void main(String[] args) {

    }
}
