package com.lemieuxdev.fhirtruck

import com.lemieuxdev.fhirtruck.datatypes.Id

data class Immunization(
    val status: Status,
    val vaccineCode: CodeableConcept,
    val identifier: List<Identifier> = listOf(),
    val statusReason: CodeableConcept? = null,
    override val id: Id? = null,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null,
    override val text: String? = null,
    override val contained: List<Resource> = listOf(),
    override val extension: List<Extension> = listOf(),
    override val modifierExtension: List<Extension> = listOf()
) : DomainResource {
  enum class Status(private val value: String) {
    Completed("completed"),
    EnteredInError("entered-in-error"),
    NotDone("not-done");

    override fun toString(): String {
      return value
    }
  }
}
