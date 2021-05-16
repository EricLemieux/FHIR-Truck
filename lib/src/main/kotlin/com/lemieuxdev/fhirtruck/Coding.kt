package com.lemieuxdev.fhirtruck

data class Coding(
    val system: String?,
    val version: String?,
    val code: String?,
    val display: String?,
    val userSelected: Boolean?,
    override val id: String?,
    override val extension: List<Extension>,
) : Element
