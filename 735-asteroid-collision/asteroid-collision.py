class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        n = len(asteroids)
        lst = []

        for i in range(0,n):
            
            if asteroids[i]>0:
                lst.append(asteroids[i])
            
            else :
                while (lst and lst[-1]> 0 and lst[-1] < abs(asteroids[i])):
                    lst.pop()

                if (lst and lst[-1]==abs(asteroids[i])):
                    lst.pop()
                
                elif (not lst or lst[-1]<0):
                    lst.append(asteroids[i])
        
        return lst