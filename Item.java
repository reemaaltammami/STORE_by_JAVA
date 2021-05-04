/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

  package store;

public class Item {
    /* COMPLETE ITEM CLASS */
    public int itemNumber;
    public String itemName;
    public double itemPrice;
    public double itemCost;
    
    public Item(int itemNumber ,String itemName, double i){
        this.itemNumber=itemNumber;
        this.itemName= itemName;
        this.itemPrice= i;      
       itemCost=0;
        
    }
    
     public int  getitemNumber() {//1
        return itemNumber;
    }

    public void setitemNumber(int  itemNumber) {//1
        this.itemNumber = itemNumber;
    }      

     public String getitemName() {//2
        return itemName;
    }

    public void setitemName(String itemName){//2
        this.itemName = itemName;
    }      

  
	public double getitemPrice(){
		return itemPrice;
	}
  
    
    public void setItemPrice(double itemPrice) {//3
        this.itemPrice = itemPrice;
    }      

     public  double getitemCost(){//4
        return itemCost;
    }

    public void setitemCost(double  itemCost){//4
        this.itemCost = itemCost;
    }
    
    public String toString() {
 System.out.println("");
//  System.out.println("");
        return "   item[itemNumber=  "+itemNumber+ "  itemName= "+itemName+"  itemPrice= "+itemPrice+"  itemCost=  "+itemCost;
    }

    void setItemName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//


