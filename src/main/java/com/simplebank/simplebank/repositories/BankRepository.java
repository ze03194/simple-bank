package com.simplebank.simplebank.repositories;

import com.simplebank.simplebank.models.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends CrudRepository<Bank, String> {

}
