public class Stack {
    int top;
    int SiZE = 4;
    int []array = new int[SiZE];

    Stack(){
     top = -1;
    }

    boolean isFull(){
     return (top == SiZE -1);
    }
    boolean isEmpty(){
     return (top == -1);
    }

    void push(int element){
     if (isFull()){
      System.out.println("Stack is full");
     }else {
      if(top == -1){
       top = 0;
       array[top] = element;
       System.out.println("First element added: " +element);
      }else {
       top += 1;
       array[top] = element;
       System.out.println("New element added: " +element);
      }
     }
    }

    int pop(){
     if (isEmpty()){
      System.out.println("Stack is empty");
     }else{
         int previousElement = top--;
      array[top] = previousElement;
      System.out.println("Element was deleted" );
      return array[top] ;
     }
        return 0;
    }

    void display(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }else{

            for(int i =0;i<=top;i++){
                System.out.print(array[i]+"->");

            }
            System.out.println();
        }

    }
 }