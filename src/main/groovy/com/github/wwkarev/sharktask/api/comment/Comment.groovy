package com.github.wwkarev.sharktask.api.comment

import com.github.wwkarev.sharktask.api.user.User

interface Comment {
    abstract Long getId()
    abstract String getBody()
    abstract User getAuthor()
}
