package com.bloc.intellij_generator_plugin.generator.components

import com.bloc.intellij_generator_plugin.generator.BlocGenerator

class BlocStateGenerator(
    name: String,
    useEquatable: Boolean,
    useLoadService:Boolean
) : BlocGenerator(name, useEquatable,useLoadService, templateName = "bloc_state") {
    override fun fileName() = "${snakeCase()}_state.${fileExtension()}"
}
