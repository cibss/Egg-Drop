
package daa;


class EggDrop
{
    // Fungsi untuk mencari nilai max dari 2 integer
    static int max(int a, int b) { return (a > b)? a: b; }
	
    // Fungsi untuk mendapatkan nilai min (worst case) dari setiap percobaan
    // n = jumlah egg , k = jumlah floor
    static int eggDrop(int n, int k)
    {
        int eggFloor[][] = new int[n+1][k+1]; 
        int hasil;
        int i, j, x; // i = egg , j = floor , x = floor yang dipilih

        for (i = 1; i <= n; i++)
        {
            /* Akan menghasilkan nilai 1 untuk setiap percobaan 
            dengan jumlah floor = 1 */
            eggFloor[i][1] = 1; 
            
            /* Akan menghasilkan nilai 0 untuk setiap percobaan 
            dengan jumlah floor = 0 */
            eggFloor[i][0] = 0; 
        }
	
        for (j = 1; j <= k; j++)
            /* Akan menghasilkan nilai j untuk setiap percobaan dengan 
            jumlah floor = j dan jumlah egg = 1 */
            eggFloor[1][j] = j; 
	
        for (i = 2; i <= n; i++)
        {
            for (j = 2; j <= k; j++)
            {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++)
                {
                    // 1 + max(eggFloor[i-1][x-1] untuk menghitung egg yang pecah
                    // eggFloor[i][j-x] untuk menghitung egg yang tidak pecah
                    hasil = 1 + max(eggFloor[i-1][x-1], eggFloor[i][j-x]);
                    if (hasil < eggFloor[i][j])
                        eggFloor[i][j] = hasil;
                }
            }
        }
        return eggFloor[n][k];
    }		
}


