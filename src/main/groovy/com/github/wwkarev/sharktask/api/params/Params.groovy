package com.github.wwkarev.sharktask.api.params

interface Params {
    void add(Long id, Object value)
    Object get(Long id) throws ParamNotFoundException
    Object getAt(Long id)
    List<Long> getIdList()
}
