package com.teamsnap.data

// TODO: Add functions to these classes as necessary and appropriate

data class CJCollection(
    val collection: Collection)

data class Collection(
    val version: String,
    val href: String,
    val rel: String,
    val data: List<Data>,
    val items: List<Item>,
    val links: List<Link>)

data class Data(
    val name: String,
    val value: Any?)

data class Item(
    val href: String,
    val data: List<Data>,
    val rel: String)

data class Link(
    val rel: String,
    val href: String)