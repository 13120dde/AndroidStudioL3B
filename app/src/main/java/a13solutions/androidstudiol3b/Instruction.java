package a13solutions.androidstudiol3b;

/**
 * Created by 13120dde on 2017-09-10.
 */

class Instruction {

    private String whatToDo;
    private String content;

    public Instruction(String whatToDo, String content) {
        this.whatToDo=whatToDo;
        this.content=content;
    }

    public String getWhatToDo() {
        return whatToDo;
    }

    public String getContent(){
        return content;
    }

}
