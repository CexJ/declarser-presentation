package io.github.cexj.declarser.presentation.mapper.domain;

public class Address {

    public static Address from(String address) {
        final var components = address.split(",");
        final var addressNumber = Integer.valueOf(components[0].trim());
        final var streetName = components[1].trim();
        final var cityName = components[2].trim();
        final var countryName = components[3].trim();
        final var postalCode = Integer.valueOf(components[4].trim());

        return new Address(addressNumber, streetName, cityName, countryName, postalCode);
    }

    public Address(
            Integer addressNumber,
            String streetName,
            String cityName,
            String countryName,
            Integer postalCode) {
        this.addressNumber = addressNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.countryName = countryName;
        this.postalCode = postalCode;
    }

    private Integer addressNumber;

    private String streetName;

    private String cityName;

    private String countryName;

    private Integer postalCode;

    public Integer getAddressNumber() {
        return addressNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCountryName() {
        return countryName;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressNumber=" + addressNumber +
                ", streetName='" + streetName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
