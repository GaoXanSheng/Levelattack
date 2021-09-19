package levelattack.levelattack;

import org.bukkit.plugin.java.JavaPlugin;
public final class Levelattack extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        SetAttack SetAttack =new SetAttack();
        SetAttack.runTaskTimer(this, 1, 40);
        getLogger().info("--------------------");
        getLogger().info("等级等于攻击力插件已经启动");
        getLogger().info("----[By Yun_Nan]----");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}

