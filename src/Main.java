class Main {
    public static void main(String[] args) {
        //Testing our random arrays
        System.out.println("Testing randomIntArr(10)");
        Integer[] testIntAr1 = SortUtils.randomIntArr(10);
        for (Integer val: testIntAr1)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("Testing randomStrArr(10)");
        String[] testStrAr1 = SortUtils.randomStrArr(10);
        for (String val: testStrAr1)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("Testing randomIntAL\n"+SortUtils.randomIntAL(10));
        System.out.println("Testing randomStrAL\n"+SortUtils.randomStrAL(10));
    }
}