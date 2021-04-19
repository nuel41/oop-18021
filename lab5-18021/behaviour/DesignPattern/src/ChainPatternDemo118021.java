public class ChainPatternDemo118021 {
    private static AbstractLogger118021 getChainOfLoggers(){
        AbstractLogger118021 errorLogger = new ErrorLogger118021(AbstractLogger118021.ERROR);
        AbstractLogger118021 fileLogger = new FileLogger118021(AbstractLogger118021.DEBUG);
        AbstractLogger118021 consoleLogger = new ConsoleLogger118021(AbstractLogger118021.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    public static void main(String[] args){
        AbstractLogger118021 loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger118021.INFO, "Sekadar Info");
        loggerChain.logMessage(AbstractLogger118021.DEBUG, "Sekadar Debug");
        loggerChain.logMessage(AbstractLogger118021.ERROR, "Sekadar error");
    }
}
