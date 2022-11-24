public class Human {
    private int yearOfBirth;
    private final String name;
    private String town;
    private final String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        String status = "безработный";
        if (jobTitle.equals(status)){
            this.jobTitle =" В настоящий момент я безработный";
        } else {this.jobTitle = " Работаю на должности "+jobTitle;}

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0 ) {
            this.yearOfBirth = yearOfBirth;
        } else {
            yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
            if (town != null && town.trim().length() != 0 && !town.isBlank() && !town.isEmpty()) {
                this.town = town;
            } else {
                this.town = "Информация не указана";
            }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Родился в " + getYearOfBirth() + " году."+ jobTitle + ". Будем знакомы!";
    }
}