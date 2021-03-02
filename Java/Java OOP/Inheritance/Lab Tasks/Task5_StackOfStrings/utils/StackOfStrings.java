package utils;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings(List<String> data) {
        this.data = new ArrayList<>();
    }

    public void push(String str){
        this.data.add(str);
    }
    public String peek(){
        if (isEmpty()){
            return null;
        }
        return data.get(data.size()-1);
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
    public String pop(){
        if (isEmpty()){
            return null;
        }
        return data.remove(data.size()-1);
    }
}
