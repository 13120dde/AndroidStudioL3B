package a13solutions.androidstudiol3b;

import android.content.res.Resources;

/**
 * Created by 13120dde on 2017-09-10.
 */

class Controller {

    private Instruction[] instructions = new Instruction[3];
    private InfoFragment infoFragment;
    private ListFragment listFragment;


    public Controller(ListFragment listFragment, InfoFragment infoFragment) {
        this.infoFragment=infoFragment;
        this.listFragment=listFragment;
        this.listFragment.setController(this);
        initiateResources();
    }

    private void initiateResources() {
        Resources res= infoFragment.getResources();
        instructions[0]=new Instruction(res.getString(R.string.what_to_do), res.getString(R.string.content));
        instructions[1]=new Instruction(res.getString(R.string.what_to_do2), res.getString(R.string.content2));
        instructions[2]=new Instruction(res.getString(R.string.what_to_do3), res.getString(R.string.content3));
    }

    public void setInfo(String s) {
        for (Instruction i : instructions){
            if(i.getWhatToDo().equals(s)){
                infoFragment.setContent(i.getContent());
                infoFragment.setWhatToDo(s);
            }
        }
    }
}
