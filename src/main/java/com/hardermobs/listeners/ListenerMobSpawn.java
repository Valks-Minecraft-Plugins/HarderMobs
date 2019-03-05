package com.hardermobs.listeners;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.hardermobs.HarderMobs;
import com.hardermobs.utils.Utils;

public class ListenerMobSpawn implements Listener {
	@EventHandler
	private void mobSpawn(CreatureSpawnEvent e) {
		FileConfiguration config = HarderMobs.plugin.getMonsterConfig();
		
		if (Math.random() >= config.getDouble("monsters." + e.getEntityType().name().toLowerCase() + ".chance"))
			return;
		
		switch (e.getSpawnReason()) {
		case NATURAL:
		case NETHER_PORTAL:
		case SPAWNER:
			switch (e.getEntityType()) {
			case DROWNED:
			case HUSK:
			case PIG_ZOMBIE:
			case SKELETON:
			case STRAY:
			case WITHER_SKELETON:
			case ZOMBIE:
			case ZOMBIE_VILLAGER:
				e.setCancelled(true);
				spawnMonster(e.getEntity(), config);
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
	}
	
	private void spawnMonster(LivingEntity entity, FileConfiguration config) {
		World w = entity.getWorld();
		LivingEntity monster = (LivingEntity) w.spawnEntity(entity.getLocation(), entity.getType());
		EntityEquipment equip = monster.getEquipment();
		
		try {
			String helmetName;
			String chestplateName;
			String leggingsName;
			String bootsName;
			String weaponMainName;
			String weaponOffName;
			int speed;
			
			switch (entity.getType()) {
			case DROWNED:
				helmetName = config.getString("monsters.drowned.helmet").toUpperCase();
				chestplateName = config.getString("monsters.drowned.chestplate").toUpperCase();
				leggingsName = config.getString("monsters.drowned.leggings").toUpperCase();
				bootsName = config.getString("monsters.drowned.boots").toUpperCase();
				weaponMainName = config.getString("monsters.drowned.mainweapon").toUpperCase();
				weaponOffName = config.getString("monsters.drowned.offweapon").toUpperCase();
				speed = config.getInt("monsters.drowned.speed");
				break;
			case HUSK:
				helmetName = config.getString("monsters.husk.helmet").toUpperCase();
				chestplateName = config.getString("monsters.husk.chestplate").toUpperCase();
				leggingsName = config.getString("monsters.husk.leggings").toUpperCase();
				bootsName = config.getString("monsters.husk.boots").toUpperCase();
				weaponMainName = config.getString("monsters.husk.mainweapon").toUpperCase();
				weaponOffName = config.getString("monsters.husk.offweapon").toUpperCase();
				speed = config.getInt("monsters.husk.speed");
				break;
			case PIG_ZOMBIE:
				helmetName = config.getString("monsters.pig_zombie.helmet").toUpperCase();
				chestplateName = config.getString("monsters.pig_zombie.chestplate").toUpperCase();
				leggingsName = config.getString("monsters.pig_zombie.leggings").toUpperCase();
				bootsName = config.getString("monsters.pig_zombie.boots").toUpperCase();
				weaponMainName = config.getString("monsters.pig_zombie.mainweapon").toUpperCase();
				weaponOffName = config.getString("monsters.pig_zombie.offweapon").toUpperCase();
				speed = config.getInt("monsters.pig_zombie.speed");
				break;
			case SKELETON:
				helmetName = config.getString("monsters.skeleton.helmet").toUpperCase();
				chestplateName = config.getString("monsters.skeleton.chestplate").toUpperCase();
				leggingsName = config.getString("monsters.skeleton.leggings").toUpperCase();
				bootsName = config.getString("monsters.skeleton.boots").toUpperCase();
				weaponMainName = config.getString("monsters.skeleton.mainweapon").toUpperCase();
				weaponOffName = config.getString("monsters.skeleton.offweapon").toUpperCase();
				speed = config.getInt("monsters.skeleton.speed");
				break;
			case STRAY:
				helmetName = config.getString("monsters.stray.helmet").toUpperCase();
				chestplateName = config.getString("monsters.stray.chestplate").toUpperCase();
				leggingsName = config.getString("monsters.stray.leggings").toUpperCase();
				bootsName = config.getString("monsters.stray.boots").toUpperCase();
				weaponMainName = config.getString("monsters.stray.mainweapon").toUpperCase();
				weaponOffName = config.getString("monsters.stray.offweapon").toUpperCase();
				speed = config.getInt("monsters.stray.speed");
				break;
			case WITHER_SKELETON:
				helmetName = config.getString("monsters.wither_skeleton.helmet").toUpperCase();
				chestplateName = config.getString("monsters.wither_skeleton.chestplate").toUpperCase();
				leggingsName = config.getString("monsters.wither_skeleton.leggings").toUpperCase();
				bootsName = config.getString("monsters.wither_skeleton.boots").toUpperCase();
				weaponMainName = config.getString("monsters.wither_skeleton.mainweapon").toUpperCase();
				weaponOffName = config.getString("monsters.wither_skeleton.offweapon").toUpperCase();
				speed = config.getInt("monsters.wither.speed");
				break;
			case ZOMBIE:
				helmetName = config.getString("monsters.zombie.helmet").toUpperCase();
				chestplateName = config.getString("monsters.zombie.chestplate").toUpperCase();
				leggingsName = config.getString("monsters.zombie.leggings").toUpperCase();
				bootsName = config.getString("monsters.zombie.boots").toUpperCase();
				weaponMainName = config.getString("monsters.zombie.mainweapon").toUpperCase();
				weaponOffName = config.getString("monsters.zombie.offweapon").toUpperCase();
				speed = config.getInt("monsters.zombie.speed");
				break;
			case ZOMBIE_VILLAGER:
				helmetName = config.getString("monsters.zombie_villager.helmet").toUpperCase();
				chestplateName = config.getString("monsters.zombie_villager.chestplate").toUpperCase();
				leggingsName = config.getString("monsters.zombie_villager.leggings").toUpperCase();
				bootsName = config.getString("monsters.zombie_villager.boots").toUpperCase();
				weaponMainName = config.getString("monsters.zombie_villager.mainweapon").toUpperCase();
				weaponOffName = config.getString("monsters.zombie_villager.offweapon").toUpperCase();
				speed = config.getInt("monsters.zombie_villager.speed");
				break;
			default:
				helmetName = "DIAMOND_HELMET";
				chestplateName = "DIAMOND_CHESTPLATE";
				leggingsName = "DIAMOND_LEGGINGS";
				bootsName = "DIAMOND_BOOTS";
				weaponMainName = "DIAMOND_SWORD";
				weaponOffName = "DIAMOND_SWORD";
				speed = 0;
				break;
			}
			
			Material helmetMaterial;
			if (helmetName.equals(""))
				helmetMaterial = Material.AIR;
			else {
				helmetMaterial = Material.valueOf(helmetName);
				if (helmetMaterial == null)
					helmetMaterial = Material.AIR;
			}
			
			Material chestplateMaterial;
			if (chestplateName.equals(""))
				chestplateMaterial = Material.AIR;
			else {
				chestplateMaterial = Material.valueOf(chestplateName);
				if (chestplateMaterial == null)
					chestplateMaterial = Material.AIR;
			}
			
			Material leggingsMaterial;
			if (leggingsName.equals(""))
				leggingsMaterial = Material.AIR;
			else {
				leggingsMaterial = Material.valueOf(leggingsName);
				if (leggingsMaterial == null)
					leggingsMaterial = Material.AIR;
			}
			
			Material bootsMaterial;
			if (bootsName.equals(""))
				bootsMaterial = Material.AIR;
			else {
				bootsMaterial = Material.valueOf(bootsName);
				if (bootsMaterial == null)
					bootsMaterial = Material.AIR;
			}
			
			Material weaponMainMaterial;
			if (weaponMainName.equals(""))
				weaponMainMaterial = Material.AIR;
			else {
				weaponMainMaterial = Material.valueOf(weaponMainName);
				if (weaponMainMaterial == null)
					weaponMainMaterial = Material.AIR;
			}
			
			Material weaponOffMaterial;
			if (weaponOffName.equals(""))
				weaponOffMaterial = Material.AIR;
			else {
				weaponOffMaterial = Material.valueOf(weaponOffName);
				if (weaponOffMaterial == null)
					weaponOffMaterial = Material.AIR;
			}
			
			ItemStack helmet = new ItemStack(helmetMaterial);
			ItemStack chestplate = new ItemStack(chestplateMaterial);
			ItemStack leggings = new ItemStack(leggingsMaterial);
			ItemStack boots = new ItemStack(bootsMaterial);
			ItemStack weaponMain = new ItemStack(weaponMainMaterial);
			ItemStack weaponOff = new ItemStack(weaponOffMaterial);
			
			equip.setHelmet(helmet);
			equip.setChestplate(chestplate);
			equip.setLeggings(leggings);
			equip.setBoots(boots);
			equip.setItemInMainHand(weaponMain);
			equip.setItemInOffHand(weaponOff);
			
			if (speed != 0)
				monster.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, speed - 1, 72000));
		} catch (IllegalArgumentException e) {
			HarderMobs.plugin.getServer().broadcastMessage(Utils.color("&4Error: &c" + e.getMessage()));
			HarderMobs.plugin.getServer().getLogger().warning("Illegal Argument Exception!");
		} catch (NullPointerException e) {
			HarderMobs.plugin.getServer().broadcastMessage(Utils.color("&4Error: &c" + e.getMessage()));
			HarderMobs.plugin.getServer().getLogger().warning("Null Pointer Exception!");
		}
	}
}
