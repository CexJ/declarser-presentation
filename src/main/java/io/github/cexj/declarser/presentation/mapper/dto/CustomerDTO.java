package io.github.cexj.declarser.presentation.mapper.dto;

public class CustomerDTO {

    public CustomerDTO(String firstName, String surname, Integer age, String address) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    private String firstName;

    private String surname;

    private Integer age;

    private String address;

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

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
