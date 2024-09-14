public class Main {
    public static void main(String[] args) {

        SupportHandler operatorSupportHandler = new OperatorSupportHandler();
        SupportHandler passwordResetSupportHandler = new PasswordResetSupportHandler();
        SupportHandler networkErrorSupporthandler = new NetworkErrorSupporthandler();
        SupportHandler systemOutageSupportHandler = new SystemOutageSupportHandler();

        operatorSupportHandler.setNextHandler(passwordResetSupportHandler);
        passwordResetSupportHandler.setNextHandler(networkErrorSupporthandler);
        networkErrorSupporthandler.setNextHandler(systemOutageSupportHandler);

        System.out.println("==========================================================");
        operatorSupportHandler.handleRequest(SupportType.PASSWORD_RESET);
        System.out.println("==========================================================");
        operatorSupportHandler.handleRequest(SupportType.NETWORK_ERROR);
        System.out.println("==========================================================");
        operatorSupportHandler.handleRequest(SupportType.SYSTEM_OUTAGE);
        System.out.println("==========================================================");
        operatorSupportHandler.handleRequest(SupportType.ORDER_ERROR);
        System.out.println("==========================================================");

    }
}