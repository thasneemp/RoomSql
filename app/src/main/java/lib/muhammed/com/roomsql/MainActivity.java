package lib.muhammed.com.roomsql;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import lib.muhammed.com.roomsql.db.AppDatabase;
import lib.muhammed.com.roomsql.db.User;
import lib.muhammed.com.roomsql.db.UserDao;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private UserDao userDao;

    private EditText mNameEditText;
    private EditText mPhoneEditText;

    private Button mInsertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEditText = findViewById(R.id.nameEditText);
        mPhoneEditText = findViewById(R.id.phoneEditText);
        mInsertButton = findViewById(R.id.insertButton);

        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "test").allowMainThreadQueries().build();

        userDao = appDatabase.userDao();


        mInsertButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        User user = new User();

        user.setName(mNameEditText.getText().toString());
        user.setPhone(mPhoneEditText.getText().toString());

        userDao.insert(user);
    }
}
