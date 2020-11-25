package modellierungfahrrad;

public class Seller {
    private String sellerName;
    private float price;
    private String articleNumber;

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public Seller(String sellerName, float price, String articleNumber) {
        this.sellerName = sellerName;
        this.price = price;
        this.articleNumber = articleNumber;
    }
}
