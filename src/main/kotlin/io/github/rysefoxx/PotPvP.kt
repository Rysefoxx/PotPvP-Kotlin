package io.github.rysefoxx

import io.github.rysefoxx.command.EatCommand
import net.axay.kspigot.main.KSpigot

class PotPvP : KSpigot() {

    override fun startup() {
        registerCommands()
    }

    override fun shutdown() {
    }

    private fun registerCommands() {
        getCommand("eat")?.setExecutor(EatCommand())
    }
}