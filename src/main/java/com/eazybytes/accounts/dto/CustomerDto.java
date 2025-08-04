package com.eazybytes.accounts.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be a null or empty")
    private String name;

    @NotEmpty(message = "Email address cannot be a null or empty")
    private String email;
    private String mobileNumber;
    private AccountsDto accountsDto;
}
