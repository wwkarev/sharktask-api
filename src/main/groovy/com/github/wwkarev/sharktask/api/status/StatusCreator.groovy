package com.github.wwkarev.sharktask.api.status

import com.github.wwkarev.sharktask.api.params.Params

interface StatusCreator {
    Status create(Long id, String name, Params params)
    Status create(String name, Params params)
}
