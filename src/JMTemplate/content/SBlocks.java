package JMTemplate.content;

import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.StackConveyor;

public class SBlocks implements ContentList {
    public static Block railWay;


    @Override
    public void load() {
        railWay = new StackConveyor("railWay"){{

            size = 1;
            hasItems = true;
            itemCapacity = 40;
            conveyorPlacement = true;
            requirements(Category.distribution, ItemStack.with(Items.copper, 10));

        }};
    }
}
