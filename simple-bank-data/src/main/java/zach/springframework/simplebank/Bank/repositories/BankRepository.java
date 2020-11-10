package zach.springframework.simplebank.Bank.repositories;

import zach.springframework.simplebank.Bank.models.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends CrudRepository<Bank, String> {

    public Bank findByBankName(String name);

}
