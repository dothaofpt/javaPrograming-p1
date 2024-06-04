package Generic.Model;


import Generic.Entity.Order;
import Generic.Entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements GenericDAO<Product> {
    // khoi tao fields ket noi den dtb
    private final Connection conn= MySQLConnectionDB.getMyConnection();
    private final String SQL_GET_ALL_PRODUCTS ="SELECT * FROM product";
    private final String SQL_GET_PRODUCT_BY_ID="SELECT * FROM product WHERE productID=?";
    private final String SQL_ADD_PRODUCT="INSERT INTO product(productID,productName,productDescription,Price,StockQuantity VALUES(?,?,?,?,?)";
    private final String SQL_UPDATE_PRODUCT="UPDATE product SET productName=?,productDescription=?,Price=?,StockQuantity=? WHERE productID=?";
PreparedStatement pstm=null;
    public ProductDaoImpl() throws SQLException {
    }

    @Override
    public List<Product> getAll() throws SQLException {
        //b1:tao 1 mang moi de luu danh sach cac san pham trong dtb
        List<Product> products=new ArrayList<>();
        //b2:ket noi den csdl va sd methodprepareStatement goi cau lenh truy van
        pstm=conn.prepareStatement(SQL_GET_ALL_PRODUCTS);
        //b3: tao bien resultSet de luu san pham
        ResultSet rs=pstm.executeQuery();
        //b4: dung vong lap lay ra cac fields cua entity customers
        while(rs.next()){
            Product product=new Product(
                    rs.getInt("productID"),
                    rs.getString("productName"),
                    rs.getString("productDescription"),
                    rs.getInt("Price"),
                    rs.getInt("StockQuantity")
            );// moi lan lay ra 1 san pham thi sd pt add vao list
            products.add(product);
        }
//dong ket noi
        rs.close();
        pstm.close();
        return products;
    }
    public Product getProductById(int productID)throws SQLException{
      pstm=conn.prepareStatement(SQL_GET_PRODUCT_BY_ID);
      pstm.setInt(1,productID);
      ResultSet rs= pstm.executeQuery();
      if(rs.next()){
          Product product =new Product();
          product.setProductId(rs.getInt(1));
          product.setProductName(rs.getString(2));
          product.setProductDescription(rs.getString(3));
          product.setPrice(rs.getInt(4));
          product.setStockQuantity(rs.getInt(5));
          return product;
      }
      return null;
    }

    @Override
    public void add(Product product) throws SQLException {
//tao ket noi
        pstm=conn.prepareStatement(SQL_ADD_PRODUCT);
        //tao ra cac gt cua moi fields
        pstm.setString(1, product.getProductName());
        pstm.setString(2,product.getProductDescription());
        pstm.setInt(3,product.getPrice());
        pstm.setInt(4,product.getStockQuantity());
        //thuc thi
        pstm.executeUpdate();
        //dong ket noi
        pstm.close();


    }

    @Override
    public void update(Product product) throws SQLException {
//tao ket noi
        pstm=conn.prepareStatement(SQL_UPDATE_PRODUCT);
        //lay gt cua moi fields
        pstm.setString(1,product.getProductName());
        pstm.setString(2, product.getProductDescription());
        pstm.setInt(3, product.getPrice());
        pstm.setInt(4, product.getStockQuantity());
        pstm.setInt(5, product.getProductID());
        //thuc thi
        pstm.executeUpdate();
        //dong ket noi
        pstm.close();
    }

    @Override
    public Order GetOrderById(int orderId) throws SQLException {
        return null;
    }

}
