import java.util.NoSuchElementException;

public class MyStack<T>{

    public SNode<T> bottom; //head
    public SNode<T> top; //tail
    int size;
    public boolean isEmpty(){
        return bottom==null;
        //return true if the bottom is null
    }

    public void push(T item){
        SNode<T> node = new SNode<>(item);
        if (isEmpty()) bottom=top=node;
        else {
            top.next=node;
            top=node; //new top is node, we need to update.
        }
        size++;
    }

    public T peek(){ //returns the value of the top
        return (T) top.value;
    }

    public T pop(){ //delete
        SNode peekNode;
        if (isEmpty()) throw new NoSuchElementException();
        //stack has one element
        if (top==bottom){
            peekNode=top;
            top=bottom=null;
        }else { //more than one element
            peekNode=top;
            SNode prev=bottom;
            while (prev.next!=top){//while prev.next!=top it is prev
                prev=prev.next;
            }
            prev.next=null;//delete top
            top=prev;//new top is prev
        }
        size--;
        return (T) peekNode.value;
    }





}
