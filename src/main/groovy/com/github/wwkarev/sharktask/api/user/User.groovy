package com.github.wwkarev.sharktask.api.user

interface User {
    abstract Long getId()
    abstract String getKey()
    abstract String getFirstName()
    abstract String getLastName()
    abstract String getFullName()
}
