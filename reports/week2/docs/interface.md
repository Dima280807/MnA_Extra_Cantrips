# Interface Contract for MnA Spell Addon

## Interface Type
The addon will primarily be integrated with *Mana and Artifice* **spell system**.
Besides, the addon will also utilize basic *Minecraft* systems, such as **loot tables**, **trading**, and **placing/summoning** techniques.

## Intended Users
Players of MnA who will use the new spells via MnA’s existing spell book, manaweaver's wand, and other casting UI.

## Spell Contract
Each spell must:
- Follow MnA’s spell abstract (interface or abstract class)
- Have mana cost, cast time, cooldown defined

## Discovery Contract
New spells should be explored using unique items, which can be discovered with chest loot tables systems (in dungeons, mines, temples, etc.)

## Spells as user stories

### US-01: Force consume
- **UI used:** MnA spell/cantrip casting system
- **Effect:** Force-triggers on‑eat action of the item in left hand, even if the item is uneatable or the saturation bar is full. After eating, effects are applied to the player with respect to the eaten item. (common food - nothing or built-in effects, pickaxe - haste, sword - strength, etc.)

### US-02: Empower
- **UI used:** MnA spell/cantrip casting system
- **Effect:** Next spell will have enhanced effects, e.g. the spell with damage will have increased damage or the spell with explosion will have stronger explosion  after *Empower*.

### US-03: Spectral bed
- **UI used:** MnA spell/cantrip casting system
- **Effect:** Places the spectral bed, which allows to sleep and skip night without changing a spawnpoint. After sleeping the bed disappears.

### US-04: Lightning spell
- **UI used:** MnA spell/cantrip casting system
- **Effect:** Summons lightning bolt at targeted location. The summoned lightning bolt implements the same logic as the usual one: places fire, damages entities, makes creepers charged.

### US-05: Spectral donkey
- **UI used:** MnA spell/cantrip casting system
- **Effect:** Spawns spectral donkey, which can be ridden by player and which carries a (ender?) chest. If the donkey is not being ridden for 30 seconds, it disappears. 

### US-06: Spectral boat
- **UI used:** MnA spell/cantrip casting system
- **Effect:** Spawns spectral boat entity, which can be used as a regular boat. The boat disappears after sailing.

### US-07: Reset villager trading progress
- **UI used:** MnA spell/cantrip casting system
- **Effect:** Replaces all villager's offers to the equivalent ones (or does not change it). Such casting might lead villager to having lower reputation about the player and rising the trade costs.

### US-08: Spectral Armor
- **UI used:** MnA spell/cantrip casting system
- **Effect:** Places spectral armor to player at each free slot. The protection and durability depends primarily on magic level of the player.  The spectral armor disappears after 30 seconds since last PvP/PvE combat.