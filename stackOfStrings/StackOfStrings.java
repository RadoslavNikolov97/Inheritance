package stackOfStrings;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class StackOfStrings extends ArrayList<String> {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String input){
        data.add(input);
    }
    public String pop(){
       return data.remove(data.size() - 1);
    }
    public String peek(){
        return data.get(data.size() - 1);
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }

}
