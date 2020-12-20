package com.github.wwkarev.sharktask.api.attachment

interface Attachment {
    abstract Long getId()
    abstract String getName()
    abstract File getFile()
}
