package JMTemplate.content;

import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.StackConveyor;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.meta.Attribute;

import static mindustry.type.ItemStack.with;

public class SBlocks implements ContentList {
    public static Block railWay, woodenBlocka, woodenBlockb, pollutedGrass;


    @Override
    public void load() {
        railWay = new StackConveyor("railWay"){{
            health = 100;
            size = 1;
            speed = 4f / 30f;
            itemCapacity = 30;
            requirements(Category.distribution, with(Items.copper, 10));
        }};

        woodenBlocka = new Floor("woodenBlocka");

        woodenBlockb = new Floor("woodenBlockb");

        pollutedGrass = new Floor("pollutedGrass");
    }
}