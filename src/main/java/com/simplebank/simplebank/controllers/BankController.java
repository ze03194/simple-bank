package com.simplebank.simplebank.controllers;

import com.simplebank.simplebank.services.BankService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    private BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }


}
