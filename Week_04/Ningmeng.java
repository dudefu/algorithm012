

/**
 * 柠檬水找零
 */
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int money[]={0,0};
        for(int i=0;i<bills.length;i++){
            switch(bills[i]){
                case 5:
                    money[0]++;
                    continue;
                case 10:
                    if(money[0]<1){
                        return false;
                    }
                    else{
                        money[0]--;
                        money[1]++;
                    }
                    continue;
                case 20:
                    if(money[0]>=1&&money[1]>=1){
                        money[0]--;
                        money[1]--;
                    }
                    else if(money[0]>=3){
                        money[0]=money[0]-3;
                    }
                    else
                        return false;
                    continue; 
            }    
        }
        return true;
    }
}