package datastorage;

public class DataStorageError extends Exception{
    

  public DataStorageError(String viesti, Throwable syy) { 
    super(viesti, syy); 
  }
  public DataStorageError(Throwable syy) { 
    super(syy); 
  }

  public DataStorageError(String viesti) {
    super(viesti);
  }
}


