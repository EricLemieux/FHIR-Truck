package com.lemieuxdev.fhirtruck

interface Element {
  val id: String?
  val extension: List<Extension>
}
