public class Human {
    private int yearOfBirth;
    private final String name;
    private String town;
    private String jobTitle;
    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            yearOfBirth = 0;
        }
        if (name != null && name.trim().length() != 0 && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (town != null && town.trim().length() != 0 && !town.isBlank() && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
        if (jobTitle != null && jobTitle.trim().length() != 0 && !jobTitle.isBlank() && !jobTitle.isEmpty()) {
            this.jobTitle = jobTitle;
        } else {
            this.town = "Информация не указана";
        }
    }
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}