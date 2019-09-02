package Questoes.terceira;

public class ConversorDeMedidas {
//    onverterMassa, converterTemperatura e
//    converterDistancia.
    public void converterMassa(Medidas medidas) {
        if (medidas.getMassUnit().equals("Kg") ) {
//            lb = kg * 2.2046
            medidas.setMassUnit("Kg");
            medidas.setMass(medidas.getMass() * 2.2046);
        } else {
            medidas.setMassUnit("lb");
            medidas.setMass(medidas.getMass() / 2.2046);
        }
    }

    public void converterTemperatura(Medidas medidas) {
        if (medidas.getTempUnit().equals("C")) {
//          (°F - 32)/1,8
            medidas.setTempUnit("F");
            medidas.setTemp((medidas.getTemp() -32) /1.8);
        } else {
            medidas.setTempUnit("C");
            medidas.setTemp(medidas.getTemp() * 1.8 - 32);
        }
    }

    public void converterDistancia(Medidas medidas) {
        if (medidas.getDistUnit().equals("Km")) {
//            mi = km/1,609
            medidas.setDistUnit("mi");
            medidas.setDist(medidas.getDist() / 1.609);
        } else {
            medidas.setDistUnit("Km");
            medidas.setDist(medidas.getDist() * 1.609);
        }
    }
}
