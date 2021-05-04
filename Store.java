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

public class Store {
private Queue<Order> newOrders;
	private Queue<Order> processedOrders;
	private Queue<Order> removedOrders;
	private DLL<Item> items;
        public double salse;
        public BST r;
        public Stack f;
    /**
     * @param args the command line arguments
     */

	public Store() {
		newOrders = new Queue<>();
		processedOrders = new Queue<>();
		removedOrders = new Queue<>();
		items = new DLL<>();
                r=new BST<>();
                 f=new Stack<>();
                 salse=0;
	}
    
    /* STORE CLASS FUNCTIONS AND DATA FIELDS SHOULD BE HERE */
     public void resetOrders(){
         int a=newOrders.size();
          int b=processedOrders.size();
           int c=removedOrders.size();
            for(int i=0; i<a; i++){
                newOrders.dequeue();
            }
             for(int i=0; i<b; i++){
                processedOrders.dequeue();
            }
                  for(int i=0; i<c; i++){
                removedOrders.dequeue();
            }
     }
     public void addNewOrder(Order o){
         newOrders.enqueue(o);
         
     }
     
      public void processOrder(){
          Order o= newOrders.dequeue();
          
//          int s=newOrders.size();   
//          salse=0;
//          for(int i=0 ; i<s ; i++){
              
            
             salse+=o.clacp();
          
            processedOrders.enqueue(o);
      }

     
      public void removeOrder(int or){
          int a= newOrders.size();
         
          for(int i=0; i<a; i++){
       Order b = newOrders.dequeue();
              if(b.orderNumber==or){
                  removedOrders.enqueue(b);
              }
              else{
                  newOrders.enqueue(b);
              }
          }
          
      }
      

     public void printAllOrders(Queue<Order> a){
         Queue F =new Queue<Order>();
         
   while(!a.isEmpty()){
      Order o=a.dequeue();
      o.printOrder();
        F.enqueue(o);
   }
    while(!F.isEmpty()){
        a.enqueue((Order) F.dequeue());
   }

 
     
       }
        
      public double calculateSales(){
          int x= processedOrders.size();
          double sum =0;
          for(int i=0 ; i<x ; i++){
              Order o=  processedOrders.dequeue();
              processedOrders.enqueue(o);
            sum+=o.clacp();
            
          }
          return sum;
      }
     public void generateItemsTree (){
         Node<Item> cc=items.head;
         while(cc!=null){
         r.insert(cc.getItem().itemNumber,cc.item);
         cc=cc.next;
         
     }
         
         System.out.println("");
        r.inOrder(r.getRoot());
//r.draw(r.getRoot());
        
     }
     //Binry seach tree 
//     public void binarySearchItems(int num){
////         r.find(num);
//         System.out.print("--"+ r.find(num));
//         
//     }


        
    public boolean binarySearchItems(int n) {
           BS b=new BS ();
           Item m[] =b.SortArray(items);
              for(int i=0;i<m.length;i++) {
                  System.out.print(""+m[i].getitemName());}
              System.out.println("");
              return b.binarySearch(m,n,0,m.length-1);}


     
    /* AFTER COMPLETING THE REQUIREMENTS ALL ERRORS SHOULD BE RESOLVED */
                
                
    

    public static void main(String[] args) {
   
       
        
        
        Store store = new Store();
       
        
        Order o4 = new Order(4);
        o4.addItem(new Item(111,"iPhone X",3750));
        store.items.addLast(new Item(111,"iPhone X",3750));
        o4.addItem(new Item(133,"Bose Headphone",1099));
        store.items.addLast(new Item(133,"Bose Headphone",1099));
        
        
        
        store.addNewOrder(o4);
   
    
        Order o5 = new Order(5);
        o5.addItem(new Item(122,"iPhone X Max",5550));
         store.items.addLast(new Item(122,"iPhone X Max",5550));
        store.addNewOrder(o5);
        
        
        Order o1 = new Order(1);
        o1.addItem(new Item(111,"iPhone X",3750));
//        store.items.addLast(new Item(111,"iPhone X",3750));
        o1.addItem(new Item(122,"iPhone X Max",5550));
//        store.items.addLast(new Item(122,"iPhone X Max",5550));
        o1.addItem(new Item(231,"Samsung Galaxy Note 10",2500));
//        store.items.addLast(new Item(231,"Samsung Galaxy Note 10",2500));
        
        store.addNewOrder(o1);
     
        
        Order o2 = new Order(2);
        o2.addItem(new Item(122,"iPhone X Max",5550));
//        store.items.addLast(new Item(122,"iPhone X Max",5550));
        o2.addItem(new Item(131,"Apple AirPods",599));

        store.items.addLast(new Item(131,"Apple AirPods",599));
        store.addNewOrder(o2);
  
    
    
  
    
         
        Order o3 = new Order(3);
        o3.addItem(new Item(231,"Samsung Galaxy Note 10",2500));
        store.items.addLast(new Item(231,"Samsung Galaxy Note 10",2500));
        store.addNewOrder(o3);
        
        store.removeOrder(5);
        store.processOrder();
 
   
     

    
     
      System.out.println("--New:--");
     
     
        store.printAllOrders(store.newOrders);
        System.out.println("--Processed:--");
        store.printAllOrders(store.processedOrders);
     System.out.println();
        System.out.println("--Remove--");
        store.printAllOrders(store.removedOrders);
        //tree :( 
        System.out.println("----------------BST-----------------");
        store.generateItemsTree();
        System.out.println("----------------BS-----------------");
        store.binarySearchItems(111);
           
        
            

    
   
    
    
    
    }
            }

        

    

