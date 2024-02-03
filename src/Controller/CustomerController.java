/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.OrderList;
import View.DBConnection;
import java.util.Arrays;
/**
 *
 * @author User
 */
public class CustomerController {
    public static String getOrderId(){
    OrderList orderList= DBConnection.getInstance().getOrderList();
    int i=orderList.size();
    String id="ORD#"+String.format("%05d",(i+1));
    return id;
    
    }
    
    
     public static double calculateOrderAmount(double quantity, String size) {
        double price = 0.0;

        if ("XS".equals(size)) {
            price = quantity * 600.0;
        } else if ("S".equals(size)) {
            price = quantity * 800.0;
        } else if ("M".equals(size)) {
            price = quantity * 900.0;
        } else if ("L".equals(size)) {
            price = quantity * 1000.0;
        } else if ("XL".equals(size)) {
            price = quantity * 1100.0;
        } else {
            price = quantity * 1200.0;
        }

        return price;
    }
     
    public static boolean addOrder(OrderList.Client customer){
     OrderList orderList=DBConnection.getInstance().getOrderList();
       orderList.add(customer);
      return true;
    } 
    public static boolean idAvailable(String phoneNum){
    OrderList orderList=DBConnection.getInstance().getOrderList();
    
    return orderList.isAvailableCustomerId(phoneNum);
    
    }
    public static boolean orderIdAvailable(String idNum){
    OrderList orderList=DBConnection.getInstance().getOrderList();
    
    return orderList.isAvailableOrderId(idNum);
    }
    public static int getSizeOfList(){
    return DBConnection.getInstance().getOrderList().size();
    
    }
    public static OrderList.Client[] passArray(){
    OrderList orderList=DBConnection.getInstance().getOrderList();
    return orderList.toArray();
    }
    public static OrderList.Client[] arrayExtends(OrderList.Client[] arr,OrderList.Client c){
        OrderList.Client [] tempClientArray = new OrderList.Client[arr.length+1];
	    for (int i = 0; i < arr.length; i++){
		tempClientArray[i]=arr[i];
	    }
	tempClientArray[arr.length]=c;
	return tempClientArray;
    
    }
    public static OrderList.Client[] searchCustomerTempArray(String phoneNum){
        OrderList.Client[] tempArray=new OrderList.Client[0];
        OrderList.Client [] array=CustomerController.passArray();
	for (int i = 0; i <DBConnection.getInstance().getOrderList().size(); i++){
            if(array[i].getCustomerId().equals(phoneNum)){
            tempArray=arrayExtends(tempArray,array[i]);	
            }
	}
	for (int i = tempArray.length-1; i >0 ; i--){
	    for (int j = 0; j < i; j++){
		OrderList.Client s1=tempArray[j];
		OrderList.Client s2=tempArray[j+1];
		 if(s1.getAmount()>s2.getAmount()){
			 OrderList.Client temp=tempArray[j];
			tempArray[j]=tempArray[j+1];
			tempArray[j+1]=temp;
		}
	   }
       }
        return tempArray;
    
    }
    public static int matchingIndex(String idNum){
    int index = DBConnection.getInstance().getOrderList().matchIndex(idNum);
        return index;
    }
    public static OrderList.Client getObjectOfIndex(int index){
    return DBConnection.getInstance().getOrderList().get(index);
    }
   
    public static boolean deleteOrder(int index) {
     OrderList orderList=DBConnection.getInstance().getOrderList();
     orderList.remove(index);
     return true;
    }
     public static OrderList.Client [] getWithoutDuplicates(OrderList.Client[] clientArray ){
	OrderList.Client [] tempDupArray=new OrderList.Client[0];
	if(clientArray.length>0){
            L1:for (int i = 0; i < clientArray.length; i++){
		boolean notAdded=true;
		for (int j = 0; j < tempDupArray.length; j++){
		if(clientArray[i].getCustomerId().equals(tempDupArray[j].getCustomerId())){
			continue L1;
		}
		  }		
		tempDupArray=arrayExtends(tempDupArray,clientArray[i]);
		tempDupArray[tempDupArray.length-1]=clientArray[i];
		}
		return tempDupArray;
	}
		return null;
	}

    public static int[] sortWithIndexes(double[] arr) {
        int n = arr.length;
        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        Arrays.sort(indexes, (a, b) -> Double.compare(arr[b], arr[a]));

        int[] sortedIndexes = new int[n];
        for (int i = 0; i < n; i++) {
            sortedIndexes[i] = indexes[i];
        }

        return sortedIndexes;
    }
    public static boolean addIndexOf(int index,String status){
    DBConnection.getInstance().getOrderList().add(index, status);
    return true;
    }

   
}
