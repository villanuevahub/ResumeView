package com.example.myapplication16;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bTtnmainnwusr;
    Button bTtnmainsignin;
    EditText eTmainuser;
    EditText eTmainpsswd;
    View.OnClickListener onClickListener;

    private List<Users>usersList = new ArrayList<>();
    DataBaseHelper db;
    Integer Yes = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bTtnmainsignin = (Button)findViewById(R.id.bTtnmainsignin);
        bTtnmainnwusr = (Button)findViewById(R.id.bTtnmainnwusr);
        eTmainuser = (EditText)findViewById(R.id.eTmainuser);
        eTmainpsswd = (EditText)findViewById(R.id.eTmainpsswd);

        db = new DataBaseHelper(this);
        usersList = db.getAllUsers();
        //usersList.get(1);

        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){

                    case(R.id.bTtnmainsignin):
                        //int count = db.getUsersCount();
                        toastMessage("Sign in...");
                         //signInValidator();
                        //Yes = noEmptyError();
                        userActivity();
                        break;
                    case(R.id.bTtnmainnwusr):
                        //getUser();
                        //getUsesrcount();
                        toastMessage("Create User...");
                        //createUserActivity();
                        break;
                    default:
                        break;
                }
            }
        };

        bTtnmainsignin.setOnClickListener(onClickListener);
        bTtnmainnwusr.setOnClickListener(onClickListener);


        /*
        createUser(3, "Luis", "Fabian", "Mendoza", "Bravo",
                "Beibi", "bravo_men", "mendozapass", "mendoza.bam@yahoo.com",
                "5424543453", "Male", "15", "Magueyes", "987",
                "El Camichin", "Michoacán", "Primaria", "03/03/1917",
                "Engaged", "Teniente Coronel");
        Log.d("Sqlite", "Insert Third User Successfully");
        createUser(4, "Peter", "Alexander", "Beckam",
                "Messi", "Pits", "petal", "petalpass",
                "alexpits@reaver.com", "4367423458", "Male", "47",
                "Street1324", "54353", "GridPark Silicon Valley",
                "California", "Cambridge Institute", "20/5/1973",
                "Divorced", "Data Scientist");
        Log.d("Sqlite", "Insert Fourth User Successfully");
         */
    }

    public void toastMessage(String toastMassage) {
        Toast.makeText(this, toastMassage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {    }

    public void editTextClean(){
        eTmainpsswd.setText("");
        eTmainuser.setText("");
    }

    public void signInValidator() {

        String usuario = "q";
        String pass = "q";
        String user = eTmainuser.getText().toString();
        String password = eTmainpsswd.getText().toString();
        if(usuario.equals(user)&& pass.equals(password)) {
            toastMessage("Access Granted...");
            editTextClean();
        }else {
            toastMessage("Sign in...");
            editTextClean();
        }
    }

    private void createUser(int Ide, String First_Name, String Second_Name, String Last_Name,
                            String Second_Last_Name, String Alias, String Username, String Password,
                            String Email, String Mobile_Phone, String Genre, String Age, String Street,
                            String Number, String Neighbourhood, String Country, String School,
                            String Birthdate, String Civil_Status, String Job) {

        long Id = db.insertUser(Ide, First_Name, Second_Name, Last_Name, Second_Last_Name, Alias,
                Username, Password, Email, Mobile_Phone, Genre, Age, Street, Number, Neighbourhood,
                Country, School, Birthdate, Civil_Status, Job);

        Users user = db.getUser(Id);

        if (user != null) {
            //Empty Check
        }

    }

    private void updateUser(String First_Name, String Second_Name, String Last_Name,
                            String Second_Last_Name, String Alias, String Username, String Password,
                            String Email, String Mobile_Phone, String Genre, String Age, String Street,
                            String Number, String Neighbourhood, String Country, String School,
                            String Birthdate, String Civil_Status, String Job) {

        Users user = new Users();

        user.setFirst_Name(First_Name);
        user.setSecond_Name(Second_Name);
        user.setLast_Name(Last_Name);
        user.setSecond_Last_Name(Second_Last_Name);
        user.setAlias(Alias);
        user.setUsername(Username);
        user.setPassword(Password);
        user.setEmail(Email);
        user.setMobile_Phone(Mobile_Phone);
        user.setGenre(Genre);
        user.setAge(Age);
        user.setStreet(Street);
        user.setNumber(Number);
        user.setNeighbourhood(Neighbourhood);
        user.setCountry(Country);
        user.setSchool(School);
        user.setBirthdate(Birthdate);
        user.setCivil_Status(Civil_Status);
        user.setJob(Job);

        db.updateUser(user);

    }

    private void deleteUser(Users user) {

        db.deleteUser(user);
    }

    public void getUser() {
        Users user = new Users();

        //int Id = Integer.parseInt(eTmainpsswd.getText().toString());
        int Id = 1;
        user = db.getUserById(Id);

        int Ide = user.getIde();
        String First_Name = user.getFirst_Name();
        String Second_Name = user.getSecond_Name();
        String Last_Name = user.getLast_Name();
        String Second_Last_Name = user.getSecond_Last_Name();
        String Alias = user.getAlias();
        String Username = user.getUsername();
        String Password = user.getPassword();
        String Email = user.getEmail();
        String Mobile_Phone = user.getMobile_Phone();
        String Genre = user.getGenre();
        String Age = user.getAge();
        String Street = user.getStreet();
        String Number = user.getNumber();
        String Neighbourhood = user.getNeighbourhood();
        String Country = user.getCountry();
        String School= user.getSchool();
        String Birthdate = user.getBirthdate();
        String Civil_Status = user.getCivilStatus();
        String Job = user.getJob();
        String Timestamp = user.getTimestamp();

        Log.d("Sqlite","Read Successful: "
                + " First_Name "+ First_Name
                + " Second_Name " + Second_Name
                + " Last_Name " + Last_Name
                + " Second_Last_Name " + Second_Last_Name
                + " Alias " + Alias
                + " Username " + Username
                + " Password " + Password
                + " Email " + Email
                + " Mobile_Phone " + Mobile_Phone
                + " Genre " + Genre
                + " Age " + Age
                + " Street " + Street
                + " Number " + Number
                + " Neighbourhood " + Neighbourhood
                + " School " + School
                + " Country " + Country
                + " Birthdate " + Birthdate
                + " Civil_Status " + Civil_Status
                + " Job" + Job
                + " Timestamp " + Timestamp);
    }

    public Integer noEmptyError() {
        if(eTmainuser.getText().equals("")&&eTmainpsswd.getText().equals("")) {
            toastMessage("(y)");
        }else {
            toastMessage("Insert Username & Password to continue");
            //toastMessage("Usename & Password not Registred");
            //toastMessage("Click Create User to continue");
            Yes = 1;
        }
        return Yes;
    }

    public void createUserActivity() {
        Intent i = new Intent(getApplicationContext(), CreateUserActivity.class);
        startActivity(i);
    }

    public void userActivity() {
        Intent i = new Intent(getApplicationContext(), UserActivity.class);
        startActivity(i);
    }

    public void getUsesrcount() {
        int count = db.getUsersCount();
        String tag = String.valueOf(count);
        Log.d("Sqlite","users count: "+tag);
    }

    public void anotherAdvanceQuery(int Yes) {
        int count = 0;
        if ( Yes==1 && count > Integer.parseInt(eTmainpsswd.getText().toString())) {
            toastMessage("Bienvenido");
        }
    }
}
