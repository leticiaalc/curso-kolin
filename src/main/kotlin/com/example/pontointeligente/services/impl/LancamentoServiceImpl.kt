package com.example.pontointeligente.services.impl

import com.example.pontointeligente.documents.Lancamento
import com.example.pontointeligente.repositories.LancamentoRepository
import com.example.pontointeligente.services.LancamentoService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

/**
 * Created by Leticia - QA on 15/10/2018
 **/
@Service
class LancamentoServiceImpl(val lancamentoRepository: LancamentoRepository) : LancamentoService {
    override fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento> =
            lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest)

    override fun buscarPorId(id: String): Lancamento? = lancamentoRepository.findOne(id)

    override fun persistir(lancamento: Lancamento): Lancamento  = lancamentoRepository.save(lancamento)

    override fun remover(id: String) = lancamentoRepository.delete(id)
}