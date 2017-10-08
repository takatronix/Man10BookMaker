package red.man10

import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class BookMakerPlugin: JavaPlugin() , Listener
{
    override fun onEnable() {

        logger.info("Man10 BookMaker (Kotlin ver)")
        //
        // server.pluginManager.registerEvents(this, this)
        getCommand("mb").setExecutor(BookMakerCommand(this))


        //      １秒タイマー
        Bukkit.getScheduler().runTaskTimer(this, { onOneSecTimer() }, 0, 20*5)


    }
    fun onOneSecTimer(){

        BookMakerGUI(this)
        //  Bukkit.getServer().broadcastMessage("Man10BookMaker hello Kotlin")
    }
    override fun onDisable() {
        // Plugin shutdown logic
    }
}
