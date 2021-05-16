package com.lemieuxdev.fhirtruck

import com.lemieuxdev.fhirtruck.datatypes.Id

data class Meta(
    override val id: String?,
    override val extension: List<Extension> = listOf(),
    val versionId: Id? = null,
    val lastUpdated: String? = null,
    val source: String? = null,
) : Element
