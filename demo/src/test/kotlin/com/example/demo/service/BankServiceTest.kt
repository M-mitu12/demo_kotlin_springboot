package com.example.demo.service

import com.example.demo.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BankServiceTest{

    private val dataSource: BankDataSource = mockk()
    // or use mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks` () {
    // given
    every { dataSource.getBanks() }    returns emptyList()

    // when
    val banks = bankService.getBanks()

    // then
    verify(exactly = 1) {  dataSource.getBanks() }

     }
}