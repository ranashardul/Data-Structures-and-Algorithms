class Solution:
    def trap(self, arr: List[int]) -> int:
        lmax=rmax=total=0
        l=0
        r=len(arr)-1

        while l<r:
            if arr[l]<=arr[r]:
                if lmax>arr[l]:
                    total = total + (lmax-arr[l])
                else:
                    lmax = arr[l]
                l=l+1
            else:
                if rmax>arr[r]:
                    total = total + (rmax-arr[r])
                else:
                    rmax = arr[r]
                r=r-1
        return total