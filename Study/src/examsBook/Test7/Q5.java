package examsBook.Test7;

class DatabaseWrapper
{
     public String url = "jdbc://derby://localhost:1527//mydb";
     public DatabaseWrapper getDatabase()
    {
        System.out.println("Getting DB");
        return null;
    }
    public static void main(String[ ] args)
    {
        System.out.println( new DatabaseWrapper().getDatabase().url ); //with static we will not get exception bcs it does not depend on object
    }
}
