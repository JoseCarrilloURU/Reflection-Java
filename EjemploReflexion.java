import java.lang.reflect.*;

public class EjemploReflexion{

    public static void main(String[] args) throws Exception{

        BeanCarro carro = new BeanCarro();
        //Metodos[] BeanCarro = BeanCarro.getClass.getDeclaredMethods();

        String methodName;

        methodName = "setName";
        Method setNameMethod = carro.getClass().getMethod(methodName, String.class);
        setNameMethod.invoke(carro, "Optra");

        methodName = "getName";
        Method getNameMethod = carro.getClass().getMethod(methodName);
        String name = (String) getNameMethod.invoke(carro);

        /*methodName = "setYear";
        Method setYearMethod = carro.getClass().getMethod(methodName, int.class);
        setYearMethod.invoke(carro, 1998);
        
        methodName = "getYear";
        Method getYearMethod = carro.getClass().getMethod(methodName);
        int year = (int) getYearMethod.invoke(carro);*/

        methodName = "metodoCarro";
        Method metCarroMethod = carro.getClass().getMethod(methodName, String.class, int.class);
        metCarroMethod.invoke(carro, name, 1998);

        methodName = "metodoMarca";
        Method metMarcaMethod = carro.getClass().getMethod(methodName, String.class);
        metMarcaMethod.invoke(carro, "Chevrolet");

        methodName = "metodoSuma";
        Method sumaMethod = carro.getClass().getMethod(methodName, int.class, int.class);
        System.out.println(sumaMethod.invoke(carro, 10, 15));
    }
}