package de.rexlNico.Main;

import java.io.File;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		if(sender instanceof Player){
			Player p = (Player)sender;
			File file = new File("plugins/rexlSign/config.yml");
			YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
			if(p.hasPermission("rexlsign.addsign")){
				if(args.length == 1){
					
				}else if(args.length == 2){
					
				}else if(args.length == 3){
					
				}else if(args.length == 4){
					
				}
			}
		}
		return false;
	}

}



//                         			p.sendMessage("§8/§eaddsign <Spielmodus> <ServerName> <Ip> <Port>");