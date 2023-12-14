public class BeanCarro{
    
private String name, brand;
    private int year;

    public BeanCarro(){
    }

    public BeanCarro(String name, String brand, int year){
        this.name = name;
        this.year = year;
        this.brand = brand;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void metodoCarro(String name, int year){
        System.out.println("\nEl carro es un " + name + " y es del año " + year + ".");
    }

    public void metodoMarca(String brand){
        System.out.println("\nEl carro es de la marca " + brand + ".");
    }

    public int metodoSuma(int a, int b){

        return a+b;
        
    }
}