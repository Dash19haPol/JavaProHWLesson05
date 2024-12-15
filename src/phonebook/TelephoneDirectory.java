package phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    static List<Record> records = new ArrayList<>();

    public void add(Record record){
        records.add(record);
    }

    public Record find(String name){
        for (Record record : records){
            if (record.getName().equals(name)){
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name){
        List<Record> newList = new ArrayList<>();
        for (Record record : records){
            if (record.getName().equals(name)){
                newList.add(record);
            }
        }
        return newList.isEmpty() ? null : newList;
    }
}