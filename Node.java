
public class Node <T>
{
    private Node<T> next; 
    private Node<T> previous;
    private T data;
    
    public Node()
    {
        next = null;
        previous = null;
        data = null;
    }
    
    public Node(T data)
    {
        this.data = data;
    }
    
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    
    public void setPrevious(Node<T> previous)
    {
        this.previous = previous;
    }
    
    public void setData(T data)
    {
        this.data = data; 
    }
    
    public Node<T> getNext()
    {
        return this.next;
    }
    
    public Node<T> getPrevious()
    {
        return this.previous;
    }
    
    public T getData()
    {
        return this.data;
    }
}
