/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part4;

/**
 *
 * @author 主子
 */
public class NewClass {
    public static void main(String[] args) {
        String s= "2008/02/21/15:30";
        System.out.println(s.matches("[0-9]{4}/[0-9]+/[0-9]+/+[0-9]{2}:[0-9]{2}"));
    }
}
