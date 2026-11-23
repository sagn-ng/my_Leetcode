"""
- while adding new elements, one thing that we can update in O(1) is the 'prefix product'
-> to calculate the product of the last 'k' numbers, we simply take: allProds/prefixProd[count-k-1],
where 'count' is the number of elements added.

- The problem is that: if there's a 0 in the first 'count-k' numbers, it will cause error since
we can't divide by 0. We need a way to 'avoid' those 0s in our products in the fraction above

-> we actually need 'nonZeroAllProds' and 'nonZeroProds'

- So, we need to specify 'k' into some cases: 

+ If there's a 0 in the last 'k' numbers, i.e index (count-k) to (count), simply return 0
+ Otherwise, but if 'k' equals 'count' -> return nonZeroAllProds
+ If there isn't, it means that all 0s lie in the first half -> all 0s can be 'truncated' (and
replaced with '1' for maintaining the products). Finally, return the fraction defined above
"""
class ProductOfNumbers:

    def __init__(self):
        self.lastZero=-1
        self.nonZeroAllProds=1
        self.nonZeroProds=[]
        self.count=0

    def add(self, num: int) -> None:
        if (num==0): self.lastZero=self.count

        temp=1 if num==0 else num

        if (self.count==0): self.nonZeroProds.append(temp)
        else:
            x=self.nonZeroProds[-1]
            self.nonZeroProds.append(x*temp)

        self.nonZeroAllProds*=temp
        self.count+=1


    def getProduct(self, k: int) -> int:
        if (self.count-k<=self.lastZero): return 0

        if (k==self.count): return self.nonZeroAllProds

        return (self.nonZeroAllProds)//(self.nonZeroProds[self.count-k-1])