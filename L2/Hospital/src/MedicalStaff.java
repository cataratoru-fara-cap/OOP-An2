package src;
public class MedicalStaff {
    private int noDoctors;
    private List<Doctor> doctors;
    public Hospital hospital;

    public MedicalStaff(int noDoctors, Hospital hospital){
        this.noDoctors=noDoctors;
        this.hospital=hospital;
        this.doctors = new ArrayList<>();
    }

    private List<Doctor> getDoctors(){
        return doctors;
    }

    public void hireDoctors(Doctor doctor){
        if(doctor.size() < noDoctors)
            doctors.add(doctor);
        else
            System.out.println("Doctors already full");;
    }

    public void display(){
        System.out.println("Medical Staff");
        for (Doctor doctor : doctors){
            System.out.println(doctor);
        }
    }
}


