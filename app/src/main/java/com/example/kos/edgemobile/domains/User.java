package com.example.kos.edgemobile.domains;

/**
 * Created by roman on 17.01.2018.
 */

public class User
{
    public int id;
    public String Surname;
    public String Name;
    public String Patronymic;

    public User(int id,String Surname,String Name,String Patronymic)
    {
        this.id=id;
        this.Surname=Surname;
        this.Name=Name;
        this.Patronymic=Patronymic;
    }
    public User()
    {
    }

}