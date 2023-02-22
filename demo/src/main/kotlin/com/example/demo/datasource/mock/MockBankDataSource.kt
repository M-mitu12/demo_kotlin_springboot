package com.example.demo.datasource.mock

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
        Bank(1, "Mayu",300, 5),
        Bank(2, "Mayank", 500, 10)
    )
    override fun getBanks(): Collection<Bank>  = banks
    override fun getBank(accno: Int): Bank = banks.first { it.accno == accno }

}