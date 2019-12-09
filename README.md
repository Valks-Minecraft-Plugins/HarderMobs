# HarderMobs

## About
Download latest release for 1.13.2 [here](https://github.com/valkyrienyanko/HarderMobs/releases).

Drowned, Husk, Pig Zombie, Skeleton Stray, Wither Skeleton, Zombie, Zombie Villager have a configurable chance to spawn with configurable equipment / speed.

### Configuration Tutorial

```yml
monsters:
  <type>
    chance: 0.1 # The chance that the monster can spawn. Values range from 0.0 - 1.0 (0% - 100%)
    helmet: BLACK_WOOL # The helmet itemstack.
    chestplate: CHAINMAIL_CHESTPLATE # The chestplate itemstack.
    leggings: IRON_LEGGINGS # The leggings itemstack.
    boots: GOLDEN_BOOTS # The boots itemstack.
    mainweapon: APPLE # The main weapon itemstack. (It does not have to be a weapon.)
    offweapon: '' # Since '' was put, it means nothing will be placed in the off hand weapon slot.
    speed: 1 # The speed of the mob, if you don't want any extra speed than put 0. (All values are greater than zero.)
```

<details><summary>Config Preview (Click to Expand)</summary>
<p>

#### monsters.yml

```yml
monsters:
  drowned:
    chance: 0.3
    helmet: DIAMOND_HELMET
    chestplate: DIAMOND_CHESTPLATE
    leggings: DIAMOND_LEGGINGS
    boots: DIAMOND_BOOTS
    mainweapon: DIAMOND_SWORD
    offweapon: DIAMOND_SWORD
    speed: 0
  husk:
    chance: 0.1
    helmet: DIAMOND_HELMET
    chestplate: DIAMOND_CHESTPLATE
    leggings: DIAMOND_LEGGINGS
    boots: DIAMOND_BOOTS
    mainweapon: DIAMOND
    offweapon: GOLD_INGOT
    speed: 0
  pig_zombie:
    chance: 0.6
    helmet: GOLDEN_HELMET
    chestplate: GOLDEN_CHESTPLATE
    leggings: GOLDEN_LEGGINGS
    boots: GOLDEN_BOOTS
    mainweapon: GOLDEN_SWORD
    offweapon: GOLDEN_SWORD
    speed: 0
  skeleton:
    chance: 1.0
    helmet: IRON_HELMET
    chestplate: IRON_CHESTPLATE
    leggings: IRON_LEGGINGS
    boots: IRON_BOOTS
    mainweapon: IRON_SWORD
    offweapon: IRON_SWORD
    speed: 2
  stray:
    chance: 0.1
    helmet: DIAMOND_HELMET
    chestplate: DIAMOND_CHESTPLATE
    leggings: DIAMOND_LEGGINGS
    boots: DIAMOND_BOOTS
    mainweapon: BOW
    offweapon: ''
    speed: 0
  wither_skeleton:
    chance: 0.25
    helmet: DIAMOND_HELMET
    chestplate: DIAMOND_CHESTPLATE
    leggings: DIAMOND_LEGGINGS
    boots: DIAMOND_BOOTS
    mainweapon: BOW
    offweapon: ''
    speed: 0
  zombie:
    chance: 0.1
    helmet: CHAINMAIL_HELMET
    chestplate: CHAINMAIL_CHESTPLATE
    leggings: CHAINMAIL_LEGGINGS
    boots: CHAINMAIL_BOOTS
    mainweapon: IRON_AXE
    offweapon: IRON_AXE
    speed: 1
  zombie_villager:
    chance: 0.15
    helmet: DIAMOND_HELMET
    chestplate: DIAMOND_CHESTPLATE
    leggings: DIAMOND_LEGGINGS
    boots: DIAMOND_BOOTS
    mainweapon: DIAMOND_SWORD
    offweapon: DIAMOND_SWORD
    speed: 0
```
</p>
</details>

## Compiling
1. Clone the repository directly into your IDE.
2. Build Spigot with [Spigot's Build Tools](https://www.spigotmc.org/wiki/buildtools/) then add the JAR to the projects build path.
3. Fix any outdated code in the project depending on what version of Spigot you installed.
4. Compile the plugin by exporting it to a JAR file.
