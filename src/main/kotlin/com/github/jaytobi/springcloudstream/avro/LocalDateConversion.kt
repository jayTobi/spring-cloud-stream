package com.github.jaytobi.springcloudstream.avro

import org.apache.avro.Conversion
import org.apache.avro.LogicalType
import org.apache.avro.Schema
import java.time.LocalDate


open class LocalDateConversion : Conversion<LocalDate>() {

    override fun getConvertedType(): Class<LocalDate> {
        return LocalDate::class.java
    }

    override fun getLogicalTypeName(): String {
        return "LocalDate"
    }

    override fun fromLong(microsFromEpoch: Long?, schema: Schema?, type: LogicalType): LocalDate {
        return LocalDate.now()// DateTime(microsFromEpoch!! / 1000L, DateTimeZone.UTC)
    }
}
