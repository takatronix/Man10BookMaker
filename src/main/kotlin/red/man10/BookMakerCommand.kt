package red.man10

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class BookMakerCommand(private val plugin: BookMakerPlugin) : CommandExecutor {


    override fun onCommand(sender: CommandSender, cmd: Command, label: String, args: Array<String>): Boolean {

        showHelp(sender)
        return false
    }

    fun showHelp(sender: CommandSender) {
        sender.sendMessage("==============[ゲーム管理]==================")
        sender.sendMessage("/mb list 登録中のゲームを表示する")
        sender.sendMessage("/mb create [game] ゲーム作成する")
        sender.sendMessage("/mb delete [game] ゲームを削除する")
        sender.sendMessage("/mb load [game] ゲームをロードする")
        sender.sendMessage("===========[プレーヤー管理]===================")
        sender.sendMessage("/mb register [name] ゲームにユーザーを登録する")
        sender.sendMessage("/mb unregister [name] ゲームからユーザーを削除する")
        sender.sendMessage("/mb open ゲームを開催し、BETをうつける")
        sender.sendMessage("/mb start ゲームを開始する")
        sender.sendMessage("")
    }
}
