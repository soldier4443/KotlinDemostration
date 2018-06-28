package dsl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Created by nyh0111 on 2018-06-27.
 */
public class FileControlUsingJava {
    public static void main(String[] args) throws IOException {
        File file = new File("/src");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        
        // Java 7
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        
        // Java 8
        Stream.of(br.lines())
            .forEach(System.out::println);
        
        br.close();
    }
}
