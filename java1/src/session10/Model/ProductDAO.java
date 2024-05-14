
package session10.Model;

import session10.Entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {
    void createProduct(Product product) throws SQLException;

    Product getProductById(int productId) throws SQLException;

    ArrayList<Product> getAllProduct() throws SQLException;

    void updateProduct(Product product) throws SQLException;

    void deleteProduct(int productId) throws SQLException;
}
