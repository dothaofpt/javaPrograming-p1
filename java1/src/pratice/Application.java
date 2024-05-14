package pratice;

import pratice.view.ProductConsoleUI;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        ProductConsoleUI productConsoleUI = new ProductConsoleUI();
        productConsoleUI.start();

    }
}
