/*
    "XConstructorWrong.java"
    Copyright 2007 - 2008 isidoro ghezzi
    Compiled with: javac 1.5.0_13
    Tested with:
    java version "1.5.0_13"
    Java(TM) 2 Runtime Environment, Standard Edition (build 1.5.0_13-b05-237)
    Java HotSpot(TM) Client VM (build 1.5.0_13-119, mixed mode, sharing)

    ---

    Copyright 2008 - 2019 isidoro ghezzi
    https://github.com/isghe/XConstructorWrong
    Compiled with: javac 1.8.0_66
    Tested with:
	java version "1.8.0_66"
	Java(TM) SE Runtime Environment (build 1.8.0_66-b17)
	Java HotSpot(TM) 64-Bit Server VM (build 25.66-b17, mixed mode)

	---

	MIT License
*/

abstract class XBase{
    abstract protected void init ();
    public XBase (){
        init ();
    }
}

class XDerivate extends XBase{
    private String fWelcomeMessage = "not initialized";
    public XDerivate (String theWelcomeMessage){
        fWelcomeMessage = theWelcomeMessage;
    }
    protected void init (){
        System.out.println (fWelcomeMessage);
    }
}

public class XConstructorWrong {
    public static void main(String args []){
        XBase aBase = new XDerivate ("Hello from XDerivate");
    }
}
