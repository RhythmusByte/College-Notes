class CmdLineArgs {
    public static void main(String[] args) {
        String i = args[0];
        String j = args[1];
        String k = args[2];
        int x = Integer.parseInt(i);
        int y = Integer.parseInt(j);
        int z = Integer.parseInt(k);
        int l = x + y;
        int m = l - x;
        System.out.println("The l is " + l);
        System.out.println("The m is " + m);
    }
}

/* 
Execute Commands:
  javac FileName.java
  java ClassFileName 7 8 9 (values)
*/
