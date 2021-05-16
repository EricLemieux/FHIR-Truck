package com.lemieuxdev.fhirtruck

data class Identifier(
    override val id: String? = null,
    override val extension: List<Extension>,
    val system: String? = null
) : Element
