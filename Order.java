/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author reema
 */
public class Order {
    public int orderNumber;
    
    DLL  items =new DLL();
    
    public Order(int orderNumber){
        this.orderNumber=orderNumber;
    }
    
    public void addItem(Item  e) { 
        items.addLast(e);
    }

     public void removeItem(int e){
        
       if(items.head==null)
           return;
       
       Node p=items.head;
         Node<Item> a = items.head;
         
     while(p!=null){
       
        if(e==a.getItem().itemNumber){
   
     	if (p == items.head) {
        items.setHead(p.getNext());
	if (items.head != null) {
	items.head.setPrev(null);
        items.head=p.next;
           p.setNext(null);
            }

    } else if (p == items.tail) {

    items.setTail(p.getPrev());
    items.tail.setNext(null);
	} else {
      Node<Item> pree = p.getPrev();
       Node<Item> nee = p.getNext();
      pree.setNext(nee);
   nee.setPrev(pree);
}
        
			}

			p= p.getNext();
     }
     }
     
     
        
     
     
       public Item searchByNumber(int e){
          if(items.head==null)
           System.out.println("NO ONE");
          
           
          Node <Item> p= items.head;
          int o=p.getItem().getitemNumber();
          
       int a=items.size;
           
           for(int i=0; i<a;i++){
          
              if(o==e){
                  return p.getItem();
              }
              p=p.next;
          }
          return null;
       }
       
      public Item searchByName(String e){
                    if(items.head==null)
           System.out.println("NO ONE");
          int a=items.size;
           Node <Item> p= items.getHead();
           for(int i=0; i<a;i++){
           
           
         
//          String o=p.getItem().getitemName();
          
        
          
              if(p.getItem().getitemName().equals(e)){
                  return p.getItem();
              }
              p=p.next;
          }
          return null;
       }
  
      public Item searchByPrice(double e){
           Node <Item> p= items.getHead();
          double o=p.getItem().getitemPrice();
        int a=items.size;
           
           for(int i=0; i<a;i++){
          
              if(o==e){
                  return p.getItem();
              }
              p=p.next;
          }
          return null;
       }
      
      
   
	public void printOrder() {

		System.out.println("order number:" + orderNumber);
                Node<Item> c=items.getHead();
               
		c.getItem().toString();
               
                items.print();}
      
	public String toString() {
		printOrder();
		return "";
	}
        
        
         public double clacp(){
          if(items.head==null)
              return 0;
          double sum=0;
          Node <Item> c=items.head;
       while(c!=null){
          
           sum+=c.getItem().itemPrice;
       
         c=c.next;
          }
       return sum;
      }
         

     
     
     

     public void removeItem1(int itemNumber) {
 
                    if (items.isEmpty()) {
   return;
     }
   Node<Item> r= items.getHead();
 
     while (r!= null) {
 
        if (r.getItem().getitemNumber() == itemNumber) {
 
         if (r== items.getHead()) {
             items.setHead(r.getNext());
        if (items.getHead() != null) {
  items.getHead().setPrev(null);
 
               r.setNext(null);
                  }
 
         } else if (r == items.getTail()) {
 
         items.setTail(r.getPrev());
       items.getTail().setNext(null);
      } else {
     r.getPrev().setNext(r.getNext());
        r.getNext().setPrev(r.getPrev());
 
               }
 
      }
 
                              r = r.getNext();
                    }
 
          }

 
        
        
      
}


       
                
	




