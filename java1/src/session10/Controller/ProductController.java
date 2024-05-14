
package session10.Controller;

import session10.Entities.Product;
import session10.Model.ProductDAO;
import session10.Model.ProductDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    private ProductDAO productDao;

    public ProductController() throws SQLException {
        productDao = new ProductDaoImpl();
    }

    public ArrayList<Product> getAllProductController() throws SQLException {
        return productDao.getAllProduct();
    }

    public void createProductController(Product product) throws SQLException {
        productDao.createProduct(product);
    }

    public Product getProductByIdController(int prodId) throws SQLException {
        return productDao.getProductById(prodId);
    }

    public void updateProductController(Product product) throws SQLException {
        productDao.updateProduct(product);
    }

    public void deleteProduct(int prodId) throws SQLException {
        productDao.deleteProduct(prodId);
    }
}
