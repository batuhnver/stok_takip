/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stok_takip;

/**
 *
 * @author Batu
 */
class Product {
    
    private int id;
    private String productName,corpName,productType,info,type;
    
    
    public Product(int id, String productName, String corpName, String productType, String info,String type){
        
        this.id=id;
        this.productName=productName;
        this.corpName=corpName;
        this.productType=productType;
        this.info=info;
        this.type=type;
    }
    public int getid(){
        
        return id;
    }
    public String getproductName(){
        
        return productName;
    }
    public String getcorpName(){
        return corpName;
    }
    public String getproductType(){
        return productType;
    }
    public String getinfo(){
        return info;
    }
    public String gettype(){
        return type;
    }
    
}
