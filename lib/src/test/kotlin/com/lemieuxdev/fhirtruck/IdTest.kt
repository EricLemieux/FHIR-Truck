package com.lemieuxdev.fhirtruck

import com.lemieuxdev.fhirtruck.datatypes.Id
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IdTest {
  @Test
  fun `Throws when id is an empty string`() {
    assertThrows(Exception::class.java) { Id("") }
  }

  @Test
  fun `Throws when id is more than 64 characters long`() {
    assertThrows(Exception::class.java) {
      Id("1234567890123456789012345678901234567890123456789012345678901234567890")
    }
  }

  @Test
  fun `toString only shows the value`() {
    val id = Id("123")
    assertEquals("123", id.toString())
  }

  @Test
  fun `equals can compare strings`() {
    val id = Id("123")
    assertTrue(id.equals("123"))
  }
}
