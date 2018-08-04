package org.shengsiyuan.jdk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SwingTest {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        list.forEach( t -> {
            System.out.println(t);
        });
    }
}
