class Remove {

 ArrayList<Integer> numbers=new ArrayList<Integer> ();
 public void removeMethod(){ 
    Scanner s= new Scanner(System.in);
    for(int i=0;i<11;i++){
      System.out.println("Enter a number");
      int num=s.nextInt();
      numbers.add(num);
    }
    System.out.println(numbers);
    Scanner r=new Scanner(System.in);
    System.out.println("What do you want to remove?");
    int remove=r.nextInt();
    for(int i=0;i<numbers.size();i++){
      if(numbers.get(i)==remove){
        numbers.remove(i);
      }
    }
    System.out.println(numbers);
  }
}
}