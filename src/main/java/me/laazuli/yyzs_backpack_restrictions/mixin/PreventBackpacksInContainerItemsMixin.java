package me.laazuli.yyzs_backpack_restrictions.mixin;

import com.yyz.yyzsbackpack.item.BackpackItem;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BackpackItem.class)
public class PreventBackpacksInContainerItemsMixin extends Item {
    public PreventBackpacksInContainerItemsMixin(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canFitInsideContainerItems() {
        return false;
    }
}
