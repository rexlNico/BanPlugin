package de.rexlNico.Main;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class BanApi {

	public static void banPlayer(Player p, String grund){
		File pfile = new File("../Setings/BanPl/"+p.getUniqueId().toString()+".yml");
		YamlConfiguration pcfg = YamlConfiguration.loadConfiguration(pfile);
		
		pcfg.set("ban.bol", true);
		if(grund.equalsIgnoreCase("killaura")){
			pcfg.set("ban.grund", "Killaura");
			pcfg.set("ban.time", 70560);
		}
	}
	
}


//  gründe: killaura, hax, noknockback, beleidigung, 