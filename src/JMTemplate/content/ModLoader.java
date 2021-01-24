package JMTemplate.content;

import mindustry.ctype.*;
import JMTemplate.content.*;

public class ModLoader implements ContentList {
    private final ContentList[] contents = {new SBlocks()};

    public void load() {
        for(ContentList list : contents){
            list.load();
        }
    }
}
