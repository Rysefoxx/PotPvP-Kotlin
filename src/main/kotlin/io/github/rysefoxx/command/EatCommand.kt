package io.github.rysefoxx.command

import io.github.rysefoxx.PotPvP
import io.github.rysefoxx.util.PermissionConstant
import io.github.rysefoxx.util.PrefixConstant
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class EatCommand : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        if (sender !is Player)
            return false

        if (!sender.hasPermission(PermissionConstant.EAT))
            return false

        sender.foodLevel = 20
        sender.sendMessage(
            PrefixConstant.EAT.append(
                Component.text(
                    " Du hast deinen Hunger gestillt.",
                    NamedTextColor.GRAY
                ).decoration(TextDecoration.BOLD, false)
            )
        )
        return true
    }
}