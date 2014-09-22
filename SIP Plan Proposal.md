SIP - Sponge Industrialization Project Plan Proposal
---------------------------------------------------------------------------
```
IRC Channel: #SIP @ irc.esper.net

Brought to you by the SIP team :p

Work distribution:
  -waicool20: SIPCore, SIPCPU
  -octoshrimpy: ideas, ( SIPUtilities? SIPAlchemy? ) @TBD
  -Felix3008, irobin591: SIPTransport

Abbreviations:
@TBD ( To be Debated/Discussed )
```

1. SIPCore
	- Write API

	- Basic CPU Infrastructure
	- Won't contain any actual CPUs ( logic,functionality )
	- Will contain the multiblock algorithms

	- Power logic
	- Pathfinding
	- Concept @TBD

	- Core items
	- Industrializer ( Previously Typifier in CPU , Name @TBD )
		- Only serves as the "wrench" of the plugin
		- Right Click: Activates Machines
		- Shift Right Click: Wrench mode ( Disarms machines, drops them etc )
		- Left Click: "Multimeter" - Information about pipes ( Energyrate, etc ) @TBD
		- Shift Left Click: @TBD
	- Machine Configurators
		- This does the other half of the typifier functionality which is automatically adding items to CPUs
	- Ores
		- Copper, Tin etc ( Still got to think a way around textures or how to implement this @TBD )
		- Make quartz available pre-nether for CPUs

	- World Generation
	- Ingots and Ores
		- Bauxite ( Nether only, chance netherrack drop (Refines into Aluminium) )
			- Aluminium
		- Cobalt ( Refined from Silicon - Needs extreme heat from blast furnace )
			- Silicon ( Refined from sand - Needs extreme heat from blast furnace )
			- Sand
		- Steel ( Refined from iron and coal )
			- Iron/Coal
		- Alumite ( Al + Fe + Obsidian )
		- Manyullyn
		- Copper
		- Tin
		- Bronze ( Cu + Sn )
		- Silver
		- Electrum ( Au + Ag )
		- Brass ( Cu + Zn )
	- Use a database format ( eg. Mysql ) for storing large amounts of data such as WorldGen ores and CPUs
	 or use a flatfile ( like in old CPU plugin )?
  
2. SIPCPU
	- Adds the actual CPUs themselves and defines the logic, Maybe DPU for turtle like operation @TBD
	- GUI? Maybe something like here: http://dev.bukkit.org/bukkit-plugins/sensible-toolbox/pages/items/ @TBD
	- Compact CPUs? Multiple Inputs/Outputs in one block ( Like in Craftbook/Falsebook ) @TBD
	- Split SIPCPU into SIPCPU and SIPCPUExtra for more advanced items ( Like farms, quarrys, chunkloaders ) @TBD
	- Will be modular by adding types and tiers, refer to CPU sourcecode
	- Logic Gates
		- OR
		 -AND
		 -NOR
		 -NAND
		 -XOR
		 -XNOR
	- Resource Collection
		 -Some kind of ore processor/doubling mechanic
		 -Quarry
		 -Farming
			- Something similar to MFR? @TBD
	- Utility
		 -Block Breaker
		 -Block Placer ( Unified with breaker like the TE Autonomous Activator? @TBD )
		 -Teleporter
		 -Clocks
		 -Pulse Extender
		 -Pulse Limiter
		 -Wireless
		 -Autocrafting
		 -Autosmelting
		 -ChunkLoader ( Using Ender Pearls for a certain time, working without Redstone ) @TBD
	- DPU ( Dispenser Processing Unit , something akin to ComputerCraft turtles )
		 -Will be something like this: http://img4.wikia.nocookie.net/__cb20140915104619/minecraft-sip/images/f/f4/Vanillaturtle.png
		 -Using the new armor stands and stuff

3. SIPPipes
	- Pipes logic
		1: Redstone wires for transporting stuff
			  Repeaters for changing direction/speeding up items
			  Comparators for sorting items
		2: Stained Glass
			  Blue - Items
			  Orange - Liquids
			  Red - Power
	- Items ( Make recipes cheaper or increase worldgen ores for balance? @TBD )
		- Repeaters
			- Same direction as items travelling: Speeds up items
			- Different direction as items travelling: Changes direction
		- Comparators
			- Chest behind it defines what items to sort out of the stream
	- Liquids ( Maybe not @TBD )
		- XP
		- Lava
		- Water
	- Power

4. SIPTransport
	- Improves Vanilla Minecrafts transportation mechanics
	- Something like railcraft? [ mid-range ] @TBD
	- Drones? ( small armor stands ) [ mid-range ] @TBD
	- Improved boat mechanics [ long-range ]
		- Chestboats
		- Fast boats
		- Remote controlled
		- Autopilot ( pathfinding )
			- Running on energy? ( via Energyloader or furnace-items ( e.g. coal ) ) @TBD
	- Boat/Minecart/Drone Itemloader and Unloader

5. SIPTools
	- Tools somewhat like TConstruct maybe? @TBD
	- plugin version of practicalities.jotato.com ( octo has permission from mod author )
	- Jetpack

6. SIPUtilities
	- Utility stuff that are not CPUs but serve a use
		- Blocks like stuff from randomthings/openblocks
		- luggage-like chest ( octo has code )
    
7. SIPWorlds
	- Mystcraft style stuff maybe? @TBD
	- Maybe move Worldgen here? @TBD
	
8. SIPAlchemy
	- Alchemic power from items ( Explanation of non-IRL elements; Average of two items, +- modifiers)
 
	- Items' alchemic powers: ( Based from periodic table; Compare for surprises )
		- Coal - 6
			- Variants: Charcoal
		- Iron - 26
			- Variants: Steel
   
	- Non-Vanilla
		 -Aluminium - 13
		 -Alumite - 28 = 26(Iron)<->13(Aluminium)+9(obsidian, strong non-pure)
		 -Cobalt - 27
		 -Manyullyn - 24 = 27(cobalt)-3(Ardite, weak non-pure)
		 -Copper - 29
		 -Bronze - 10 = 50(Tin)<->29(Copper)
		 -Tin - 50  
		 -Silver - 47
		 -Gold - 79
		 -Electrum -53 = 47(Silver)<->79(Told)
		 -Zinc - 30
		 -Brass - 4 = 29(Copper)<->30(Zinc)
		 -Silicon - 14
   
	- Modifiers
		- Bauxite -6
		- Ardite -3
		- SpiderEyes -2
		- GunPowder -15
		- Obsidian +9
		- Bone +20
		- Bonemeal +2
 
	- Recipes
		- Average of alchemic power of items thrown in, add modifiers, subtract modifiers (in that order)
 
	- Alchemy Station: http://imgur.com/a/FznOC

9. Off Topic
	- Logo
	- Build system
		- Maven, gradle?
	- Deploy system
		- Jenkins, Travis CI?
	- Repositories
		- Organization?
		- "SpongeIndustrializationProject"
		- Split into multiple repositories?
		- Direct commit&push or pull requests?
			- Who processes the pull requests?
	- Timing
		- When will we start coding?
		- Wait for a stable release?
		- Or start now and fix later?
  
10. Octo's More Ideas Corner:
	-SIPAlchemy:
		- Add more modifiers
		- Electrum dust = redstone dust+NBT; electrum dust costs only 1 for 1 item ( Instead of 3 redstone )
		- Dust and ingot for every new ore.
		- Add most(/all) vanilla items to SIPalchemy

	- Liquids; 1:3 - Bk:ingot (Bk = bucket) for a smelter station ( Liquid not actually shown, just numbers in GUI )
 
	- Carbon Fiber
		- Carbon Fiber ingots - tougher tools
 
	- Chestboats:
		- Upgrades:
			- More inventory (1 row per upgrade)
			- Tracker - follows player who created boat
			- tracker radius - increases radius
			- Speed upgrades
			- Pathfinding upgrades
			- Autonomous ride ( Automatic transport like cargo ship; make sure to keep chunks in path loaded )
