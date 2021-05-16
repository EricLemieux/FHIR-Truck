package com.lemieuxdev.fhirtruck.datatypes

/**
 * Any combination of upper- or lower-case ASCII letters ('A'..'Z', and 'a'..'z', numerals
 * ('0'..'9'), '-' and '.', with a length limit of 64 characters. (This might be an integer, an
 * un-prefixed OID, UUID or any other identifier pattern that meets these constraints.)
 *
 * http://hl7.org/fhir/datatypes.html#id
 */
class Id(private val value: String) : DataType {
  companion object {
    private val validationRegex = Regex("[A-Za-z0-9\\-.]{1,64}")
  }

  init {
    if (!value.matches(validationRegex)) {
      throw Exception("id does not match required format")
    }
  }

  override fun toString(): String {
    return value
  }

  override fun equals(other: Any?): Boolean {
    if (other is String) {
      return value == other
    }
    return super.equals(other)
  }

  override fun hashCode(): Int {
    return value.hashCode()
  }
}
