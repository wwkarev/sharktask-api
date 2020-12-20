package com.github.wwkarev.sharktask.api.project

interface Project {
    abstract Long getId()
    abstract String getKey()
    abstract String getName()
}
