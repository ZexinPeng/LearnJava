package pers.linus.second;

import java.util.ArrayList;

public class IntegerToStringKeyboardReaderAdapter extends KeyboardStringReader{
    KeyboardIntegerReader keyboardIntegerReader;

    public IntegerToStringKeyboardReaderAdapter(KeyboardIntegerReader keyboardIntegerReader) {
        this.keyboardIntegerReader = keyboardIntegerReader;
    }

    public ArrayList<String> read_kbd() {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integerList = keyboardIntegerReader.read_int_kbd();
        for (Integer integer : integerList) {
            strings.add(String.valueOf(integer));
        }
        return strings;
    }
}
