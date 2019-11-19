package com.example.myapplication16;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class UserActivity extends AppCompatActivity {

    DataBaseHelper db;
    public List<Users> userList;
    //private String[]userListv = {"The Shawshank Redemption", "The Godfather", "The Godfather: Part II", "The Dark Knight", "Pulp Fiction", "Schindler's List", "12 Angry Men", "The Good, the Bad and the Ugly", "The Lord of the Rings: The Return of the King", "Fight Club", "The Lord of the Rings: The Fellowship of the Ring", "Star Wars: Episode V - The Empire Strikes Back", "Forrest Gump", "Inception", "One Flew Over the Cuckoo's Nest", "The Lord of the Rings: The Two Towers", "Goodfellas", "The Matrix", "Star Wars", "Seven Samurai", "City of God", "Se7en", "The Usual Suspects", "The Silence of the Lambs", "It's a Wonderful Life", "Interstellar", "Léon: The Professional", "Life Is Beautiful", "Once Upon a Time in the West", "Casablanca", "American History X", "Saving Private Ryan", "Spirited Away", "Raiders of the Lost Ark", "City Lights", "Psycho", "Rear Window", "The Intouchables", "Whiplash", "Modern Times", "The Green Mile", "Terminator 2: Judgment Day", "Memento", "The Pianist", "The Departed", "Apocalypse Now", "Gladiator", "Sunset Blvd.", "Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb", "Back to the Future", "Alien", "The Prestige", "The Lion King", "The Great Dictator", "The Lives of Others", "Cinema Paradiso", "Django Unchained", "The Shining", "Paths of Glory", "The Dark Knight Rises", "American Beauty", "WALL·E", "North by Northwest", "Aliens", "Citizen Kane", "Grave of the Fireflies", "Vertigo", "M", "Oldboy", "Das Boot", "Amélie", "Princess Mononoke", "Star Wars: Episode VI - Return of the Jedi", "Once Upon a Time in America", "Toy Story 3", "Reservoir Dogs", "A Clockwork Orange", "Braveheart", "Taxi Driver", "Double Indemnity", "Witness for the Prosecution", "Requiem for a Dream", "To Kill a Mockingbird", "Lawrence of Arabia", "Eternal Sunshine of the Spotless Mind", "Full Metal Jacket", "Bicycle Thieves", "The Sting", "Singin' in the Rain", "Amadeus", "Monty Python and the Holy Grail", "Snatch.", "2001: A Space Odyssey", "For a Few Dollars More", "Rashomon", "L.A. Confidential", "The Kid", "All About Eve", "The Apartment", "Inglourious Basterds", "Toy Story", "The Treasure of the Sierra Madre", "A Separation", "Indiana Jones and the Last Crusade", "Yojimbo", "The Third Man", "Some Like It Hot", "Metropolis", "Batman Begins", "Unforgiven", "Scarface", "Like Stars on Earth", "Raging Bull", "Up", "3 Idiots", "Downfall", "Chinatown", "The Great Escape", "Die Hard", "The Hunt", "On the Waterfront", "Heat", "Mr. Smith Goes to Washington", "Pan's Labyrinth", "Good Will Hunting", "The Bridge on the River Kwai", "My Neighbor Totoro", "Ikiru", "The Seventh Seal", "The Gold Rush", "Ran", "Wild Strawberries", "The General", "Blade Runner", "The Elephant Man", "Lock, Stock and Two Smoking Barrels", "The Secret in Their Eyes", "The Wolf of Wall Street", "Casino", "Gran Torino", "Howl's Moving Castle", "Warrior", "The Big Lebowski", "V for Vendetta", "Rebecca", "The Bandit", "Gone Girl", "The Deer Hunter", "Judgment at Nuremberg", "Cool Hand Luke", "How to Train Your Dragon", "It Happened One Night", "Fargo", "A Beautiful Mind", "Gone with the Wind", "Trainspotting", "Into the Wild", "Rush", "Dial M for Murder", "The Maltese Falcon", "The Sixth Sense", "Mary and Max", "Finding Nemo", "The Thing", "The Wages of Fear", "Hotel Rwanda", "No Country for Old Men", "Incendies", "Rang De Basanti", "Kill Bill: Vol. 1", "Platoon", "Life of Brian", "Butch Cassidy and the Sundance Kid", "Network", "A Wednesday", "Munna Bhai M.B.B.S.", "Touch of Evil", "There Will Be Blood", "12 Years a Slave", "Annie Hall", "The 400 Blows", "Stand by Me", "The Princess Bride", "Persona", "The Grand Budapest Hotel", "Amores Perros", "Ben-Hur", "Diabolique", "In the Name of the Father", "The Grapes of Wrath", "Million Dollar Baby", "Sin City", "Hachi: A Dog's Tale", "Nausicaä of the Valley of the Wind", "The Wizard of Oz", "The Best Years of Our Lives", "Gandhi", "The Avengers", "The Bourne Ultimatum", "Donnie Darko", "Shutter Island", "Stalker", "8½", "Guardians of the Galaxy", "Strangers on a Train", "Infernal Affairs", "Twelve Monkeys", "Fanny and Alexander", "Before Sunrise", "Boyhood", "Jaws", "The Imitation Game", "The Battle of Algiers", "The Terminator", "High Noon", "Groundhog Day", "Harry Potter and the Deathly Hallows: Part 2", "Memories of Murder", "The King's Speech", "Ip Man", "Monsters, Inc.", "Notorious", "Rocky", "Dog Day Afternoon", "Barry Lyndon", "La Haine", "The Truman Show", "Who's Afraid of Virginia Woolf?", "A Fistful of Dollars", "Dil Chahta Hai", "The Night of the Hunter", "Pirates of the Caribbean: The Curse of the Black Pearl", "Lagaan: Once Upon a Time in India", "Castle in the Sky", "Jurassic Park", "X-Men: Days of Future Past", "La Strada", "The Help", "Roman Holiday", "Wild Tales", "The Big Sleep", "Spring, Summer, Fall, Winter... and Spring", "Le Samouraï", "Prisoners", "Underground", "The Graduate", "Paris, Texas", "Solaris", "Three Colors: Red", "Papillon"};
    //String[]usrListv = new String[4];
    //String toast;
    ListAdapter listAdapter;
    private int userCount;
    //final int userFields = 21;
    ListView lVusr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        db = new DataBaseHelper(this);
        //userCount = getUsesrcount();
        userCount = getAllUser();

        //String[]First_name = new String[40];
        //First_name = fillv(40);
        //getUser(3);
        //getUsersListSize(userList);
        //getAllusers(userCount);
        //userCount = db.getUsersCount();
        //toast = toast+": "+String.valueOf(userCount);
        //toastMessage(toast);
        //srListv = getUsername();
        userList = db.getAllUsers();
        //userListv = filluserList(userList, userCount);
        lVusr = (ListView)findViewById(R.id.lVusr);
        //this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_textview, R.id.tVusrlsitem, First_name));
        //lVusr = getListView();
        //filluserList();
        //Log.d("Sqlite", "userlist");
        //userList.addAll(db.getAllUsers());
        listAdapter = new ListAdapter(this, userList);
        lVusr.setAdapter(listAdapter);
        //userCount = db.getUsersCount();
    }

    /*
    public String[] rallyUsers(int getUserCount, int getUserFields) {
        String[]userFields = new String[getUserFields];
        String[]userCount = new String[getUserCount];
        ArrayList<String>userStringList =new ArrayList<String>();

        for (int Id=0;Id==getUserCount;Id++) {

            for (int userBy = 0; userBy==getUserFields;userBy++) {
            }
        }
        return userFields;
    }


    public String[]filluserList(List<Users>userList, int userCount) {
        if (this.userList.isEmpty()){
            Log.d("filluserList","");
        }
        //String[] usrListv = new String[userCount];
        Users user;
        usrListv = new String[4];
        for (int i = 1;i<4;i++) {
            user = userList.get(i);
            usrListv[i] = user.getFirst_Name();
        }
        //userList.add(userListv[i]);
        return usrListv;
    }

    public String[]getUsername () {
        String[]username = new String[4];
        Users user = new Users();
        for (int i = 0;i<4;i++ ) {
            db.getUserById(i);
            username[i]= user.getFirst_Name();
        }
        return username;
    }
     */

    public void toastMessage(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT);
    }

    public int getUsesrcount() {
        int count = db.getUsersCount();
        String tag = String.valueOf(count);
        Log.d("Sqlite","users count: "+tag);
        return count;
    }

    /*
    public List<Users>getUsersListSize(List<Users> userList) {
        userList = this.userList;
        int count = userList.size();
        String tag = String.valueOf(count);
        Log.d("Sqlite","users count: "+tag);

        return userList;
    }
    */

    public void getUser(int Id) {
        Users user = new Users();

        //int Id = Integer.parseInt(eTmainpsswd.getText().toString());
        //int Id = 1;
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
                + " First_Name: "+ First_Name
                + " Second_Name: " + Second_Name
                + " Last_Name: " + Last_Name
                + " Second_Last_Name: " + Second_Last_Name
                + " Alias_ " + Alias
                + " Username: " + Username
                + " Password: " + Password
                + " Email: " + Email
                + " Mobile_Phone: " + Mobile_Phone
                + " Genre: " + Genre
                + " Age: " + Age
                + " Street: " + Street
                + " Number: " + Number
                + " Neighbourhood: " + Neighbourhood
                + " School: " + School
                + " Country: " + Country
                + " Birthdate: " + Birthdate
                + " Civil_Status: " + Civil_Status
                + " Job: " + Job
                + " Timestamp: " + Timestamp);
    }
    public void getAllusers(int count) {
        for(int i =0; i < count; i++) {
            getUser(i);
        }
    }

    public int getAllUser() {
        userList = db.getAllUsers();
        int count = userList.size();
        String tag = String.valueOf(count);
        Log.d("Sqlite","users count: "+tag);
        return count;
    }

    public String[]fillv(int count) {
        Users user = new Users();
        String[]First_Name = new String[40];
        for (int i = 0;i < count; i++) {
            user = db.getUserById(i);
            First_Name[i] = user.getFirst_Name();
        }
        return First_Name;
    }
}
