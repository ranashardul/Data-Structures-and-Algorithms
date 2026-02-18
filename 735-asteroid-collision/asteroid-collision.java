class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;

        List<Integer> lst = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(asteroids[i]>0) lst.add(asteroids[i]);
            else{
                while(!lst.isEmpty() && lst.get(lst.size()-1)>0 && lst.get(lst.size()-1)<Math.abs(asteroids[i])) {
                    lst.remove(lst.size()-1);
                }

                if(!lst.isEmpty() && lst.get(lst.size()-1)== Math.abs(asteroids[i])) lst.remove(lst.size()-1);

                else if(lst.isEmpty() || lst.get(lst.size()-1)<0) lst.add(asteroids[i]);
            }
        }

        int[] res = new int[lst.size()];

        for(int i=0; i<lst.size(); i++){
            res[i] = lst.get(i);
        }

        return res;
    }
}