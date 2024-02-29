//** HIERACHICAL INHERITANCES**/
class testoutput{  
public static void main(String args[]){  
friend3 f=new friend3();  
f.frd3();  
f.frd1();   
}} 
class friend1{  
void frd1(){System.out.println("ROHAN");}  
}  
class friend2 extends friend1{  
void frd2(){System.out.println("NIKIT");}  
}  
class friend3 extends friend2{  
void frd3(){System.out.println("HARSHAL");}  
}  
