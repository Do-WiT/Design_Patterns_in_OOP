public class FunctionPrinter {
}

// separate each override function to each interface


// one function
class OnlyPrinter implements MachinePrinter{
    @Override
    public void print(Document d) {

    }
}
// double function
class ScanAndPrinter implements MachineScanner, MachinePrinter{

    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document document) {

    }
}