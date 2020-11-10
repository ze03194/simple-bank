package zach.springframework.simplebank.Bank.services;

import zach.springframework.simplebank.Bank.models.Bank;
import zach.springframework.simplebank.User.models.User;
import zach.springframework.simplebank.Bank.repositories.BankRepository;
import zach.springframework.simplebank.User.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BankService {

    private BankRepository bankRepository;
    private UserRepository userRepository;

    public BankService(BankRepository bankRepository, UserRepository userRepository) {
        this.bankRepository = bankRepository;
        this.userRepository = userRepository;
    }

    public void addBank(Bank bank) {
        bankRepository.save(bank);
    }

    public Optional<Bank> getBank(String bankName) {
        return bankRepository.findById(bankName);
    }

    public List<Bank> getAllBanks() {
        List<Bank> banks = new ArrayList<>();
        bankRepository.findAll().forEach(banks::add);

        return banks;
    }

    public void deleteBank(String bankName) {
        bankRepository.deleteById(bankName);
    }

    public void registerUser(String name, User user){

        Bank bank = bankRepository.findByBankName(name);
        bank.addUser(user);
        bankRepository.save(bank);

        user = userRepository.findByUserName(user.getUserName());
        user.addBank(bank);
        userRepository.save(user);

    }

    public List<User> getAllBankUsers(String name){
        Bank bank = bankRepository.findByBankName(name);
        return bank.getUsers();
    }


}
