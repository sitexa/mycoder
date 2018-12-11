package com.sitexa.tools.dao

import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils.create
import org.jetbrains.exposed.sql.transactions.transaction

fun main(args: Array<String>) {
    Database.connect(datasource)
    transaction {
        create(Letter)
    }
}


var dbConfig = mapOf("driver" to "com.mysql.cj.jdbc.Driver",
        "url" to "jdbc:mysql://127.0.0.1:3306/esite",
        "user" to "root",
        "password" to "pop007",
        "pool" to 20,
        "autoCommit" to false,
        "dialect" to "MysqlDialect")

var datasource = HikariDataSource().apply {
    maximumPoolSize = (dbConfig["pool"] as Int?)!!
    driverClassName = dbConfig["driver"] as String
    jdbcUrl = dbConfig["url"] as String
    isAutoCommit = dbConfig["autoCommit"] as Boolean
    addDataSourceProperty("user", dbConfig["user"] as String)
    addDataSourceProperty("password", dbConfig["password"] as String)
    addDataSourceProperty("dialect", dbConfig["dialect"] as String)
}

