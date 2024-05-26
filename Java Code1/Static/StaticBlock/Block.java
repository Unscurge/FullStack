package Static.StaticBlock;

public class Block {
    static {
        System.out.println("Block Class Static Invoked");// Static invoke before Main Method
    }

    Block() {
        System.out.println("Block class constructer Invoked");
    }

}
