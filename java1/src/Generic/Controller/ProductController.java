package Generic.Controller;

import Generic.Entity.Product;
import Generic.Model.ProductDaoImpl;

import java.sql.SQLException;

public class ProductController {
    private ProductDaoImpl productDAO; // Đối tượng DAO để truy cập cơ sở dữ liệu

    public ProductController(ProductDaoImpl productDAO) {
        this.productDAO = productDAO;
    }

    public Product getProductById(int productId) throws SQLException {

            // Gọi phương thức getProductById từ đối tượng DAO để lấy sản phẩm dựa trên ID
            return productDAO.getProductById(productId);

    }
}
