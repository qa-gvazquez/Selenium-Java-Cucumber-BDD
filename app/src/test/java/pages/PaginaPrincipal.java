package pages;

public class PaginaPrincipal extends BasePage{

    public PaginaPrincipal() {
        super(driver);
    }

    /**
     * Método para navegar a la URL del SUT
     */
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }

}
