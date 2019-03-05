package com.hardermobs;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.hardermobs.listeners.ListenerMobSpawn;
import com.hardermobs.utils.Utils;

public class HarderMobs extends JavaPlugin {
	public static HarderMobs plugin;
	
	private File monsterConfigFile = new File(getDataFolder(), "monsters.yml");
	private FileConfiguration monsterConfig = YamlConfiguration.loadConfiguration(monsterConfigFile);
	
	@Override
	public void onEnable() {
		plugin = this;
		registerListeners();
		registerMonsterConfig();
	}
	
	private void registerListeners() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new ListenerMobSpawn(), this);
	}
	
	private void registerMonsterConfig() {
		Utils.setConfigValue(monsterConfig, "monsters.drowned.chance", 0.3);
		Utils.setConfigValue(monsterConfig, "monsters.drowned.helmet", "DIAMOND_HELMET");
		Utils.setConfigValue(monsterConfig, "monsters.drowned.chestplate", "DIAMOND_CHESTPLATE");
		Utils.setConfigValue(monsterConfig, "monsters.drowned.leggings", "DIAMOND_LEGGINGS");
		Utils.setConfigValue(monsterConfig, "monsters.drowned.boots", "DIAMOND_BOOTS");
		Utils.setConfigValue(monsterConfig, "monsters.drowned.mainweapon", "DIAMOND_SWORD");
		Utils.setConfigValue(monsterConfig, "monsters.drowned.offweapon", "DIAMOND_SWORD");
		Utils.setConfigValue(monsterConfig, "monsters.drowned.speed", 0);
		
		Utils.setConfigValue(monsterConfig, "monsters.husk.chance", 0.1);
		Utils.setConfigValue(monsterConfig, "monsters.husk.helmet", "DIAMOND_HELMET");
		Utils.setConfigValue(monsterConfig, "monsters.husk.chestplate", "DIAMOND_CHESTPLATE");
		Utils.setConfigValue(monsterConfig, "monsters.husk.leggings", "DIAMOND_LEGGINGS");
		Utils.setConfigValue(monsterConfig, "monsters.husk.boots", "DIAMOND_BOOTS");
		Utils.setConfigValue(monsterConfig, "monsters.husk.mainweapon", "DIAMOND");
		Utils.setConfigValue(monsterConfig, "monsters.husk.offweapon", "GOLD_INGOT");
		Utils.setConfigValue(monsterConfig, "monsters.husk.speed", 0);
		
		Utils.setConfigValue(monsterConfig, "monsters.pig_zombie.chance", 0.6);
		Utils.setConfigValue(monsterConfig, "monsters.pig_zombie.helmet", "GOLDEN_HELMET");
		Utils.setConfigValue(monsterConfig, "monsters.pig_zombie.chestplate", "GOLDEN_CHESTPLATE");
		Utils.setConfigValue(monsterConfig, "monsters.pig_zombie.leggings", "GOLDEN_LEGGINGS");
		Utils.setConfigValue(monsterConfig, "monsters.pig_zombie.boots", "GOLDEN_BOOTS");
		Utils.setConfigValue(monsterConfig, "monsters.pig_zombie.mainweapon", "GOLDEN_SWORD");
		Utils.setConfigValue(monsterConfig, "monsters.pig_zombie.offweapon", "GOLDEN_SWORD");
		Utils.setConfigValue(monsterConfig, "monsters.pig_zombie.speed", 0);
		
		Utils.setConfigValue(monsterConfig, "monsters.skeleton.chance", 1.0);
		Utils.setConfigValue(monsterConfig, "monsters.skeleton.helmet", "IRON_HELMET");
		Utils.setConfigValue(monsterConfig, "monsters.skeleton.chestplate", "IRON_CHESTPLATE");
		Utils.setConfigValue(monsterConfig, "monsters.skeleton.leggings", "IRON_LEGGINGS");
		Utils.setConfigValue(monsterConfig, "monsters.skeleton.boots", "IRON_BOOTS");
		Utils.setConfigValue(monsterConfig, "monsters.skeleton.mainweapon", "IRON_SWORD");
		Utils.setConfigValue(monsterConfig, "monsters.skeleton.offweapon", "IRON_SWORD");
		Utils.setConfigValue(monsterConfig, "monsters.skeleton.speed", 2);
		
		Utils.setConfigValue(monsterConfig, "monsters.stray.chance", 0.1);
		Utils.setConfigValue(monsterConfig, "monsters.stray.helmet", "DIAMOND_HELMET");
		Utils.setConfigValue(monsterConfig, "monsters.stray.chestplate", "DIAMOND_CHESTPLATE");
		Utils.setConfigValue(monsterConfig, "monsters.stray.leggings", "DIAMOND_LEGGINGS");
		Utils.setConfigValue(monsterConfig, "monsters.stray.boots", "DIAMOND_BOOTS");
		Utils.setConfigValue(monsterConfig, "monsters.stray.mainweapon", "BOW");
		Utils.setConfigValue(monsterConfig, "monsters.stray.offweapon", "");
		Utils.setConfigValue(monsterConfig, "monsters.stray.speed", 0);
		
		Utils.setConfigValue(monsterConfig, "monsters.wither_skeleton.chance", 0.25);
		Utils.setConfigValue(monsterConfig, "monsters.wither_skeleton.helmet", "DIAMOND_HELMET");
		Utils.setConfigValue(monsterConfig, "monsters.wither_skeleton.chestplate", "DIAMOND_CHESTPLATE");
		Utils.setConfigValue(monsterConfig, "monsters.wither_skeleton.leggings", "DIAMOND_LEGGINGS");
		Utils.setConfigValue(monsterConfig, "monsters.wither_skeleton.boots", "DIAMOND_BOOTS");
		Utils.setConfigValue(monsterConfig, "monsters.wither_skeleton.mainweapon", "BOW");
		Utils.setConfigValue(monsterConfig, "monsters.wither_skeleton.offweapon", "");
		Utils.setConfigValue(monsterConfig, "monsters.wither_skeleton.speed", 0);
		
		Utils.setConfigValue(monsterConfig, "monsters.zombie.chance", 0.10);
		Utils.setConfigValue(monsterConfig, "monsters.zombie.helmet", "CHAINMAIL_HELMET");
		Utils.setConfigValue(monsterConfig, "monsters.zombie.chestplate", "CHAINMAIL_CHESTPLATE");
		Utils.setConfigValue(monsterConfig, "monsters.zombie.leggings", "CHAINMAIL_LEGGINGS");
		Utils.setConfigValue(monsterConfig, "monsters.zombie.boots", "CHAINMAIL_BOOTS");
		Utils.setConfigValue(monsterConfig, "monsters.zombie.mainweapon", "IRON_AXE");
		Utils.setConfigValue(monsterConfig, "monsters.zombie.offweapon", "IRON_AXE");
		Utils.setConfigValue(monsterConfig, "monsters.zombie.speed", 1);
		
		Utils.setConfigValue(monsterConfig, "monsters.zombie_villager.chance", 0.15);
		Utils.setConfigValue(monsterConfig, "monsters.zombie_villager.helmet", "DIAMOND_HELMET");
		Utils.setConfigValue(monsterConfig, "monsters.zombie_villager.chestplate", "DIAMOND_CHESTPLATE");
		Utils.setConfigValue(monsterConfig, "monsters.zombie_villager.leggings", "DIAMOND_LEGGINGS");
		Utils.setConfigValue(monsterConfig, "monsters.zombie_villager.boots", "DIAMOND_BOOTS");
		Utils.setConfigValue(monsterConfig, "monsters.zombie_villager.mainweapon", "DIAMOND_SWORD");
		Utils.setConfigValue(monsterConfig, "monsters.zombie_villager.offweapon", "DIAMOND_SWORD");
		Utils.setConfigValue(monsterConfig, "monsters.zombie_villager.speed", 0);
		saveMonsterConfig();
	}
	
	public void saveMonsterConfig() {
		try {
			monsterConfig.save(monsterConfigFile);
		} catch (IOException e) {
			plugin.getLogger().warning("Could not save config!");
		}
	}
	
	public FileConfiguration getMonsterConfig() {
		return monsterConfig;
	}
}
