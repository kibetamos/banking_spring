package absa.bank.banking.service;

import absa.bank.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    //
    AccountDto getAccountById(Long id);
    //lets deposit to a bankl
    AccountDto deposit(Long id, double amount);
// widthraw fro banbk
    AccountDto withdraw(Long id, double amount);

    //liost all the account
    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

}
