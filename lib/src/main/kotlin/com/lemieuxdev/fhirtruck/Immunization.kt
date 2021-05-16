package com.lemieuxdev.fhirtruck

data class Immunization(val status: Status) {
  enum class Status {
    Completed,
    EnteredInError,
    NotDone
  }
}
