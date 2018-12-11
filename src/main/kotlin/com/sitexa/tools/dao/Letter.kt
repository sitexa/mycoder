package com.sitexa.tools.dao

import org.jetbrains.exposed.sql.Table

object Letter : Table() {
    val id = integer("id").primaryKey().autoIncrement()
    val title = varchar("title", 100)
    val uid = varchar("uid", 20)
    val tid = varchar("tid", 20)
    val contents = varchar("contents", 2000)
    val rid = integer("rid").nullable()
    val created = datetime("created")
}
