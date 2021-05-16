package com.lemieuxdev.fhirtruck

interface DomainResource : Resource {
  val text: String?
  val contained: List<Resource>
  val extension: List<Extension>
  val modifierExtension: List<Extension>
}
