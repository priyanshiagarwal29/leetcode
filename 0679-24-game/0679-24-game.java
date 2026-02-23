class Solution {
    Double epsilon = 0.1;

    public boolean solve(ArrayList<Double> cards){
        if(cards.size() == 1){
            if(Math.abs(24.0 - cards.get(0)) <= epsilon){
                return true;
            }
            return false;
        }

        for(int i = 0; i<cards.size(); i++){
            for(int j = 0; j<cards.size(); j++){
                if(i == j) continue;

                Double a = cards.get(i);
                Double b = cards.get(j);

                ArrayList<Double> temp = new ArrayList<>();
                for(int k = 0; k<cards.size(); k++){
                    if(k == i || k == j) continue;
                    temp.add(cards.get(k));
                }

                ArrayList<Double> operations = new ArrayList<>();
                operations.add(a*b);
                operations.add(a+b);
                operations.add(a-b);
                operations.add(b-a);

                if(a != 0){
                    operations.add(b/a);
                }
                if(b != 0){
                    operations.add(a/b);
                }

                for(int o = 0; o<operations.size(); o++){
                    //do
                    temp.add(operations.get(o));
                    //explore
                    if(solve(temp)){
                        return true;
                    }    
                    //undo
                    temp.remove(temp.size()-1);
                }
            }
        }

        return false;
    }

    public boolean judgePoint24(int[] cards) {
        ArrayList<Double> arr = new ArrayList<>();
        for(int i = 0; i<cards.length; i++){
            arr.add(cards[i]*1.0);
        }
        return solve(arr);
    }
}