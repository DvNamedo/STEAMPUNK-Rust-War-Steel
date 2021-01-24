package JMTemplate.content;

import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.StackConveyor;

import static mindustry.type.ItemStack.with;

public class SBlocks implements ContentList {
    public static Block railWay;


    @Override
    public void load() {
        railWay = new StackConveyor("railWay"){{

            health = 100;
            size = 1;
            speed = 12f / 180f;
            itemCapacity = 30;
            conveyorPlacement = true;
            requirements(Category.distribution, with(Items.copper, 10));

        }};
    }
}