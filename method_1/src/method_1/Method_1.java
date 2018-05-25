/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_1;

/**
 *
 * @author GeeksFarm
 */
class cek{
    int a;
    int b;
    
    cek(){
        a=1;
        b=2;
    }
    public void cetak () {
        System.out.println("Cetak method tanpa parameter");
        System.out.println("a adalah "+a+"& b adalah "+b);
    }
    
    public void cetak_byvalue(int a,int b){
        System.out.println("Cetak method dengan by value");
        System.out.println("a adalah "+a+"& b adalah "+b);
    }
}
public class Method_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        cek call = new cek();
        call.cetak();
        call.cetak_byvalue(7, 8);
    }
    
}
