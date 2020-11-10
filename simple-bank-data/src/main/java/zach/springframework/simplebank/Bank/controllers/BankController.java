package zach.springframework.simplebank.Bank.controllers;

import zach.springframework.simplebank.Bank.models.Bank;
import zach.springframework.simplebank.User.models.User;
import zach.springframework.simplebank.Bank.services.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BankController {
    private BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/bank")
    public void addBank(@RequestBody Bank bank) {
        bankService.addBank(bank);
    }

    @GetMapping("/bank/{name}")
    public Optional<Bank> getBank(@PathVariable String name) {
        return bankService.getBank(name);
    }

    @GetMapping("/bank")
    public List<Bank> getAllBanks() {
        return bankService.getAllBanks();
    }

    @GetMapping("/bank/{name}/users")
    public List<User> getAllBankUsers(@PathVariable String name){
        return bankService.getAllBankUsers(name);
    }

    @DeleteMapping("/bank/{bankName}")
    public void deleteBank(@PathVariable String name) {
        bankService.deleteBank(name);
    }

    @PostMapping("/bank/{name}/register")
    public void registerUser(@PathVariable String name, @RequestBody User user){
        bankService.registerUser(name, user);
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){
        return "index";
    }


}
