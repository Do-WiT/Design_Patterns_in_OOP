package singleton;

import memento.CircleMemento;

import java.util.Stack;

public class MementoSingleton {
    private static MementoSingleton INSTANCE;

    private Stack<CircleMemento> mementos;

    protected MementoSingleton(){
        System.out.println("Singleton is initialising");
        mementos = new Stack<>();
    }

    public static MementoSingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new MementoSingleton();
        }
        return INSTANCE;
    }

    public void setMemento(CircleMemento circleMemento){
        mementos.push(circleMemento);
    }

    public CircleMemento getLastMemento(){
        return mementos.pop();
    }


}
