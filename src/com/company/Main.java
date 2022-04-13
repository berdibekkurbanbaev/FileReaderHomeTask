package com.company;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
	try(FileWriter writer = new FileWriter("Alphabet")){
        writer.write("Aa\n"+
        "Bb\n"+
        "Cc\n"+
        "Dd\n"+
        "Ee\n"+
        "Ff\n"+
        "Gg\n"+
        "Hh\n"+
        "Ii\n"+
        "Jj\n"+
        "Kk\n"+
        "Ll\n"+
        "Mm\n"+
        "Nn\n"+
        "Oo\n"+
        "Pp\n"+
        "Qq\n"+
        "Rr\n"+
        "Ss\n"+
        "Tt\n"+
        "Uu\n"+
        "Vv\n"+
        "Ww\n"+
        "Xx\n"+
        "Yy\n"+
        "Zz\n"+
        "1\n"+
        "2\n"+
        "3\n"+
        "4\n"+
        "5\n"+
        "6\n"+
        "7\n"+
        "8\n"+
        "9\n");


      }catch (IOException e){
        System.out.println("df");
    }
    try (FileReader reader = new FileReader("Alphabet")){
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
      }catch (IIOException e){
        System.out.println("dd");
       }
    }
}
