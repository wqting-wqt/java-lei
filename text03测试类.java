package 类集合;
class catalog03 {
    private int catalogId;
    private String catalogName;
    public catalog03(){

    }
    public catalog03(String catalogName){
        this.catalogName=catalogName;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
}
class flower03 {
    private int flowerId;
    private catalog03 catalog;
    private String flowerName;
    private int price;
    public flower03(){
    }
    public flower03(catalog03 catalog, String flowerName, int price){
        this.catalog=catalog;
        this.flowerName=flowerName;
        this.price=price;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public catalog03 getCatalog() {
        return catalog;
    }

    public void setCatalog(catalog03 catalog) {
        this.catalog = catalog;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "品种："+catalog.getCatalogName()+ "   花名: "+flowerName+ "   价格: "+price;
    }
}

public class text03测试类 {
    public static void main(String[] args){
        catalog03 c1=new catalog03("百合");
        flower03 f1=new flower03(c1,"真挚祝福",229);
        System.out.println(f1);
    }
}
