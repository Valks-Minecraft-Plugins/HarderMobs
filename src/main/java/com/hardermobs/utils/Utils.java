package com.hardermobs.utils;

import org.bukkit.configuration.file.FileConfiguration;

import net.md_5.bungee.api.ChatColor;

public class Utils {
	public static String color(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);
	}
	
	public static void setConfigValue(FileConfiguration config, String path, String value) {
		if (!config.isSet(path))
			config.set(path, value);
	}
	
	public static void setConfigValue(FileConfiguration config, String path, int value) {
		if (!config.isSet(path))
			config.set(path, value);
	}
	
	public static void setConfigValue(FileConfiguration config, String path, double value) {
		if (!config.isSet(path))
			config.set(path, value);
	}
	
	public static void setConfigValue(FileConfiguration config, String path, boolean value) {
		if (!config.isSet(path))
			config.set(path, value);
	}
}
