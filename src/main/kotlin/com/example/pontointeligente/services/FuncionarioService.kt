package com.example.pontointeligente.services

import com.example.pontointeligente.documents.Funcionario

/**
 * Created by Leticia - QA on 10/10/2018
 **/
interface FuncionarioService {

    fun persistir(funcionario: Funcionario): Funcionario

    fun buscarPorCpf(cpf: String): Funcionario?

    fun buscarPorEmail(email: String): Funcionario?

    fun buscarPorId(id: String): Funcionario?

}