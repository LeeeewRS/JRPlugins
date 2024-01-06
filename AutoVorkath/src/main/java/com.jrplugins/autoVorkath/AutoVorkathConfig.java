/*
 * Copyright (c) 2024. By Jrod7938
 *
 */
package com.jrplugins.autoVorkath;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("AutoVorkath")
public interface AutoVorkathConfig extends Config {

    @ConfigItem(
            keyName = "crossbow",
            name = "Crossbow",
            description = "Choose your crossbow",
            position = 0
    )
    default CROSSBOW CROSSBOW() {
        return CROSSBOW.DRAGON_HUNTER_CROSSBOW;
    }

    @ConfigItem(
            keyName = "slayersStaff",
            name = "Slayers Staff",
            description = "Choose your slayers staff",
            position = 1
    )
    default STAFF SLAYERSTAFF() {
        return STAFF.SLAYER_STAFF;
    }

    @ConfigItem(
            keyName = "teleport",
            name = "Teleport",
            description = "Choose your teleport",
            position = 2
    )
    default TELEPORT TELEPORT() {
        return TELEPORT.CONSTRUCT_CAPE_T;
    }

    @ConfigItem(
            keyName = "portal",
            name = "Portal",
            description = "What Portal to use to teleport to Lunar Isle.",
            position = 3
    )
    default PORTAL PORTAL() {
        return PORTAL.PORTAL_NEXUS;
    }

    @ConfigItem(
            keyName = "rigour",
            name = "Rigour",
            description = "Activate Rigour?",
            position = 4
    )
    default boolean ACTIVATERIGOUR() {
        return true;
    }

    @ConfigItem(
            keyName = "rangePotion",
            name = "Ranging Potion",
            description = "What Ranging potion to use?",
            position = 5
    )
    default RANGE_POTION RANGEPOTION() {
        return RANGE_POTION.DIVINE_RANGING_POTION;
    }

    @ConfigItem(
            keyName = "prayerPotion",
            name = "Prayer Potion",
            description = "What Prayer potion to use?",
            position = 6
    )
    default PRAYER_POTION PRAYERPOTION() {
        return PRAYER_POTION.PRAYER;
    }

    @ConfigItem(
            keyName = "antiFirePotion",
            name = "Antifire Potion",
            description = "What Antifire potion to use?",
            position = 7
    )
    default ANTIFIRE ANTIFIRE() {
        return ANTIFIRE.EXTENDED_SUPER_ANTIFIRE;
    }

    @ConfigItem(
            keyName = "food amount",
            name = "Food Amount",
            description = "MAX FOOD : MIN FOOD",
            position = 8
    )
    default Dimension FOODAMOUNT() {
        return new Dimension(15, 10);
    }

    @ConfigItem(
            keyName = "food",
            name = "Food",
            description = "What food to use?",
            position = 9
    )
    default String FOOD() {
        return "Shark";
    }

    @ConfigItem(
            keyName = "Loot",
            name = "Loot Names",
            description = "Enter the name of the loot you want to pick up (YOUR FOOD MUST NOT BE IN HERE)",
            position = 10
    )
    default String LOOTNAMES() {
        return "Green dragonhide,Blue dragonhide,Superior dragon bones,Battlestaff,Diamond,Dragonstone bolt tips,Chaos rune,Black dragonhide,Dragon bones,Dragon plateskirt,Red dragonhide,Grapes,Magic logs,Coins,Onyx bolt tips,Rune kiteshield,Loop half of key,Death rune,Adamantite ore,Rune longsword,Dragon bolts (unf),Dragon longsword,Dragon platelegs,Dragonbone necklace,Draconic visage,Skeletal visage,Jar of decay,Wrath rune,Dragon arrowtips,Rune dart tip,Dragon dart tip,Dragon stone,Dragon battleaxe,Manta ray,Rune sq shield,Wrath talisman";
    }
}
