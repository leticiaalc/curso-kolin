package com.example.pontointeligente.services

import com.example.pontointeligente.documents.Empresa

/**
 * Created by Leticia - QA on 09/10/2018
 **/
interface EmpresaService {

    fun buscarPorCnpj(cnpj: String): Empresa?

    fun persistir(empresa: Empresa): Empresa

}