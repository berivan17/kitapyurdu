package kitapyurdu;

import org.openqa.selenium.By;

public class Pages {
    Methods methods = new Methods();

    public void search()
    {
        methods.sendKeys(By.id("search-input"), "Roman");
        methods.click(By.cssSelector(".common-sprite.button-search"));    }
    public void selectRandom() {
        methods.random();

    }
    public  void addBasket(){
        methods.click(By.id("button-cart"));

    }
    public  void addcart(){
        methods.click(By.id("cart-items"));

    }
    public  void additems(){

        methods.click(By.id("js-cart"));
    }
    public void productUp(){
        methods.sendKeys(By.xpath("//[@class='js-cart-update-product']//input"),"2");


    }
    public void productUpdate(){methods.click(By.xpath("//[@class='fa fa-refresh green-icon']"));}
    public void productDelete(){methods.click(By.xpath("//*[@class='fa fa-times red-icon']"));}
}
