package com.example.pharmacyy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.ResourceBundle;

public class ProductController implements Initializable {

        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;



        @FXML
        private DatePicker EXP;

        @FXML
        private TextField Qte;

        @FXML
        private Button btndelete;

        @FXML
        private Button btnsave;

        @FXML
        private Button btnupdate;

        @FXML
        private ChoiceBox<?> company;

        @FXML
        private TextField id;

        @FXML
        private TextField name;

        @FXML
        private TextField price;


        @FXML
        private TableColumn<Product,String > colCompany;

        @FXML
        private TableColumn<Product, Date> colEXP;

        @FXML
        private TableColumn<Product,Integer> colId;

        @FXML
        private TableColumn<Product,String> colName;

        @FXML
        private TableColumn<Product,Double> colPrice;

        @FXML
        private TableColumn<Product,Integer> colQte;

        @FXML
        private TableView<Product> table;

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                showProducts();

        }
        public ObservableList<Product> getProducts(){
                ObservableList<Product> products= FXCollections.observableArrayList();

                String query= "select* from products";
                con =DBConnection.getCon();
                try {
                        st =con.prepareStatement(query);
                        rs= st.executeQuery();
                        while (rs.next()){
                                Product st=new Product();
                                st.setId(rs.getInt("id"));
                                st.setName(rs.getNString("name"));
                                st.setPrice(rs.getDouble("price"));
                                st.setEXP(rs.getDate("EXP"));
                                st.setQte(rs.getInt("Qte"));
                                st.setCompany(rs.getString("company"));
                                products.add(st);
                        }
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
                return products;
        }

        public void showProducts(){
                ObservableList<Product> list=getProducts();
                table.setItems(list);
                colId.setCellValueFactory(new PropertyValueFactory<Product,Integer>("id"));
                colName.setCellValueFactory(new PropertyValueFactory<Product,String>("name"));
                colPrice.setCellValueFactory(new PropertyValueFactory<Product,Double>("price"));
                colEXP.setCellValueFactory(new PropertyValueFactory<Product,Date>("EXP"));
                colQte.setCellValueFactory(new PropertyValueFactory<Product,Integer>("Qte"));
                colCompany.setCellValueFactory(new PropertyValueFactory<Product,String>("company"));
        }
        @FXML
        void createProduct(ActionEvent event) {

        }

        @FXML
        void deleteProduct(ActionEvent event) {

        }

        @FXML
        void updateProduct(ActionEvent event) {

        }

}
