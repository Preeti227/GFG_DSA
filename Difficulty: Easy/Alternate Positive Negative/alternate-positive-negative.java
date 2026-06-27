class Solution {
    void rearrange(ArrayList<Integer> nums) {
      ArrayList<Integer> pos=new ArrayList<>();
      ArrayList<Integer> neg=new ArrayList<>();
      for(int n:nums){
          if(n>=0) pos.add(n);
          else neg.add(n);
      }
      nums.clear();
      int i=0,j=0;
      while(i<pos.size()&& j<neg.size()){
          nums.add(pos.get(i));
          i++;
          nums.add(neg.get(j));
          j++;
      }
      while(i<pos.size()){
          nums.add(pos.get(i));
          i++;
      }
      while(j<neg.size()){
          nums.add(neg.get(j));
          j++;
      }
    }
}