package com.github.wwkarev.sharktask.api.user

import com.github.wwkarev.sharktask.api.params.Params

interface UserCreator {
    User create(String key, String firstName, String lastName, String fullName, Params params)
}
