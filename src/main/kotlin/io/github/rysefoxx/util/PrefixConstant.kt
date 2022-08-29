package io.github.rysefoxx.util

import net.kyori.adventure.text.minimessage.MiniMessage

object PrefixConstant {

    private val MINI_MESSAGE = MiniMessage.miniMessage()

    val EAT = MINI_MESSAGE.deserialize("<green><bold>HUNGER</bold></green><dark_gray>∙</dark_gray>")

}