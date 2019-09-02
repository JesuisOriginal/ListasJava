package Questoes.terceira;

public class App {
    public static void main(String[] args) {
//        System.out.println("bool: "+ "KK".equals("KK"));
        Medidas medidas = new Medidas(10, 30,60,"Km", "Kg", "C");
        medidas.conversor.converterDistancia(medidas);
        medidas.conversor.converterMassa(medidas);
        medidas.conversor.converterTemperatura(medidas);

        System.out.println("Dist :" + medidas.getDist() + medidas.getDistUnit() + "\nTemp: " + medidas.getTemp() + medidas.getTempUnit() + "\nMass: " + medidas.getMass() + medidas.getMassUnit());
    }
}
