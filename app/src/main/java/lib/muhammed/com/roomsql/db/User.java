package lib.muhammed.com.roomsql.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by muhammed on 11/14/2017.
 */

@Entity
public class User {
    @PrimaryKey
    private int uid;

    @ColumnInfo(name = "full_name")
    private String name;

    @ColumnInfo(name = "phone_number")
    private String phone;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
