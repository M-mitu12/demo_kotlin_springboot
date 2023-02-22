package com.example.demo.datasource.mock

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MockBankDataSourceTest {
    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should a collection of banks` () {
        // given
        val banks = mockDataSource.getBanks()
        // then
        org.assertj.core.api.Assertions.assertThat(banks).isNotEmpty
    
    }

    @Test
    fun `should not contain empty values` () {
        // given
        val banks = mockDataSource.getBanks()
        // then
        //NOTE: it is by default object or simply iterator of the list similar to ranged loop
        org.assertj.core.api.Assertions.assertThat(banks).allMatch{it.accno != 0}
        org.assertj.core.api.Assertions.assertThat(banks).allMatch{it.name != ""}
        org.assertj.core.api.Assertions.assertThat(banks).allMatch{it.balance != 0}
        org.assertj.core.api.Assertions.assertThat(banks).allMatch{it.txnfee != 0}

    }
    @Test
    fun `should be unique` () {
        // given
        val banks = mockDataSource.getBanks()

        val set  = HashSet<Int>()
        // then
        for (bank in banks) {
            set.add(bank.accno)
        }

        org.assertj.core.api.Assertions.assertThat(banks.size).isEqualTo(set.size)

    }

}