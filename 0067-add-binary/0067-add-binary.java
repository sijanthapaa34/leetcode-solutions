class Solution {
    public String addBinary(String a, String b) {
        char [] ofA = a.toCharArray();
        char [] ofB = b.toCharArray();
        ArrayList< String > list = new ArrayList<>();
        int carry =0;
        int i = ofA.length-1;
        int j = ofB.length-1;
        while(i >= 0 || j >= 0){
            if(i < 0){
                if (carry ==1 && ofB[j] == '1'){
                    list.add(0,"0");
                    carry =1;
                }else if(carry ==1 && ofB[j] == '0'){
                    list.add(0,"1");
                    carry =0; 
                }
                else{
                    list.add(0,String.valueOf(ofB[j]));
                }
            }
            else if(j<0){
                if (carry ==1 && ofA[i] == '1'){
                    list.add(0,"0");
                    carry =1;
                }else if(carry ==1 && ofA[i] == '0'){
                    list.add(0,"1");
                    carry =0; 
                }
                else{
                    list.add(0,String.valueOf(ofA[i]));
                }
            }
            else if(ofA[i] == '1' && ofB[j] =='1'){
                if (carry ==1){
                    list.add(0,"1");
                }else{
                    list.add(0,"0");
                }
                carry = 1;
            }else if(ofA[i] == '1' || ofB[j] =='1'){
                if (carry ==1){
                    list.add(0,"0");
                    carry = 1;
                }else{
                    list.add(0,"1");
                    carry = 0;
                }
                
            }
            else{
                if (carry ==1){
                    list.add(0,"1");
                }else{
                    list.add(0,"0");
                }
                carry = 0;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            list.add(0, "1");
        }
        return String.join("", list);
        
    }
}