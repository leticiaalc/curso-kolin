package com.example.pontointeligente.services.impl

import com.example.pontointeligente.documents.Empresa
import com.example.pontointeligente.repositories.EmpresaRepository
import com.example.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

/**
 * Created by Leticia - QA on 09/10/2018
 **/
@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}