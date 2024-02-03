
package Model;

public class OrderList {
    private Client first;
	
	private boolean isEmpty(){
		return first==null;
	}
	public void add(Client customer){
		if(isEmpty()){
			first=customer;
		}else{
			Client temp=first;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=customer;
		}
	}
	public int size(){
		int count=0;
		Client temp=first;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public boolean isAvailableCustomerId(String key){
		Client temp=first;
		while(temp!=null){
			if(temp.getCustomerId().equals(key)){
				return true;
				}
				temp=temp.next;
		}
		return false;
	}
	public boolean isAvailableOrderId(String key){
		Client temp=first;
		while(temp!=null){
			if(temp.getOrderId().equals(key)){
				return true;
				}
			temp=temp.next;
		}
		return false;
	}
	public Client[] toArray(){
		Client[] tempArray=new Client[size()];
		Client temp=first;
		for (int i = 0; i < size(); i++){
			tempArray[i]=temp;
			temp=temp.next;
		}
		return tempArray;
		
	}
	public int matchIndex(String key){
		Client temp=first;
		int index=0;
		while(temp!=null){
			if(temp.getOrderId().equals(key)){
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
	}
	public Client get(int index){
		Client temp=first;
		int count=0;
		while(count++!=index){
			temp=temp.next;
		}
		return temp;
	}
	public void add(int index,String status){
		Client temp=first;
		int count=0;
			while(count++!=index){
				temp=temp.next;
			}
			temp.setStatus(status);
		}
	
	public boolean statusUpdate(int index){
		Client temp=first;
		int count=0;
		while(count++!=index){
			if(temp.getStatus().equals("PROCESSING")){
				return true;
				}
				temp=temp.next;
			}
			return false;
	}
	public void clear(){
		first=null;
	}
	public void remove(int index){
		
		Client tempOne=first;
		Client tempTwo=first;
		int countOne=0;
		int countTwo=0;
		if(index==0){
			first=tempOne.next;
		}
		while(countOne++<index-1){
			tempOne=tempOne.next;
		}
		while(countTwo++<index){
			tempTwo=tempTwo.next;
		}
		tempOne.next=tempTwo.next;
	}

    public static class Client {

        private String orderId;
        private String customerId;
        private String size;
        private double qty;
        private double amount;
        private String status;
        Client next;

        public Client() {
        }

        public Client(String orderId, String customerId, String size, double qty, double amount, String status) {
            this.orderId = orderId;
            this.customerId = customerId;
            this.size = size;
            this.qty = qty;
            this.amount = amount;
            this.status = status;
        }

        //getters---------
        public String getOrderId() {
            return orderId;
        }

        public String getCustomerId() {
            return customerId;
        }

        public String getSize() {
            return size;
        }

        public double getqty() {
            return qty;
        }

        public double getAmount() {
            return amount;
        }

        public String getStatus() {
            return status;
        }

        //setters------
        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setQty(double qty) {
            this.qty = qty;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String toString() {
            return "Phone Number : " + customerId + "\nSize         : " + size + "\nQTY          : " + qty + "\nAmount       : " + amount + "\nStatus       : " + status;
        }
        //-----------
    }
}
