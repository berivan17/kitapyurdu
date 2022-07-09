package kitapyurdu;

import org.junit.Test;

public class TestPage extends BaseTest {
    @Test
    public void testPage()
    {
        Pages pages = new Pages();
        Methods methods = new Methods();
        methods.waitBySecond(2);
        pages.search();
        methods.waitBySecond(2);
        pages.selectRandom();
        methods.waitBySecond(2);
        pages.addBasket();
        methods.waitBySecond(2);
        pages.addcart();
        methods.waitBySecond(2);
        pages.additems();
        methods.waitBySecond(2);
        pages.productUp();
        methods.waitBySecond(2);
        pages.productUpdate();
        methods.waitBySecond(2);
        pages.productDelete();
    }
}
