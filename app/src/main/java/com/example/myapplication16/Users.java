package com.example.myapplication16;

public class Users {

    public static final String TABLE_NAME = "Users";

    public static final String COLUMN_ID = "Id";
    public static final String COLUMN_IDE = "Identificator";
    public static final String COLUMN_FIRST_NAME = "First Name";
    public static final String COLUMN_SECOND_NAME = "Second Name";
    public static final String COLUMN_LAST_NAME = "Last Name";
    public static final String COLUMN_SECOND_LAST_NAME = "Second Last Name";
    public static final String COLUMN_ALIAS = "Alias";
    public static final String COLUMN_USERNAME = "Username";
    public static final String COLUMN_PASSWORD = "Password";
    public static final String COLUMN_EMAIL = "Email";
    public static final String COLUMN_MOBILE_PHONE = "Mobile Phone";
    public static final String COLUMN_GENRE = "Genre";
    public static final String COLUMN_AGE = "Age";
    public static final String COLUMN_STREET = "Street";
    public static final String COLUMN_NUMBER = "Number";
    public static final String COLUMN_NEIGHBOURHOOD = "Neighbourhood";
    public static final String COLUMN_COUNTRY = "Country";
    public static final String COLUMN_SCHOOL = "School";
    public static final String COLUMN_BIRTHDATE = "Birthdate";
    public static final String COLUMN_CIVIL_STATUS = "Civil Status";
    public static final String COLUMN_JOB = "Job";
    public static final String COLUMN_CURRENT_TIMESTAMP = "Timestamp";

    private int Id;
    private int Ide;
    private String First_Name;
    private String Second_Name;
    private String Last_Name;
    private String Second_Last_Name;
    private String Alias;
    private String Username;
    private String Password;
    private String Email;
    private String Mobile_Phone;
    private String Genre;
    private String Age;
    private String Street;
    private String Number;
    private String Neighbourhood;
    private String Country;
    private String School;
    private String Birthdate;
    private String Civil_Status;
    private String Job;
    private String Timestamp;

    public static final String CREATE_TABLE = "CREATE TABLE " + "( "
            + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_IDE + "INTEGER AUTOINCREMENT, "
            + COLUMN_FIRST_NAME + "TEXT, "
            + COLUMN_SECOND_NAME + "TEXT, "
            + COLUMN_LAST_NAME + "TEXT, "
            + COLUMN_SECOND_LAST_NAME + "TEXT, "
            + COLUMN_ALIAS + "TEXT, "
            + COLUMN_USERNAME + "TEXT, "
            + COLUMN_PASSWORD + "TEXT, "
            + COLUMN_EMAIL + "TEXT, "
            + COLUMN_MOBILE_PHONE + "TEXT, "
            + COLUMN_GENRE + "TEXT, "
            + COLUMN_AGE + "TEXT, "
            + COLUMN_STREET + "TEXT, "
            + COLUMN_NUMBER + "TEXT, "
            + COLUMN_NEIGHBOURHOOD + "TEXT, "
            + COLUMN_COUNTRY + "TEXT, "
            + COLUMN_SCHOOL + "TEXT, "
            + COLUMN_BIRTHDATE + "TEXT, "
            + COLUMN_CIVIL_STATUS + "TEXT, "
            + COLUMN_JOB + "TEXT, "
            + COLUMN_CURRENT_TIMESTAMP + "TEXT"
            + ")";

    public Users(){

    }

    public Users(int Id, int Ide, String First_Name, String Second_Name, String Last_Name,
                 String Second_Last_Name, String Alias, String Username, String Password,
                 String Email, String Mobile_Phone, String Genre, String Age, String Street,
                 String Number, String Neighbourhood, String Country, String School,
                 String Birthdate, String Civil_Status, String Job, String Timestamp) {

        this.Id = Id;
        this.Id = Ide;
        this.First_Name = First_Name;
        this.Second_Name = Second_Name;
        this.Last_Name = Last_Name;
        this.Second_Last_Name = Second_Last_Name;
        this.Alias = Alias;
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Mobile_Phone = Mobile_Phone;
        this.Genre = Genre;
        this.Age = Age;
        this.Street = Street;
        this.Number = Number;
        this.Neighbourhood = Neighbourhood;
        this.Country = Country;
        this.School = School;
        this.Birthdate = Birthdate;
        this.Civil_Status = Civil_Status;
        this.Job = Job;
        this.Timestamp = Timestamp;

    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIde() {
        return Ide;
    }

    public void setIde(int Ide) {
        this.Ide = Ide;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getSecond_Name() {
        return Second_Name;
    }

    public void setSecond_Name(String Second_Name) {
        this.Second_Name = Second_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getSecond_Last_Name() {
        return Last_Name;
    }

    public void setSecond_Last_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMobile_Phone() {
        return Mobile_Phone;
    }

    public void setMobile_Phone(String Mobile_Phone) {
        this.Mobile_Phone = Mobile_Phone;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getNeighbourhood() {
        return Neighbourhood;
    }

    public void setNeighbourhood(String Neighbourhood) {
        this.Neighbourhood = Neighbourhood;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getCivilStatus() {
        return Civil_Status;
    }

    public void setCivil_Status(String Civil_Status) {
        this.Civil_Status = Civil_Status;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

}
