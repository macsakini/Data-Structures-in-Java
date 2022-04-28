class algo {
    public static void main(String[] args) {
        int[] f ={4,2,-3,5,8,12,1,0};
        algo(f,0,7); 
    }
    public static int[] algo(int[] f, int l, int r) {
    
        int x = 0;
        int y = 0;
        
        if(l == r){
            x = f[l];
            y =f[l];

            int[] ret = {x,y};
            
            return ret;
        } else if(l+1 == r){
            if(f[l]<f[r]){
                x =f[r];
                y = f[l];
            }
            else{
                x =f[l];
                y = f[r];
            }

            int[] ret = {x,y};

            return ret;
        }else{
            int q = (l+(r-1))/2;
            
            int[] xlyl = algo(f,l,q);

            int[] xryr = algo(f,q+1,r);

            if(xlyl[0] > xryr[0]){
                x = xlyl[0];
            }else{
                x = xryr[0];
            }

            if(xlyl[0] < xryr[0]){
                y = xlyl[0];
            }else{
                y = xryr[0];
            }

            System.out.println(x);

            int[] ret = {x,y};
            return ret;
        }
    }    
}
