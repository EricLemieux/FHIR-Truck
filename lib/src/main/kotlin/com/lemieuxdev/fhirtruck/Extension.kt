package com.lemieuxdev.fhirtruck

data class Extension(
    override val id: String? = null,
    override val extension: List<Extension>,
    val url: String,
    val value: Any
) : Element
