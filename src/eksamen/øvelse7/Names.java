package eksamen.øvelse7;

public class Names {

    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName) {
        String[] names = fullName.split(" ");

        if (names.length > 2) {
            firstName = names[0];
            middleName = names[1];
            lastName = names[2];
        } else {
            firstName = names[0];
            lastName = names[1];
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(firstName).append(" ");

        if (middleName != null) {
            s.append(middleName).append(" ");
        }

        s.append(lastName).append(" ");

        /*String s = "";

        s += firstName + " ";

        if (middleName != null){
            s += middleName + " ";
        }

        s += lastName;*/

        return s.toString();
    }
}
