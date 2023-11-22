package net.raylirov.coolarmor.items;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.raylirov.coolarmor.CoolArmor;

import java.util.List;

public class GildedSmithingTemplateItem extends SmithingTemplateItem {
    public GildedSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures);
    }

    private static final Formatting DESCRIPTION_FORMAT = Formatting.BLUE;
    private static final Formatting TITLE_FORMAT = Formatting.GRAY;
    private static final Text UPGRADE_BASE_SLOT_DESCRIPTION = Text.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.base_slot_description");
    private static final Text UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Text.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.additions_slot_description");
    private static final Text UPGRADE = Text.translatable("upgrade." + CoolArmor.MOD_ID + ".gilded_upgrade").formatted(TITLE_FORMAT);
    private static final Text UPGRADE_APPLIES_TO = Text.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.applies_to").formatted(DESCRIPTION_FORMAT);
    private static final Text UPGRADE_INGREDIENTS = Text.translatable("item." + CoolArmor.MOD_ID + ".smithing_template.gilded_upgrade.ingredients").formatted(DESCRIPTION_FORMAT);

    private static final Identifier EMPTY_SLOT_HELMET = new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_SLOT_CHESTPLATE = new Identifier("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_SLOT_LEGGINGS = new Identifier("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_SLOT_BOOTS = new Identifier("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_INGOT = new Identifier("item/empty_slot_ingot");


    private static List<Identifier> createUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    }

    private static List<Identifier> createUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    public static GildedSmithingTemplateItem createUpgradeTemplate() {
        return new GildedSmithingTemplateItem(UPGRADE_APPLIES_TO, UPGRADE_INGREDIENTS, UPGRADE, UPGRADE_BASE_SLOT_DESCRIPTION, UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createUpgradeIconList(), createUpgradeMaterialList());
    }
}
