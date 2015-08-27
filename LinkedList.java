public class LinkedList <T>
{
    private Node<T> currNode;
    public LinkedList()
    {
        currNode = new Node<>();
    }
    
    public LinkedList(T data)
    {
        currNode = new Node<>(data);
    }
    
    public LinkedList(T[] dataList)
    {
        currNode = new Node<>(dataList[0]);
        Node dummyNode = currNode;
        for (int i=1; i<dataList.length; i++)
        {
            dummyNode.setNext(new Node<>(dataList[i]));
            dummyNode = dummyNode.getNext();
        }
    }
        
    public void add(T data)
    {
        //adds a new node at the end of the linked list
        Node newNode = new Node<>(data);
        Node lastNode = currNode;
        lastNode = recFindLastNode(lastNode);
        lastNode.setNext(newNode);
        newNode.setPrevious(lastNode);
    }
    public void goToBeginning()
    {
    //sets the currNode to the beginning of the linked list
        currNode = recFindFirstNode(currNode);
    }
        
     public T getData()
     {
        return currNode.getData();
     }
     
     private Node recFindFirstNode(Node currNode)
     {
         //recursivly finds the first node in the linked list
         if (currNode.getPrevious() ==null)
             return currNode;
         else 
             recFindFirstNode(currNode.getPrevious());
         return null;
     }
         
     
        
         
         
     private Node recFindLastNode(Node currNode)
     {
         //recursivly finds the final node in the linked list
          if (currNode.getNext() == null)
              return currNode;
          else 
              recFindLastNode(currNode.getNext());
          return null;
     }
     
            
          
         
     
     
     
    
}
