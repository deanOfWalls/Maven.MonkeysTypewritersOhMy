package io.zipcoder;

import java.util.Arrays;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        while(stringIterator.hasNext()){
            copied += stringIterator.next();
            sb.append(stringIterator.next()).append(" ");
        }
        copied = sb.toString();
//        System.out.println(copied);


    }
}
