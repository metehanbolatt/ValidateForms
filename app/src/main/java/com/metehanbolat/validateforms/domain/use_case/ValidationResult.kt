package com.metehanbolat.validateforms.domain.use_case

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)
