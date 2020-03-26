package io.github.cexj.declarser.presentation.mapper;

import io.github.cexj.declarser.kernel.tryapi.Try;
import io.github.cexj.declarser.mapper.builder.MapperDeclarserBuilder;
import io.github.cexj.declarser.presentation.mapper.domain.Address;
import io.github.cexj.declarser.presentation.mapper.domain.Customer;
import io.github.cexj.declarser.presentation.mapper.dto.CustomerDTO;

public class MapperApp {

    private final static CustomerDTO customerDTO = new CustomerDTO(
            "John","Doe", 45, "100, JF Kennedy Street, New York, NY, 10000");

    public static void main(String[] args){

        final var declarser = MapperDeclarserBuilder
                .from(CustomerDTO.class)
                .to(Customer.class)
                .with("address").as(customerDTO -> Try.call(() -> Address.from(customerDTO.getAddress())))
                .build().getValue();

        System.out.println(declarser.apply(customerDTO));

    }

}
