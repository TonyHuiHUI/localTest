import java.util.*;

public class Demo {

    public static class SkuKey {
        private String category;
        private String skuProperties;

        public SkuKey(String category, String skuProperties) {
            this.category = category;
            this.skuProperties = skuProperties;
        }
    }


    public static class Sku{
        String category;
        String skuProperties;
        String name;

        public Sku(String category, String skuProperties, String name) {
            this.category = category;
            this.skuProperties = skuProperties;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        List<Sku> skus = new ArrayList();
        skus.add(new Sku("0001", "1:1;2:2;3:3", "sku-1"));
        skus.add(new Sku("0002", "1:1;2:2;3:3", "sku-2"));
        skus.add(new Sku("0003", "1:1;2:2;3:3", "sku-3"));
        skus.add(new Sku("0004", "1:1;2:2;3:3", "sku-4"));

        Map<SkuKey, Sku> skuByKey = new HashMap<>();
        for(int i = 0; i< 4000*4000; i++) {
            skus.forEach( sku -> skuByKey.put(new SkuKey(sku.category, sku.skuProperties), sku ) );
        }

        System.out.println("build map complete");

    }

}
