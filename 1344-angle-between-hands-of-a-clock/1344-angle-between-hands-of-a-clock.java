class Solution {
    public double angleClock(int hour, int minutes) {
        double hourdegree=hour==12?0:hour*30.0;
        hourdegree+=minutes*0.5;

        double mindegree=minutes*6.0;

        double ans=Math.abs(hourdegree-mindegree);
        ans=Math.min(Math.abs(ans-360),ans);

        return ans;
    }
}