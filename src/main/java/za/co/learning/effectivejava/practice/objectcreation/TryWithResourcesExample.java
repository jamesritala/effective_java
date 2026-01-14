package za.co.learning.effectivejava.practice.objectcreation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
 static String firstLineOfFile(String path, String defaultVal){
     try (BufferedReader br = new BufferedReader(new FileReader(path))){
         return br.readLine();
     }catch(IOException e) {
         return defaultVal;
     }
 }
}
