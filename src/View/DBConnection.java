package View;

import Model.OrderList;


public class DBConnection {
    private final OrderList orderList;
    private static DBConnection dBConnection;
    
    private DBConnection(){
     orderList=new OrderList();
    
    }
    public static DBConnection getInstance(){
        if(dBConnection==null){
        dBConnection=new DBConnection();
        }
        return dBConnection;
    
    }
    public OrderList getOrderList(){ 
        return orderList;
    }
}
