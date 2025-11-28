  class Doctor {
    void consultationFee() {
        System.out.println("General doctor fee: ₹300");
    }
}

class Dentist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Dentist fee: ₹500");
    }
}

class Cardiologist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Cardiologist fee: ₹800");
    }
}

class Surgeon extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Surgeon fee: ₹1200");
    }
}

public class Main4 {
    public static void main(String[] args) {

        Doctor d1 = new Dentist();
        Doctor d2 = new Cardiologist();
        Doctor d3 = new Surgeon();

        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
    }
}
