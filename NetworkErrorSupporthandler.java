// ネットワークの復旧を行うサポート
public class NetworkErrorSupporthandler extends SupportHandler {
    @Override
    public void handleRequest(SupportType supportType) {
        if (supportType.equals(SupportType.NETWORK_ERROR)) {
            System.out.println("ネットワークエラーが発生したため再接続を実施します");
        } else if (nextSupportHandler != null) {
            System.out.println("こちらはネットワーク課です。別の部署に問い合わせます");
            nextSupportHandler.handleRequest(supportType);
        } else {
            super.outputNotFoundMessage(supportType);
        }
    } 
}
