package com.guncv.Spring.Boot.Tutorial.service

import com.guncv.Spring.Boot.Tutorial.model.Bank
import org.springframework.beans.factory.annotation.Qualifier
import com.guncv.Spring.Boot.Tutorial.datasource.BankDataSource
import org.springframework.stereotype.Service

@Service
class BankService(@Qualifier("mock") private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)

    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)

    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)

    fun deleteBank(accountNumber: String): Unit = dataSource.deleteBank(accountNumber)
}