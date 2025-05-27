package com.guncv.Spring.Boot.Tutorial.datasource.mock

import com.guncv.Spring.Boot.Tutorial.model.Bank
import com.guncv.Spring.Boot.Tutorial.datasource.BankDataSource
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {
    val banks = listOf(
        Bank(accountNumber = "1234", trust = 3.14, transactionFee = 1),
        Bank(accountNumber = "1235", trust = 31.14, transactionFee = 5),
        Bank(accountNumber = "1235", trust = 21.9, transactionFee = 10)
    )

    override fun retrieveBanks(): Collection<Bank> {
        return banks;
    }
}