package com.kneelawk.nilclassic;

import com.mojang.minecraft.User;
import com.mojang.minecraft.level.tile.Tile;

import com.kneelawk.nilclassic.premain.NilClassicLog;

@SuppressWarnings("unused")
public class NilClassicMain implements Runnable {
    @Override
    public void run() {
        NilClassicLog.log.info("Hello from main!");

        NilClassicLog.log.info("Adding water to selection screen...");
        User.creativeTiles.add(Tile.water);
    }
}
