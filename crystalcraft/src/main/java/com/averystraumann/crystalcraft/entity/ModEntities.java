package com.averystraumann.crystalcraft.entity;

import com.averystraumann.crystalcraft.crystalcraft;
import com.averystraumann.crystalcraft.entity.custom.RubyCowEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.Cow;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, crystalcraft.MODID);

    public static final RegistryObject<EntityType<RubyCowEntity>> RUBY_COW = ENTITY_TYPES.register("ruby_cow", () ->
            EntityType.Builder.of(RubyCowEntity::new, MobCategory.CREATURE)
            .sized(1.5f,1.74f).build(new ResourceLocation(crystalcraft.MODID, "ruby_cow").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
