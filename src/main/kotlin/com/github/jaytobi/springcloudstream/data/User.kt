package com.github.jaytobi.springcloudstream.data

import java.time.LocalDate

/**
 * User class used as a message.
 */
data class User(var name: String, var firstName: String, var birthdate: LocalDate)