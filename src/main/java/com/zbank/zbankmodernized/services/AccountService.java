
package com.zbank.zbankmodernized.services;

import com.zbank.zbankmodernized.models.Account;
import com.zbank.zbankmodernized.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        // Placeholder for listing all accounts
        return accountRepository.findAll();
    }

    public Optional<Account> getAccountById(Long id) {
        // Placeholder for finding an account by ID
        return accountRepository.findById(id);
    }

    public Account createAccount(Account account) {
        // Placeholder for creating a new account
        return accountRepository.save(account);
    }

    public Account updateAccount(Long id, Account accountDetails) {
        // Placeholder for updating an existing account
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        account.setAccountNumber(accountDetails.getAccountNumber());
        account.setAccountType(accountDetails.getAccountType());
        account.setBalance(accountDetails.getBalance());
        return accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        // Placeholder for deleting an account
        accountRepository.deleteById(id);
    }
}
