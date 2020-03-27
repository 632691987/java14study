If has following code having null exception:

a.b.c.i = 99;

Before, you don't know because a.b is null, or a.b.c is null, but now the detail exception message would be clear:

Exception in thread "main" java.lang.NullPointerException:
        Cannot read field 'c' because 'a.b' is null.
    at Prog.main(Prog.java:5)