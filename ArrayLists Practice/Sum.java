class Sum{
public void sumMethod() {
    ArrayList<Integer> Numbers= new ArrayList<Integer>();
    Numbers.add(10);
    Numbers.add(12);
    Numbers.add(1);
    Numbers.add(5);
    Numbers.add(7);
    int sum=0;
    int product=1;
    for(int i=0;i<Numbers.size();i++){
      sum+=Numbers.get(i);
      product*=Numbers.get(i);
    }
    System.out.println(sum);
    System.out.println(product);
}

}