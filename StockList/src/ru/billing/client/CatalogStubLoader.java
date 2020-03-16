package ru.billing.client;
import ru.billing.client.CatalogLoader;
import ru.billing.stocklist.Category;
import ru.billing.stocklist.FOODItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;


import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    public void load(ItemCatalog cat) {
        GenericItem item1 = new GenericItem("Sony TV",23000, Category.GENERAL);
        FOODItem item2 = new FOODItem("Bread",12,null,new Date(),(short)10);
        cat.addItem(item1);
        cat.addItem(item2);
    }
}
