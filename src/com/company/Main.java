package com.company;

import java.io.File;
import java.io.IOException;
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
        ArrayList<String> newnames = new ArrayList<>();
        for(int i = 0;i<names.size();i++){
            a[i]=rd.nextInt(names.size());
            for(int j = 0; j<a.length;j++){
                while(a[i]==a[j]&&i!=j){
                    a[i]=rd.nextInt(names.size());
                }
            }
        }
        for(int c=0;c<a.length;c++){
           newnames.add(names.get(a[c]));
        }
        for(int b = 0; b< newnames.size(); b++){
            System.out.println(newnames.get(b));
        }
        scan.close();

    }
}
