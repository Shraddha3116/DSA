class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while(i< nums1.length && j < nums2.length){
          if(nums1[i] == nums2[j]){
            if(!ans.contains(nums1[i])){
            ans.add(nums1[i]);
            }
            i++;
            j++;
          }
          else if( nums2[j] > nums1[i]){
            i++;
          }
          else if( nums2[j] < nums1[i]){
            j++;
          }
        }
        int[] temp = new int[ ans.size()];
        for( int k = 0 ; k < ans.size(); k++ ){
            temp[k] = ans.get(k);
        }
     return temp;
    }
}