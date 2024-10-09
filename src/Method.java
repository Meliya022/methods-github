public class Method {

    int calculateCrimeRisk(){
        return 48;
    }

    int calculateEarthQuakeRisk(){
        return 12;
    }


    int calculateFloodRisk(){
        return 24;
    }

    int totalCalculatedRisk(){
        return calculateCrimeRisk() + calculateEarthQuakeRisk() + calculateFloodRisk();
    }

    public static void main(String [] args){
        Method method = new Method();
        System.out.println("Total risk " + method.totalCalculatedRisk());
    }
}
