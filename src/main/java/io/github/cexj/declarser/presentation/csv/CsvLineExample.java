package io.github.cexj.declarser.presentation.csv;

import io.github.cexj.declarser.csv.stages.annotations.fields.CsvColumn;

public class CsvLineExample {

    @CsvColumn(0)
    private String firstName;

    @CsvColumn(1)
    private String surname;

    @CsvColumn(2)
    private Integer age;

    @CsvColumn(3)
    private String address;


    @Override
    public String toString() {
        return "CsvLineExample{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
