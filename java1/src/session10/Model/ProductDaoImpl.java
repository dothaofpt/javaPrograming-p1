
package session10.Model;

import session10.Entities.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDAO {
    private final Connection conn = MySQLConnectionDB.getMyConnection();
    private final String SQL_CREATE_PRODUCT = "INSERT INTO product (productName, productDescription, price, stockQuantity) VALUES (?,?,?,?)";
    private final String SQL_GET_BY_ID = "SELECT * FROM product WHERE productId=?";
    private final String SQL_GET_ALL_PRODUCT = "SELECT * FROM product";
    private final String SQL_DELETE_PRODUCT = "DELETE FROM product WHERE productId=?";
    private final String SQL_UPDATE_PRODUCT = "UPDATE product SET productName=?, productDescription=?, price=?, stockQuantity=? WHERE productId=?";
    PreparedStatement pstm = null;

    public ProductDaoImpl() throws SQLException {

    }

    @Override
    public void createProduct(Product product) throws SQLException {
        pstm = conn.prepareStatement(SQL_CREATE_PRODUCT);
        pstm.setString(1, product.getProductName());
        pstm.setString(2, product.getProductDescription());
        pstm.setInt(3, product.getPrice());
        pstm.setInt(4, product.getStockQuantity());
        pstm.executeUpdate();
        System.out.println("Insert success");
    }

    @Override
    public Product getProductById(int productId) throws SQLException {
        pstm = conn.prepareStatement(SQL_GET_BY_ID);
        pstm.setInt(1, productId);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductDescription(rs.getString(3));
            product.setPrice(rs.getInt(4));
            product.setStockQuantity(rs.getInt(5));
            return product;
        }
        return null; // Return null if product not found
    }

    @Override
    public ArrayList<Product> getAllProduct() throws SQLException {
        ArrayList<Product> products = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL_PRODUCT);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductDescription(rs.getString(3));
            product.setPrice(rs.getInt(4));
            product.setStockQuantity(rs.getInt(5));
            products.add(product);
        }
        return products;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        pstm = conn.prepareStatement(SQL_UPDATE_PRODUCT);
        pstm.setString(1, product.getProductName());
        pstm.setString(2, product.getProductDescription());
        pstm.setInt(3, product.getPrice());
        pstm.setInt(4, product.getStockQuantity());
        pstm.setInt(5, product.getProductID());
        pstm.executeUpdate();
        System.out.println("Update product success");
    }

    @Override
    public void deleteProduct(int productId) throws SQLException {
        pstm = conn.prepareStatement(SQL_DELETE_PRODUCT);
        pstm.setInt(1, productId);
        pstm.executeUpdate();
        System.out.println("Delete product success");
    }
}
