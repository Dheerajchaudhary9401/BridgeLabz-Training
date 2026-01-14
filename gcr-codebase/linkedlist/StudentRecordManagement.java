public class StudentRecordManagement {
  class Node{
    int roll;
    String name;
    int age;
    char grade;
    Node next ;
    Node (int roll,String name,int age,char grade){
      this.roll = roll;
      this.name=name;
      this.age=age;
      this.grade=grade;
      this.next=null;
    }
  }
  Node head;
  //insert
  public void insert(int roll,String name,int age, char grade){
    Node newNode = new Node(roll, name, age, grade);
    if(head==null){
      head = newNode;
      return;
    }
    Node temp = head;
    while(temp.next!=null){
      temp = temp.next;
    }
    temp.next = newNode;
  }

  //insert at beginnning
  public void insertAtBeginning(int roll,String name,int age,char grade){
    Node newNode = new Node(roll,name,age,grade);
    if(head==null){
      head = newNode;
      return;
    }
    Node temp = newNode;
    temp.next=head;
    head = temp;
  }

  //insert at end
  public void insertAtEnd(int roll,String name,int age,char grade){
    Node newNode = new Node(roll,name,age,grade);
    if(head==null){
      head = newNode;
      return;
    }
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = newNode;
  }

  //insert at position
  public void insertAtPosition(int pos,int roll,String name,int age,char grade){
    Node newNode = new Node(roll,name,age,grade);
    if(head==null){
      head = newNode;
      return;
    }
    Node temp = head;
    while(temp != null && pos!=1){
      temp = temp.next;
      pos--;
    }
    Node temp2 = temp.next;
    temp.next = newNode;
    newNode.next = temp2;

  }
  //delete by roll
  public void deletebyroll(int r){
    Node temp = head;
    if(head==null){
      System.out.println("Sorry!! record is empty");
    }
    else{
      while(temp!=null && temp.next.roll!=r){
        temp= temp.next;
      }
      System.out.println("deleted a student record having roll no."+r);
      temp.next = temp.next.next;
    }

  }

  //search by roll
  public void searchByRoll(int r){
    Node temp = head;
    if(head==null){
      System.out.println("Sorry!! record is empty");
    }
    else{
      while(temp!=null && temp.roll!=r){
        temp= temp.next;
      }
      System.out.println("Searched student record: "+"Roll no.: "+temp.roll +", "+ "Name: "+ temp.name +", "+"Age: " + temp.age+", Grade: "+temp.grade);
    }
  }

  //update grade of a student having roll no. r
  public void UpdateGrade(int r, char g){
    Node temp = head;
    if(head==null){
      System.out.println("Sorry!! record is empty");
    }
    else{
      while(temp!=null && temp.roll!=r){
        temp= temp.next;
      }
      System.out.println("updated a student grade having roll no."+r);
      temp.grade = g;
    }
  }
  //display
  public void display(){
    Node temp = head;
    while(temp != null){
      System.out.println("Roll no.: "+temp.roll +", "+ "Name: "+ temp.name +", "+"Age: " + temp.age+", Grade: "+temp.grade);
      temp=temp.next;
    }

  }

  public static void main(String[] args) {
    StudentRecordManagement record = new StudentRecordManagement();
    record.insert(13, "Dheeraj", 23,'A');
    record.insert(14, "Rajat", 23,'B');
    record.insert(15, "Raja", 24,'C');
    record.insertAtBeginning(12, "Subhash", 22,'B');
    record.insertAtPosition(2, 56, "nikhil", 23, 'A');
    record.deletebyroll(14);

    record.display();
    record.searchByRoll(13);
    record.UpdateGrade(12, 'F');
    record.display();

  }
}
