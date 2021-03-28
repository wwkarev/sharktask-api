package com.github.wwkarev.sharktask.api.project

import com.github.wwkarev.sharktask.api.params.Params

interface ProjectCreator {
    Project create(Long id, String key, String name, Params params)
    Project create(String key, String name, Params params)
}
