package com.guncv.Spring.Boot.Tutorial.datasource.network.dto

import com.guncv.Spring.Boot.Tutorial.model.Bank

data class BankList(
    val results: Collection<Bank>
)