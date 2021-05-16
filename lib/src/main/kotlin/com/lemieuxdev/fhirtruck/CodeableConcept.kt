package com.lemieuxdev.fhirtruck

data class CodeableConcept(
    val coding: List<Coding>,
    val text: String?,
    override val id: String?,
    override val extension: List<Extension>
) : Element
