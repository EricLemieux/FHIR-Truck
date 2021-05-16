package com.lemieuxdev.fhirtruck

import com.lemieuxdev.fhirtruck.datatypes.Id

interface Resource {
  val id: Id?
  val meta: Meta?
  val implicitRules: String?
  val language: String?
}
