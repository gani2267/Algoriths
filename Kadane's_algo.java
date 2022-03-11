
        int sum = 0;
        int max = arr[0];

        for(int i : arr){
            sum += i;
            max = Math.max(sum,max);
            sum = Math.max(sum,0);
        }
        
        int ans = max;