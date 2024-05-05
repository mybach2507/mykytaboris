package io.github.example.epicspleef;

import io.github.example.epicspleef.command.CreateSpleefExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class EpicSpleefMain extends JavaPlugin {


    @Override
    public void onEnable() {

        getCommand("createspleef").setExecutor(new CreateSpleefExecutor());


        getLogger().info("Started plugin!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Stopped plugin!");
    }
}
