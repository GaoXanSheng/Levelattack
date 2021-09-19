package levelattack.levelattack;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Collection;


public class SetAttack extends BukkitRunnable  {
    @Override
    public void run() {
        Collection<? extends Player> players = Bukkit.getOnlinePlayers();
        for (Player player : players) {
            set(player);
        }
    }
    public void set (Player player) {
        String name = player.getName();
        int level = player.getLevel();
            //        获取属性
        AttributeInstance Set = player.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE);
//        设置攻击力为0
        Set.addModifier(new AttributeModifier(name, -Set.getValue(), AttributeModifier.Operation.ADD_NUMBER));
//        设置攻击力为当前等级
        Set.addModifier(new AttributeModifier(name, level, AttributeModifier.Operation.ADD_NUMBER));
    }
}
