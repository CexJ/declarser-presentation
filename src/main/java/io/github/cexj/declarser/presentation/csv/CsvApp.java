package io.github.cexj.declarser.presentation.csv;


import io.github.cexj.declarser.csv.CsvDeclarserFactory;
import io.github.cexj.declarser.kernel.tryapi.Try;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CsvApp {

    private final static String fileName = "src/main/resources/example.csv";

    public static void main(String[] args){
        final var declarser = CsvDeclarserFactory.defaultFactory()
                .declarserOf(CsvLineExample.class, ";")
                .getValue();


        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.map(declarser::apply)
                  .map(CsvApp::extractResult)
                  .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String extractResult(Try<CsvLineExample> result) {
        return result.isSuccess() ? result.getValue().toString()
                                  : result.getException().getMessage();
    }
}
