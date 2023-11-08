class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xDistanceDiff = Math.abs(fx-sx);
        int yDistanceDiff = Math.abs(fy-sy);
        int totalSteps = 0;

        if(xDistanceDiff == 0 && yDistanceDiff == 0 && t == 1){
            return false;
        }

        int diagonalDistance = Math.min(xDistanceDiff,yDistanceDiff);

        
        totalSteps = diagonalDistance;

        xDistanceDiff = Math.abs(diagonalDistance - xDistanceDiff);
        yDistanceDiff = Math.abs(diagonalDistance - yDistanceDiff);

               totalSteps = totalSteps + xDistanceDiff + yDistanceDiff;

        return (totalSteps <= t);


    }
}