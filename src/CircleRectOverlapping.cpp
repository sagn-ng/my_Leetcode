#include <iostream>
using namespace std;
/*acknowledgement: *we'll use Cx and Cy instead of xCenter and yCenter for short
-   We will construct a circle at I(Cx, Cy) with the varying radius d.
-   As d increases from 0 to r, if our circle touches the given rectangle, it implies
that in the first time, d must equal the smallest distance from I(Cx, Cy) to the rectangle
So, we have: minDist(I, rect) <= r.
And in reverse, if minDist(I, rect) <= r, then it's obvious that our circle (I, r) always
touches the rectangle (at least one)

Thus, we simply need to evaluate minDist(I, rect) and compare it with r
-   We do this by minimizing the x-axis length and the y-axis length of the distance from
    I(Cx, Cy) to a point lying on the rectangle.
*/
bool checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {    
    int minD_x=-1, minD_y=-1;
    //minimizing the x-axis length:
    if (xCenter<=x1) minD_x=x1;
    else if (xCenter>=x2) minD_x=x2;
    else minD_x=xCenter;
    minD_x-=xCenter;
    //minimizing the y-axis length:
    if (yCenter<=y1) minD_y=y1;
    else if (yCenter>=y2) minD_y=y2;
    else minD_y=yCenter;
    minD_y-=yCenter;
    //minDist(I, rect)^2 = minD_x^2 + minD_y^2
    return (minD_x*minD_x + minD_y*minD_y<=radius*radius);
}

int main(){
    //e.g: r=3; Cx=1; Cy=-1; x1=0; y1=1; x2=3; y2=4
    cout<<checkOverlap(3, 1, -1, 0, 1, 3, 4); //output: 1 (True)
    return 0;
}