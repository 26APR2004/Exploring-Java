// Source code is decompiled from a .class file using FernFlower decompiler.
class E_car {
    public String model;
 
    E_car() {
       this.model = "210Q";
    }
 
    E_car(String var1) {
       this.model = var1;
    }
 
    public void getNmae() {
       System.out.println("Car model is:" + this.model);
    }
 
    public static void main(String[]args) {
       E_car var1 = new E_car();
       E_car var2 = new E_car("Audi");
       var1.getNmae();
       var2.getNmae();
    }
 }
 