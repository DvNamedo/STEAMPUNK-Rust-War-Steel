package JMTemplate.content;

import mindustry.annotations.Annotations;
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
            health = 50;
            size = 1;
            speed = 4f / 45f;
            itemCapacity = 20;
            requirements(Category.distribution, with(Items.copper, 10));
        }};

        woodenBlocka = new Floor("woodenBlocka"){{
            variants = 0;
        }};

        woodenBlockb = new Floor("woodenBlockb"){{
            variants = 0;
        }};

        pollutedGrass = new Floor("pollutedGrass"){{
            variants = 0;
        }};
    }
}
