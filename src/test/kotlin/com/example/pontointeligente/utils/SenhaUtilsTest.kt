package com.example.pontointeligente.utils

import org.junit.Assert
import org.junit.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

/**
 * Created by Leticia - QA on 09/10/2018
 **/
class SenhaUtilsTest {

    private val SENHA = "123456"
    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun testGerarHashSenha(){
        val hash = SenhaUtils().gerarBcrypt(SENHA)
        Assert.assertTrue(bCryptEncoder.matches(SENHA, hash))
    }
}