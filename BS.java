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
public class BS {
    public Item [] Array ;
    public  Item[] SortArray(DLL<Item> r){
        BS  n =new BS();
        Node <Item> cc=r.head;
        int s=r.size;
        Array =new Item[s];
        for(int i =0; i<s; i++){
            Array[i]=cc.getItem();
            cc=cc.next;}
        Item r1;
         for(int i =0; i< Array.length; i++){
            for(int j =0; j< Array.length; j++) 
                if(Array[i].getitemNumber()>Array[j].getitemNumber()){
                    r1=Array[i];
                    Array[i]=Array[j];
                    Array[j]=r1;
                }
        
        }
         return Array;
    }
    public boolean binarySearch(Item []data ,int target , int l ,int h) {
           
                
          if ( l > h ){
              return false;
          }
          else {
              int mid = (l+h)/2;
              if (target == data[mid].itemNumber)
                  return true;
              else if(target <data[mid].itemNumber)
                  return binarySearch(data,target,l,mid-1);
              else if(target >data[mid].itemNumber)
                  return binarySearch(data,target,mid+1,h);
 
          }
          return false;
         
          }
    
}
