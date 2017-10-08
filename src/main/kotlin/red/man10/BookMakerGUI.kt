package red.man10

import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin


open class BookMakerGUI {
    constructor(plugin:BookMakerPlugin){

    }
    var plugin:JavaPlugin? = null
    var t = 1
    init {
        println("plugin title ${plugin} is instantiated.")
    }
    fun show(){
        Bukkit.getLogger().info("t="+t)
    }
}

