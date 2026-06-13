package net.ultrad00d.ExtraCantrips.registry;

import com.mna.api.cantrips.ICantrip;
import com.mna.api.tools.RLoc;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class CantripRegistry {
    public static void register() {
        com.mna.cantrips.CantripRegistry registry = com.mna.cantrips.CantripRegistry.INSTANCE;
        // MVPv0
        registry.registerCantrip(
            new ResourceLocation("mna_extra_cantrips", "lightning"),
            new ResourceLocation("mna_extra_cantrips", "textures/gui/cantrips/lightning.png"),
            1,
            CantripRegistry::lightning,
            ItemStack.EMPTY,
            new ResourceLocation[]{RLoc.create("manaweave_patterns/knot2"), RLoc.create("manaweave_patterns/diamond")}
        );
        registry.registerCantrip(
            new ResourceLocation("mna_extra_cantrips", "spectral_bed"),
            new ResourceLocation("mna_extra_cantrips", "textures/gui/cantrips/spectral_bed.png"),
            1,
            CantripRegistry::placeBed,
            ItemStack.EMPTY,
            new ResourceLocation[]{RLoc.create("manaweave_patterns/knot2"), RLoc.create("manaweave_patterns/diamond")}
        );
        registry.registerCantrip(
            new ResourceLocation("mna_extra_cantrips", "spectral_boat"),
            new ResourceLocation("mna_extra_cantrips", "textures/gui/cantrips/spectral_boat.png"),
            1,
            CantripRegistry::summonBoat,
            ItemStack.EMPTY,
            new ResourceLocation[]{RLoc.create("manaweave_patterns/knot2"), RLoc.create("manaweave_patterns/diamond")}
        );
    }

    public static void lightning(Player player, ICantrip cantrip, InteractionHand hand) {

    }
    public static void placeBed(Player player, ICantrip cantrip, InteractionHand hand) {

    }
    public static void summonBoat(Player player, ICantrip cantrip, InteractionHand hand) {

    }
}
