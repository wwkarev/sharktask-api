package com.github.wwkarev.sharktask.api.field

import com.github.wwkarev.sharktask.api.params.Params

interface FieldCreator {
    Field create(Long id, String name, Params params)
    Field create(String name, Params params)
}
