package com.example.demo.service

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> {
        return dataSource.getBanks()
    }

    fun getBank(accno: Int): Bank {
        return dataSource.getBank(accno)
    }
}