package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;
import jakarta.validation.constraints.Pattern;

public interface ICustomerService {
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber,String correlationId);
}
