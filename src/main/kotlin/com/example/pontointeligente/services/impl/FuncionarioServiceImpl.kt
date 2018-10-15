package com.example.pontointeligente.services.impl

import com.example.pontointeligente.documents.Funcionario
import com.example.pontointeligente.repositories.FuncionarioRepository
import com.example.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

/**
 * Created by Leticia - QA on 10/10/2018
 **/
@Service
class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository) : FuncionarioService {

    override fun persistir(funcionario: Funcionario): Funcionario =
            funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String): Funcionario? = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String): Funcionario? = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String): Funcionario? = funcionarioRepository.findOne(id)
}