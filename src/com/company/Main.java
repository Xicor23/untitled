package com.company;
import java.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        ArrayList<String> names = new ArrayList<String>();
        Scanner scan = new Scanner(new File("class.txt"));
        while(scan.hasNextLine()){
            String s = scan.nextLine();
            names.add(s);
        }
        System.out.println(names);
        Random rd = new Random();
        int a[]=new int[names.size()];
        int x = 0;
        ArrayList<String> newnames = new ArrayList<String>();
        while(x<names.size()){
            int i = rd.nextInt(names.size());
            a[x] = i;
            int n = 0;
            for (int j = 0; j<a.length; j++){
                if (a[j] != i){
                    n++;
                }
            }
            if (n == a.length){
                newnames.add(x,names.get(i));
                x++;
            }

        }
        for(int b = 0; b< newnames.size(); b++){
            System.out.println(newnames.get(b));
        }
        scan.close();

    }
}
