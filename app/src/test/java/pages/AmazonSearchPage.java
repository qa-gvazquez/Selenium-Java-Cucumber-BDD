package pages;

public class AmazonSearchPage extends BasePage{

    // Listado de localizadores
    private final String searchBox = "//input[@id='twotabsearchtextbox']";
    private final String searchButton = "//input[@id='nav-search-submit-button']";
    private final String thirdResult = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[3]";
    private final String addToCartButton = "//input[@id='add-to-cart-button']";
    private final String addedMessageText = "//h1[normalize-space()='Agregado al carrito']";


    /**
     * Constructor de la BasePage en la clase AmazonSearchPage
     */
    public AmazonSearchPage() {
        super(driver);
    }

    /**
     * Acción que abre la página del SUT: www.amazon.com hererando el método navitateTo de la BasePage
     */
    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com.mx");
    }

    /**
    * Método para modelar el esribir algo en la caja de búsqueda del SUT. Hereda método 'write'.
    */
    public void enterSearchCriteria(String criteria){
        write(searchBox, criteria);
    }

    /**
     * Método para dar clic en el SUT, hereda 'clickElement' de BasePage.
     */
    public void clickSearch(){
        clickElement(searchButton);
    }

    /**
     * Metodo para dar clic en el enlace con el Texto que le digamos a la función
     * Hereda de BasePage.
     */
    public void goToPageX(String number){
        goToLinkText(number);
    }

    /**
     * Método que busca el elemento X de una lista de WebElements
     * Heread de BasePage
     */
    public void pickNthItem(){
        clickElement(thirdResult);
    }

    public void addToCart(){
        clickElement(addToCartButton);
    }

    public String addedToCartMessage(){
        return textFromElement(addedMessageText);
    }

}

